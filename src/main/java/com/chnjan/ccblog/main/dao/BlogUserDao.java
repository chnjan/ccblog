
package com.chnjan.ccblog.main.dao;

import com.chnjan.ccblog.main.domain.UserBlogInfo;

/**
 * @author chenjian
 * 2017-12-24
 * 用户信息查询dao
 */
public interface BlogUserDao {

	/**
	 * 通过路径里的url变量查询用户id
	 * 
	 * */
	UserBlogInfo queryUserIdByUrl(String url);
}
