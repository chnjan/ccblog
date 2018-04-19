/**
 * 
 */
package com.chnjan.ccblog.pub.sysparam;

import java.io.IOException;
import java.util.Properties;

/**
 * @author chenjian
 * @date 2018年4月19日
 * 读取系统配置文件参数
 */
public class SystemParamUtil {

	private static Properties properties = null;
	
	static {
		properties = new Properties();
		try {
			//加载系统参数配置文件
			properties.load(SystemParamUtil.class.getClassLoader().getResourceAsStream("properties/systemparam.properties"));
		} catch (IOException e) {
			System.out.println("加载系统参数配置文件失败"+e.getMessage());
			e.printStackTrace();
		}
	}
	
	/**
	 * 通过键值获取properties/systemparam.properties文件里的参数值
	 * @param key 键值
	 * @return String 参数值,不包含首尾空格
	 * */
	public static String getSysValue(String key) {
		return properties.getProperty(key).trim();
	}
}
