<%@ page contentType="text/html; charset=GBK" language="java" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>���ź�̨</title>
<link rel="stylesheet" type="text/css" href="css/default2.css">
<link rel="stylesheet" type="text/css" href="js/jquery-easyui-1.3.5/themes/gray/easyui.css">
<link rel="stylesheet" type="text/css" href="js/jquery-easyui-1.3.5/themes/icon.css" />
<link rel="stylesheet" type="text/css" href="js/JQuery-zTree-v3.5.15/css/zTreeStyle/zTreeStyle.css">
<script type="text/javascript" src="js/jquery-easyui-1.3.5/jquery-1.10.2.min.js"></script>
<script type="text/javascript" src="js/jquery-easyui-1.3.5/jquery.easyui.min.js"></script>
<script type="text/javascript" src="js/JQuery-zTree-v3.5.15/jquery.ztree.all-3.5.min.js"></script>
<script type="text/javascript" src="js/index2.js"></script>
<script type="text/javascript" src="js/extends.js"></script>
<script type="text/javascript" src="js/common.js"></script>

</head>

<body class="easyui-layout">
<!-- ͷ������ -->
<div data-options="region:'north',border:false" style="height:60px; padding:5px; background:#F3F3F3"> 
	<a href="www.solooo.net"><span class="northTitle">���ź�̨</span></a>
    <span class="loginInfo">��¼�û���admin&nbsp;&nbsp;����������Ա&nbsp;&nbsp;��ɫ��ϵͳ����Ա</span>
</div>

<!-- ��ർ�� -->
<div data-options="region:'west',split:true,title:'�����˵�', fit:false" style="width:200px;"> 
  <ul id="menuTree" class="ztree">
  </ul>
</div>

<!-- ҳ����Ϣ -->
<div data-options="region:'south',border:false" style="height:20px; background:#F3F3F3; padding:2px; vertical-align:middle;">
	<span id="sysVersion">ϵͳ�汾��V1.0</span>
    <span id="nowTime"></span>
</div>

<!-- ����tabs -->
<div id="center" data-options="region:'center'">
  <div id="tabs" class="easyui-tabs">
    <div title="��ҳ" style="padding:5px;display:block;" >
      <p>��ӭ�������ź�̨ϵͳ��</p>
        
    </div>
  </div>
</div>

<!-- ���ڵ����� -->
<div id="parent_win"></div>

</body>
</html>
