/**
 * 
 */
package com.chnjan.ccblog.auth.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.chnjan.ccblog.auth.dao.UserBaseInfoDao;
import com.chnjan.ccblog.auth.domain.UserBaseInfo;
import com.chnjan.ccblog.auth.service.UserBaseInfoService;

/**
 * @author chenjian
 * 2018-04-10
 */

@Service("userBaseInfoService")
public class UserBaseInfoServiceImpl implements UserBaseInfoService {
	
	@Autowired
	private UserBaseInfoDao userBaseInfoDao;

	/**
	 * 通过用户名密码判断用户是否通过验证
	 * @param loginAccount 登录账号
	 * @param passWord 密码
	 * @return boolean 通过true，不通过false
	 * 
	 * */
	@Override
	public boolean validUserLogin(String loginAccount, String passWord) {
		//通过登录账号查询出此用户对应的密码
		String pawd = userBaseInfoDao.queryUserPswdByLgCnt(loginAccount);
		//如果密码为空说明账号不存在
		if (StringUtils.isEmpty(pawd)) {
			return false;
		}
		
		//将密码摘要加密
		
		//判断加密后的密码是否相同
		if (pawd.equals(passWord)) {
			return true;
		}
		
		return false;
	}

	/**
	 * 更新用户登录时间
	 * @param uid 用户id
	 * */
	@Override
	public void updateLoginTime(String uid) {
		userBaseInfoDao.updateUserLogintime(uid);
	}

	/**
	 * 根据用户id查询
	 * @param uid 用户id
	 * @return UserBaseInfo 用户基本信息对象
	 * 
	 * */
	@Override
	public UserBaseInfo getUserBaseInfo(String uid) {
		return userBaseInfoDao.queryUserBaseById(uid);
	}

	//get and set
	public UserBaseInfoDao getUserBaseInfoDao() {
		return userBaseInfoDao;
	}

	public void setUserBaseInfoDao(UserBaseInfoDao userBaseInfoDao) {
		this.userBaseInfoDao = userBaseInfoDao;
	}

}
