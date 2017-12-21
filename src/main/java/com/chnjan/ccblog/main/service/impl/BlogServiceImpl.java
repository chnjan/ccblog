package com.chnjan.ccblog.main.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chnjan.ccblog.main.dao.BlogDao;
import com.chnjan.ccblog.main.domain.Blog;
import com.chnjan.ccblog.main.service.BlogService;

/**
 * 2017-12-16
 * @author chenjian
 * 博客服务实现类
 */
@Service("blogService")
public class BlogServiceImpl implements BlogService {

	@Autowired
	private BlogDao blogDao;
	
	public Blog queryBlogById(String blogId) {
		Blog blog = blogDao.queryBlogById(blogId);
		return blog;
	}

	public void addBlog(Blog blog) {
		blogDao.addBlog(blog);

	}

	public int deleteBlogById(String blogId) {
		int count = blogDao.deleteBlogById(blogId);
		return count;
	}

	public int updateBlog(Blog blog) {
		int count = blogDao.updateBlog(blog);
		return count;
	}

	public List<Blog> queryBlogList() {
		return blogDao.queryBlogList();
	}
	
	//get and set method
	public BlogDao getBlogDao() {
		return blogDao;
	}

	public void setBlogDao(BlogDao blogDao) {
		this.blogDao = blogDao;
	}

}
