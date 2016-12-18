<%@ page contentType="text/html; charset=GBK" language="java" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
	<%@taglib prefix="s" uri="/struts-tags" %>
<!--[if lt IE 7]><html class="no-js lt-ie9 lt-ie8 lt-ie7"> <![endif]-->
<!--[if IE 7]><html class="no-js lt-ie9 lt-ie8"> <![endif]-->
<!--[if IE 8]><html class="no-js lt-ie9"> <![endif]-->
<!--[if gt IE 8]><!--> <html class="no-js"> <!--<![endif]-->
<head>
    <meta charset="utf-8">
    <title>一个活动</title>
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width">
    
    <!-- Bootstrap Stylesheet -->
    <link rel="stylesheet" href="css/1bootstrap.min.css">

    <!-- Animate -->
    <link rel="stylesheet" href="css/animate.min.css">


    <!-- FontAwesome Icons -->
    <link rel="stylesheet" href="css/font-awesome.min.css">
    
    <!-- Normailize Stylesheet -->
    <link rel="stylesheet" href="css/normalize.min.css">

    <!-- Main Styles -->
    <link rel="stylesheet" href="css/templatemo_style.css">

    <script src="js/vendor/modernizr-2.6.2.min.js"></script>

</head>
<body>
    <!--[if lt IE 7]>
    <p class="chromeframe">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade your browser</a> or <a href="#/chromeframe/?redirect=true">activate Google Chrome Frame</a> to improve your experience.</p>
    <![endif]-->
    

    <div id="responsive-menu">
        <ul class="menu-holder">
            <li><a href="index"><i class="fa fa-home"></i>首页</a></li>
            <li><a href="#services"><i class="fa fa-list"></i>活动公告</a></li>
            
           
        </ul>
    </div>

    <!-- HEADER -->
    
    <header class="site-header">
        <div class="container">
            <div class="row">
                <div class="menu-holder">
                    <div class="col-md-3 col-sm-2 logo">
                        
                    </div>
                    <div class="col-md-7 col-sm-8">
                        <nav class="main-menu hidden-xs">
                            <ul>
                                <li><a href="index">首页</a></li>
                                <li><a href="huodong.html">活动公告</a></li>
                               
                            </ul>
                        </nav>
                    </div>
                  
                </div>


                <div class="text-right visible-xs">
                    <a href="#" id="mobile_menu"><span class="fa fa-bars"></span></a>
                </div>
            </div>
        </div>
    </header> <!-- .site-header -->
   
    <!-- TOP CONTENT -->
    <s:iterator value="#session.activitys" id="activity2">
    <div class="top-c">
        <div class="container">
            <div class="row">
                <div class="col-md-offset-1 col-lg-5 col-md-5 col-xs-offset-1 col-sm-5 col-xs-8 col-xs-offset-2">
                    <div class="topc-img">
                        <img src="images/slide1.png" alt="">
                    </div>
                </div>
                <div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
                    <h3 class="topc-title"><s:property value="#activity1.actname"/></h3>
                    <ul>
                        <li><i class="fa fa-check"></i>举办单位：<s:property value="#activity2.club_name"/></li>
                        </s:iterator>
                        <s:iterator value="#session.activity" id="activity1">
                        <li><i class="fa fa-check"></i>活动时间: <s:property value="#activity1.acttime"/></li>
                        <li><i class="fa fa-check"></i>活动地点: <s:property value="#activity1.actlocation"/></li>
                        
                        
                    </ul>
                </div>
               
            </div>
        </div>
    </div>
 

    <!-- SERVICES -->
    <div class="content-section" id="services">
        <div class="container">
            <div class="row">
                <div class="col-md-3 col-xs-6 text-center">
                    <div class="service-item">
                        <div class="service-icon">
                            <i class="fa fa-video-camera"></i>
                        </div>
                        <a href=index'><h3 class="service-title">返回上一页</h3></a>
                    </div> <!-- .service-item -->
                </div> <!-- .col-md-3 -->
                <div class="col-md-3 col-xs-6 text-center">
                    <div class="service-item">
                        <div class="service-icon">
                            <i class="fa fa-desktop"></i>
                        </div>
                        <a href='activity_actjoin?students_id=${session.user.students_id}&activity_id=<s:property value="#activity1.activity_id"/>&club_id=<s:property value="#activity1.club_id"/>'><h3 class="service-title">${requestScope.tip}报名</h3></a>
                    </div> <!-- .service-item -->
                </div> <!-- .col-md-3 -->
                <div class="col-md-3 col-xs-6 text-center">
                    <div class="service-item">
                        <div class="service-icon">
                            <i class="fa fa-headphones"></i>
                        </div>
                        <a href=''><h3 class="service-title">活动规则下载</h3></a>
                    </div> <!-- .service-item -->
                </div> <!-- .col-md-3 -->
              
            </div> <!-- .row -->
        </div> <!-- .container -->
    </div> <!-- #services -->
</s:iterator>
    
   
    
    
    <script>
   var errorMsg="${requestScope.errorMessage}";
   if(errorMsg!=""){
     alert(errorMsg);
   }
</script>
    <script src="js/vendor/jquery-1.10.1.min.js"></script>
    <script>window.jQuery || document.write('<script src="js/vendor/jquery-1.10.1.min.js"><\/script>')</script>
    
    <script src="js/bootstrap.min.js"></script>
    <script src="js/plugins.js"></script>
    <script src="js/templatemo_custom.js"></script> 
    
<div style="display:none"><script src='http://v7.cnzz.com/stat.php?id=155540&web_id=155540' language='JavaScript' charset='gb2312'></script></div>
</body>
</html>