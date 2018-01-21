/**
 * 2018-01-21
 * 翻页
 */

/**
 * 下一页
 * */
function nextPage() {
	var pageUrl = $("#pageurl").val();
	var currentpage = $("#currentpage").val();
	var totlepage = $("#totlepage").val();
	currentpage = parseInt(currentpage);
	var topage = currentpage + 1;
	if (topage>totlepage) {
		$("#next").attr("disabled",true);
		return;
	} else {
		pageUrl = pageUrl + "?page=" + topage;
	}
	location.href = pageUrl;
}

/**
 * 上一页
 * */
function prePage() {
	var pageUrl = $("#pageurl").val();
	var currentpage = $("#currentpage").val();
	var totlepage = $("#totlepage").val();
	currentpage = parseInt(currentpage);
	var topage = currentpage - 1;
	if (topage<1) {
		$("#pre").attr("disabled",true);
		return;
	} else {
		pageUrl = pageUrl + "?page=" + topage;
	}
	location.href = pageUrl;
}

/**
 * 首页
 * */
function firstPage() {
	var pageUrl = $("#pageurl").val();
	location.href = pageUrl + "?page=1";
}

/**
 * 末页
 * */
function lastPage() {
	var pageUrl = $("#pageurl").val();
	var totlepage = $("#totlepage").val();
	location.href = pageUrl + "?page=" + totlepage;
}

/**
 * 跳到第x页
 * */
function gotoPage(page) {
	
}