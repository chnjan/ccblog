/**
 * 
 */
package com.chnjan.ccblog.common.tools.image;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.HashMap;
import java.util.Map;

import com.chnjan.ccblog.common.tools.random.RandomChars;

/**
 * @author chenjian
 * @date 2018年4月16日
 * 随机图片验证码
 */
public class RandomImage {
	/**
	 * 生成图片宽度
	 * */
	private static int width = 100;
	
	/**
	 * 生成图片高度
	 * */
	private static int height = 25;
	
	/**
	 * 生成图片高度
	 * */
	private static int lineNum = 5;

	/**
	 * 生成随机验证码图片
	 * @return Map<String, Object> radmStr随机验证码，img图片
	 * */
	public static Map<String, Object> getValidImageAndStr() {
		//创建空白图片
		BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		//获取图片的画笔
		Graphics graphics = bufferedImage.getGraphics();
		//填充图片
		graphics.setColor(new Color(220, 220, 200));
		graphics.fillRect(0, 0, width, height);
		
		//生成4位的随机字符
		String rdStr  = RandomChars.getRandomMixWords(4);
		char[] strChar = rdStr.toCharArray();
		
		//画字符
		for (int i = 0; i < strChar.length; i++) {
			int r = RandomChars.getRandomInt(256);
			int g = RandomChars.getRandomInt(256);
			int b = RandomChars.getRandomInt(256);
			int fontsize = 25-RandomChars.getRandomInt(5);
			//设置颜色
			graphics.setColor(new Color(r,g,b));
			//设置字体
			graphics.setFont(new Font(null, Font.BOLD + Font.ITALIC, fontsize));
			//设置位置
			int xposition = RandomChars.getRandomInt(10)+25*i;
			int yposition = RandomChars.getRandomInt(10)+15;
			graphics.drawString(String.valueOf(strChar[i]), xposition, yposition);
		}
		
		//画干扰线
		for (int i = 0; i < lineNum; i++) {
			int r = RandomChars.getRandomInt(256);
			int g = RandomChars.getRandomInt(256);
			int b = RandomChars.getRandomInt(256);
			//设置颜色
			graphics.setColor(new Color(r,g,b));
			
			graphics.drawLine(RandomChars.getRandomInt(width), RandomChars.getRandomInt(height)
					, RandomChars.getRandomInt(width), RandomChars.getRandomInt(height));
		}
		
		Map<String, Object> rsMap = new HashMap<>();
		rsMap.put("str", rdStr);
		rsMap.put("img", bufferedImage);
		
		return rsMap;
	}
}
