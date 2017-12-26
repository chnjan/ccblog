
package com.chnjan.ccblog.test.bloguser;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.chnjan.ccblog.main.domain.UserBlogInfo;
import com.chnjan.ccblog.main.service.BlogUserService;

/**
 * @author chenjian
 * 2017-12-24
 * 测试用户信息接口
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/applicationContext.xml",
"classpath:mybatis/spring-mybatis.xml"})
public class BlogUserTest {
	@Autowired
	private BlogUserService blogUserservice;

	@Test
	public void testQueryUidByUrl() {
		String urlstring = "chnjan";
		UserBlogInfo userBlogInfo = blogUserservice.queryUserIdByUrl(urlstring);
		System.out.println(userBlogInfo);
		//assertThat(url,equalTo("master"));
		
	}
}
