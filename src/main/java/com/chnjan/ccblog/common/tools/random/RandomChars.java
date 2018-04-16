/**
 * 
 */
package com.chnjan.ccblog.common.tools.random;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

import org.springframework.util.StringUtils;

/**
 * @author chenjian
 * @date 2018年4月16日
 * 随机字符生成
 */
public class RandomChars {
	/**
	 * 数字
	 * */
	private static String num = "0435216798";
	
	/**
	 * 小写字母
	 * */
	private static String literword = "abcdefghijklmnopqrstuvwxyz";
	
	/**
	 * 大写字母
	 * */
	private static String bigword = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	
	/**
	 * 返回指定位数的随机数字
	 * @param count 随机数字的个数
	 * @return String 随机数字字符串
	 * */
	public static String getRandomNumbers(int count) {
		String randomNumbers = getRandomCode(count,num);
		return randomNumbers;
	}
	
	/**
	 * 返回指定位数的随机字母(小写)
	 * @param count 随机字母的个数
	 * @return String 随机字母字符串
	 * */
	public static String getRandomLitterWords(int count) {
		String randomNumbers = getRandomCode(count,literword);
		return randomNumbers;
	}
	
	/**
	 * 返回指定位数的随机字母(大写)
	 * @param count 随机字母的个数
	 * @return String 随机字母字符串
	 * */
	public static String getRandomBigWords(int count) {
		String randomNumbers = getRandomCode(count,bigword);
		return randomNumbers;
	}
	
	/**
	 * 返回指定位数的随机字母(大小写混合)
	 * @param count 随机字母的个数
	 * @return String 随机字母字符串
	 * */
	public static String getRandomAllWords(int count) {
		String randomNumbers = getRandomCode(count,bigword+literword);
		return randomNumbers;
	}
	
	/**
	 * 返回指定位数的随机字母(大写小写数字混合)
	 * @param count 随机字母的个数
	 * @return String 随机字母字符串
	 * */
	public static String getRandomMixWords(int count) {
		String randomNumbers = getRandomCode(count,bigword+num+literword);
		return randomNumbers;
	}
	
	/**
	 * 获取指定个数的随机字符
	 * @param count 随机字符个数
	 * @param sets 随机字符集
	 * @return String 随机字符串
	 * */
	private static String getRandomCode(int count,String sets) {
		if (count<=0 || !StringUtils.hasText(sets)) {
			return "";
		}
		
		String randomCode = "";
		StringBuilder sb = new StringBuilder("");
		
		//获取随机对象单例
		SecureRandom random = SingletonRandomClss.sr;
	
		int randomRange = sets.length();

		//拼接指定长度的字符
		for (int i = 0; i < count; i++) {
			int charIndex = random.nextInt(randomRange);
			sb.append(sets.charAt(charIndex));
		}
		
		randomCode = sb.toString();
		return randomCode ;
	}

	//随机数算法及种子定义
	private static class SingletonRandomClss{
		private static SecureRandom sr = null;
		static {
			try {
				sr = SecureRandom.getInstance("SHA1PRNG");
				//设置随机对象种子
				sr.setSeed(System.currentTimeMillis()+1134L);
			} catch (NoSuchAlgorithmException e) {
				sr = new SecureRandom();
				//设置随机对象种子
				sr.setSeed(System.currentTimeMillis()+1134L);
			}
		}
	}
}
