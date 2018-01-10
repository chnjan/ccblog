/**
 * 
 */
package com.chnjan.ccblog.pub.filter;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

/**
 * @author chenjian
 * 2018-01-10
 */
public class XssFilter implements Filter {

	/**
	 * 要替换的特殊符号，将key替换为value
	 * */
	private static Map<String, String> xssCodeMap = new HashMap<String,String>();
	
	static {
		xssCodeMap.put("<", "");
		xssCodeMap.put("'", "");
		xssCodeMap.put("\"", "");
		xssCodeMap.put(">", "");
	}
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest httpServletRequest = (HttpServletRequest) request;
		request = new XssRequest(httpServletRequest);
		doFilter(request, response, chain);
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}
	
	/**
	 * 替换字符串里的特殊字符
	 * @param inputStr 要替换的特殊字符
	 * @return String 清除特殊字符后的字符串
	 * */
	private String replaceXssCode(String inputStr) {
		if (inputStr == null) {
			return null;
		}
		if (inputStr.length()>0) {
			Iterator<String> iterator = xssCodeMap.keySet().iterator();
			while (iterator.hasNext()) {
				String xssCode = (String) iterator.next();
				inputStr = inputStr.replaceAll(xssCode, xssCodeMap.get(xssCode));
			}
		}
		return inputStr;
	}
	
	/**
	 * 自定义request包装类，过滤特殊字符
	 * */
	private class XssRequest extends HttpServletRequestWrapper{

		public XssRequest(HttpServletRequest request) {
			super(request);
		}
		
		@Override
		public String getParameter(String name) {
			String param = super.getParameter(name);
			if ("richText".equals(name)) {
				//富文本过滤（待实现）
			}else {
				//普通输入框过滤
				param = replaceXssCode(param);
			}
			return param;
		}
		
		@Override
		public String[] getParameterValues(String name) {
			String[] params = super.getParameterValues(name);
			if (params != null) {
				for (int i = 0; i < params.length; i++) {
					params[i] = replaceXssCode(params[i]);
				}
			}
			return params;
		}
	}

}
