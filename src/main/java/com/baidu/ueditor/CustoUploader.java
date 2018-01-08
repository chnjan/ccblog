
package com.baidu.ueditor;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import com.baidu.ueditor.define.AppInfo;
import com.baidu.ueditor.define.BaseState;
import com.baidu.ueditor.define.State;
import com.chnjan.ccblog.pub.ftp.FtpTools;

/**
 * @author chenjian
 * 自定义文件上传方式
 * 2018-01-08
 */
public class CustoUploader {

	private HttpServletRequest request;
	private Map<String, Object> conf;
	
	public CustoUploader(HttpServletRequest request,Map<String, Object> conf) {
		this.request = request;
		this.conf = conf;
	}
	
	/**
	 * 单文件上传
	 * */
	public final State doExec() {
		State state = null;
		List<State> states = null;
		try {
			states = uploadFileToFpt(request,conf);
			state = states.get(0);
		} catch (FileUploadException e) {
			state = new BaseState(false, AppInfo.PARSE_REQUEST_ERROR);
			e.printStackTrace();
		}
		
		//System.out.println(state.toString());
		return state;
	}
	
	/**
	 * 上传文件到ftp服务器
	 * @param request request请求
	 * @param conf 配置参数，包括文件大小限制，类型限制
	 * @return List<State>
	 * */
	public static List<State> uploadFileToFpt(HttpServletRequest request,Map<String, Object> conf) throws FileUploadException {
		List<State> retrunStates = new ArrayList<State>();
		
		//判断是否包含文件
		boolean hasFile = ServletFileUpload.isMultipartContent(request);
		if (hasFile) {
			//使用本地默认路径来作为临时文件夹
			ServletFileUpload servletFileUpload = new ServletFileUpload(new DiskFileItemFactory());
			//将文件从请求中解析出来
			List<FileItem> fileItems = servletFileUpload.parseRequest(request);
			String userUrl = "chnjan";
			FtpTools ftpTools = new FtpTools();
			String path = ftpTools.getImgthPath(userUrl);
			//配置文件里的最大文件限制
			long maxSize = ((Long) conf.get("maxSize")).longValue();
			//配置文件类型限制
			String[] types = (String[]) conf.get("allowFiles");
			try {
				for (FileItem fileItem : fileItems) {
					//限制文件大小
					long filesize = fileItem.getSize();
					if (filesize>maxSize) {
						retrunStates.add(new BaseState(false, AppInfo.MAX_SIZE));
						continue;
					}
					
					//文件名
					String fileName = fileItem.getName();
					//文件后缀名
					String nameSuffix = fileName.substring(fileName.indexOf(".")).toLowerCase();
					//限制文件类型
					if (!validType(nameSuffix,types)) {
						retrunStates.add(new BaseState(false, AppInfo.NOT_ALLOW_FILE_TYPE));
						continue;
					}
					
					//文件流
					InputStream fileInputStream = fileItem.getInputStream();

					//上传文件到ftp服务器
					String showPath = ftpTools.upLoadFileToServer(fileInputStream, fileName, path);
					State state = null;
					if (showPath == null || "".equals(showPath)) {
						state = new BaseState(false, AppInfo.NOTFOUND_UPLOAD_DATA);
					} else {
						state = new BaseState(true);
						//文件回显目录
						state.putInfo("url", showPath);
					}
					retrunStates.add(state);
					//删除临时文件
					fileItem.delete();
				}
			} catch (IOException e) {
				retrunStates.add(new BaseState(false, AppInfo.IO_ERROR));
				e.printStackTrace();
			}
		}else {
			retrunStates.add(new BaseState(false, AppInfo.NOT_MULTIPART_CONTENT));
		}
		return retrunStates;
	}
	
	/**
	 * 查看文件后缀名是否包含在配置里
	 * */
	private static boolean validType(String type, String[] allowTypes) {
		List<String> list = Arrays.asList(allowTypes);

		return list.contains(type);
	}
}
