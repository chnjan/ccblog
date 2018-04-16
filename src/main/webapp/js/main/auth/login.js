/**
 * 2018-4-15
 * chnjan
 * 登录验证相关
 * 
 */

function login() {
	var loginName = $("#loginName").val();
	var passWord = $("#passWord").val();
	var urlst = content + "/user/login";
	var parm = "loginName="+loginName+"&passWord="+passWord;
	$.ajax({
		url:urlst,
		type:"POST",
		contenttype :"application/x-www-form-urlencoded;charset=utf-8", 
		data:parm,
		success:function(msg){
			//var msgobj = eval('('+msg+')');
			if (msg.code == "1") {
				//验证通过
				//跳转到个人主页
				var ur = content+"/blog/"+msg.data.userurl;
				location.href = ur;
			} else {
				//验证不通过
				//显示错误信息
				alert(msg.desc);
			}
			//alert(msg.code+":"+msg.desc);
		}
	});
}