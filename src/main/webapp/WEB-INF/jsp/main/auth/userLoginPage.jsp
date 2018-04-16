<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page language="java" import="java.util.Random" %>
<%String path = request.getContextPath();
	String bathPath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path;
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>登录</title>
	<link href="<%=path %>/css/auth/auth.css" type="text/css" rel="stylesheet"/>
	<script type="text/javascript" src="<%=path %>/js/jquery/jquery-3.1.0.min.js"></script>
	<script type="text/javascript" src="<%=path %>/js/main/auth/login.js"></script>
</head>
<body>
<script type="text/javascript">
var content = "<%= bathPath%>";
$(document).ready(function(){
	$("#span_vali").on("click",function(){
		$("#valiImg").attr("src","<%=path %>/user/getvaliImg?b="+Math.random());
	});
	$("#lgin").on("click",login);
	$("#loginName").on("focus",function(){
		if($("#loginName").val()=="请输入登录账号")
		{
			$("#loginName").val("");
		}
	});
	$("#loginName").on("blur",function(){
		if($("#loginName").val()=="")
		{
			$("#loginName").val("请输入登录账号");
		}
	});
});

</script>
<div class="maindiv">
	<div>
		<form action="<%= path%>/user/login" method="post">
			<table id="table_login">
				<thead>
					<tr><td colspan="2"><span id="login_thead">登录</span></td></tr>
				</thead>
				<tbody>
					<tr><td colspan="2"><input class="input_login" id="loginName" name="account" type="text" value="请输入登录账号" /></td></tr>
					<tr><td colspan="2"><input class="input_login" id="passWord" name="passWord" type="password"/></td></tr>
					<tr>
						<td width="45%">
							<input id="vali_passimg" name="passimg" type="text" maxlength="6" />
							<span id="span_hasvali"></span>
						</td>
						<td width="65%">
							<img id="valiImg" style="width: 100px;height: 25px;float: left;" alt="验证码" src="<%=path %>/user/getvaliImg" />
							<span id="span_vali" style="background-image:url('<%=path %>/image/auth/refesh.jpg');"></span>
						</td>
					</tr>
					<tr style="text-align: center;"><td colspan="2"><input id="lgin" type="button" value="登录" /></td></tr>
				</tbody>
			</table>
		</form>
	</div>
</div>
</body>
</html>