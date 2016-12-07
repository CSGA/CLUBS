<%@ page contentType="text/html; charset=GBK" language="java" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>��˻</title>
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
		idField:'activity_id',
		url:"jsd/getAllActivity",
		singleSelect:true, 
		nowrap:true,
		fitColumns:true,
		rownumbers:true,
		showPageList:false,
		columns:[[
					{field:'activity_id',title:'�ID'},
					{field:'club_id',title:'����ID'},
		            {field:'actname',title:'�����'},
					{field:'acttime',title:'�ʱ��'},
					{field:'actlocation',title:'��ص�'},
					{field:'actstatus',title:'�״̬'},
					{field:'actdesc',title:'�����'} 
           
		]],
		toolbar:'#tt_btn',  
        pagination:true,
		onDblClickRow:function(rowIndex, rowData){
			viewDetail(rowData.userId);
		}
	});

	
	//����������
	$("#save").on("click", function(){
		$parent("#parent_win").window({
			width:274,
			height:225,
			href:'user/addUser.html',
			title:'�����'
		});
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
	setTimeout(domresize,300);
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
      <a href="javascript:void(0)"  id="delete" class="easyui-linkbutton" iconCls="icon-remove" plain="true">ɾ��</a>
   </div>
</div>
</body>
</html>
