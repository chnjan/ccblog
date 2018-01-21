
package com.chnjan.ccblog.pub.timer;

import org.springframework.beans.factory.InitializingBean;

/**
 * @author chenjian
 * 2018-01-21
 * 定时任务管理
 */
public class globalTimerManage implements InitializingBean {

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("timer start");
	}

}
