﻿<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8" language="java" errorPage=""%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>社联后台</title>
<link rel="stylesheet" type="text/css" href="css/default2.css">
<link rel="stylesheet" type="text/css" href="js/jquery-easyui-1.3.5/themes/gray/easyui.css">
<link rel="stylesheet" type="text/css" href="js/jquery-easyui-1.3.5/themes/icon.css" />
<link rel="stylesheet" type="text/css" href="js/JQuery-zTree-v3.5.15/css/zTreeStyle/zTreeStyle.css">
<script type="text/javascript" src="js/jquery-easyui-1.3.5/jquery-1.10.2.min.js"></script>
<script type="text/javascript" src="js/jquery-easyui-1.3.5/jquery.easyui.min.js"></script>
<script type="text/javascript" src="js/JQuery-zTree-v3.5.15/jquery.ztree.all-3.5.min.js"></script>
<script type="text/javascript" src="js/unionindex.js"></script>
<script type="text/javascript" src="js/extends.js"></script>
<script type="text/javascript" src="js/common.js"></script>

</head>

<body class="easyui-layout">
<!-- 头部标题 -->
<div data-options="region:'north',border:false" style="height:60px; padding:5px; background:#F3F3F3"> 
	<center><p><font size="8">社联后台</font></p></center>
</div>

<!-- 左侧导航 -->
<div data-options="region:'west',split:true,title:'导航菜单', fit:false" style="width:200px;"> 
  <ul id="menuTree" class="ztree">
  </ul>
</div>

<!-- 页脚信息 -->
<div data-options="region:'south',border:false" style="height:20px; background:#F3F3F3; padding:2px; vertical-align:middle;">
	<span id="sysVersion">系统版本：V1.0</span>
    <span id="nowTime"></span>
</div>

<!-- 内容tabs -->
<div id="center" data-options="region:'center'">
  <div id="tabs" class="easyui-tabs">
    <div title="首页" style="padding:5px;display:block;vertical-align:middle;" >
             <center><p><font size="15">欢迎进入社联后台系统!</font></p></center>
        
    </div>
  </div>
</div>

<!-- 用于弹出框 -->
<div id="parent_win"></div>

</body>
</html>
