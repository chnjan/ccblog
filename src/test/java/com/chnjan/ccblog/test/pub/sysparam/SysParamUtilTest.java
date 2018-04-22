/**
 * 
 */
package com.chnjan.ccblog.test.pub.sysparam;

import java.security.Provider;
import java.security.Security;

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
	
	@Test
	public void showProviders() {
		Provider[] providers = Security.getProviders();
		for (int i = 0; i < providers.length; i++) {
			System.out.println(providers[i].getName()+":"+providers[i].getInfo());
			
		}
	}
}
