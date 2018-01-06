/**
 * 
 */
package com.chnjan.ccblog.test.ftp;

import java.io.File;
import java.util.Calendar;

import org.junit.Test;

import com.chnjan.ccblog.pub.ftp.FtpTools;

/**
 * @author chenjian
 * 2018-01-03
 * ftp测试类
 */
public class FtpTest {

	@Test
	public void name() {
		String path = "";
		path = "chnjan"+"/blog/image";
		Calendar calendar = Calendar.getInstance();
		Integer year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH)+12;
		int season = month/3;
		String yearStr = year.toString();
		String seasonStr = "";
		switch (season) {
		case 0:
			seasonStr = "01";
			break;
		case 1:
			seasonStr = "02";
			break;
		case 2:
			seasonStr = "03";
			break;
		case 3:
			seasonStr = "04";
			break;

		default:
			seasonStr = "";
			break;
		}
		path = path + "/"+yearStr + seasonStr;
		System.out.println(path);
	}
	@Test
	public void testftpcen() {
		
		FtpTools ft = new FtpTools();
		File file = new File("D:\\cj_proNeed\\timg.jpg");
		String rePath = ft.getImgthPath("");
		String path = ft.upLoadFileToServer(file,rePath);
		//ft.cdOrCreatDir("ty/", null);
		System.out.println(path);
	}
}
