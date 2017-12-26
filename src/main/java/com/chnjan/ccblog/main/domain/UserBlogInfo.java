
package com.chnjan.ccblog.main.domain;

/**
 * @author chenjian
 * 2017-12-27
 * 用户blog信息实体
 */
public class UserBlogInfo {

	//用户id
	private String userId;
	//呢称
	private String nickName;
	//个性签名
	private String saySome;
	//用户url
	private String userUrl;
	//发表的blog数量
	private Integer blogCount;
	//发表的评论数量
	private Integer commentCount;
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
	public String getSaySome() {
		return saySome;
	}
	public void setSaySome(String saySome) {
		this.saySome = saySome;
	}
	public String getUserUrl() {
		return userUrl;
	}
	public void setUserUrl(String userUrl) {
		this.userUrl = userUrl;
	}
	public Integer getBlogCount() {
		return blogCount;
	}
	public void setBlogCount(Integer blogCount) {
		this.blogCount = blogCount;
	}
	public Integer getCommentCount() {
		return commentCount;
	}
	public void setCommentCount(Integer commentCount) {
		this.commentCount = commentCount;
	}
	
	
	@Override
	public String toString() {
		return "UserBlogInfo [userId=" + userId + ", nickName=" + nickName + ", saySome=" + saySome + ", userUrl="
				+ userUrl + ", blogCount=" + blogCount + ", commentCount=" + commentCount + "]";
	}
	
}
