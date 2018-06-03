/**
 * 2018-4-15
 * chnjan
 * 登录验证相关
 * 
 */

function login() {
	var loginName = $("#loginName").val();
	var passWord = $("#passWord").val();
	var vilicode = $("#vali_passimg").val();
	var urlst = content + "/signin/login";
	var parm = "loginName="+loginName+"&passWord="+passWord+"&valicode="+vilicode;
	$.ajax({
		url:urlst,
		type:"POST",
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
				if(msg.desc == "验证码错误")
				{
					//验证码置空
					$("#vali_passimg").val("");
					//刷新验证码
					$("#span_vali").click();
				}
				if(msg.desc == "账号或密码错误")
				{
					//密码置空
					$("#passWord").val("");
					//验证码置空
					$("#vali_passimg").val("");
					//刷新验证码
					$("#span_vali").click();
				}
			}
			//alert(msg.code+":"+msg.desc);
		}
	});
}