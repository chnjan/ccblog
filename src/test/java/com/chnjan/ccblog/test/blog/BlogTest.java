
package com.chnjan.ccblog.test.blog;

import java.util.Date;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.chnjan.ccblog.main.domain.Blog;
import com.chnjan.ccblog.main.service.BlogService;

/**
 * @author chenjian
 * 20171216
 * 单元测试
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/applicationContext.xml",
	"classpath:mybatis/spring-mybatis.xml"})
public class BlogTest {
	@Resource
	private BlogService blogService;
	
	//测试新增
	@Test
	public void testinsertblog() {
		Blog blog = new Blog();
		blog.setBlogId("20171216185112365234");
		blog.setTitle("测试标题");
		blog.setContent("测试内容");
		blog.setLastUpdateTime(new Date());
		blog.setAutorid("3");
		blogService.addBlog(blog);
	}
}
