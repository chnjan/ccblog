package com.chnjan.ccblog.main.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chnjan.ccblog.common.tools.Pagination;
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
	
	/**
	 * 查询某个用户的所有blog列表
	 * @param userUrl 用户userUrl
	 * @param page 分页信息对象
	 * @return List<blog>某个用户的blog列表
	 * */
	public List<Blog> queryBlogListByUid(String userUrl ,Pagination page) {
		//查询数据条数
		int count = blogDao.queryBlogCountByUrl(userUrl);
		//设置到page对象里
		page.setTotleCount(count);
		return blogDao.queryBlogListByUid(userUrl,page);
	}

}
