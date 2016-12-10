<%@ page contentType="text/html; charset=utf-8" language="java" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>审核活动</title>
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
					{field:'activity_id',title:'活动ID'},
					{field:'club_id',title:'社团ID'},
		            {field:'actname',title:'活动名称'},
					{field:'acttime',title:'活动时间'},
					{field:'actlocation',title:'活动地点'},
					{field:'actstatus',title:'活动状态'},
					{field:'actdesc',title:'活动描述'} 
           
		]],  
        pagination:true,
		onDblClickRow:function(rowIndex, rowData){
			viewDetail(rowData.activity_id);
		}
	});

	$('#changewin').window({
		width:300,
		height:480,
		title:'审核活动',
		collapsible:false,
		minimizable:true,
	    maximizable:false, 
	    closable:true,
	    draggable:true,
	    closed:true		
	});

})




function viewDetail(activity_id){
	$('#changewin').window('open');
	var selectedRow = $('#tt').datagrid('getSelected');
	$('#changeform').form('load',{
		activity_id:selectedRow.activity_id,
		club_id:selectedRow.club_id,
		actname:selectedRow.actname,
		acttime:selectedRow.acttime,
		actlocation:selectedRow.actlocation,
		actstatus:selectedRow.actstatus,
		actdesc:selectedRow.actdesc
	})
}


//通知审核结果
function changeco(){
	$('#changeform').form('submit',{
		url:'jsd/checkActivity.action',
		success: function(){
				$('#changewin').window('close');		
				$('#tt').datagrid('reload');		
				alert("审核成功！审核结果已发送至该社团公邮！")
		}
	});
}


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

       <div id="changewin">
		<form id="changeform" method="post" action="jsd/checkActivity.action">
		<br /><br />
			<div>
				<label for="activity_id">活&nbsp;&nbsp;动&nbsp;&nbsp;id：</label>
				<input id="activity_id" name="activity_id"/>
			</div><br />
			<div>
				<label for="club_id">社&nbsp;&nbsp;团&nbsp;&nbsp;id：</label>
				<input id="club_id" name="club_id"/>
			</div><br />
			<div>
				<label for="actname">活动名称：</label>
				<input id="actname" name="actname"/>
			</div><br />
			<div>
				<label for="acttime">活动时间：</label>
				<input id="acttime" name="acttime" disabled="true"/>
			</div><br />
			<div>
				<label for="actlocation">活动地点：</label>
				<input id="actlocation" name="actlocation" disabled="true"/>
			</div><br />
			<div>
				<label for="actdesc">活动描述：</label>
				<textarea id="actdesc" name="actdesc" disabled="true"></textarea>
			</div><br />
			<hr />
			<div>
				<label for="actstatus">活动状态：</label>
				<input type="radio" name="actstatus" value="审核通过"/>审核通过
				<input type="radio" name="actstatus" value="审核不通过"/>审核不通过
			</div><br />
			<div>
				<label for="advice">审批意见：</label>
				<textarea id="advice" name="advice"></textarea>
			</div><br />
			<a id="changecobtn" class="easyui-linkbutton" icon="icon-ok" href="javascript:void(0)" onclick="changeco()">通知结果</a> 
    		<a id="cbtnCancel" class="easyui-linkbutton" icon="icon-cancel" href="javascript:void(0)">取消</a> 
		</form>
	</div>
</div>
</body>
</html>
