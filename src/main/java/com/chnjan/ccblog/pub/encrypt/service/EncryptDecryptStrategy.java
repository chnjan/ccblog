package com.chnjan.ccblog.pub.encrypt.service;

/**
 * @author chenjian
 * 2018-03-18
 * 加密解密策略
 */
public interface EncryptDecryptStrategy {

	/**
	 * 加密
	 * @param content 待加密的内容
	 * @param key 加密密钥
	 * @return String 加密后的密文
	 * */
	String encrypt(String content, String key);
	
	/**
	 * 解密
	 * @param content 待解密的密文
	 * @param key 解密密钥
	 * @return String 解密后的明文
	 * */
	String decrypt(String content, String key);
}
