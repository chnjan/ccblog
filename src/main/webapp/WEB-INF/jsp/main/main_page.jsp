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
	<link href="<%=bathPath %>/css/main.css" type="text/css" rel="stylesheet"/>
	<link href="<%=bathPath %>/css/global.css" type="text/css" rel="stylesheet"/>
</head>
<body>
<div>
	<div id="blog_list_div">
	hello main page
	</div>
	<%@include file="/WEB-INF/jsp/main/main_left.jsp" %>
	<%@include file="/WEB-INF/jsp/main/main_right.jsp" %>
</div>
</body>
</html>