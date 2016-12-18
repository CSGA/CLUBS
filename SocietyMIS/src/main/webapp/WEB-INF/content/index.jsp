<%@ page contentType="text/html; charset=GBK" language="java" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
	<head>
		<meta charset="utf-8">
		<link href="css/index.css" type="text/css" rel="stylesheet">
		
	</head>
	<body id="top">
		<div class="jdm-toolbar-wrap J-wrap">                
			<div class="jdm-toolbar J-toolbar">                    
				<div class="jdm-toolbar-panels J-panel">                                             
				</div>                                       
				                   
			               
			<div class="jdm-toolbar-mini">                    
			</div>                
		</div>                
		<div id="J-toolbar-load-hook" clstag="h|keycount|cebianlan_h|load"></div>            
	</div>
		<!-----------------------------------------顶部-------------->
		<header id="header">
			<div class="header-box">
				<ul class="header-right">
                    <li class="my bj">
						<a href="#">
						${session.user.students_id} 
						<%@page import="cn.edu.cumt.ec.entity.Users"%> 
						<% Users user= (Users)session.getAttribute("user");%>
						<%=user.getStudents_id()%>
						</a>
						<i class="ci-right ">
							<s class="jt">◇</s> 
						</i>
						<div class="my1">
                            <img src="./images/no-img_mid_.jpg">
								<div class="my3">
									<h3 class="neirong2"><a href="huiyuan.html">您好，会员注册</a></h3>
									<h3 class="neirong2"><a href="shetuanzhuce.html">您好，社团注册</a></h3>
									<h3 class="neirong2"><a href="shelianzhuce.html">您好，社联注册</a></h3>
								</div>
							
						</div>
					</li>
                     <li class="my bj">
						<a href="#">我要报名</a>
						<i class="ci-right ">
							<s class="jt"></s>
						</i>
						<div class="my1">
                            <img src="./images/no-img_mid_.jpg">
								<div class="my3">
									<h3 class="neirong2"><a href="club_clubshow">报名加入社团</a></h3>
									<h3 class="neirong2"><a href="activity_activityshow">报名参加活动</a></h3>
									
								</div>
							
						</div>
					</li>
					 <li class="my bj">
						<a href="#">个人空间</a>
						<i class="ci-right ">
							<s class="jt"></s>
						</i>
						<div class="my1">
                            <img src="./images/no-img_mid_.jpg">
								<div class="my3">
									<h3 class="neirong2"><a href="club_myclub?students_id=${session.user.students_id}">我的社团</a></h3>
									<h3 class="neirong2"><a href="activity_activityshow">我的活动</a></h3>
									<h3 class="neirong2"><a href="club_clubshow">我的信息</a></h3>
								</div>
							
						</div>
					</li>
					<li class="denglu"><a href="backlogin">社团登录</a> 
                    <li class="denglu"><a href="shetuanxinxi">所有社团联系方式</a> 
                    
					<li class="shu"></li>
					<li class="shu"></li>
					
					<li class="shu"></li>
                   
					
		</header>
		
		
		<div class="clear"></div>
		<!--轮播图上方导航栏  一栏-->
		
		<div class="focus">
			<div class="focus-a">
				<div class="fouc-img1"><img src="./images/beijing.jpg" class="nav-img2"></div>
				<div class="fouc-font"><a href="shetuan">全部社团分类</a> </div>
			</div>
			
			
			<!--轮播图左边当行蓝-->
			<div class="bb"></div>
			<div class="dd-inner">
				<div class="font-item">
					<div class="item fore1">
						<h3><a href="">学术科技类</a></h3>
						<i>></i>
					</div>
					<div class="font-item1">
						<div class="font-left">
							<div class="one"><a href="">级别<i>></i></a></div>
							
						</div>
						<div class="font-lefty">
							<dl class="fore1">
								<dt><a href="">校级<i>></i></a></dt>							
								<dd>
									<a href="kexie">科协</a><a href="">创意社</a><a href="">电子协会</a><a href="">数学建模协会</a><a href="">星河天文学社</a>
									
								</dd>
							</dl>
							<dl class="fore1">
								<dt><a href="">院级<i>></i></a></dt>							
								<dd>
									<a href="">影视协会</a><a href="">网络联盟</a><a href="">学科竞赛协会</a><a href="">证券投资协会</a><a href="">社交游戏社</a>
									
								</dd>
							</dl>
							
						</div>
						
						
					</div>
				</div>
				<div class="fore-2">
					<div class="item fore2">
						<h3>
							<a href="">公益实践类</a>
						</h3>
						<i>></i>
					</div>
					<div class="font-item1">
						<div class="font-left">
							<div class="one"><a href="">级别<i>></i></a></div>
							
						</div>
						<div class="font-lefty">
							<dl class="fore1">
								<dt><a href="">校级<i>></i></a></dt>
								<dd>
									<a href="">创业者协会</a><a href="">校青协</a><a href="">创业者之家</a><a href="">红十字协会</a><a href="">新长城自强社</a>					
								</dd>
							</dl>
							<dl class="fore1">
								<dt><a href="">院级<i>></i></a></dt>
								<dd>
									<a href="">环保协会</a><a href="">社工学社</a>
								</dd>
							</dl>
														
						</div>
						
						
					</div>
				</div>
				<div class="fore-3">
					<div class="item fore3">
						<h3>
							<a href="">体育、</a>
							<a href="">竞技类</a>
						</h3>
						<i>></i>
					</div>
					<div class="font-item1">
						<div class="font-left">
							<div class="one"><a href="">级别<i>></i></a></div>
							
						</div>
						<div class="font-lefty">
							<dl class="fore1">
								<dt><a href="">校级<i>></i></a></dt>
								<dd>
									<a href="#">定向运动协会</a>
									<a href="#">健身俱乐部</a>
									<a href="#">金石棋社</a>
									<a href="#">轮滑社</a>
									<a href="#">台球协会</a>
									
								</dd>
							</dl>
							<dl class="fore1">
								<dt><a href="">院级<i>></i></a></dt>
								<dd>
									<a href="#">乒羽协会</a>
									<a href="#">跆拳道协会</a>
									<a href="#">网球协会</a>
									<a href="#">武术协会</a>
									<a href="#">足球协会</a>
									
								</dd>
							</dl>
							
						</div>
						
						
					</div>
				</div>
				<div class="fore-4">
					<div class="item fore4">
						<h3>
							<a href="##">文学修养类</a>
							
						</h3>
						<i>></i>
					</div>
					<div class="font-item1">
						<div class="font-left">
							<div class="one"><a href="">级别<i>></i></a></div>
							
						</div>
						<div class="font-lefty">
							<dl class="fore1">
								<dt><a href="">校级<i>></i></a></dt>
							
								<dd>
									<a href="#">文学社</a>
									<a href="#">读书协会</a>
									<a href="#">镜湖国学馆</a>
									<a href="#">演讲与口才协会</a>
									<a href="#">阳光英语俱乐部</a>
									<a href="#">文史学社</a>
									
								</dd>
							</dl>
							<dl class="fore1">
								<dt><a href="#">院级<i>></i></a></dt>
							
								<dd>
									<a href="#">嘉荷文学社</a>
									<a href="#">采薇英语</a>
									<a href="#">诵读协会</a>
									<a href="#">文史学社</a>
									
								</dd>
							</dl>
							
						</div>
						
						
					</div>
				</div>
				<div class="fore-5">
					<div class="item fore5">
						<h3>
							<a href="##">文艺娱乐类社团</a>
							
						</h3>
						<i>></i>
					</div>
					<div class="font-item1">
						<div class="font-left">
							<div class="one"><a href="">级别<i>></i></a></div>
							
						</div>
						<div class="font-lefty">
							<dl class="fore1">
								<dt><a href="">校级<i>></i></a></dt>
							
								<dd>
									<a href="#">古韵音乐社</a>
									<a href="#">校管乐团</a>
									<a href="#">海天音乐社</a>
									<a href="#">校礼仪</a>
									<a href="#">美术协会</a>
									<a href="#">书法协会</a>
									<a href="#">舞蹈协会</a>
									<a href="#">魔术协会</a>
									
								</dd>
							</dl>
							<dl class="fore1">
								<dt><a href="##">院级<i>></i></a></dt>
							
								<dd>
									<a href="#">彩虹艺术团</a>
									<a href="#">灵韵音乐社</a>
									<a href="#">舞空间</a>
									
								</dd>
							</dl>
							
						</div>
						
						
					</div>
				</div>
				<div class="fore-6">
					<div class="item fore6">
						<h3>
							<a href="">理论学习类</a>
							
						</h3>
						<i>></i>
					</div>
					<div class="font-item1">
						<div class="font-left">
							<div class="one"><a href="">级别<i>></i></a></div>
							
						</div>
						<div class="font-lefty">
							<dl class="fore1">
								<dt><a href="">校级<i>></i></a></dt>
							
								<dd>
									<a href="">青年廉政文化研习社</a>
									
								</dd>
							</dl>
							<dl class="fore1">
								<dt><a href="">院级<i>></i></a></dt>
							
								<dd>
									<a href="">邓研社</a>
								
						</div>
						
						
					</div>
				</div>
				<div class="fore-7">
					<div class="item fore7">
						<h3>
							<a href="">学生会</a>
							
						</h3>
						<i>></i>
					</div>
					<div class="font-item1">
						<div class="font-left">
							<div class="one"><a href="">级别<i>></i></a></div>
							
						</div>
						<div class="font-lefty">
							<dl class="fore1">
								<dt><a href="">校级<i>></i></a></dt>
							
								<dd>
									<a href="">校学生会</a>
									
								</dd>
							</dl>
							<dl class="fore1">
								<dt><a href="">院级<i>></i></a></dt>
							
								<dd>
									
						</div>
						
						
					</div>
				</div>
				<div class="fore-8">
					<div class="item fore8">
						<h3><a href="">校十佳</a></h3>
						<i>></i>
					</div>
					<div class="font-item1">
						
						<div class="font-lefty">
							<dl class="fore1">
								<dt><a href="">校十佳<i>></i></a></dt>
							
								<dd>
								<a href="#">大学生法律援助中心</a>
									<a href="#">曲艺协会</a>
									<a href="#">青学社</a>
									<a href="#">嘉荷文学社</a>
									<a href="#">广播剧社</a>
									<a href="#">诵读协会</a>
									<a href="#">舞蹈协会</a>
									<a href="#">环测青马</a>	
									<a href="#">电子协会</a>	
									<a href="#">彩虹艺术团</a>	
								</dd>
							</dl>
							
						</div>
						
						
					</div>
				</div>
				
				
			
			<!------------------------------------轮播图------------------------------------>
			<div id="lunbo">
				<ul id="one">
					
					<li><a href=""><img src="./images/gl.jpg"></a></li>
					<li><a href=""><img src="./images/s0.jpg"></a></li>
					<li><a href=""><img src="./images/s1.jpg"></a></li>
					<li><a href=""><img src="./images/qx.jpg"></a></li>
				</ul>
				<ul id="two">
					<li class="on">1</li>
					<li>2</li>
					<li>3</li>
					<li>4</li>
					<li>5</li>
				</ul>
				<!------------------------------------轮播图左右箭头------------------------>
				<div class="slider-page">
					<a href="javascript:void(0)" id="left"><</a>
					<a href="javascript:void(0)" id="right">></a>
				</div>
			</div>
			
			<!------------------------------------轮播图右侧一栏------------------------>
			<div class="m">
				<div class="mt">
					<h3>靓丽社团</h3>
					<div class="extra"><a href="club_clubshow">更多 ></a></div>
				</div>
				<div class="mc">
					<ul>
						<li><a href=""><span>[文娱]</span>灵韵音乐社</a></li>
					</ul>
				</div>
				<div class="mc">
					<ul>
						<li><a href=""><span>[体育]</span>台球协会</a></li>
					</ul>
				</div>
				<div class="mc">
					<ul>
						<li><a href="kexie"><span>[公益]</span>科学技术协会</a></li>
					</ul>
				</div>
				<div class="mc">
					<ul>
						<li><a href=""><span>[文娱]</span>古韵音乐社</a></li>
					</ul>
				</div>
				<div class="mc">
					<ul>
						<li><a href="singleclub"><span>[文学]</span>嘉荷文学社</a></li>
					</ul>
				</div>
			</div>
			<div class="ms">
				<div class="mm">
					<h3>精彩活动</h3>
					<div class="extra"><a href="activity_activityshow">更多 ></a></div>
				</div>
				<div class="mmm">
					<ul>
						<li>
							<a href="">
								<i class="ci-left" style="background:url()no-repeat;"></i>
								<span class="ci-bottom">音乐会</span>
							</a>
						</li>
						<li>
							<a href="">
								<i class="ci-left" style="background:url()no-repeat 0 -25px;"></i>
								<span class="ci-bottom">公益活动</span>
							</a>
						</li>
						<li>
							<a href="">
								<i class="ci-left" style="background:url()no-repeat 0 -50px;"></i>
								<span class="ci-bottom">话剧表演</span>
							</a>
						</li><li>
							<a href="">
								<i class="ci-left" style="background:url()no-repeat 0 -75px;"></i>
								<span class="ci-bottom">台球赛</span>
							</a>
						</li>
						<li>
							<a href="">
								<i class="ci-left" style="background:url()no-repeat -25px -100px;"></i>
								<span class="ci-bottom">网球赛</span>
							</a>
						</li>
						<li>
							<a href="">
								<i class="ci-left" style="background:url()no-repeat -25px -125px;"></i>
								<span class="ci-bottom">义务献血</span>
							</a>
						</li>
						<li>
							<a href="">
								<i class="ci-left" style="background:url()no-repeat -25px -150px;"></i>
								<span class="ci-bottom">演讲比赛</span>
							</a>
						</li><li>
							<a href="">
								<i class="ci-left" style="background:url()no-repeat -25px -175px;"></i>
								<span class="ci-bottom">诵读</span>
							</a>
						</li>
						<li>
							<a href="">
								<i class="ci-left" style="background:url()no-repeat 0px -250px;"></i>
								<span class="ci-bottom">礼仪课</span>
							</a>
						</li>
						<li>
							<a href="">
								<i class="ci-left" style="background:url()no-repeat -25px -200px;"></i>
								<span class="ci-bottom">书法大赛</span>
							</a>
						</li>
						<li>
							<a href="">
								<i class="ci-left" style="background:url()no-repeat -25px -275px;"></i>
								<span class="ci-bottom">舞神大赛</span>
							</a>
						</li><li>
							<a href="">
								<i class="ci-left" style="background:url()no-repeat -25px -225px;"></i>
								<span class="ci-bottom">十佳歌手</span>
							</a>
						</li>
					</ul>
					
				</div>
			</div>
		
		<!--*****************轮播下方*****************-->
		<div class="lazy-fn lazy-fn-done" id="lazy-todays">
		<div id="todays" class="clearfix">
			
			<div class="slider clearfix" style="position: relative;">
				
				<div class="slider-page">
					<a href="javascript:void(0)" class="slider-prev" clstag="h|keycount|2015|11b1">&lt;</a>
					<a href="javascript:void(0)" class="slider-next" clstag="h|keycount|2015|11b2">&gt;</a>
				</div>
			</div>
		</div>
		
