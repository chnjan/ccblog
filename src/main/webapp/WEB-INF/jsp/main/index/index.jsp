<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String bathPath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path;
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>cc-blog</title>
	<link href="<%=bathPath %>/css/aggsite.css" type="text/css" rel="stylesheet"/>
</head>
<body>
<div id="wrapper">
    <%@include file="/WEB-INF/jsp/main/index/loginHead.jsp" %>
    <%@include file="/WEB-INF/jsp/main/index/logoHead.jsp" %>
    <%@include file="/WEB-INF/jsp/main/index/index_menu.jsp" %>
    <div id="main">
        <div class="post_nav_block_wrapper">
            <ul class="post_nav_block">
                    <li><a class="current_nav" href="/">首页</a></li>
                    <li><a title="编辑精选博文" href="/pick/">精华</a></li>
                    <li><a title="候选区的博文" href="/candidate/">候选</a></li>
                    <li><a title="新闻频道最新新闻" href="/news/">新闻</a></li>
                    <li><a title="我关注博客的最新博文" href="/following">关注</a></li>
                    <li><a title="我评论过的博文" href="/aggsite/mycommented">我评</a></li>
                    <li><a title="我推荐过的博文" href="/aggsite/mydigged">我赞</a></li>
            </ul>
            <div class="clear"></div>
        </div>
        <div class="rss_link" id="rss_block">
			<span id="posts_refresh_tips"></span>
			<a title="刷新博文列表" class="refresh" id="posts_refresh" onclick="aggSite.loadCategoryPostList();return false" href="#">刷新</a>
			<a href="http://feed.cnblogs.com/blog/sitehome/rss">
				订阅<!-- <img title="订阅博客园文章" style="top: 2px; position: relative;" alt="点击订阅" src="//common.cnblogs.com/images/icon_rss.gif"> -->
			</a>
		</div>
       <%@include file="/WEB-INF/jsp/main/index/index_top.jsp" %>   

        

        
      <div id="pager_top" style="display: none;"></div>
      <div class="hide" id="post_list_tips"></div>
      
      <div id="post_list">
                
		<div class="post_item">
		<div class="digg">
		    <div class="diggit" onclick="DiggPost('wxshi',8053973,303448,1)"> 
			<span class="diggnum" id="digg_count_8053973">0</span>
			</div>
			<div class="clear"></div>
			<div class="digg_tip" id="digg_tip_8053973"></div>
		</div>      
		<div class="post_item_body">
			<h3><a class="titlelnk" href="http://www.cnblogs.com/wxshi/p/8053973.html" target="_blank">使用TensorFlow实现DNN</a></h3>               	
		    <p class="post_item_summary">
		<a href="http://www.cnblogs.com/wxshi/" target="_blank"><img width="48" height="48" class="pfs" alt="" src="//pic.cnblogs.com/face/702365/20171201112556.png"></a>    这一节使用TF实现一个多层神经网络模型来对 数据集进行分类，这里我们设计一个含有两个隐藏层的神经网络，在输出部分使用softmax对结果进行预测。 使用高级API实现多层神经网络 这里我们使用 包，这是一个高度封装的包，里面包含了许多类似 一些实用的方法。 先引入数据 模型的主要代码 其中 这个方法 ...
		    </p>              
		    <div class="post_item_foot">                    
		    <a class="lightblue" href="http://www.cnblogs.com/wxshi/">Wanna_Go</a> 
		    发布于 2017-12-18 00:22 
		    <span class="article_comment"><a title="" class="gray" href="http://www.cnblogs.com/wxshi/p/8053973.html#commentform">
		        评论(0)</a></span><span class="article_view"><a class="gray" href="http://www.cnblogs.com/wxshi/p/8053973.html">阅读(2)</a></span></div>
		</div>
		<div class="clear"></div>
		</div>
		<div class="post_item">
		<div class="digg">
		    <div class="diggit" onclick="DiggPost('xiaohuochai',8050983,221787,1)"> 
			<span class="diggnum" id="digg_count_8050983">0</span>
			</div>
			<div class="clear"></div>
			<div class="digg_tip" id="digg_tip_8050983"></div>
		</div>      
		<div class="post_item_body">
			<h3><a class="titlelnk" href="http://www.cnblogs.com/xiaohuochai/p/8050983.html" target="_blank">面向对象的设计原则</a></h3>               	
		    <p class="post_item_summary">
		<a href="http://www.cnblogs.com/xiaohuochai/" target="_blank"><img width="48" height="48" class="pfs" alt="" src="//pic.cnblogs.com/face/740839/20150730225601.png"></a>    前面的话 面向对象的设计原则，可以说每种设计模式都是为了让代码迎合其中一个或多个原则而出现的， 它们本身已经融入了设计模式之中，给面向对象编程指明了方向。适合javascript开发的设计原则包括是单一职责原则、最少知识原则和开放封闭原则。本文将详细介绍面向对象的设计原则 单一职责原则 就一个类而言 ...
		    </p>              
		    <div class="post_item_foot">                    
		    <a class="lightblue" href="http://www.cnblogs.com/xiaohuochai/">小火柴的蓝色理想</a> 
		    发布于 2017-12-18 00:21 
		    <span class="article_comment"><a title="" class="gray" href="http://www.cnblogs.com/xiaohuochai/p/8050983.html#commentform">
		        评论(0)</a></span><span class="article_view"><a class="gray" href="http://www.cnblogs.com/xiaohuochai/p/8050983.html">阅读(4)</a></span></div>
		</div>
		<div class="clear"></div>
		</div>
		<div class="post_item">
		<div class="digg">
		    <div class="diggit" onclick="DiggPost('ln-0407',8053878,391598,1)"> 
			<span class="diggnum" id="digg_count_8053878">0</span>
			</div>
			<div class="clear"></div>
			<div class="digg_tip" id="digg_tip_8053878"></div>
		</div>      
		<div class="post_item_body">
			<h3><a class="titlelnk" href="http://www.cnblogs.com/ln-0407/p/8053878.html" target="_blank">信协第一学期考核</a></h3>               	
		    <p class="post_item_summary">
		    （普通题一题20分） 共七道题 选做 题目一：数组（array） 从键盘输入一个长度为N（比如10）的整型数组，第一行输出小于零的数，第二行输出零的个数，第三行输出大于零的数，维持原数组顺序，不进行排序。 输入描述&nbsp;：第一行键盘输入 n，第二行输入n个数。 输出描述： 第一行输出小于零的数，第二行输 ...
		    </p>              
		    <div class="post_item_foot">                    
		    <a class="lightblue" href="http://www.cnblogs.com/ln-0407/">20175207冷南</a> 
		    发布于 2017-12-17 23:29 
		    <span class="article_comment"><a title="" class="gray" href="http://www.cnblogs.com/ln-0407/p/8053878.html#commentform">
		        评论(0)</a></span><span class="article_view"><a class="gray" href="http://www.cnblogs.com/ln-0407/p/8053878.html">阅读(16)</a></span></div>
		</div>
		<div class="clear"></div>
		</div>
		<div class="post_item">
		<div class="digg">
		    <div class="diggit" onclick="DiggPost('sunshine-2015',8053867,256323,1)"> 
			<span class="diggnum" id="digg_count_8053867">0</span>
			</div>
			<div class="clear"></div>
			<div class="digg_tip" id="digg_tip_8053867"></div>
		</div>      
		<div class="post_item_body">
			<h3><a class="titlelnk" href="http://www.cnblogs.com/sunshine-2015/p/8053867.html" target="_blank">dubbo源码—dubbo自定义spring xml标签</a></h3>               	
		    <p class="post_item_summary">
		<a href="http://www.cnblogs.com/sunshine-2015/" target="_blank"><img width="48" height="48" class="pfs" alt="" src="//pic.cnblogs.com/face/846961/20151128161653.png"></a>    dubbo为了和spring更好的集成，提供了一些xml配置标签，也就是自定义标签 spring自定义标签 spring自定义标签的方式如下： 1. 设计配置属性和JavaBean 2. 编写xsd文件，校验xml属性和便于编辑器提示 3. 编写NamespaceHandler和BeanDefini ...
		    </p>              
		    <div class="post_item_foot">                    
		    <a class="lightblue" href="http://www.cnblogs.com/sunshine-2015/">lacker</a> 
		    发布于 2017-12-17 23:23 
		    <span class="article_comment"><a title="" class="gray" href="http://www.cnblogs.com/sunshine-2015/p/8053867.html#commentform">
		        评论(0)</a></span><span class="article_view"><a class="gray" href="http://www.cnblogs.com/sunshine-2015/p/8053867.html">阅读(18)</a></span></div>
		</div>
		<div class="clear"></div>
		</div>
		<div class="post_item">
		<div class="digg">
		    <div class="diggit" onclick="DiggPost('saper',8045300,44834,1)"> 
			<span class="diggnum" id="digg_count_8045300">1</span>
			</div>
			<div class="clear"></div>
			<div class="digg_tip" id="digg_tip_8045300"></div>
		</div>      
		<div class="post_item_body">
			<h3><a class="titlelnk" href="http://www.cnblogs.com/saper/p/8045300.html" target="_blank">入职一周</a></h3>               	
		    <p class="post_item_summary">
		<a href="http://www.cnblogs.com/saper/" target="_blank"><img width="48" height="48" class="pfs" alt="" src="//pic.cnblogs.com/face/41253/20161006205252.png"></a>    很意外的是我又一次跳槽了，而且是在一年内经历了三家公司。相对其他同事朋友而言，频繁更换工作环境使得我的经历其实更加丰富，见识到了很多的项目，不管是烂项目也好，优秀的项目也罢，都使我眼界大开，积累不少经验和教训；同时也见识到了三家不同企业的信息化建设程度，不管是信息化沙漠也好，稳健庞大的信息化架构也好 ...
		    </p>              
		    <div class="post_item_foot">                    
		    <a class="lightblue" href="http://www.cnblogs.com/saper/">SAP梦心</a> 
		    发布于 2017-12-17 23:21 
		    <span class="article_comment"><a title="2017-12-18 00:19" class="gray" href="http://www.cnblogs.com/saper/p/8045300.html#commentform">
		        评论(1)</a></span><span class="article_view"><a class="gray" href="http://www.cnblogs.com/saper/p/8045300.html">阅读(48)</a></span></div>
		</div>
		<div class="clear"></div>
		</div>
		<div class="post_item">
		<div class="digg">
		    <div class="diggit" onclick="DiggPost('zhh19981104',8053861,390584,1)"> 
			<span class="diggnum" id="digg_count_8053861">1</span>
			</div>
			<div class="clear"></div>
			<div class="digg_tip" id="digg_tip_8053861"></div>
		</div>      
		<div class="post_item_body">
			<h3><a class="titlelnk" href="http://www.cnblogs.com/zhh19981104/p/8053861.html" target="_blank">NGUI_Button</a></h3>               	
		    <p class="post_item_summary">
		<a href="http://www.cnblogs.com/zhh19981104/" target="_blank"><img width="48" height="48" class="pfs" alt="" src="//pic.cnblogs.com/face/1265195/20171025162419.png"></a>    十、按钮，Button 1、按钮的核心作用： 按钮能够接收单击并触发响应事件 按钮单击时能同时触发多个响应事件 按钮可以有普通、悬停、单击、禁用等多个状态的不同表现 广泛的说，按钮的核心在于接收事件 2、创建按钮： 【注意】：Laber的深度要高于这个按钮的深度 小提示：创建出来的Sprite记得单 ...
		    </p>              
		    <div class="post_item_foot">                    
		    <a class="lightblue" href="http://www.cnblogs.com/zhh19981104/">张三疯_1998</a> 
		    发布于 2017-12-17 23:21 
		    <span class="article_comment"><a title="" class="gray" href="http://www.cnblogs.com/zhh19981104/p/8053861.html#commentform">
		        评论(0)</a></span><span class="article_view"><a class="gray" href="http://www.cnblogs.com/zhh19981104/p/8053861.html">阅读(9)</a></span></div>
		</div>
		<div class="clear"></div>
		</div>
		<div class="post_item">
		<div class="digg">
		    <div class="diggit" onclick="DiggPost('lsgcoder101',8053767,165272,1)"> 
			<span class="diggnum" id="digg_count_8053767">0</span>
			</div>
			<div class="clear"></div>
			<div class="digg_tip" id="digg_tip_8053767"></div>
		</div>      
		<div class="post_item_body">
			<h3><a class="titlelnk" href="http://www.cnblogs.com/lsgcoder101/p/8053767.html" target="_blank">Python--Pycharm backup_ver1.py 控制台一直Backup FAILED</a></h3>               	
		    <p class="post_item_summary">
		<a href="http://www.cnblogs.com/lsgcoder101/" target="_blank"><img width="48" height="48" class="pfs" alt="" src="//pic.cnblogs.com/face/572296/20140826204151.png"></a>    1、windows不自带zip，需自行安装，http://gnuwin32.sourceforge.net/packages/zip.htm 2、安装后，要配置环境变量：PATH 3、简明Python教程 （A Byte of Python）中的 backup_ver1.py 代码 4、第一次运行的 ...
		    </p>              
		    <div class="post_item_foot">                    
		    <a class="lightblue" href="http://www.cnblogs.com/lsgcoder101/">~茶~</a> 
		    发布于 2017-12-17 22:59 
		    <span class="article_comment"><a title="" class="gray" href="http://www.cnblogs.com/lsgcoder101/p/8053767.html#commentform">
		        评论(0)</a></span><span class="article_view"><a class="gray" href="http://www.cnblogs.com/lsgcoder101/p/8053767.html">阅读(11)</a></span></div>
		</div>
		<div class="clear"></div>
		</div>
   

      </div>
            <script>editorPickStat(); aggSite.user.getUserInfo();</script>
            <script type="text/javascript">
                //var aggSiteModel = {"CategoryType":"SiteHome","ParentCategoryId":0,"CategoryId":808,"PageIndex":1,"TotalPostCount":4000,"ItemListActionName":"PostList"};
            </script>
            <div id="pager_bottom">
            	<div id="paging_block">
            		<div class="pager">
            			<a class="p_1 current" onclick="aggSite.loadCategoryPostList(1,20);buildPaging(1);return false;" href="/">1</a>
            			<a class="p_2 middle" onclick="aggSite.loadCategoryPostList(2,20);buildPaging(2);return false;" href="/sitehome/p/2">2</a>
            			<a class="p_3 middle" onclick="aggSite.loadCategoryPostList(3,20);buildPaging(3);return false;" href="/sitehome/p/3">3</a>
            			<a class="p_4 middle" onclick="aggSite.loadCategoryPostList(4,20);buildPaging(4);return false;" href="/sitehome/p/4">4</a>
            			<a class="p_5 middle" onclick="aggSite.loadCategoryPostList(5,20);buildPaging(5);return false;" href="/sitehome/p/5">5</a>
            			<a class="p_6 middle" onclick="aggSite.loadCategoryPostList(6,20);buildPaging(6);return false;" href="/sitehome/p/6">6</a>
            			<a class="p_7 middle" onclick="aggSite.loadCategoryPostList(7,20);buildPaging(7);return false;" href="/sitehome/p/7">7</a>
            			<a class="p_8 middle" onclick="aggSite.loadCategoryPostList(8,20);buildPaging(8);return false;" href="/sitehome/p/8">8</a>
            			<a class="p_9 middle" onclick="aggSite.loadCategoryPostList(9,20);buildPaging(9);return false;" href="/sitehome/p/9">9</a>
            			<a class="p_10 middle" onclick="aggSite.loadCategoryPostList(10,20);buildPaging(10);return false;" href="/sitehome/p/10">10</a>
            			<a class="p_11 middle" onclick="aggSite.loadCategoryPostList(11,20);buildPaging(11);return false;" href="/sitehome/p/11">11</a>
            			<span class="ellipsis">···</span>
            			<a class="p_200 last" onclick="aggSite.loadCategoryPostList(200,20);buildPaging(200);return false;" href="/sitehome/p/200">200</a>
            			<a onclick="aggSite.loadCategoryPostList(2,20);buildPaging(2);return false;" href="/sitehome/p/2">Next &gt;</a>
            		</div>
            	</div>
            	<script type="text/javascript">
            		/*var pagingBuider={"OnlyLinkText":false,"TotalCount":4000,"PageIndex":1,"PageSize":20,"ShowPageCount":5,"SkipCount":0,"UrlFormat":"/sitehome/p/{0}","OnlickJsFunc":"aggSite.loadCategoryPostList()","FirstPageLink":"/","AjaxUrl":"/mvc/ToolkitPaging/load.aspx","AjaxCallbak":null,"TopPagerId":"pager_top","IsRenderScript":true};
            		function buildPaging(pageIndex)
            		{pagingBuider.PageIndex=pageIndex;$.ajax({url:pagingBuider.AjaxUrl,data:JSON.stringify(pagingBuider),type:'post',dataType:'text',contentType:'application/json; charset=utf-8',success:function (data) { $('#paging_block').html(data);
            		var pagerTop=$('#pager_top');
            		if(pageIndex>1)
            		{$(pagerTop).html(data).show();}
            		else{$(pagerTop).hide();}}});}*/</script>
			</div>
       <%@include file="/WEB-INF/jsp/main/index/index_left.jsp" %>
       <%@include file="/WEB-INF/jsp/main/index/index_right.jsp" %>
       </div>
       <%@include file="/WEB-INF/jsp/main/index/foot_friendslink.jsp" %>
       <%@include file="/WEB-INF/jsp/main/index/foot.jsp" %>
    </div>
</body>
</html>