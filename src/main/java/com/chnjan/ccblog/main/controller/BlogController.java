package com.chnjan.ccblog.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.chnjan.ccblog.main.domain.Blog;
import com.chnjan.ccblog.main.service.BlogService;
import com.chnjan.ccblog.main.service.BlogUserService;

/**
 * @author chenjian
 * blog controller类
 * 2017-12-23
 */
@Controller
@RequestMapping("/blog")
public class BlogController{
	
	@Autowired
	private BlogService blogService;
	
	@Autowired
	private BlogUserService blogUserService;

	@RequestMapping("/")
	public String errorpage() {
		return "error";
	}
	/**
	 * 查询用户blog列表
	 * */
	@RequestMapping("/{userUrl}")
	public ModelAndView showUserBlogList(@PathVariable String userUrl) {
		ModelAndView mav = new ModelAndView();
		/*if ("".equals(userUrl)) {
			mav.setViewName("error");
			return mav;
		}*/
		//查询用户的id
		String uid = blogUserService.queryUserIdByUrl(userUrl);
		
		//url不存在
		if (uid==null||"".equals(uid)) {
			mav.setViewName("error");
			return mav;
		}
		
		//查询用户blog列表
		List<Blog> blogs = blogService.queryBlogListByUid(uid);
		mav.setViewName("main/blog/personalBlogList");
		mav.addObject("userUrl", userUrl);
		mav.addObject("userBlogs", blogs);
		return mav;
		
	}

	//http://www.cnblogs.com/itdragon/p/8094722.html
	/**
	 * 查询某条blog详细信息
	 * */
	@RequestMapping("/{userUrl}/{blogId}.html")
	public ModelAndView showUserBlog(@PathVariable String userUrl,@PathVariable String blogId) {
		
		ModelAndView mav = new ModelAndView();
		
		//查询用户的id
		String uid = blogUserService.queryUserIdByUrl(userUrl);
		
		//uid不存在
		if (uid==null||"".equals(uid)) {
			mav.setViewName("error");
			return mav;
		}
		
		//根据blogid和userid查出blog
		Blog blog = blogService.queryBlogById(blogId);
		
		if (blog==null) {
			mav.setViewName("error");
			return mav;
		}else {
			//blog详情页面
			mav.setViewName("main/blog/blogDetailPage");
			mav.addObject("userBlog", blog);
			return mav;
		}
		
	}

}
