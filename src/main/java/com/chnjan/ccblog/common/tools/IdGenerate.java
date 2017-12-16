package com.chnjan.ccblog.common.tools;

import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author chenjian
 * 生成唯一id
 *
 */
public class IdGenerate {
	private static final Logger LOGGER = LogManager.getLogger(IdGenerate.class);
	
	/**
	 * 获取唯一的id
	 * 由时间戳+6位随机码组成
	 * @return String
	 * */
	public static String generateId() {
		//唯一id
		String uniqueId = "";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSSS");
		
		//获取6位随机码
		String randomCode = getRandomCode(6);
		
		//结果
		uniqueId = sdf.format(new Date()) + randomCode;
		LOGGER.debug("生成id："+uniqueId);
		return uniqueId ;
	}
	
	
	/**
	 * 获取指定位数的随机码
	 * @param count 随机码的位数
	 * @return String 随机码
	 * 
	 * */
	public static String getRandomCode(int count) {
		if (count<=0) {
			return "";
		}
		
		String randomCode = "";
		StringBuilder sb = new StringBuilder("");
		
		//获取随机对象单例
		SecureRandom random = SingletonRandom.getInstance();
		LOGGER.debug("随机算法："+random.getAlgorithm());
		//随机字符的范围
		String numRange = "1235689074";

		//拼接指定长度的字符
		for (int i = 0; i < count; i++) {
			int charIndex = random.nextInt(10);
			sb.append(numRange.charAt(charIndex));
		}
		
		randomCode = sb.toString();
		return randomCode ;
	}

}
