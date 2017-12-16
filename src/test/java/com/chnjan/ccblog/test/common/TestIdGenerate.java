/**
 * 
 */
package com.chnjan.ccblog.test.common;

import org.junit.Test;

import com.chnjan.ccblog.common.tools.IdGenerate;

/**
 * @author chenjian
 * 测试id生成器
 * 20171216
 */
public class TestIdGenerate {

	@Test
	public void testGenerateId() {
		for (int i = 0; i < 10; i++) {
			String result = IdGenerate.generateId();
			System.out.println(result);
		}
		
	}
	
	@Test
	public void testGetRandomNum() {
		for (int i = 0; i < 10; i++) {
			String result = IdGenerate.getRandomCode(10);
			System.out.println(result);
		}

	}
}
