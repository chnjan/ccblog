
package com.chnjan.ccblog.test.blog;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.chnjan.ccblog.common.tools.IdGenerate;
import com.chnjan.ccblog.main.domain.Blog;
import com.chnjan.ccblog.main.service.BlogService;

/**
 * @author chenjian
 * 20171216
 * blog单元测试
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
		blog.setBlogId(IdGenerate.generateId());
		blog.setTitle("测试标题");
		blog.setContent("测试内容");
		blog.setLastUpdateTime(new Date());
		blog.setAutorid("3");
		blogService.addBlog(blog);
	}
	
	//删除测试
	@Test
	public void testDelete() {
		int r = blogService.deleteBlogById("20171214001654147523");
		System.out.println("删除："+r);
	}
	
	//更新测试
	@Test
	public void testUpdate() {
		Blog blog = new Blog();
		blog.setBlogId("20171217010652583474450");
		blog.setTitle("测试而非夫人标题");
		blog.setContent("测试3の饿21完全内容");
		blog.setAutorid("5");
		int r = blogService.updateBlog(blog);
		System.out.println("更新："+r);
	}
	
	//查询测试
	@Test
	public void testQueryById() {
		Blog blog = blogService.queryBlogById("20171217010652583474450");
		System.out.println(blog);
	}
	
	//查询列表
	@Test
	public void testQueryBlogList() {
		List<Blog> result = blogService.queryBlogList();
		for (int i = 0; i < result.size(); i++) {
			System.out.println(result.get(i));
		}
	}
}
