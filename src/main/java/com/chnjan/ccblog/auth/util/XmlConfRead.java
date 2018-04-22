/**
 * 
 */
package com.chnjan.ccblog.auth.util;

import java.io.File;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

/**
 * @author chenjian
 * @date 2018年4月22日
 * 从配置的xml中读取指定内容
 */
public class XmlConfRead {
	
	private static String authConfUrlPath = "properties/intercepturl.xml";
	
	/**
	 * 从指定路径读取配置文件
	 * @return Document文档
	 * @throws DocumentException 
	 * */
	private static Document readDocFromFile() throws DocumentException
	{
		//文件url
		String path = XmlConfRead.class.getClassLoader().getResource(authConfUrlPath).getPath();
		File conffile = new File(path);
		
		//InputStream inputStream = new FileInputStream(conffile);
		SAXReader saxReader = new SAXReader();
		//读文件
		Document document = saxReader.read(conffile);
		return document;
	}
	
	/**
	 * 返回配置的要验证的url
	 * @return Set<String>
	 * @throws DocumentException 
	 * */
	public static Set<String> getInterceptUrls(){
		Set<String> urls = new HashSet<>();
		Document doc;
		try {
			doc = readDocFromFile();
			Element rootElement = doc.getRootElement();
			//获取loginvalidlist的子节点
			Element loginvalidlist = rootElement.element("loginvalidlist");
			@SuppressWarnings("unchecked")
			List<Element> elements = loginvalidlist.elements("url");
			//遍历所有的url节点元素并将内容放到list返回
			for (Element element : elements) {
				//去掉前后空格再放入
				urls.add(element.getText().trim());
			}
		} catch (DocumentException e) {
			e.printStackTrace();
		}
		return urls;
	}

}
