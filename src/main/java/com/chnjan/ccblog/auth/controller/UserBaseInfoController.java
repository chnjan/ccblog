/**
 * 
 */
package com.chnjan.ccblog.auth.controller;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Map;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.chnjan.ccblog.auth.domain.UserBaseInfo;
import com.chnjan.ccblog.auth.domain.UserLoginCall;
import com.chnjan.ccblog.auth.service.UserBaseInfoService;
import com.chnjan.ccblog.common.tools.image.RandomImage;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;


/**
 * @author chenjian
 * @date 2018年4月14日
 */
@Controller
public class UserBaseInfoController {

	@Autowired
	private UserBaseInfoService userBaseInfoService;
	
	/**
	 * 
	 * 跳转到登录页面
	 * */
	@RequestMapping("/signin/to_login")
	public String toLoginPage() {
		return "main/auth/userLoginPage";
	}
	
	/**
	 * 登录验证
	 * 
	 * */
	@RequestMapping("/signin/login")
	public void loginValid(HttpServletRequest request,HttpServletResponse response) {
		String loginAcount = request.getParameter("loginName");
		String passwd = request.getParameter("passWord");
		
		String code = "";
		String desc = "";
		ObjectNode data = null;
		
		//验证码
		String valicode = request.getParameter("valicode");
		//取出服务器session里的验证码
		HttpSession session = request.getSession();
		String realValicode = (String) session.getAttribute("valicode");
		//验证图片随机码
		if (valicode == null || !valicode.equalsIgnoreCase(realValicode)) {
			code = "0";
			desc = "验证码错误";
			returnData(code, desc, data, response);
			return;
		}
		
		//验证账号密码是否有效
		boolean isok = userBaseInfoService.validUserLogin(loginAcount, passwd);
		
		if (isok) {
			//账号密码有效
			code = "1";
			desc = "success";
			//查询用户url信息
			Map<String, Object> urlInfo = userBaseInfoService.getUserUrlInfoByLgCnt(loginAcount);
			ObjectMapper objectMapper = new ObjectMapper();
			data = objectMapper.createObjectNode();
			String url = (String)urlInfo.get("url");
			String userId = (String)urlInfo.get("userid");
			data.put("userurl", url);
			data.put("userid", userId);
			//更新用户登录时间
			userBaseInfoService.updateLoginTime(userId);
			
			UserBaseInfo baseInfo = userBaseInfoService.getUserBaseInfo(userId);
			UserLoginCall userLoginCall = new UserLoginCall();
			userLoginCall.setUserId(userId);
			userLoginCall.setUserUrl(url);
			userLoginCall.setLoginAccount(loginAcount);
			userLoginCall.setBaseInfo(baseInfo);
			//将登录的信息放到session
			session.setAttribute("loginCall", userLoginCall);
			
		}else {
			//账号密码无效
			code = "0";
			desc = "账号或密码错误";
		}
		returnData(code, desc, data, response);
	}
	
	/**
	 * 返回登录结果
	 * @param code 结果标志，1成功，0失败
	 * @param desc 结果描述
	 * @param data 登录数据
	 * @param response 响应对象
	 * */
	private void returnData(String code,String desc,ObjectNode data,HttpServletResponse response) {
		ObjectMapper objectMapper = new ObjectMapper();
		ObjectNode root = objectMapper.createObjectNode();
		root.put("code", code);
		root.put("desc", desc);
		root.set("data", data);
		String rslt = "";
		
		//输出返回的字符串结果如{"code":"1","desc":"success","data":{"userurl":"chnjan","userid":"master"}}
		PrintWriter printWriter = null;
		try {
			rslt = objectMapper.writeValueAsString(root);
			//设置contenttype一定要在getwriter前面
			response.setContentType("application/json;charset=utf-8");
			printWriter = response.getWriter();
			printWriter.write(rslt);
			printWriter.flush();
			printWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (printWriter!=null) {
				printWriter.close();
			}
		}
	}
	
	/**
	 * 返回验证码图片
	 * 
	 * */
	@RequestMapping("/signin/getvaliImg")
	public void getValiImg(HttpServletRequest request,HttpServletResponse response) {
		HttpSession session = request.getSession();
		
		//生成随机验证码图片
		Map<String, Object> imgs = RandomImage.getValidImageAndStr();
		
		//随机码
		session.setAttribute("valicode", imgs.get("str"));
		BufferedImage valiImg = (BufferedImage) imgs.get("img");
		//设置响应内容为png图片
		response.setContentType("image/png");
		OutputStream os = null;
		try {
			os = response.getOutputStream();
			ImageIO.write(valiImg, "png", os);
			os.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(imgs.get("str"));
	}
}
