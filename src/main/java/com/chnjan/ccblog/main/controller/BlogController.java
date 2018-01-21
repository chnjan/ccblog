package com.chnjan.ccblog.main.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.chnjan.ccblog.common.tools.IdGenerate;
import com.chnjan.ccblog.common.tools.Pagination;
import com.chnjan.ccblog.common.tools.htmltools.HtmlTool;
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
	
	//private final static Logger LOGGER = LogManager.getLogger(BlogController.class);
	
	@Autowired
	private BlogService blogService;
	
	@Autowired
	private BlogUserService blogUserService;
	
	private Pagination page;

	@RequestMapping("/blog")
	public String errorpage() {
		return "error";
	}
	
	/**
	 * 查询用户blog列表
	 * */
	@RequestMapping("/blog/{userUrl}")
	public ModelAndView showUserBlogList(@PathVariable String userUrl,
			@RequestParam(value = "page",defaultValue = "1") String currentPage) {
		ModelAndView mav = new ModelAndView();
		//查询用户信息
		UserBlogInfo userBlogInfo = queryUserBlogInfo(userUrl,mav);
		if (userBlogInfo == null) {
			return mav;
		}
		
		//设置分页参数
		page = new Pagination();
		//设置每页数量
		page.setPageSize(10);
		page.setCurrentPage(currentPage);
		
		//查询用户blog列表
		List<Blog> blogs = blogService.queryBlogListByUid(userUrl,page);
		
		mav.setViewName("main/blog/personalBlogList");
		
		//blog列表信息
		mav.addObject("userBlogs", blogs);
		//分页信息
		mav.addObject("page", page);
		return mav;
	}

	//http://www.cnblogs.com/itdragon/p/8094722.html
	/**
	 * 查询某条blog详细信息
	 * */
	@RequestMapping("/blog/{userUrl}/{blogId}.html")
	public ModelAndView showUserBlog(@PathVariable String userUrl,@PathVariable String blogId) {
		ModelAndView mav = new ModelAndView();
		//查询用户信息
		UserBlogInfo userBlogInfo = queryUserBlogInfo(userUrl,mav);
		if (userBlogInfo == null) {
			return mav;
		}
		
		//展示blog详情页
		Blog blog = blogService.queryBlogById(blogId);
		//blog为空或者userUrl不匹配
		if (blog == null || !userUrl.equals(blog.getUserUrl())) {
			//错误页面
			mav.setViewName("error");
			return mav;
		}
		
		//blog详情页面
		mav.setViewName("main/blog/blogDetailPage");
		
		//blog信息
		mav.addObject("userBlog", blog);
		
		return mav;
	}
	
	/**
	 * 显示新增或修改blog
	 * */
	@RequestMapping("/user/{userUrl}/{action}")
	public ModelAndView showEditBlog(@PathVariable String userUrl, @PathVariable String action,
			HttpServletRequest request,Blog blog) {
		ModelAndView mav = new ModelAndView();

		// 判断用户是否已登录，当前用户与userUrl对应的用户是否相同

		// 设置用户信息
		UserBlogInfo userBlogInfo = queryUserBlogInfo(userUrl, mav);
		if (userBlogInfo == null) {
			return mav;
		}

		// 判断动作类型
		if ("add".equals(action)) {
			// 新增----------------
			mav.setViewName("main/blog/blogEdit");
			return mav;
		
		} else if ("edit".equals(action)) {
			// 修改-----------------
			mav.setViewName("main/blog/blogEdit");
		
		} else if ("save".equals(action)) {
			//保存-----------------
			//验证参数是否符合要求
			if (!validBlog(blog)) {
				mav.setViewName("errorvalid");
				return mav;
			}
			//设置id
			blog.setBlogId(IdGenerate.generateId());
			String content = blog.getContent();
			
			//设置摘要
			//删除html标签
			String blogAbstract = HtmlTool.delHTMLTag(content);
			//截取前200位
			if (blogAbstract.length()>200) {
				blogAbstract = blogAbstract.substring(0,199);
			}
			blog.setBlogAbstract(blogAbstract);
			
			//设置用户信息
			blog.setAutorid(userBlogInfo.getUserId());
			blog.setUserUrl(userBlogInfo.getUserUrl());
			
			//保存
			blogService.addBlog(blog);
			
			//如果保存成功
			mav.setViewName("forward:/blog/"+userUrl);
		
		// 如果都不是
		} else {
			mav.setViewName("error");
			return mav;
		}
		
		return mav;
		// ModelAndView mav = handBlogAction(userUrl,action,request);
		// return mav;
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
	 * 验证前台输入的blog信息合法性
	 * @param blog blog对象
	 * @return boolean true:没问题 ,false:有问题
	 * */
	public boolean validBlog(Blog blog) {
		if(blog == null) {
			return false;
		}
		String title = blog.getTitle();
		if (title == null||title.length()>250) {
			return false;
		}
		String content = blog.getContent();
		if (content == null || content.length()>19000) {
			return false;
		}
		return true;
	}
}
