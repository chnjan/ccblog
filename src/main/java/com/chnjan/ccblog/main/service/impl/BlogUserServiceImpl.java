/**
 * 
 */
package com.chnjan.ccblog.main.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chnjan.ccblog.main.dao.BlogUserDao;
import com.chnjan.ccblog.main.service.BlogUserService;

/**
 * @author chenjian
 *
 */
@Service("blogUserService")
public class BlogUserServiceImpl implements BlogUserService {

	@Autowired
	private BlogUserDao blogUserDao;
	
	/**
	 * 通过路径里的url变量查询用户id
	 * @param url 从路径中获取的用户url变量
	 * @return String url对应的用户id
	 * */
	public String queryUserIdByUrl(String url) {
		if (url==null || "".equals(url)) {
			return "";
		}
		String userId = blogUserDao.queryUserIdByUrl(url);
		return userId;
	}

}
