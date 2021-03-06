
package com.chnjan.ccblog.pub.ftp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.SocketException;
import java.util.Calendar;

import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPReply;

import com.chnjan.ccblog.common.tools.IdGenerate;
import com.chnjan.ccblog.pub.sysparam.SystemParamUtil;

/**
 * @author chenjian
 * ftp相关操作
 * 2018-01-03
 */
public class FtpTools {

	/**
	 * 获取图片存储目录(用于管理图片文件路径)
	 * @param userUrl 用Url
	 * @return String 返回文件路径，不带前后"/",如chnjan/blog/image/1801
	 * */
	public String getImgthPath(String userUrl) {
		if (userUrl == null || "".equals(userUrl)) {
			return "coulddelete";
		}
		String path = "";
		path = userUrl+"/blog/image";
		Calendar calendar = Calendar.getInstance();
		Integer year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH);
		//季度
		int season = month/3;
		String yearStr = year.toString();
		String seasonStr = "";
		switch (season) {
		case 0:
			seasonStr = "01";
			break;
		case 1:
			seasonStr = "02";
			break;
		case 2:
			seasonStr = "03";
			break;
		case 3:
			seasonStr = "04";
			break;

		default:
			seasonStr = "";
			break;
		}
		path = path + "/"+yearStr + seasonStr;
		return path;
	}
	
	/**
	 * 将文件上传到服务器
	 * @param file 要上传的文件
	 * @param path 目录,将文件传到此目录下,如chnjan/blog/image/180101
	 * @return String 成功返回文件的全路径，失败返回""空字符串
	 * 
	 * */
	public String upLoadFileToServer(File file,String path) {
		String fileName = file.getName();
		try {
			InputStream inputStream = new FileInputStream(file);
			return upLoadFileToServer(inputStream, fileName, path);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return "";
	}
	
	/**
	 * 将文件上传到服务器
	 * @param fileInputStream 文件输入流
	 * @param fileName 文件原名，带后缀
	 * @param path 文件目录,将文件传到ftp服务器此目录下,如chnjan/blog/image/180101
	 * @return String 成功返回文件的全路径，失败返回""空字符串
	 * */
	public String upLoadFileToServer(InputStream fileInputStream, String fileName, String path) {
		// 返回文件的全路径
		String fileOnFtpPath = "";

		// 判断文件或路径等于空，返回

		//文件服务器连接信息
		FTPClient ftpClient = new FTPClient();
		String ftpServerIp = SystemParamUtil.getSysValue("ftp.image.ServerIp");//"192.168.18.128";
		int ftpServerPort = Integer.valueOf(SystemParamUtil.getSysValue("ftp.image.ServerPort"));//21;
		String ftpUser = SystemParamUtil.getSysValue("ftp.image.User");//"ftpimg";
		String ftpPasswd = SystemParamUtil.getSysValue("ftp.image.Passwd");//"ftpimg123456";
		
		try {
			// 连接指定ip,端口
			ftpClient.connect(ftpServerIp, ftpServerPort);
			// 登录用户名和密码
			ftpClient.login(ftpUser, ftpPasswd);
			// 设置传输的文件类型为二进制
			ftpClient.setFileType(FTPClient.BINARY_FILE_TYPE);
			// 返回响应码
			int reply = ftpClient.getReplyCode();
			// 通过响应码查看连接是否可用
			boolean a = FTPReply.isPositiveCompletion(reply);
			// 如果响应码不可用
			if (!a) {
				return fileOnFtpPath;
			}
			// 进入或创建目录
			String realPath = cdOrCreatDir(path, ftpClient);
			if ("".equals(realPath)) {
				// 失败返回
				return fileOnFtpPath;
			}

			// 原文件名
			String sorcename = fileName;// file.getName();
			// 文件后缀名
			String nameSuffix = sorcename.substring(sorcename.indexOf(".")).toLowerCase();
			String filename = IdGenerate.getCurrntTimeNum() + nameSuffix;
			// FileInputStream fileInputStream = new FileInputStream(file);
			// 文件名相同时会覆盖文件
			boolean relt = ftpClient.storeFile(filename, fileInputStream);

			if (relt) {
				// 返回文件的全路径
				fileOnFtpPath = realPath + filename;
			}

			ftpClient.disconnect();

		} catch (SocketException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
		return fileOnFtpPath;
	}
	
	/**
	 * 进入对应的目录,如果不存在则创建
	 * @param dir 目录如chnjan/blog/image/180101
	 * @param ftpClient 
	 * @return String 有效的路径，如：chnjan/blog/image/180101/
	 * 			失败返回空字符串""
	 * @throws IOException 
	 * */
	private String cdOrCreatDir(String dir,FTPClient ftpClient) throws IOException {
		if (dir == null || "".equals(dir)) {
			return "";
		}
		//去前后空格
		dir = dir.trim();
		//如果是以"/"开头，去掉
		if (dir.startsWith("/")) {
			dir = dir.substring(1);
		}
		String[] paths = dir.split("/");
		
		for (String path : paths) {
			//进入path路径，如果进入失败就创建
			if (!ftpClient.changeWorkingDirectory(path)) {
				//如果创建文件失败就返回false
				if (!ftpClient.makeDirectory(path)) {
					return "";
				}
				//创建成功就进入对应目录
				ftpClient.changeWorkingDirectory(path);
			}
		}
		int last = dir.lastIndexOf("/");
		//如果路径不以"/"结尾，则加上
		if (last<dir.length()-1) {
			dir = dir+"/";
		}
		return dir;
	}

	
}
