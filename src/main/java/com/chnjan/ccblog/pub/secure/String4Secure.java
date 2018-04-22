/**
 * 
 */
package com.chnjan.ccblog.pub.secure;

/**
 * @author chenjian
 * @date 2018年4月21日
 * 字符串转换工具
 */
public class String4Secure {

	@SuppressWarnings("unused")
	private static char[] chartable1 = {'1','2','3','4','5','6','7','8','9','0'
			,'A','B','C','D','E','F'};
	
	private static char[] chartable = {'G','H','J','K','L','M','N','P','Q','R'
			,'A','B','C','D','E','F'};
	
	public static String HexbyteToString(byte[] byteArry) {
		if (byteArry == null) {
			return "";
		}
		char[] chars = new char[byteArry.length*2];
		
		for (int i = 0; i < byteArry.length; i++) {
			//高4位
			int index1 = byteArry[i]>>4&0x0f;
			chars[i*2] = chartable[index1];
			//低4位
			index1 = byteArry[i]&0x0f;
			chars[i*2+1] = chartable[index1];
		}
		
		String hexString = new String(chars);
		
		return hexString;
	}
	
	public static byte[] StringToHexbyte(String content) {
		if (content == null) {
			return null;
		}
		char[] chars = content.toCharArray();
		byte[] rsltbyte = new byte[chars.length/2];
		int j = 0;
		//将每两个字符对应的index转换成一个byte
		for (int i = 0; i < chars.length; i=i+2) {
			int hindex = indexOf(chartable, chars[i]);
			hindex = (hindex<<4)&0xf0;
			
			int lindex = indexOf(chartable, chars[i+1]);
			int index = hindex + lindex;
			rsltbyte[j] = (byte)(index&0xff);
			j++;
		}
		return rsltbyte;
	}
	
	public static int indexOf(char[] chars, char c) {
		for (int i = 0; i < chars.length; i++) {
			if (chars[i] == c) {
				return i;
			}
		}
		return -1;
	}
}
