
package com.chnjan.ccblog.main.domain;

import java.util.Date;

/**
 * @author chenjian
 * 用户信息实体
 * 2017-12-24
 */
public class BlogUser {
	
	private String userId;			//用户id
	private String nickName;		//昵称
	private String loginAccount;	//登录账号
	private String userUrl;			//用户url
	private Date rigistTime;		//注册时间
	private Date lastLoginTime;		//最近登录时间
	private String email;			//邮箱
	private String phone;			//手机号
	private String qq;				//qq
	private transient String password;		//密码
	private Date lastUpdatePwdTime;	//最近修改密码时间
	
	
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
	public Date getRigistTime() {
		return rigistTime;
	}
	public void setRigistTime(Date rigistTime) {
		this.rigistTime = rigistTime;
	}
	public Date getLastLoginTime() {
		return lastLoginTime;
	}
	public void setLastLoginTime(Date lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getQq() {
		return qq;
	}
	public void setQq(String qq) {
		this.qq = qq;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getLastUpdatePwdTime() {
		return lastUpdatePwdTime;
	}
	public void setLastUpdatePwdTime(Date lastUpdatePwdTime) {
		this.lastUpdatePwdTime = lastUpdatePwdTime;
	}
	@Override
	public String toString() {
		return "BlogUser [userId=" + userId + ", nickName=" + nickName + ", loginAccount=" + loginAccount + ", userUrl="
				+ userUrl + ", rigistTime=" + rigistTime + ", lastLoginTime=" + lastLoginTime + ", email=" + email
				+ ", phone=" + phone + ", qq=" + qq + ", password=" + password + ", lastUpdatePwdTime="
				+ lastUpdatePwdTime + "]";
	}
	
	
	
}
