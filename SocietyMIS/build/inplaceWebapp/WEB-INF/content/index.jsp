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
		<!-----------------------------------------����-------------->
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
							<s class="jt">��</s> 
						</i>
						<div class="my1">
                            <img src="./images/no-img_mid_.jpg">
								<div class="my3">
									<h3 class="neirong2"><a href="huiyuan.html">���ã���Աע��</a></h3>
									<h3 class="neirong2"><a href="shetuanzhuce.html">���ã�����ע��</a></h3>
									<h3 class="neirong2"><a href="shelianzhuce.html">���ã�����ע��</a></h3>
								</div>
							
						</div>
					</li>
                     <li class="my bj">
						<a href="#">��Ҫ����</a>
						<i class="ci-right ">
							<s class="jt"></s>
						</i>
						<div class="my1">
                            <img src="./images/no-img_mid_.jpg">
								<div class="my3">
									<h3 class="neirong2"><a href="club_clubshow">������������</a></h3>
									<h3 class="neirong2"><a href="activity_activityshow">�����μӻ</a></h3>
									
								</div>
							
						</div>
					</li>
					 <li class="my bj">
						<a href="#">���˿ռ�</a>
						<i class="ci-right ">
							<s class="jt"></s>
						</i>
						<div class="my1">
                            <img src="./images/no-img_mid_.jpg">
								<div class="my3">
									<h3 class="neirong2"><a href="club_myclub?students_id=${session.user.students_id}">�ҵ�����</a></h3>
									<h3 class="neirong2"><a href="activity_activityshow">�ҵĻ</a></h3>
									<h3 class="neirong2"><a href="club_clubshow">�ҵ���Ϣ</a></h3>
								</div>
							
						</div>
					</li>
					<li class="denglu"><a href="backlogin">���ŵ�¼</a> 
                    <li class="denglu"><a href="shetuanxinxi">����������ϵ��ʽ</a> 
                    
					<li class="shu"></li>
					<li class="shu"></li>
					
					<li class="shu"></li>
                   
					
		</header>
		
		
		<div class="clear"></div>
		<!--�ֲ�ͼ�Ϸ�������  һ��-->
		
		<div class="focus">
			<div class="focus-a">
				<div class="fouc-img1"><img src="./images/beijing.jpg" class="nav-img2"></div>
				<div class="fouc-font"><a href="shetuan">ȫ�����ŷ���</a> </div>
			</div>
			
			
			<!--�ֲ�ͼ��ߵ�����-->
			<div class="bb"></div>
			<div class="dd-inner">
				<div class="font-item">
					<div class="item fore1">
						<h3><a href="">ѧ���Ƽ���</a></h3>
						<i>></i>
					</div>
					<div class="font-item1">
						<div class="font-left">
							<div class="one"><a href="">����<i>></i></a></div>
							
						</div>
						<div class="font-lefty">
							<dl class="fore1">
								<dt><a href="">У��<i>></i></a></dt>							
								<dd>
									<a href="kexie">��Э</a><a href="">������</a><a href="">����Э��</a><a href="">��ѧ��ģЭ��</a><a href="">�Ǻ�����ѧ��</a>
									
								</dd>
							</dl>
							<dl class="fore1">
								<dt><a href="">Ժ��<i>></i></a></dt>							
								<dd>
									<a href="">Ӱ��Э��</a><a href="">��������</a><a href="">ѧ�ƾ���Э��</a><a href="">֤ȯͶ��Э��</a><a href="">�罻��Ϸ��</a>
									
								</dd>
							</dl>
							
						</div>
						
						
					</div>
				</div>
				<div class="fore-2">
					<div class="item fore2">
						<h3>
							<a href="">����ʵ����</a>
						</h3>
						<i>></i>
					</div>
					<div class="font-item1">
						<div class="font-left">
							<div class="one"><a href="">����<i>></i></a></div>
							
						</div>
						<div class="font-lefty">
							<dl class="fore1">
								<dt><a href="">У��<i>></i></a></dt>
								<dd>
									<a href="">��ҵ��Э��</a><a href="">У��Э</a><a href="">��ҵ��֮��</a><a href="">��ʮ��Э��</a><a href="">�³�����ǿ��</a>					
								</dd>
							</dl>
							<dl class="fore1">
								<dt><a href="">Ժ��<i>></i></a></dt>
								<dd>
									<a href="">����Э��</a><a href="">�繤ѧ��</a>
								</dd>
							</dl>
														
						</div>
						
						
					</div>
				</div>
				<div class="fore-3">
					<div class="item fore3">
						<h3>
							<a href="">������</a>
							<a href="">������</a>
						</h3>
						<i>></i>
					</div>
					<div class="font-item1">
						<div class="font-left">
							<div class="one"><a href="">����<i>></i></a></div>
							
						</div>
						<div class="font-lefty">
							<dl class="fore1">
								<dt><a href="">У��<i>></i></a></dt>
								<dd>
									<a href="#">�����˶�Э��</a>
									<a href="#">������ֲ�</a>
									<a href="#">��ʯ����</a>
									<a href="#">�ֻ���</a>
									<a href="#">̨��Э��</a>
									
								</dd>
							</dl>
							<dl class="fore1">
								<dt><a href="">Ժ��<i>></i></a></dt>
								<dd>
									<a href="#">ƹ��Э��</a>
									<a href="#">��ȭ��Э��</a>
									<a href="#">����Э��</a>
									<a href="#">����Э��</a>
									<a href="#">����Э��</a>
									
								</dd>
							</dl>
							
						</div>
						
						
					</div>
				</div>
				<div class="fore-4">
					<div class="item fore4">
						<h3>
							<a href="##">��ѧ������</a>
							
						</h3>
						<i>></i>
					</div>
					<div class="font-item1">
						<div class="font-left">
							<div class="one"><a href="">����<i>></i></a></div>
							
						</div>
						<div class="font-lefty">
							<dl class="fore1">
								<dt><a href="">У��<i>></i></a></dt>
							
								<dd>
									<a href="#">��ѧ��</a>
									<a href="#">����Э��</a>
									<a href="#">������ѧ��</a>
									<a href="#">�ݽ���ڲ�Э��</a>
									<a href="#">����Ӣ����ֲ�</a>
									<a href="#">��ʷѧ��</a>
									
								</dd>
							</dl>
							<dl class="fore1">
								<dt><a href="#">Ժ��<i>></i></a></dt>
							
								<dd>
									<a href="#">�κ���ѧ��</a>
									<a href="#">��ޱӢ��</a>
									<a href="#">�ж�Э��</a>
									<a href="#">��ʷѧ��</a>
									
								</dd>
							</dl>
							
						</div>
						
						
					</div>
				</div>
				<div class="fore-5">
					<div class="item fore5">
						<h3>
							<a href="##">��������������</a>
							
						</h3>
						<i>></i>
					</div>
					<div class="font-item1">
						<div class="font-left">
							<div class="one"><a href="">����<i>></i></a></div>
							
						</div>
						<div class="font-lefty">
							<dl class="fore1">
								<dt><a href="">У��<i>></i></a></dt>
							
								<dd>
									<a href="#">����������</a>
									<a href="#">У������</a>
									<a href="#">����������</a>
									<a href="#">У����</a>
									<a href="#">����Э��</a>
									<a href="#">�鷨Э��</a>
									<a href="#">�赸Э��</a>
									<a href="#">ħ��Э��</a>
									
								</dd>
							</dl>
							<dl class="fore1">
								<dt><a href="##">Ժ��<i>></i></a></dt>
							
								<dd>
									<a href="#">�ʺ�������</a>
									<a href="#">����������</a>
									<a href="#">��ռ�</a>
									
								</dd>
							</dl>
							
						</div>
						
						
					</div>
				</div>
				<div class="fore-6">
					<div class="item fore6">
						<h3>
							<a href="">����ѧϰ��</a>
							
						</h3>
						<i>></i>
					</div>
					<div class="font-item1">
						<div class="font-left">
							<div class="one"><a href="">����<i>></i></a></div>
							
						</div>
						<div class="font-lefty">
							<dl class="fore1">
								<dt><a href="">У��<i>></i></a></dt>
							
								<dd>
									<a href="">���������Ļ���ϰ��</a>
									
								</dd>
							</dl>
							<dl class="fore1">
								<dt><a href="">Ժ��<i>></i></a></dt>
							
								<dd>
									<a href="">������</a>
								
						</div>
						
						
					</div>
				</div>
				<div class="fore-7">
					<div class="item fore7">
						<h3>
							<a href="">ѧ����</a>
							
						</h3>
						<i>></i>
					</div>
					<div class="font-item1">
						<div class="font-left">
							<div class="one"><a href="">����<i>></i></a></div>
							
						</div>
						<div class="font-lefty">
							<dl class="fore1">
								<dt><a href="">У��<i>></i></a></dt>
							
								<dd>
									<a href="">Уѧ����</a>
									
								</dd>
							</dl>
							<dl class="fore1">
								<dt><a href="">Ժ��<i>></i></a></dt>
							
								<dd>
									
						</div>
						
						
					</div>
				</div>
				<div class="fore-8">
					<div class="item fore8">
						<h3><a href="">Уʮ��</a></h3>
						<i>></i>
					</div>
					<div class="font-item1">
						
						<div class="font-lefty">
							<dl class="fore1">
								<dt><a href="">Уʮ��<i>></i></a></dt>
							
								<dd>
								<a href="#">��ѧ������Ԯ������</a>
									<a href="#">����Э��</a>
									<a href="#">��ѧ��</a>
									<a href="#">�κ���ѧ��</a>
									<a href="#">�㲥����</a>
									<a href="#">�ж�Э��</a>
									<a href="#">�赸Э��</a>
									<a href="#">��������</a>	
									<a href="#">����Э��</a>	
									<a href="#">�ʺ�������</a>	
								</dd>
							</dl>
							
						</div>
						
						
					</div>
				</div>
				
				
			
			<!------------------------------------�ֲ�ͼ------------------------------------>
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
				<!------------------------------------�ֲ�ͼ���Ҽ�ͷ------------------------>
				<div class="slider-page">
					<a href="javascript:void(0)" id="left"><</a>
					<a href="javascript:void(0)" id="right">></a>
				</div>
			</div>
			
			<!------------------------------------�ֲ�ͼ�Ҳ�һ��------------------------>
			<div class="m">
				<div class="mt">
					<h3>��������</h3>
					<div class="extra"><a href="club_clubshow">���� ></a></div>
				</div>
				<div class="mc">
					<ul>
						<li><a href=""><span>[����]</span>����������</a></li>
					</ul>
				</div>
				<div class="mc">
					<ul>
						<li><a href=""><span>[����]</span>̨��Э��</a></li>
					</ul>
				</div>
				<div class="mc">
					<ul>
						<li><a href="kexie"><span>[����]</span>��ѧ����Э��</a></li>
					</ul>
				</div>
				<div class="mc">
					<ul>
						<li><a href=""><span>[����]</span>����������</a></li>
					</ul>
				</div>
				<div class="mc">
					<ul>
						<li><a href="singleclub"><span>[��ѧ]</span>�κ���ѧ��</a></li>
					</ul>
				</div>
			</div>
			<div class="ms">
				<div class="mm">
					<h3>���ʻ</h3>
					<div class="extra"><a href="activity_activityshow">���� ></a></div>
				</div>
				<div class="mmm">
					<ul>
						<li>
							<a href="">
								<i class="ci-left" style="background:url()no-repeat;"></i>
								<span class="ci-bottom">���ֻ�</span>
							</a>
						</li>
						<li>
							<a href="">
								<i class="ci-left" style="background:url()no-repeat 0 -25px;"></i>
								<span class="ci-bottom">����</span>
							</a>
						</li>
						<li>
							<a href="">
								<i class="ci-left" style="background:url()no-repeat 0 -50px;"></i>
								<span class="ci-bottom">�������</span>
							</a>
						</li><li>
							<a href="">
								<i class="ci-left" style="background:url()no-repeat 0 -75px;"></i>
								<span class="ci-bottom">̨����</span>
							</a>
						</li>
						<li>
							<a href="">
								<i class="ci-left" style="background:url()no-repeat -25px -100px;"></i>
								<span class="ci-bottom">������</span>
							</a>
						</li>
						<li>
							<a href="">
								<i class="ci-left" style="background:url()no-repeat -25px -125px;"></i>
								<span class="ci-bottom">������Ѫ</span>
							</a>
						</li>
						<li>
							<a href="">
								<i class="ci-left" style="background:url()no-repeat -25px -150px;"></i>
								<span class="ci-bottom">�ݽ�����</span>
							</a>
						</li><li>
							<a href="">
								<i class="ci-left" style="background:url()no-repeat -25px -175px;"></i>
								<span class="ci-bottom">�ж�</span>
							</a>
						</li>
						<li>
							<a href="">
								<i class="ci-left" style="background:url()no-repeat 0px -250px;"></i>
								<span class="ci-bottom">���ǿ�</span>
							</a>
						</li>
						<li>
							<a href="">
								<i class="ci-left" style="background:url()no-repeat -25px -200px;"></i>
								<span class="ci-bottom">�鷨����</span>
							</a>
						</li>
						<li>
							<a href="">
								<i class="ci-left" style="background:url()no-repeat -25px -275px;"></i>
								<span class="ci-bottom">�������</span>
							</a>
						</li><li>
							<a href="">
								<i class="ci-left" style="background:url()no-repeat -25px -225px;"></i>
								<span class="ci-bottom">ʮ�Ѹ���</span>
							</a>
						</li>
					</ul>
					
				</div>
			</div>
		
		<!--*****************�ֲ��·�*****************-->
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
		<h2><i>��������</i></h2>
		
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
							<span>ʮ�Ѹ���</span>
						</a>
					</li>
					<li class="fore2">
						<a target="_blank" href="#">
							<i class="icon"></i>
							<span>�������</span>
						</a>
					</li>
					<li class="fore3">
						<a target="_blank" href="#">
							<i class="icon"></i>
							<span>��ҵ���</span>
						</a>
					</li>
					<li class="fore4">
						<a target="_blank" href="#">
							<i class="icon"></i>
							<span>��У�ݽ�</span>
						</a>
					</li>
					<li class="fore5">
						<a target="_blank" href="#">
							<i class="icon"></i>
							<span>���²ɷ�</span>
						</a>
					</li>
					<li class="fore6">
						<a target="_blank" href="#">
							<i class="icon"></i>
							<span>˭������</span>
						</a>
					</li>
				</ul>
				<ul class="words">
					<li class="fore1">
						<a href="#" target="_blank">
							<span>������Э��</span>
						</a>
						<a href="#" target="_blank">������ѧ���</a>
						
						<a href="#">�ݽ���ڲ�Э��</a>
						<a href="#">���洴ҵЭ��</a>
						<a href="#">
							<span class="style-red">�鷨Э��</span>
						</a>
						<a href="#" target="_blank">��������֧����</a>
						<a href="#">��ѧ�����ͱ�������֯</a>
					</li>
					<li class="fore2">
						<a href="#" target="_blank">��ѧ����������Э��</a>
						<a href="#"><span>������</span></a>
						<a href="#" target="_blank">��ʷѧ��</a>
						<a href="#" target="_blank">˼��а����ѧ��</a>
						<a href="#">��������</a>
						<a href="#" target="_blank">
							<spans>�罻��Ϸ��</span>
						</a>
						<a href="#" target="_blank">����Э��</a>
						<a href="#" target="_blank">�ɹ���㴴ҵ��</a>
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
						<!-- ���λ 2_955_6821-->
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
			<a rel="nofollow" target="_blank" href="#">��������</a>|<a  href="#">��ϵ����</a>|<a rel="nofollow" target="_blank" href="#">������פ</a>|<a href="#" target="_blank">Contact Us</a></div>
		
	  </div>
    </div>
  </div>
	</div>
	</div>
	</body>
	<script src="js/jquery-1.11.3.min.js" ></script>
	<script src="js/index.js" ></script>
</html>