
package com.chnjan.ccblog.common.tools.htmltools;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author chenjian
 * 2017-12-25
 * html字符串处理工具类
 */
public class HtmlTool {
	
	/**
	 * 定义script的正则表达式
	 * */
	private static final String REGEX_SCRIPT = "<script[^>]*?>[\\s\\S]*?<\\/script>";
	/**
	 * 定义style的正则表达式
	 * */
    private static final String REGEX_STYLE = "<style[^>]*?>[\\s\\S]*?<\\/style>";
    /**
     * 定义HTML标签的正则表达式
     * */
    private static final String REGEX_HTML = "<[^>]+>"; 
    /**
     * 定义空格回车换行符
     * */
    private static final String REGEX_SPACE = "\\s*|\t|\r|\n";
    
    /**
     * 忽略大小写的scprit的正则表达式
     * */
    private static final Pattern P_SCRIPT = Pattern.compile(REGEX_SCRIPT,Pattern.CASE_INSENSITIVE);
    /**
     * style标签
     * */
    private static final Pattern P_STYLE = Pattern.compile(REGEX_STYLE, Pattern.CASE_INSENSITIVE);
    /**
     * html标签
     * */
    private static final Pattern P_HTML = Pattern.compile(REGEX_HTML, Pattern.CASE_INSENSITIVE);
    /**
     * 空格回车标签
     * */
    private static final Pattern P_SPACE = Pattern.compile(REGEX_SPACE, Pattern.CASE_INSENSITIVE);
    
    /**
     * @param htmlStr html字符串
     * @return
     *  删除Html标签
     */
    public static String delHTMLTag(String htmlStr) {
        Matcher matcherScript = P_SCRIPT.matcher(htmlStr);
        // 过滤script标签
        htmlStr = matcherScript.replaceAll(""); 

        Matcher matcherStyle = P_STYLE.matcher(htmlStr);
        // 过滤style标签
        htmlStr = matcherStyle.replaceAll(""); 

        Matcher matcherHtml = P_HTML.matcher(htmlStr);
        // 过滤html标签
        htmlStr = matcherHtml.replaceAll(""); 

        Matcher matcherSpace = P_SPACE.matcher(htmlStr);
        // 过滤空格回车标签
        htmlStr = matcherSpace.replaceAll("");
        // 返回文本字符串
        return htmlStr.trim();
    }
    
    public static String getTextFromHtml(String htmlStr){
    	htmlStr = delHTMLTag(htmlStr);
    	htmlStr = htmlStr.replaceAll("&nbsp;", "");
    	htmlStr = htmlStr.substring(0, htmlStr.indexOf("。")+1);
    	return htmlStr;
    }

}
