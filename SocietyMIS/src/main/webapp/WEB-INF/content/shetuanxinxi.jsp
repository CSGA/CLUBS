<%@ page contentType="text/html; charset=GBK" language="java" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>管理社团</title>
<link rel="stylesheet" type="text/css" href="css/default.css">
<link rel="stylesheet" type="text/css" href="js/jquery-easyui-1.3.5/themes/gray/easyui.css">
<link rel="stylesheet" type="text/css" href="js/jquery-easyui-1.3.5/themes/icon.css" />
<script type="text/javascript" src="js/jquery-easyui-1.3.5/jquery-1.10.2.min.js"></script>
<script type="text/javascript" src="js/jquery-easyui-1.3.5/jquery.easyui.min.js"></script>
<script type="text/javascript" src="js/extends.js"></script>
<script type="text/javascript" src="js/common.js"></script>
<script>

$(function(){
	$("#tt").datagrid({
		height:$("#body").height()-$('#search_area').height()-5,
		width:$("#body").width(),
		idField:'userId',
		//data: data,
		url:"jsd/shetuanxinxi",  
		singleSelect:true, 
		nowrap:true,
		fitColumns:true,
		rownumbers:true,
		showPageList:false,
		columns:[[
            {field:'club_name',title:'社团名称',width:100,halign:"center", align:"left"},
			{field:'settime',title:'社团成立时间时间',width:100,halign:"center", align:"left"},
			{field:'clubdesc',title:'社团描述',width:100,halign:"center", align:"left"},
            
            {field:'clubemail',title:'社团邮箱',width:100,halign:"center", align:"left"},
            {field:'clubman',title:'社团负责人',width:100,halign:"center", align:"left"},
            {field:'clubmantel',title:'社团负责人电话',width:100,halign:"center", align:"left"},
		]],
		toolbar:'#tt_btn',  
        pagination:true,
		onDblClickRow:function(rowIndex, rowData){
			viewDetail(rowData.userId);
		}
	});
	
	//新增弹出框
	$("#save").on("click", function(){
		$parent("#parent_win").window({
			width:274,
			height:225,
			href:'xiugaishetuan.html',
			title:'新增活动'
		});
	});
	//修改
	$("#update").on("click", function(){
		$parent("#parent_win").window({
			width:274,
			height:225,
			href:'xiugaishetuan.html',
			title:'修改社团信息'
		});
	});
	//删除
	$("#delete").on("click", function(){
		$parent.messager.alert("提示","delete", "info");
	});
})

function viewDetail(date, id){
	$parent.messager.alert("提示","查询详细", "info");
}

//监听窗口大小变化
window.onresize = function(){
	setTimeout(domresize,300);
};
//改变表格宽高
function domresize(){
	$('#tt').datagrid('resize',{  
		height:$("#body").height()-$('#search_area').height()-5,
		width:$("#body").width()
	});
}
</script>
</head>
<body class="easyui-layout" >
<div id="body" region="center" > 
 
  <!-- 数据表格区域 -->
  <table id="tt" style="table-layout:fixed;" ></table>
  <!-- 表格顶部工具按钮 -->
  <div id="tt_btn">
      
      <a href="xiugaishetuan.html"  id="update" class="easyui-linkbutton" iconCls="icon-edit" plain="true">修改</a> 
      
   </div>
</div>
</body>
</html>
