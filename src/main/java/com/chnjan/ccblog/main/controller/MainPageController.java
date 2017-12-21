package com.chnjan.ccblog.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.chnjan.ccblog.main.domain.Blog;
import com.chnjan.ccblog.main.service.BlogService;

/**
 * @author chenjian
 * 2017-12-17
 * 首页controller
 */

@Controller
public class MainPageController {
	
	@Autowired
	private BlogService blogservice;
	
	@RequestMapping("/")
	public ModelAndView mainPage() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("main/index/index");
		
		List<Blog> blogs = blogservice.queryBlogList();
		modelAndView.addObject("blogs", blogs);
		
		return modelAndView;
	}
}