<div class="w floor lazy-fn lazy-fn-done floor-current" >
<div id="clothes" class="">
    <br>
    <br>

	<div class="mt">
		<h2><i>精彩社团</i></h2>
		
	</div>
	<div class="mz">
		<div class="side" style="display:block;">
			<div class="side-inner">
				<div class="banner" clstag="h|keycount|2015|17a1">
					<!-- 2_955_6219 
						<a href="#" title="" target="_blank"><img src="images/gl.jpg" width="330" height="475" alt="" fclog="0.100158.166065.1.2_955_6219"></a>-->

					<!-- /2_955_6219 -->
				</div>
				<ul class="themes" clstag="h|keycount|2015|17a2">
					
					<li class="fore1">
						<a target="_blank" href="#">
							<i class="icon"></i>
							<span>十佳歌手</span>
						</a>
					</li>
					<li class="fore2">
						<a target="_blank" href="#">
							<i class="icon"></i>
							<span>舞神大赛</span>
						</a>
					</li>
					<li class="fore3">
						<a target="_blank" href="#">
							<i class="icon"></i>
							<span>毕业晚会</span>
						</a>
					</li>
					<li class="fore4">
						<a target="_blank" href="#">
							<i class="icon"></i>
							<span>高校演讲</span>
						</a>
					</li>
					<li class="fore5">
						<a target="_blank" href="#">
							<i class="icon"></i>
							<span>五月采风</span>
						</a>
					</li>
					<li class="fore6">
						<a target="_blank" href="#">
							<i class="icon"></i>
							<span>谁羽争锋</span>
						</a>
					</li>
				</ul>
				<ul class="words">
					<li class="fore1">
						<a href="#" target="_blank">
							<span>马拉松协会</span>
						</a>
						<a href="#" target="_blank">镜湖国学会馆</a>
						
						<a href="#">演讲与口才协会</a>
						<a href="#">公益创业协会</a>
						<a href="#">
							<span class="style-red">书法协会</span>
						</a>
						<a href="#" target="_blank">羽翼网络支教团</a>
						<a href="#">大学生世纪杯环保组织</a>
					</li>
					<li class="fore2">
						<a href="#" target="_blank">大学生国防教育协会</a>
						<a href="#"><span>管乐团</span></a>
						<a href="#" target="_blank">文史学社</a>
						<a href="#" target="_blank">思无邪汉服学社</a>
						<a href="#">古韵乐团</a>
						<a href="#" target="_blank">
							<spans>社交游戏社</span>
						</a>
						<a href="#" target="_blank">读书协会</a>
						<a href="#" target="_blank">成功起点创业社</a>
					</li>
				</ul>
			</div>
			<div class="side-extra">
				<!-- 2_955_6307 -->
				<a href="#"><img width="328" height="157" src="images/2dianzi.jpg"></a>

				<!-- / 2_955_6307 -->
			</div>
		</div>
		<div class="main main-selected" style="display: block;">
			<div class="main-inner">
				<ul class="main-body">
					
					<li class="fore1" >
						<a target="_blank" href="#"><img src="images/2caihong.jpg" width="439" height="157"></a>
					</li>
					<li class="fore2" id="f1-fore-random">
						<a target="_blank" href="#">
							<img src="images/2wudao.jpg" width="439" height="157">
						</a>
					</li>
					<li class="fore3" >
						<a target="_blank" href="#">
							<img src="images/2falv.jpg" width="219" height="157">
						</a>
					</li>
					<li class="fore4">
						<a target="_blank" href="#"><img src="images/2qingxue.jpg" width="219" height="157">
						</a>
					</li>
					<li class="fore5" >
						<a target="_blank" href="#"><img src="images/2guangbo.jpg" width="219" height="157"></a>
					</li>
					<li class="fore6" >
						<a target="_blank" href="#"><img src="images/2huance.jpg" width="219" height="157"></a>
					</li>
				</ul>
				<ul class="main-extra">
					
						<li class="fore1">
								<a target="_blank" href="#"><img src="images/2quyi.jpg" width="219" height="157"></a>
						</li>
						<li class="fore2">
								<a target="_blank" href="#"><img src="images/2jiahe.jpg" width="219" height="157"></a>
						</li>
					<li class="fore3">
						<!-- 广告位 2_955_6821-->
						<div id="ad6821"><a href="#"><img src="images/2songdu.jpg" width="219" height="316"></a></div>
					</li>
				</ul>
			</div>
			<div class="slider">
			<!-- 2_955_6221 -->
				
	<div class="slider-body" style="position: relative;">
		<ul class="slider-main1" style="width: 2634px; left: -439px; position: absolute;">
			<li class="slider-panel" style="float: left; display: list-item;">
				<a href="#"><img src="images/2yanjiang.jpg" width="439" height="315" data-lazy-img="done" alt=""></a>
			</li>
			<li class="slider-panel slider-panel-selected" style="float: left; display: list-item;">
				<a href="#"><img src="images/2gongyi.jpg" width="439" height="315" alt=""></a>
			</li>
			<li class="slider-panel" style="float: left; display: list-item;">
				<a href="#"><img src="images/2jinghu.jpg" width="439" height="315" data-lazy-img="done" alt=""></a>
			</li>
			<li class="slider-panel" style="float: left; display: list-item;">
				<a href="#"><img src="images/2malasong.jpg" width="439" height="315" alt=""></a>
			</li>
			<li class="slider-panel" style="float: left; display: list-item;">
				<a href="#" target="_blank" title=""><img src="images/2shufa.jpg" width="439" height="315" alt=""></a></li>
		<li class="slider-panel" style="float: left; display: list-item;">
			<a href="#"><img src="images/2xiaoguanyue.jpg" width="439" height="315" alt=""></a>
		</li>
	</ul>
	</div>
	<div class="slider-nav">
		<ul> 
			<li  class="slider-item slider-selected active2"></li>
			<li class="slider-item"></li>
			<li class="slider-item"></li>
			<li class="slider-item"></li>
		</ul>
	</div>
			<!-- 2_955_6221 end-->
				<div class="slider-page">
					<a href="javascript:void(0)" class="slider-prev">&lt;</a> 
					<a href="javascript:void(0)" class="slider-next">&gt;</a> 
				</div>
			</div>
		</div>
		
