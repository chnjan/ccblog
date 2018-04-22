/**
 * 
 */
package com.chnjan.ccblog.test.auth.util;

import java.util.Set;

import org.dom4j.DocumentException;
import org.junit.Test;

import com.chnjan.ccblog.auth.util.XmlConfRead;

/**
 * @author chenjian
 * @date 2018年4月22日
 */
public class XmlConfTest {
	
	@Test
	public void testReadConf() throws DocumentException {
		Set<String> urls = XmlConfRead.getInterceptUrls();
		System.out.println(urls);
	}

}
