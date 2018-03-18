/**
 * 
 */
package com.chnjan.ccblog.pub.encrypt.service.impl;

import com.chnjan.ccblog.pub.encrypt.service.EncryptDecryptStrategy;

/**
 * @author chenjian
 *
 */
public class EncryptByMD5 implements EncryptDecryptStrategy {

	/** 
	 * @see com.chnjan.ccblog.pub.encrypt.service.impl.EncryptDecryptStrategy#encrypt(java.lang.String, java.lang.String)
	 * 将给定字符串内容进行MD5加密
	 * @param content 待加密内容
	 * @param key 密钥，此参数不需要，忽略
	 */
	@Override
	public String encrypt(String content, String key) {
		
		return null;
	}

	/** 
	 * 此方法不实现
	 */
	@Override
	public String decrypt(String content, String key) {
		return null;
	}

}
