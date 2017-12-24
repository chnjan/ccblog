<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<div id="sideBar">
	<div id="sideBarMain">
			
		<!--done-->
		<div class="newsItem">
			<h3 class="catListTitle">公告</h3>
			<div id="blog-news">
				<div id="profile_block">昵称：
					<a href="http://home.cnblogs.com/u/skyfsm/">Madcola</a><br>
					园龄：<a title="入园时间：2017-01-09" href="http://home.cnblogs.com/u/skyfsm/">11个月</a><br>
					粉丝：<a href="http://home.cnblogs.com/u/skyfsm/followers/">144</a><br>
					关注：<a href="http://home.cnblogs.com/u/skyfsm/followees/">20</a>
					<div id="p_b_follow"><a onclick="follow('0615e00a-49d6-e611-845c-ac853d9f53ac')" href="javascript:void(0);">+加关注</a></div>
				</div>
			</div>
			<!-- <script type="text/javascript">loadBlogNews();</script> -->
		</div>

		<!-- <div id="blog-calendar">
		<table title="Calendar" class="Cal" id="blogCalendar" cellspacing="0" cellpadding="0">
			<tbody>
				<tr>
					<td colspan="7">
						<table class="CalTitle" cellspacing="0">
							<tbody>
								<tr>
									<td class="CalNextPrev">
										<a onclick="loadBlogCalendar('2017/11/01');return false;" href="javascript:void(0);">&lt;</a>
									</td>
									<td align="center">2017年12月</td>
									<td align="right" class="CalNextPrev"><a onclick="loadBlogCalendar('2018/01/01');return false;" href="javascript:void(0);">&gt;</a></td>
								</tr>
							</tbody>
						</table>
					</td>
				</tr>
				<tr>
					<th align="center" class="CalDayHeader" abbr="日" scope="col">日</th>
					<th align="center" class="CalDayHeader" abbr="一" scope="col">一</th>
					<th align="center" class="CalDayHeader" abbr="二" scope="col">二</th>
					<th align="center" class="CalDayHeader" abbr="三" scope="col">三</th>
					<th align="center" class="CalDayHeader" abbr="四" scope="col">四</th>
					<th align="center" class="CalDayHeader" abbr="五" scope="col">五</th>
					<th align="center" class="CalDayHeader" abbr="六" scope="col">六</th>
					</tr>
				<tr>
				<td align="center" class="CalOtherMonthDay">26</td>
				<td align="center" class="CalOtherMonthDay">27</td><td align="center" class="CalOtherMonthDay">28</td><td align="center" class="CalOtherMonthDay">29</td><td align="center" class="CalOtherMonthDay">30</td><td align="center">1</td><td align="center" class="CalWeekendDay">2</td></tr><tr><td align="center" class="CalWeekendDay">3</td><td align="center">4</td><td align="center">5</td><td align="center">6</td><td align="center">7</td><td align="center">8</td><td align="center" class="CalWeekendDay">9</td></tr><tr><td align="center" class="CalWeekendDay">10</td><td align="center">11</td><td align="center"><a href="http://www.cnblogs.com/skyfsm/archive/2017/12/12.html"><u>12</u></a></td><td align="center">13</td><td align="center">14</td><td align="center">15</td><td align="center" class="CalWeekendDay">16</td></tr><tr><td align="center" class="CalWeekendDay"><a href="http://www.cnblogs.com/skyfsm/archive/2017/12/17.html"><u>17</u></a></td><td align="center">18</td><td align="center">19</td><td align="center">20</td><td align="center">21</td><td align="center">22</td><td align="center" class="CalTodayDay"><a href="http://www.cnblogs.com/skyfsm/archive/2017/12/23.html"><u>23</u></a></td></tr><tr><td align="center" class="CalWeekendDay">24</td><td align="center">25</td><td align="center">26</td><td align="center">27</td><td align="center">28</td><td align="center">29</td><td align="center" class="CalWeekendDay">30</td></tr><tr><td align="center" class="CalWeekendDay">31</td><td align="center" class="CalOtherMonthDay">1</td><td align="center" class="CalOtherMonthDay">2</td><td align="center" class="CalOtherMonthDay">3</td><td align="center" class="CalOtherMonthDay">4</td><td align="center" class="CalOtherMonthDay">5</td><td align="center" class="CalOtherMonthDay">6</td></tr>
			</tbody>
		</table>
		</div> -->
