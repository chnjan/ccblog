
package com.chnjan.ccblog.main.service;

import com.chnjan.ccblog.main.domain.UserBlogInfo;

/**
 * @author chenjian
 * 2017-12-24
 * 用户信息查询service
 */
public interface BlogUserService {
	
	/**
	 * 通过路径里的url变量查询用户id
	 * @param url 从路径中获取的用户url变量
	 * @return UserBlogInfo url对应的用户信息
	 * */
	UserBlogInfo queryUserIdByUrl(String url);

}
