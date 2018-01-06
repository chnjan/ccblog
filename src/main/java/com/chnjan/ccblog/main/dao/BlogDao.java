package com.chnjan.ccblog.main.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.chnjan.ccblog.common.tools.Pagination;
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
	 * 根据用户url查询blog的数量
	 * @param userUrl 用户url
	 * @return int blog数量
	 * */
	int queryBlogCountByUrl(String userUrl);
	
	/**
	 * 查询某个用户的所有blog列表
	 * @param userUrl 用户userUrl
	 * @param page 分页信息对象
	 * @return List<blog>某个用户的blog列表
	 * */
	List<Blog> queryBlogListByUid(@Param(value = "userUrl") String userUrl ,@Param(value = "page") Pagination page);

}
