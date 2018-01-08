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
	<title>error</title>
	<style type="text/css">
		html{width: 100%;height: 100%;margin: 0px;}
		body{width: 100%;height: 100%;margin: 0px;}
		div{width: 100%;height: 100%;margin: 0px;}
		#errorImg{position: relative;top:50%;left: 50%;margin: -15% auto auto -18%;}
	</style>
</head>
<body>
	<div>
		<img id="errorImg" alt="404_error" src="<%=bathPath%>/image/sys/error/errorvali.jpg">
	</div>
</body>
</html>