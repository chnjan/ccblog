/**
 * 
 */
package com.chnjan.ccblog.test.pub.secure;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

import org.junit.Test;

import com.chnjan.ccblog.pub.secure.String4Secure;
import com.chnjan.ccblog.pub.secure.msgdigest.Md5;

/**
 * @author chenjian
 * @date 2018年4月22日
 */
public class SecureStringTest {

	@Test
	public void testString() {
		String s = "ABCDEF";
		byte[] bt = String4Secure.StringToHexbyte(s);
		System.out.println(Arrays.toString(bt));
		String rString = String4Secure.HexbyteToString(bt);
		System.out.println(rString);
	}
	
	@Test
	public void testMd5() throws NoSuchAlgorithmException, UnsupportedEncodingException {
		String string = "sfdsfdsfsf";
		String rString = Md5.digest(string);
		System.out.println(rString);
	}
}