<!--***********************************************-->
	<div class="lazy-fn lazy-fn-done" id="lazy-footer">        
		<div id="service-2014">
	
	<div class="w">
		<dl class="fore1">
			<dt></dt>
			<dd>
				<div><a rel="nofollow" target="_blank" href="#"></a></div>
				<div><a rel="nofollow" target="_blank" href="#"></a></div>
				<div><a rel="nofollow" target="_blank" href="#"></a></div>
				<div><a rel="nofollow" target="_blank" href="#"></a></div>
			</dd>
		</dl>
		<dl class="fore2">		
			<dt></dt>
			<dd>
				<div><a rel="nofollow" target="_blank" href="#"></a></div>
				<div><a rel="nofollow" target="_blank" href="#"></a></div>
				<div><a rel="nofollow" target="_blank" href="#"></a></div>
				<div><a rel="nofollow" target="_blank" href="#"></a></div>
				<div><a target="_blank" href="#"></a></div>
			</dd>
		</dl>
		<dl class="fore3">
			<dt></dt>
			<dd>
				<div><a rel="nofollow" target="_blank" href="#"></a></div>
				<div><a rel="nofollow" target="_blank" href="#"></a></div>
				<div><a rel="nofollow" target="_blank" href="#"></a></div>
				<div><a rel="nofollow" target="_blank" href="#"></a></div>
				<div><a rel="nofollow" target="_blank" href="#"></a></div>
			</dd>
		</dl>
		<dl class="fore4">		
			<dt></dt>
			<dd>
				<div><a rel="nofollow" target="_blank" href="#"></a></div>
				<div><a rel="nofollow" target="_blank" href="#"></a></div>
				<div><a rel="nofollow" target="_blank" href="#"></a></div>
				<div><a rel="nofollow" target="_blank" href="#"></a></div>
				<div><a rel="nofollow" target="_blank" href="#"></a></div>
			</dd>
		</dl>
		<dl class="fore5">
			<dt></dt>
			<dd>		
				<div><a target="_blank" href="#"></a></div>
				<div><a target="_blank" href="#"></a></div>
				<div><a rel="nofollow" target="_blank" href="#"></a></div>
				<div><a rel="nofollow" target="_blank" href="#"></a></div>	
				<div><a rel="nofollow" target="_blank" href="#"></a></div>
				<div><a rel="nofollow" target="_blank" href="#"></a></div>
			</dd>
		</dl>
		
		<span class="clr"></span>
	</div>
</div>        <div class="w">
	<div id="footer-2014" >
		<div class="links">
			<a rel="nofollow" target="_blank" href="#">关于我们</a>|<a  href="#">联系我们</a>|<a rel="nofollow" target="_blank" href="#">社团入驻</a>|<a href="#" target="_blank">Contact Us</a></div>
		
	  </div>
    </div>
  </div>
	</div>
	</div>
	</body>
	<script src="js/jquery-1.11.3.min.js" ></script>
	<script src="js/index.js" ></script>
</html>