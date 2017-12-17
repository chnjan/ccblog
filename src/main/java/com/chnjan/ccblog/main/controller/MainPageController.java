package com.chnjan.ccblog.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author chenjian
 * 2017-12-17
 * 首页controller
 */

@Controller
public class MainPageController {
	
	@RequestMapping("/")
	public String mainPage() {
		return "main/NewFile";
	}
}
