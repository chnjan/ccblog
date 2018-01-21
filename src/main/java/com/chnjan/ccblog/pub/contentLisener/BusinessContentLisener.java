
package com.chnjan.ccblog.pub.contentLisener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @author chenjian
 * 2018-01-21
 * 业务初始化
 */
public class BusinessContentLisener implements ServletContextListener {

	
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("start web");

	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		
	}

}
