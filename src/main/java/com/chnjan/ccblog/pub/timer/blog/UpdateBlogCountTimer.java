
package com.chnjan.ccblog.pub.timer.blog;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

/**
 * @author chenjian
 * 定时更新blog信息
 * 2018-01-21
 */
public class UpdateBlogCountTimer extends QuartzJobBean{

	private String cotent;
	
	@Override
	protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
		System.out.println("blog timer ssss--"+cotent);
	}

	
	public String getCotent() {
		return cotent;
	}

	public void setCotent(String cotent) {
		this.cotent = cotent;
	}

}
