<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div id="head_top">
	<div id="logindiv">
		<c:if test="${empty sessionScope.loginCall}">
			<a class="login_regin" href="${pageContext.request.contextPath }/signin/to_login">登录</a>
			<a class="login_regin" href="javascript:void(0);">注册</a>
		</c:if>
		<c:if test="${!empty sessionScope.loginCall}">
			<a class="login_regin" href="javascript:void(0);">welcome</a>
			<a class="login_regin" href="<%=request.getContextPath() %>/blog/${sessionScope.loginCall.userUrl}">${sessionScope.loginCall.baseInfo.nickName}</a>
		</c:if>
	</div>
</div>