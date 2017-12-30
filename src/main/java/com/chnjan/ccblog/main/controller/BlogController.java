package com.chnjan.ccblog.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.chnjan.ccblog.main.domain.Blog;
import com.chnjan.ccblog.main.domain.UserBlogInfo;
import com.chnjan.ccblog.main.service.BlogService;
import com.chnjan.ccblog.main.service.BlogUserService;

/**
 * @author chenjian
 * blog controller类
 * 2017-12-23
 */
@Controller
public class BlogController{
	
	@Autowired
	private BlogService blogService;
	
	@Autowired
	private BlogUserService blogUserService;

	@RequestMapping("/blog")
	public String errorpage() {
		return "error";
	}
	
	/**
	 * 查询用户blog列表
	 * */
	@RequestMapping("/blog/{userUrl}")
	public ModelAndView showUserBlogList(@PathVariable String userUrl) {
		return handRequestByUrl(userUrl, null);
	}

	//http://www.cnblogs.com/itdragon/p/8094722.html
	/**
	 * 查询某条blog详细信息
	 * */
	@RequestMapping("/blog/{userUrl}/{blogId}.html")
	public ModelAndView showUserBlog(@PathVariable String userUrl,@PathVariable String blogId) {
		return handRequestByUrl(userUrl,blogId);
		
	}
	
	/**
	 * 显示新增或修改blog
	 * */
	@RequestMapping("/user/{userUrl}/{action}")
	public ModelAndView showEditBlog(@PathVariable String userUrl, @PathVariable String action) {
		ModelAndView mav = handBlogAction(userUrl,action);
		return mav;
	}
	
	/**
	 * 根据url和blogid判断显示哪个页面
	 * @param userUrl 用户路径
	 * @param blogId blogid
	 * @return ModelAndView 页面
	 * */
	private ModelAndView handRequestByUrl(String userUrl,String blogId) {
		ModelAndView mav = new ModelAndView();
		
		UserBlogInfo userBlogInfo = queryUserBlogInfo(userUrl,mav);
		if (userBlogInfo == null) {
			return mav;
		}
		
		//通过blogId是否为空来判断是展示个人blog首页还是blog详情页
		if (blogId==null || "".equals(blogId)) {
			//展示个人blog首页
			String uid = userBlogInfo.getUserId();
			//查询用户blog列表
			List<Blog> blogs = blogService.queryBlogListByUid(uid);
			mav.setViewName("main/blog/personalBlogList");
			
			//blog列表信息
			mav.addObject("userBlogs", blogs);
		} else {
			//展示blog详情页
			Blog blog = blogService.queryBlogById(blogId);//这里要根据userid和blogid两个条件一起查
			if (blog == null) {
				//错误页面
				mav.setViewName("error");
			} else {
				//blog详情页面
				mav.setViewName("main/blog/blogDetailPage");
				
				//blog信息
				mav.addObject("userBlog", blog);
			}
		}
		
		return mav;
	}
	
	/**
	 * 根据用户的url来判断用户是否存在，
	 * 如果存在，将用户信息设置到ModelAndView
	 * 如果不存在返回错误页面
	 * @param userUrl 用户url路径
	 * @param mav 传入的ModelAndView
	 * @return UserBlogInfo 用户存在：用户信息对象
	 * 				不存在：null
	 * */
	public UserBlogInfo queryUserBlogInfo(String userUrl, ModelAndView mav) {
		//userUrl为空，直接跳到错误页面
		if (userUrl==null || "".equals(userUrl)) {
			mav.setViewName("error");
			return null;
		}
		
		//通过url查用户信息
		UserBlogInfo userBlogInfo = blogUserService.queryUserIdByUrl(userUrl);
		
		//对应的用户不存在
		if (userBlogInfo == null || "".equals(userBlogInfo.getUserId())) {
			mav.setViewName("error");
			return null;
		}
		
		//用户信息
		mav.addObject("userBlogInfo", userBlogInfo);
		return userBlogInfo;
	}
	
	/**
	 * 新增或修改blog
	 * @param userUrl 用户路径
	 * @param action 动作
	 * @return ModelAndView 页面
	 * */
	private ModelAndView handBlogAction(String userUrl,String action) {
		ModelAndView mav = new ModelAndView();
		
		//判断用户是否已登录，当前用户与userUrl对应的用户是否相同
		
		//设置用户信息
		UserBlogInfo userBlogInfo = queryUserBlogInfo(userUrl,mav);
		if (userBlogInfo == null) {
			return mav;
		}
		
		mav.setViewName("main/blog/blogEdit");
		return mav;
	}
}
