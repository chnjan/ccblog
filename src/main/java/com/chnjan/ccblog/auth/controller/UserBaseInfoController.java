/**
 * 
 */
package com.chnjan.ccblog.auth.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.chnjan.ccblog.auth.service.UserBaseInfoService;
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
	@RequestMapping("/user/to_login")
	public String toLoginPage() {
		return "main/auth/userLoginPage";
	}
	
	/**
	 * 登录验证
	 * 
	 * */
	@RequestMapping("/user/login")
	public void loginValid(HttpServletRequest request,HttpServletResponse response) {
		String loginAcount = request.getParameter("loginName");
		String passwd = request.getParameter("passWord");
		//验证账号密码是否有效
		boolean isok = userBaseInfoService.validUserLogin(loginAcount, passwd);
		
		ObjectMapper objectMapper = new ObjectMapper();
		String code = "";
		String desc = "";
		ObjectNode data = null;
		
		if (isok) {
			//账号密码有效
			code = "1";
			desc = "success";
			//查询用户url信息
			Map<String, Object> urlInfo = userBaseInfoService.getUserUrlInfoByLgCnt(loginAcount);
			data = objectMapper.createObjectNode();
			data.put("userurl", (String)urlInfo.get("url"));
			data.put("userid", (String)urlInfo.get("userid"));
		}else {
			//账号密码无效
			code = "0";
			desc = "账号或密码错误";
		}
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
		//System.out.println(rslt);
	}
	
	/**
	 * 返回验证码图片
	 * 
	 * */
	@RequestMapping("/user/getvaliImg")
	public void getValiImg() {
		
	}
}
