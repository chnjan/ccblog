/**
 * 
 */
package com.chnjan.ccblog.main.domain;

import java.util.Date;

/**
 * 2017-12-14
 * @author chenjian
 * 博客信息实体类
 */
public class Blog {
	/**
	 * id
	 * */
	private String blogId;
	/**
	 * 创建时间
	 * */
	private Date createTime;
	/**
	 * 最近更新时间
	 * */
	private Date lastUpdateTime;
	/**
	 * 标题
	 * */
	private String title;
	/**
	 * 内容
	 * */
	private String content;
	/**
	 * 内容摘要
	 * */
	private String blogAbstract;
	/**
	 * 作者id
	 * */
	private String autorid;
	/**
	 * 作者url
	 * */
	private String userUrl;
	/**
	 * 作者名称
	 * */
	private String autorName;
	/**
	 * 阅读量
	 * */
	private Integer readCount;
	/**
	 * 推荐量
	 * */
	private Integer upupCount;
	
	public String getBlogId() {
		return blogId;
	}
	public void setBlogId(String blogId) {
		this.blogId = blogId;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getLastUpdateTime() {
		return lastUpdateTime;
	}
	public void setLastUpdateTime(Date lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getBlogAbstract() {
		return blogAbstract;
	}
	public void setBlogAbstract(String blogAbstract) {
		this.blogAbstract = blogAbstract;
	}
	public String getAutorid() {
		return autorid;
	}
	public void setAutorid(String autorid) {
		this.autorid = autorid;
	}
	public String getUserUrl() {
		return userUrl;
	}
	public void setUserUrl(String userUrl) {
		this.userUrl = userUrl;
	}
	public String getAutorName() {
		return autorName;
	}
	public void setAutorName(String autorName) {
		this.autorName = autorName;
	}
	public Integer getReadCount() {
		return readCount;
	}
	public void setReadCount(Integer readCount) {
		this.readCount = readCount;
	}
	public Integer getUpupCount() {
		return upupCount;
	}
	public void setUpupCount(Integer upupCount) {
		this.upupCount = upupCount;
	}
	
	
	@Override
	public String toString() {
		return "Blog [blogId=" + blogId + ", createTime=" + createTime + ", lastUpdateTime=" + lastUpdateTime
				+ ", title=" + title + ", content=" + content + ", blogAbstract=" + blogAbstract + ", autorid="
				+ autorid + ", userUrl=" + userUrl + ", autorName=" + autorName + ", readCount=" + readCount
				+ ", upupCount=" + upupCount + "]";
	}
	
}
