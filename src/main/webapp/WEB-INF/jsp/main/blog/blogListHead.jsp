<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String bathPath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path;
%>
<div id="header">
	<div id="blogTitle">
		<a id="lnkBlogLogo" href="http://www.cnblogs.com/skyfsm/"><img id="blogLogo" alt="返回主页" src="/Skins/custom/images/logo.gif"></a>	
		<!--done-->
		<h1><a class="headermaintitle" id="Header1_HeaderTitle" href="http://www.cnblogs.com/skyfsm/">chnjan</a></h1>
		<h2>Don't let your dream be dream.</h2>
	</div><!--end: blogTitle 博客的标题和副标题 -->
	<div id="navigator">
		<ul id="navList">
			<li><a class="menu" id="blog_nav_sitehome" href="<%=bathPath %>">博客园</a></li>
			<li><a class="menu" id="blog_nav_myhome" href="">首页</a></li>
			<li><a class="menu" id="blog_nav_newpost" href="" rel="nofollow">新随笔</a></li>
			<li><a class="menu" id="blog_nav_contact" href="" rel="nofollow">联系</a></li>
			<li><a class="menu" id="blog_nav_rss" href="">订阅</a>
			<li><a class="menu" id="blog_nav_admin" href="">管理</a></li>
		</ul>
		<div class="blogStats">
			<div id="blog_stats">
				<span id="stats_post_count">随笔 - 50&nbsp; </span>
				<span id="stats_article_count">文章 - 0&nbsp; </span>
				<span id="stats-comment_count">评论 - 220</span>
			</div>
		</div>
	</div><!--end: navigator 博客导航栏 -->
</div><!--end: header 头部 -->