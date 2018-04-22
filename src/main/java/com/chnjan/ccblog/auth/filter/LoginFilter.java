/**
 * 
 */
package com.chnjan.ccblog.auth.filter;

import java.io.IOException;
import java.util.Set;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.chnjan.ccblog.auth.util.XmlConfRead;

/**
 * @author chenjian
 * @date 2018年4月22日
 * 登录验证过滤器
 */
public class LoginFilter implements Filter {
	
	private static Set<String> urls = XmlConfRead.getInterceptUrls();

	/* (non-Javadoc)
	 * @see javax.servlet.Filter#init(javax.servlet.FilterConfig)
	 */
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {

	}

	/**
	 * 登录验证
	 * @see javax.servlet.Filter#doFilter(javax.servlet.ServletRequest, javax.servlet.ServletResponse, javax.servlet.FilterChain)
	 */
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest httpServletRequest = (HttpServletRequest)request;
		//uri地址
		String uri = httpServletRequest.getRequestURI();
		String contex = httpServletRequest.getContextPath();
		//去除context后的uri
		String compuri = uri.substring(contex.length());
		//如果当前请求的uri在配置里
		if (isNeedIntercept(compuri)) {
			HttpSession session = httpServletRequest.getSession();
			Object logincall = session.getAttribute("loginCall");
			if (logincall == null) {
				//跳转到登录页面
				httpServletRequest.getRequestDispatcher("/signin/to_login").forward(request, response);
			}else {
				chain.doFilter(request, response);
			}
		}else {
			chain.doFilter(request, response);
		}
	}

	/* (non-Javadoc)
	 * @see javax.servlet.Filter#destroy()
	 */
	@Override
	public void destroy() {

	}
	
	/**
	 * 判断输入的uri字符串是否是受限资源
	 * */
	private boolean isNeedIntercept(String uri) {
		for (String urStr : urls) {
			if (uri.startsWith(urStr)) {
				return true;
			}
		}
		return false;
	}

}
