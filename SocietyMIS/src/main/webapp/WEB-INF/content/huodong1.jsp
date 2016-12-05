<%@ page contentType="text/html; charset=GBK" language="java" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>�ϴ��</title>
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
		url:"datagrid.json",  
		singleSelect:true, 
		nowrap:true,
		fitColumns:true,
		rownumbers:true,
		showPageList:false,
		columns:[[
			{field:'activities_id',title:'ID',width:100,halign:"center", align:"left"},
            {field:'activities_name',title:'�����',width:100,halign:"center", align:"left"},
			{field:'activities_time',title:'�ʱ��',width:100,halign:"center", align:"left"},
			{field:'activities_place',title:'��ص�',width:100,halign:"center", align:"left"},
            {field:'activities_description',title:'�����',width:100,halign:"center", align:"left"},
            {field:'activities',title:'�״̬',width:100,halign:"center", align:"left"},
		]],
		toolbar:'#tt_btn',  
        pagination:true,
		onDblClickRow:function(rowIndex, rowData){
			viewDetail(rowData.userId);
		}
	});
	
	
	//�޸�
	$("#update").on("click", function(){
		$parent.messager.alert("��ʾ","update", "info");
	});
	//ɾ��
	$("#delete").on("click", function(){
		$parent.messager.alert("��ʾ","delete", "info");
	});
})

function viewDetail(date, id){
	$parent.messager.alert("��ʾ","��ѯ��ϸ", "info");
}

//�������ڴ�С�仯
window.onresize = function(){
	setTimeout(domresize,500);
};
//�ı�����
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
 
  <!-- ���ݱ������ -->
  <table id="tt" style="table-layout:fixed;" ></table>
  <!-- ��񶥲����߰�ť -->
  <div id="tt_btn">
      <a href="addActivity"  id="save" class="easyui-linkbutton" iconCls="icon-add" plain="true">����</a>
      <a href="javascript:void(0)"  id="update" class="easyui-linkbutton" iconCls="icon-edit" plain="true">�޸�</a> 
      <a href="javascript:void(0)"  id="delete" class="easyui-linkbutton" iconCls="icon-remove" plain="true">ɾ��</a>
   </div>
</div>
</body>
</html>
