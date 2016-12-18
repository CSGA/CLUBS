<%@ page contentType="text/html; charset=GBK" language="java" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>历史活动</title>
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
		url:"jsd/club_showactivity?club_id=${session.club.club_id}",  
		singleSelect:true, 
		nowrap:true,
		fitColumns:true,
		rownumbers:true,
		showPageList:false,
		columns:[[
			{field:'activity_id',title:'活动ID',width:100,halign:"center", align:"left"},
			{field:'club_id',title:'社团ID',width:100,halign:"center", align:"left"},
            {field:'actname',title:'活动名称',width:100,halign:"center", align:"left"},
			{field:'acttime',title:'活动时间',width:100,halign:"center", align:"left"},
			{field:'actlocation',title:'活动地点',width:100,halign:"center", align:"left"},
            {field:'actdesc',title:'活动描述（规则）',width:100,halign:"center", align:"left"},
             {field:'actstatus',title:'活动状态',width:100,halign:"center", align:"left"}
           
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
			href:'user/addUser.html',
			title:'新增活动'
		});
	});
	//修改
	$("#update").on("click", function(){
		$parent.messager.alert("提示","update", "info");
	});
	//删除
	$("#delete").on("click", function(){
		$parent.messager.alert("提示","delete", "info");
	});

// $("#seestu").linkbutton({
// 	onClick:function(){
// 	var selectrow=$('#tt').datagrid("getSelected");
// 	$.post("jsd/",{students_id:selectedRow.students_id};
// 	}
// 	}
// )



	
})

function viewDetail(date, id){
	$parent.messager.alert("提示","查询详细", "info");
}
function viewDetail(activity_id){
	$('#see').window('cansaixinxi');
	var selectedRow = $('#tt').datagrid('getSelected');
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
     
     
      <a href="javascript:void(0)"  id="delete" class="easyui-linkbutton" iconCls="icon-remove" plain="true">删除</a>
      <a href="addActivity"  id="seestu" class="easyui-linkbutton" iconCls="icon-remove" plain="true">添加活动</a>
      <a href="cansaixinxi"  id="see" class="easyui-linkbutton" iconCls="icon-remove" plain="true">查看活动报名名单</a>
   </div>
</div>
</body>
</html>
