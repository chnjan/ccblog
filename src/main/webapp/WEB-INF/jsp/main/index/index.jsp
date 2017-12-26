<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
			<a href="">
				订阅<!-- <img title="订阅博客园文章" style="top: 2px; position: relative;" alt="点击订阅" src="//common.cnblogs.com/images/icon_rss.gif"> -->
			</a>
		</div>
    <%@include file="/WEB-INF/jsp/main/index/index_top.jsp" %>   

    <div id="pager_top" style="display: none;"></div>
    <div class="hide" id="post_list_tips"></div>
      
    <div id="post_list">
        <c:forEach var="blog" items="${blogs }">
		<div class="post_item">
			<div class="digg">
			    <div class="diggit" onclick="DiggPost('wxshi',8053973,303448,1)"> 
					<span class="diggnum" id="digg_count_8053973">${blog.upupCount }</span>
				</div>
				<div class="clear"></div>
				<div class="digg_tip" id="digg_tip_8053973"></div>
			</div>      
			<div class="post_item_body">
				<h3><a class="titlelnk" href="http://www.cnblogs.com/wxshi/p/8053973.html" target="_blank">${blog.title }</a></h3>               	
			    <p class="post_item_summary">
				<a href="http://www.cnblogs.com/wxshi/" target="_blank">
					<img width="48" height="48" class="pfs" alt="" src="//pic.cnblogs.com/face/702365/20171201112556.png">
				</a>
				${blog.blogAbstract }
			    </p>
			    <div class="post_item_foot">                    
				    <a class="lightblue" href="http://www.cnblogs.com/wxshi/">${blog.autorName }</a> 
				       发布于 ${blog.createTime } 
				    <span class="article_comment">
				    	<a title="" class="gray" href="http://www.cnblogs.com/wxshi/p/8053973.html#commentform">评论(${blog.readCount})</a>
				    </span>
				    <span class="article_view">
				    	<a class="gray" href="http://www.cnblogs.com/wxshi/p/8053973.html">阅读(${blog.readCount })</a>
				    </span>
			    </div>
			</div>
			<div class="clear"></div>
		</div>
		</c:forEach>
		
		<!-- <div class="post_item">
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
		</div> -->

    </div>
            <script>
            	//editorPickStat(); aggSite.user.getUserInfo();
            </script>
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