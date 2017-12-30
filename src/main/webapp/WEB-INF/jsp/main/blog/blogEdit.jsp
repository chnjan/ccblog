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
	<title>edit blog</title>
	<link href="<%=bathPath %>/css/blog/blog-common.css" type="text/css" rel="stylesheet"/>
	<link href="<%=bathPath %>/css/blog/bundle-SimpleMemory.css" type="text/css" rel="stylesheet"/>
	<script type="text/javascript" charset="utf-8" src="<%=bathPath%>/js/uedit/ueditor.config.js"></script>
	<script type="text/javascript" charset="utf-8" src="<%=bathPath%>/js/uedit/ueditor.all.min.js"></script>
	<script type="text/javascript" charset="utf-8" src="<%=bathPath%>/js/uedit/lang/zh-cn/zh-cn.js"></script>
</head>
<body>
	<div id="home">
	<jsp:include page="/WEB-INF/jsp/main/blog/blogListHead.jsp"></jsp:include>
	<div id="main" style="height: 840px;">
		<div id="mainContent" style="margin-left: 0em;">
			<div class="forFlow" style="margin-left: 0em;">
				<div>
				    <script id="editor" type="text/plain" style="width:948px;height:800px;"></script>
				</div>
			</div>
		</div>
	</div>
	</div>
	<script type="text/javascript">

    //实例化编辑器
    //建议使用工厂方法getEditor创建和引用编辑器实例，如果在某个闭包下引用该编辑器，直接调用UE.getEditor('editor')就能拿到相关的实例
    var ue = UE.getEditor('editor',{
    	toolbars: [
            ['fullscreen', 'source', 'undo', 'redo', 'bold', 'link', 'emotion',
             'simpleupload']],
		autoHeightEnabled: true,		//高度可变
		autoFloatEnabled: true,			//自动浮动
		initialFrameWidth: '948',
		initialFrameHeight: '800',	//初始化高度
		elementPathEnabled: false	//不显示元素路径
		});
	</script>
</body>
</html>