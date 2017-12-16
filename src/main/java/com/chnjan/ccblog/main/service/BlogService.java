package com.chnjan.ccblog.main.service;

import com.chnjan.ccblog.main.domain.Blog;


/**
 * 2017-12-16
 * @author chenjian
 * 博客service接口
 */
public interface BlogService {

	/**
	 * 通过id查询一条博客信息
	 * 
	 * */
	Blog queryBlogById(String blogId);
	
	/**
	 * 新增一条blog信息
	 * 
	 * */
	void addBlog(Blog blog);
	
	/**
	 * 删除blog
	 * 
	 * */
	int deleteBlogById(String blogId);
	
	/**
	 * 修改blog
	 * 
	 * */
	int updateBlog(Blog blog);
	
}
