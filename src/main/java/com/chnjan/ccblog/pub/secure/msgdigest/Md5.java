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
 * @date 2018年4月21日
 * md5信息摘要加密
 */
public class Md5 {

	/**
	 * 使用MD5算法对内容进行摘要加密
	 * @param message 要加密的内容
	 * @return 返回密文,入参无内容返回""，32位16进制字符串
	 * @throws NoSuchAlgorithmException 
	 * @throws UnsupportedEncodingException 
	 * */
	public static String digest(String message) throws NoSuchAlgorithmException, UnsupportedEncodingException {
		//校验内容
		if (!StringUtils.hasText(message)) {
			return "";
		}
		MessageDigest md = MessageDigest.getInstance("MD5");
		byte[] rsltBytes = md.digest(message.getBytes("utf-8"));
		//16进制
		String hexStr = String4Secure.HexbyteToString(rsltBytes);
		/*System.out.println("16进制："+hexStr);
		byte[] tes = String4Secure.StringToHexbyte(hexStr);
		String rsltStrt = Base64.getEncoder().encodeToString(tes);
		System.out.println(rsltStrt);
		//base64编码
		String rsltStr = Base64.getEncoder().encodeToString(rsltBytes);
		return rsltStr;*/
		return hexStr;
	}
}
