/**
 * 
 */
package com.chnjan.ccblog.test.pub.sysparam;

import org.junit.Test;

import com.chnjan.ccblog.pub.sysparam.SystemParamUtil;

/**
 * @author chenjian
 * @date 2018年4月19日
 */
public class SysParamUtilTest {

	@Test
	public void testGetPropertiesValue() {
		String ftpuser = SystemParamUtil.getSysValue("ftp.image.User");
		System.out.println(ftpuser);
	}
}
