/**
 * 
 */
package com.chnjan.ccblog.test.common;

import org.junit.Test;

import com.chnjan.ccblog.common.tools.random.RandomChars;

/**
 * @author chenjian
 * @date 2018年4月17日
 */
public class TestRandom {

	@Test
	public void testrdNumb() {
		for (int i = 0; i < 20; i++) {
			System.out.println(RandomChars.getRandomNumbers(10));
			
		}
	}
	
	@Test
	public void testrdlitwords() {
		for (int i = 0; i < 20; i++) {
			System.out.println(RandomChars.getRandomLitterWords(20));
			
		}
	}
	
	@Test
	public void testrdmixwords() {
		for (int i = 0; i < 20; i++) {
			System.out.println(RandomChars.getRandomMixWords(20));
			
		}
	}
	
	@Test
	public void testrdallwords() {
		for (int i = 0; i < 20; i++) {
			System.out.println(RandomChars.getRandomAllWords(20));
			
		}
	}
	
	@Test
	public void testrdint() {
		for (int i = 0; i < 200; i++) {
			System.out.println(RandomChars.getRandomInt(10));
			
		}
	}
}
