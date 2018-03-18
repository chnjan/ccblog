package com.chnjan.ccblog.pub.encrypt;

import com.chnjan.ccblog.pub.encrypt.service.EncryptDecryptStrategy;

/**
 * @author chenjian
 * 2018-03-18
 * 加密解密
 */
public class EncryptDecryptContext {
	
	private EncryptDecryptStrategy encryptDecryptStrategy;

	/**
	 * 使用指定的算法将给定的内容加密
	 * @param content 待加密内容
	 * @param algorithm 加密算法
	 * @param key 密钥
	 * @return String 密文
	 * */
	public static String encrypt(String content,String algorithm,String key) {
		return null;
		
	}
	
	/**
	 * 使用指定的算法将给定的内容进行摘要加密
	 * @param content 待加密内容
	 * @param algorithm 加密算法
	 * @return String 密文
	 * */
	public static String encrypt(String content,String algorithm) {
		return null;
		
	}
	
	/**
	 * 使用指定的算法将给定的内容解密
	 * @param content 待解密内容
	 * @param algorithm 解密算法
	 * @param key 密钥
	 * @return String 明文
	 * */
	public static String decrypt(String content,String algorithm,String key) {
		return null;
		
	}
	
	public EncryptDecryptStrategy getEncryptDecryptStrategy() {
		return encryptDecryptStrategy;
	}

	public void setEncryptDecryptStrategy(EncryptDecryptStrategy encryptDecryptStrategy) {
		this.encryptDecryptStrategy = encryptDecryptStrategy;
	}

}
