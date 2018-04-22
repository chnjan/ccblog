/**
 * 
 */
package com.chnjan.ccblog.auth.domain;

/**
 * @author chenjian
 * @date 2018年4月22日
 * 登录信息
 */
public class UserLoginCall {

	private String userId;			//用户id
	private String nickName;		//昵称
	private String loginAccount;	//登录账号
	private String userUrl;			//用户url
	private String loginIp;			//登录的ip
	private UserBaseInfo baseInfo;	//基本信息
	
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getLoginAccount() {
		return loginAccount;
	}
	public void setLoginAccount(String loginAccount) {
		this.loginAccount = loginAccount;
	}
	public String getUserUrl() {
		return userUrl;
	}
	public void setUserUrl(String userUrl) {
		this.userUrl = userUrl;
	}
	public String getLoginIp() {
		return loginIp;
	}
	public void setLoginIp(String loginIp) {
		this.loginIp = loginIp;
	}
	public UserBaseInfo getBaseInfo() {
		return baseInfo;
	}
	public void setBaseInfo(UserBaseInfo baseInfo) {
		this.baseInfo = baseInfo;
	}
	@Override
	public String toString() {
		return "UserLoginCall [userId=" + userId + ", nickName=" + nickName + ", loginAccount=" + loginAccount
				+ ", userUrl=" + userUrl + ", loginIp=" + loginIp + "]";
	}
	
}
