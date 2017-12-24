package com.chnjan.ccblog.main.dao;

import java.util.List;

import com.chnjan.ccblog.main.domain.Blog;


/**
 * 2017-12-16
 * @author chenjian
 * 博客dao接口
 */
public interface BlogDao {
	
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
	
	/**
	 * 首页查询博客列表
	 * */
	List<Blog> queryBlogList();
	
	/**
	 * 查询某个用户的所有blog列表
	 * @param uid 用户id
	 * @return List<blog>某个用户的blog列表
	 * */
	List<Blog> queryBlogListByUid(String uid);

}
