/**
 * 
 */
package com.chnjan.ccblog.auth.dao;

import com.chnjan.ccblog.auth.domain.UserBaseInfo;

/**
 * @author chenjian
 * 2018-04-10
 */
public interface UserBaseInfoDao {

	/**
	 * 通过id查询用户基本信息
	 * @param uid 用户id
	 * @return UserBaseInfo 用户基本信息
	 * */
	UserBaseInfo queryUserBaseById(String uid);
	
	/**
	 * 通过用户登录名查询用户密码
	 * @param loginAcount 登录账号
	 * @return String 返回密码或空
	 * */
	String queryUserPswdByLgCnt(String loginAccount);
	
	/**
	 * 更新用户登录时间
	 * @param uid 用户id
	 * @return int 受影响行数
	 * */
	int updateUserLogintime(String uid);
}
