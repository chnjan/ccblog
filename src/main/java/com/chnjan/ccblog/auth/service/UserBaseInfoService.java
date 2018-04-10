/**
 * 
 */
package com.chnjan.ccblog.auth.service;

import com.chnjan.ccblog.auth.domain.UserBaseInfo;

/**
 * @author chenjian
 * 2018-04-10
 * 用户基本信息接口
 */
public interface UserBaseInfoService {

	/**
	 * 通过用户名密码判断用户是否通过验证
	 * @param loginAccount 登录账号
	 * @param passWord 密码
	 * @return boolean 通过true，不通过false
	 * 
	 * */
	boolean validUserLogin(String loginAccount,String passWord);
	
	/**
	 * 更新用户登录时间
	 * @param uid 用户id
	 * */
	void updateLoginTime(String uid);
	
	/**
	 * 根据用户id查询
	 * @param uid 用户id
	 * @return UserBaseInfo 用户基本信息对象
	 * 
	 * */
	UserBaseInfo getUserBaseInfo(String uid);
}
