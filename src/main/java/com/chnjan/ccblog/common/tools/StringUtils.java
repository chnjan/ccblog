/**
 * 
 */
package com.chnjan.ccblog.common.tools;

/**
 * @author chenjian
 * 字符串处理工具类
 */
public class StringUtils {

	public static Boolean isHaveContent(String inString) {
		if (inString==null||"".equals(inString)) {
			return false;
		}
		return true;
	}
}
