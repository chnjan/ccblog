
package com.chnjan.ccblog.common.tools;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author chenjian
 * 2018-01-01
 * 分页对象
 */
public class Pagination {
	
	private final static Logger LOGGER = LogManager.getLogger(Pagination.class);
	
	/**
	 * 当前是第几页
	 * 从1开始
	 * */
	private Integer currentPage;
	/**
	 * 每页共多少条
	 * */
	private Integer pageSize;
	/**
	 * 总数
	 * */
	private Integer totleCount;
	
	/**
	 * 根据当前页和每页条数
	 * 获取查询起始位置
	 * 第一条从0开始
	 * */
	public Integer getStart()
	{
		return (currentPage-1)*pageSize;
	}
	
	/**
	 * 根据当前页和每页条数
	 * 获取查询结束位置
	 * */
	public Integer getEnd()
	{
		return currentPage*pageSize;
		
	}

	
	public Integer getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}
	
	public void setCurrentPage(String currentPage) {
		Integer i_crnt_Pg;
		try {
			i_crnt_Pg = Integer.parseInt(currentPage);
		} catch (NumberFormatException e) {
			LOGGER.error("设置当前页数时，转换错误:"+e.getStackTrace());
			i_crnt_Pg = 1;
		}
		this.setCurrentPage(i_crnt_Pg);
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	
	public void setPageSize(String pageSize) {
		Integer i_pgs;
		try {
			i_pgs = Integer.parseInt(pageSize);
		} catch (NumberFormatException e) {
			LOGGER.error("设置每页显示数时，转换错误:"+e.getStackTrace());
			i_pgs = 10;
		}
		this.setPageSize(i_pgs);
	}

	public Integer getTotleCount() {
		return totleCount;
	}

	public void setTotleCount(Integer totleCount) {
		this.totleCount = totleCount;
	}

	@Override
	public String toString() {
		return "Pagination [currentPage=" + currentPage + ", pageSize=" + pageSize + ", totleCount=" + totleCount + "]";
	}
	
	
}
