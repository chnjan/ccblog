/**
 * 
 */
package com.chnjan.ccblog.main.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author chenjian
 * 处理请求图片
 * 2018-01-08
 */
@Controller
public class ImageController {

	private String ftpNginxIp = "192.168.18.128";
	private Integer ftpNginxPort = 8083;
	
	/**
	 * 将图片的请求重定向到ftp服务器请求
	 * 
	 * */
	@RequestMapping("blogimages")
	public void rediercToFtp(HttpServletRequest request,HttpServletResponse response) {
		/*//ftp服务器上的文件路径
		String path = request.getParameter("path");
		//拼接ftp服务器上的完整文件访问地址
		if (!"".equals(path)) {
			path = "http://"+ftpNginxIp+":"+ftpNginxPort.toString()+"/"+path;
			try {
				System.out.println(path);
				response.sendRedirect(path);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}*/
	}
}
