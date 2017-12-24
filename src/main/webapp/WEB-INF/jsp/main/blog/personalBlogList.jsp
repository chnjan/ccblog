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
	<title>personal blog List</title>
	<link href="<%=bathPath %>/css/blog/blog-common.css" type="text/css" rel="stylesheet"/>
	<link href="<%=bathPath %>/css/blog/bundle-SimpleMemory.css" type="text/css" rel="stylesheet"/>
</head>
<body>
<div id="home">
	<%-- <%@include file="/WEB-INF/jsp/main/blog/blogListHead.jsp" %> --%>
	<jsp:include page="/WEB-INF/jsp/main/blog/blogListHead.jsp"></jsp:include>

	<div id="main">
	<div id="mainContent">
	<div class="forFlow">
		<c:forEach var="myblog" items="${userBlogs }">
		<div class="day">
			<div class="dayTitle">
				<a id="homepage1_HomePageDays_DaysList_ctl00_ImageLink" href="http://www.cnblogs.com/skyfsm/archive/2017/12/23.html">2017年12月23日</a>				  
			</div>
			<div class="postTitle">
				<a class="postTitle2" id="homepage1_HomePageDays_DaysList_ctl00_DayList_TitleUrl_0" href="<%=bathPath %>/blog/${userUrl}/${myblog.blogId}.html">${myblog.title }</a>
			</div>
			<div class="postCon"><div class="c_b_p_desc">摘要: ${myblog.content}<a class="c_b_p_desc_readmore" href="<%=bathPath %>/blog/${userUrl}/${myblog.blogId}.html">阅读全文</a></div></div>
			<div class="clear"></div>
			<div class="postDesc">posted @ ${myblog.createTime}  ${myblog.autorName} 阅读(${myblog.readCount}) 评论(${myblog.upupCount})  <a href="https://i.cnblogs.com/EditPosts.aspx?postid=8088158" rel="nofollow">编辑</a></div>
			<div class="clear"></div>
		</div>
		</c:forEach>

		<div class="day">
			<div class="dayTitle">
				<a id="homepage1_HomePageDays_DaysList_ctl01_ImageLink" href="http://www.cnblogs.com/skyfsm/archive/2017/12/17.html">2017年12月17日</a>				  
			</div>
		
			
					<div class="postTitle">
						<a class="postTitle2" id="homepage1_HomePageDays_DaysList_ctl01_DayList_TitleUrl_0" href="http://www.cnblogs.com/skyfsm/p/8051705.html">【Keras】从两个实际任务掌握图像分类</a>
					</div>
					<div class="postCon"><div class="c_b_p_desc">摘要: 我们一般用深度学习做图片分类的入门教材都是MNIST或者CIFAR 10，因为数据都是别人准备好的，有的甚至是一个函数就把所有数据都load进来了，所以跑起来都很简单，但是跑完了，好像自己还没掌握图片分类的完整流程，因为他们没有经历数据处理的阶段，所以谈不上走过一遍深度学习的分类实现过程。今天我想给<a class="c_b_p_desc_readmore" href="http://www.cnblogs.com/skyfsm/p/8051705.html">阅读全文</a></div></div>
					<div class="clear"></div>
					<div class="postDesc">posted @ 2017-12-17 12:10 Madcola 阅读(216) 评论(1)  <a href="https://i.cnblogs.com/EditPosts.aspx?postid=8051705" rel="nofollow">编辑</a></div>
					<div class="clear"></div>
				
		</div>

		<div class="topicListFooter"><div id="nav_next_page"><a href="http://www.cnblogs.com/skyfsm/default.html?page=2">下一页</a></div></div>


	</div><!--end: forFlow -->
	</div><!--end: mainContent 主体内容容器-->

	<%@include file="/WEB-INF/jsp/main/blog/blogListSide.jsp" %>
	<div class="clear"></div>
	</div><!--end: main -->
	<div class="clear"></div>
	<div id="footer">
		Copyright ©2017 chnjan
	</div>
</div>
</body>
</html>