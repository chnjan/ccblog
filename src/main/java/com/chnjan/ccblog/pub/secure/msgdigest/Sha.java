/**
 * 
 */
package com.chnjan.ccblog.pub.secure.msgdigest;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.springframework.util.StringUtils;

import com.chnjan.ccblog.pub.secure.String4Secure;

/**
 * @author chenjian
 * @date 2018年4月22日
 * sha1摘要
 */
public class Sha {

	/**
	 * sha-1摘要加密
	 * @param message 要进行计算的内容
	 * @return String 加密后的内容40位16进制字符串
	 * @throws NoSuchAlgorithmException 
	 * @throws UnsupportedEncodingException 
	 * */
	public static String digestSha1(String message) throws NoSuchAlgorithmException, UnsupportedEncodingException {
		//校验内容
		if (!StringUtils.hasText(message)) {
			return "";
		}
		MessageDigest md = MessageDigest.getInstance("SHA-1");
		byte[] rsltBytes = md.digest(message.getBytes("utf-8"));
		
		String hexStr = String4Secure.HexbyteToString(rsltBytes);
		return hexStr;
	}
	
	/**
	 * sha-256摘要加密
	 * @param message 要进行计算的内容
	 * @return String 加密后的内容 64位16进制字符串
	 * @throws NoSuchAlgorithmException 
	 * @throws UnsupportedEncodingException 
	 * */
	public static String digestSha256(String message) throws NoSuchAlgorithmException, UnsupportedEncodingException {
		//校验内容
		if (!StringUtils.hasText(message)) {
			return "";
		}
		MessageDigest md = MessageDigest.getInstance("SHA-256");
		byte[] rsltBytes = md.digest(message.getBytes("utf-8"));
		
		String hexStr = String4Secure.HexbyteToString(rsltBytes);
		return hexStr;
	}
	
	/**
	 * sha-512摘要加密
	 * @param message 要进行计算的内容
	 * @return String 加密后的内容 ,加密后的内容 128位16进制字符串
	 * @throws NoSuchAlgorithmException 
	 * @throws UnsupportedEncodingException 
	 * */
	public static String digestSha512(String message) throws NoSuchAlgorithmException, UnsupportedEncodingException {
		//校验内容
		if (!StringUtils.hasText(message)) {
			return "";
		}
		MessageDigest md = MessageDigest.getInstance("SHA-512");
		byte[] rsltBytes = md.digest(message.getBytes("utf-8"));
		
		String hexStr = String4Secure.HexbyteToString(rsltBytes);
		return hexStr;
	}
	
}