<!-- <script type="text/javascript">loadBlogDefaultCalendar();</script> -->
			
		<div id="leftcontentcontainer">
		<div id="blog-sidecolumn">
		<div class="sidebar-block" id="sidebar_search">
			<div class="mySearch" id="sidebar_search">
				<h3 class="catListTitle">搜索</h3>
				<div id="sidebar_search_box">
					<div class="div_my_zzk" id="widget_my_zzk"><input class="input_my_zzk" id="q" onkeydown="return zzk_go_enter(event);" type="text">&nbsp;<input class="btn_my_zzk" id="btnZzk" onclick="zzk_go()" type="button" value="找找看"></div>
					<div class="div_my_zzk" id="widget_my_google"><input name="google_q" class="input_my_zzk" id="google_q" onkeydown="return google_go_enter(event)" type="text">&nbsp;<input class="btn_my_zzk" onclick="google_go()" type="button" value="谷歌搜索"></div>
				</div>
			</div>
		</div>
		<div class="sidebar-block" id="sidebar_shortcut">
			<div class="catListLink">
				<h3 class="catListTitle">常用链接</h3>
				<ul>
					<li><a title="我的博客的随笔列表" href="http://www.cnblogs.com/skyfsm/p/">我的随笔</a></li>
					<li><a title="我发表过的评论列表" href="http://www.cnblogs.com/skyfsm/MyComments.html">我的评论</a></li>
					<li><a title="我评论过的随笔列表" href="http://www.cnblogs.com/skyfsm/OtherPosts.html">我的参与</a></li>
					<li><a title="我的博客的评论列表" href="http://www.cnblogs.com/skyfsm/RecentComments.html">最新评论</a></li>
					<li><a title="我的博客的标签列表" href="http://www.cnblogs.com/skyfsm/tag/">我的标签</a></li>
				</ul>
				<div id="itemListLin_con" style="display: none;">
					<ul>
					</ul>
				</div>
			</div>
		</div>
		<div class="sidebar-block" id="sidebar_toptags"></div>
		<div id="sidebar_categories">
			<div class="catListPostCategory sidebar-block" id="sidebar_postcategory">
				<h3 class="catListTitle">随笔分类<span style="font-size: 11px; font-weight: normal;">(50)</span></h3>
				<ul>
					<li><a id="CatList_LinkList_0_Link_0" href="http://www.cnblogs.com/skyfsm/category/1012247.html">C++</a> </li>
					<li><a id="CatList_LinkList_0_Link_1" href="http://www.cnblogs.com/skyfsm/category/935270.html">Linux编程(10)</a> </li>
					<li><a id="CatList_LinkList_0_Link_2" href="http://www.cnblogs.com/skyfsm/category/1123384.html">OCR系列(2)</a> </li>
					<li><a id="CatList_LinkList_0_Link_3" href="http://www.cnblogs.com/skyfsm/category/1000207.html">opencv探索(27)</a> </li>
					<li><a id="CatList_LinkList_0_Link_4" href="http://www.cnblogs.com/skyfsm/category/1074227.html">STL(2)</a> </li>
					<li><a id="CatList_LinkList_0_Link_5" href="http://www.cnblogs.com/skyfsm/category/935280.html">波折岁月(3)</a> </li>
					<li><a id="CatList_LinkList_0_Link_6" href="http://www.cnblogs.com/skyfsm/category/993807.html">机器学习之旅(3)</a> </li>
					<li><a id="CatList_LinkList_0_Link_7" href="http://www.cnblogs.com/skyfsm/category/1085234.html">数字图像处理(3)</a> </li>
				</ul>
			</div>

			<div class="catListPostArchive sidebar-block" id="sidebar_postarchive">
				<h3 class="catListTitle">随笔档案<span style="font-size: 11px; font-weight: normal;">(50)</span></h3>
				<ul>
					<li><a id="CatList_LinkList_1_Link_0" href="http://www.cnblogs.com/skyfsm/archive/2017/12.html">2017年12月 (3)</a> </li>
					<li><a id="CatList_LinkList_1_Link_1" href="http://www.cnblogs.com/skyfsm/archive/2017/11.html">2017年11月 (3)</a> </li>
					<li><a id="CatList_LinkList_1_Link_2" href="http://www.cnblogs.com/skyfsm/archive/2017/10.html">2017年10月 (1)</a> </li>
					<li><a id="CatList_LinkList_1_Link_3" href="http://www.cnblogs.com/skyfsm/archive/2017/09.html">2017年9月 (4)</a> </li>
					<li><a id="CatList_LinkList_1_Link_4" href="http://www.cnblogs.com/skyfsm/archive/2017/08.html">2017年8月 (3)</a> </li>
					<li><a id="CatList_LinkList_1_Link_5" href="http://www.cnblogs.com/skyfsm/archive/2017/07.html">2017年7月 (5)</a> </li>
					<li><a id="CatList_LinkList_1_Link_6" href="http://www.cnblogs.com/skyfsm/archive/2017/06.html">2017年6月 (4)</a> </li>
					<li><a id="CatList_LinkList_1_Link_7" href="http://www.cnblogs.com/skyfsm/archive/2017/05.html">2017年5月 (17)</a> </li>
					<li><a id="CatList_LinkList_1_Link_8" href="http://www.cnblogs.com/skyfsm/archive/2017/04.html">2017年4月 (2)</a> </li>
					<li><a id="CatList_LinkList_1_Link_9" href="http://www.cnblogs.com/skyfsm/archive/2017/02.html">2017年2月 (2)</a> </li>
					<li><a id="CatList_LinkList_1_Link_10" href="http://www.cnblogs.com/skyfsm/archive/2017/01.html">2017年1月 (6)</a> </li>
				</ul>
			</div>
		</div>
		<div class="sidebar-block" id="sidebar_scorerank">
			<div class="catListBlogRank">
			<h3 class="catListTitle">积分与排名</h3>
			<ul>
				<li class="liScore">
					积分 -	73522
				</li>
				<li class="liRank">
					排名 -	4371
				</li>
			</ul>
			</div>
		</div>
		<!-- <div class="sidebar-block" id="sidebar_recentcomments">
			<div id="recent_comments_wrap">
				<div class="catListComment">
					<h3 class="catListTitle">最新评论</h3>
					<div id="RecentCommentsBlock">
						<ul>
					        <li class="recent_comment_title"><a href="http://www.cnblogs.com/skyfsm/p/8088158.html#3872458">1. Re:读研以来的一些感想：名校好在哪里？</a></li>
					        <li class="recent_comment_body">普通学校也有讲座，有些也很不错。有时候是你没有特意去发现周围对自己成长发展有益的事情，到新环境中刻意去寻找</li>
					        <li class="recent_comment_author">--maanshancss</li>
					        <li class="recent_comment_title"><a href="http://www.cnblogs.com/skyfsm/p/8088158.html#3872436">2. Re:读研以来的一些感想：名校好在哪里？</a></li>
					        <li class="recent_comment_body">名校和普通学校最大的区别是，毕业后的人脉圈子。</li>
					        <li class="recent_comment_author">--灯火阑珊²ºº7</li>
					        <li class="recent_comment_title"><a href="http://www.cnblogs.com/skyfsm/p/8088158.html#3872414">3. Re:读研以来的一些感想：名校好在哪里？</a></li>
					        <li class="recent_comment_body">其实名校什么都是其次，你能把你手上的资源真正全部利用起来，强化自己，这才是最重要的。</li>
					        <li class="recent_comment_author">--小王子的博客</li>
					        <li class="recent_comment_title"><a href="http://www.cnblogs.com/skyfsm/p/8088158.html#3872325">4. Re:读研以来的一些感想：名校好在哪里？</a></li>
					        <li class="recent_comment_body">@YJLAugus加油吧 五年后的你会感谢现在努力的你的。...</li>
					        <li class="recent_comment_author">--一个昵称</li>
					        <li class="recent_comment_title"><a href="http://www.cnblogs.com/skyfsm/p/8088158.html#3872258">5. Re:读研以来的一些感想：名校好在哪里？</a></li>
					        <li class="recent_comment_body">我的博客<a href="" target="_blank"></a></li>
					        <li class="recent_comment_author">--吾心已无</li>
						</ul>
					</div>
				</div>
			</div>
		</div>
		<div class="sidebar-block" id="sidebar_topviewedposts">
			<div id="topview_posts_wrap">
				<div class="catListView">
					<h3 class="catListTitle">阅读排行榜</h3>
					<div id="TopViewPostsBlock"><ul><li><a href="http://www.cnblogs.com/skyfsm/p/6806246.html">1. 基于深度学习的目标检测技术演进：R-CNN、Fast R-CNN、Faster R-CNN(10532)</a></li><li><a href="http://www.cnblogs.com/skyfsm/p/6672167.html">2. 两年波折路（考研、工作、考研）(7765)</a></li><li><a href="http://www.cnblogs.com/skyfsm/p/7411961.html">3. OpenCV探索之路（二十四）图像拼接和图像融合技术(7256)</a></li><li><a href="http://www.cnblogs.com/skyfsm/p/6287787.html">4. Linux编程之UDP SOCKET全攻略(5882)</a></li><li><a href="http://www.cnblogs.com/skyfsm/p/6897313.html">5. OpenCV探索之路（十四）：绘制点、直线、几何图形(4001)</a></li></ul></div>
				</div>
			</div>
		</div>
		<div class="sidebar-block" id="sidebar_topcommentedposts">
			<div id="topfeedback_posts_wrap">
				<div class="catListFeedback">
					<h3 class="catListTitle">评论排行榜</h3>
					<div id="TopFeedbackPostsBlock"><ul><li><a href="http://www.cnblogs.com/skyfsm/p/6672167.html">1. 两年波折路（考研、工作、考研）(84)</a></li><li><a href="http://www.cnblogs.com/skyfsm/p/7411961.html">2. OpenCV探索之路（二十四）图像拼接和图像融合技术(29)</a></li><li><a href="http://www.cnblogs.com/skyfsm/p/7324346.html">3. OpenCV探索之路（二十二）：制作一个类“全能扫描王”的简易扫描软件(13)</a></li><li><a href="http://www.cnblogs.com/skyfsm/p/7253208.html">4. Opencv探索之路（二十）：制作一个简易手动图像配准工具(12)</a></li><li><a href="http://www.cnblogs.com/skyfsm/p/6872648.html">5. OpenCV探索之路（二）：图像处理的基础知识点串烧(11)</a></li></ul></div>
				</div>
			</div>
		</div>
		<div class="sidebar-block" id="sidebar_topdiggedposts">
			<div id="topdigg_posts_wrap">
				<div class="catListView">
					<h3 class="catListTitle">推荐排行榜</h3>
					<div id="TopDiggPostsBlock"><ul><li><a href="http://www.cnblogs.com/skyfsm/p/6672167.html">1. 两年波折路（考研、工作、考研）(71)</a></li><li><a href="http://www.cnblogs.com/skyfsm/p/6806246.html">2. 基于深度学习的目标检测技术演进：R-CNN、Fast R-CNN、Faster R-CNN(12)</a></li><li><a href="http://www.cnblogs.com/skyfsm/p/8088158.html">3. 读研以来的一些感想：名校好在哪里？(9)</a></li><li><a href="http://www.cnblogs.com/skyfsm/p/7868877.html">4. OpenCV探索之路（二十七）：皮肤检测技术(7)</a></li><li><a href="http://www.cnblogs.com/skyfsm/p/6790245.html">5. 卷积神经网络CNN总结(7)</a></li></ul></div>
				</div>
			</div>
		</div> -->
		</div>
		<!-- <script type="text/javascript">loadBlogSideColumn();</script> -->
		</div>
	</div><!--end: sideBarMain -->
</div><!--end: sideBar 侧边栏容器 -->