package com.chnjan.ccblog.test.auth;

import java.util.Map;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.chnjan.ccblog.auth.domain.UserBaseInfo;
import com.chnjan.ccblog.auth.service.UserBaseInfoService;
import com.chnjan.ccblog.main.service.BlogService;

/**
 * @author chenjian
 * 2018-04-14
 * 用户验证测试
 * 
 * */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/applicationContext.xml",
"classpath:mybatis/spring-mybatis.xml","classpath:timer/*.timer.xml"})
public class AuthUserTest {
	
	@Resource
	private UserBaseInfoService userBaseInfoService;
	@Resource
	private BlogService blogService;
	
	/**
	 * 测试验证登录
	 * */
	@Test
	public void testValidUserLogin() {
		boolean adm = userBaseInfoService.validUserLogin("admin", "admin");
		boolean admp = userBaseInfoService.validUserLogin("admin", "admi");
		boolean admup = userBaseInfoService.validUserLogin("an", "adn");
		System.out.println(adm+":"+admp+":"+admup);
	}
	
	/**
	 * 查询用户信息
	 * 
	 * */
	@Test
	public void tesqueryUserInfo() {
		UserBaseInfo u = userBaseInfoService.getUserBaseInfo("master");
		System.out.println(u);
	}
	
	/**
	 * 查询用户url信息
	 * 
	 * */
	@Test
	public void tesqueryUserUrlInfo() {
		Map<String, Object> u = userBaseInfoService.getUserUrlInfoByLgCnt("admin");
		System.out.println(u);
	}
}
