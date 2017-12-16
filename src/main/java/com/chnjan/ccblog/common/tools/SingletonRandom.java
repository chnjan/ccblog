/**
 * 
 */
package com.chnjan.ccblog.common.tools;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

/**
 * @author chenjian
 * 获取随机对象单例
 */
public class SingletonRandom {
	//私有构造方法
	private SingletonRandom() {}
	
	/**
	 * 获得SecureRandom单例对象
	 * @return SecureRandom
	 * */
	public static SecureRandom getInstance() {
		return SingletonHolder.sr;
	}
	
	//私有静态内部类
	private static class SingletonHolder{
		private static SecureRandom sr = null;
		static {
			try {
				sr = SecureRandom.getInstance("SHA1PRNG");
				//设置随机对象种子
				sr.setSeed(System.currentTimeMillis()+521L);
			} catch (NoSuchAlgorithmException e) {
				sr = new SecureRandom();
				//设置随机对象种子
				sr.setSeed(System.currentTimeMillis()+521L);
			}
		}
	}

}
