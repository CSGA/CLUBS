/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.23
 * Generated at: 2016-12-10 07:33:33 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.content;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class huodong1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=GBK");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			"", true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\"\r\n");
      out.write("\t\"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<title>上传活动</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/default.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"js/jquery-easyui-1.3.5/themes/gray/easyui.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"js/jquery-easyui-1.3.5/themes/icon.css\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery-easyui-1.3.5/jquery-1.10.2.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery-easyui-1.3.5/jquery.easyui.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/extends.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/common.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("$(function(){\r\n");
      out.write("\t$(\"#tt\").datagrid({\r\n");
      out.write("\t\theight:$(\"#body\").height()-$('#search_area').height()-5,\r\n");
      out.write("\t\twidth:$(\"#body\").width(),\r\n");
      out.write("\t\tidField:'userId',\r\n");
      out.write("\t\t//data: data,\r\n");
      out.write("\t\turl:\"datagrid.json\",  \r\n");
      out.write("\t\tsingleSelect:true, \r\n");
      out.write("\t\tnowrap:true,\r\n");
      out.write("\t\tfitColumns:true,\r\n");
      out.write("\t\trownumbers:true,\r\n");
      out.write("\t\tshowPageList:false,\r\n");
      out.write("\t\tcolumns:[[\r\n");
      out.write("\t\t\t{field:'activities_id',title:'ID',width:100,halign:\"center\", align:\"left\"},\r\n");
      out.write("            {field:'activities_name',title:'活动名称',width:100,halign:\"center\", align:\"left\"},\r\n");
      out.write("\t\t\t{field:'activities_time',title:'活动时间',width:100,halign:\"center\", align:\"left\"},\r\n");
      out.write("\t\t\t{field:'activities_place',title:'活动地点',width:100,halign:\"center\", align:\"left\"},\r\n");
      out.write("            {field:'activities_description',title:'活动描述',width:100,halign:\"center\", align:\"left\"},\r\n");
      out.write("            {field:'activities',title:'活动状态',width:100,halign:\"center\", align:\"left\"},\r\n");
      out.write("\t\t]],\r\n");
      out.write("\t\ttoolbar:'#tt_btn',  \r\n");
      out.write("        pagination:true,\r\n");
      out.write("\t\tonDblClickRow:function(rowIndex, rowData){\r\n");
      out.write("\t\t\tviewDetail(rowData.userId);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t//修改\r\n");
      out.write("\t$(\"#update\").on(\"click\", function(){\r\n");
      out.write("\t\t$parent.messager.alert(\"提示\",\"update\", \"info\");\r\n");
      out.write("\t});\r\n");
      out.write("\t//删除\r\n");
      out.write("\t$(\"#delete\").on(\"click\", function(){\r\n");
      out.write("\t\t$parent.messager.alert(\"提示\",\"delete\", \"info\");\r\n");
      out.write("\t});\r\n");
      out.write("})\r\n");
      out.write("\r\n");
      out.write("function viewDetail(date, id){\r\n");
      out.write("\t$parent.messager.alert(\"提示\",\"查询详细\", \"info\");\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("//监听窗口大小变化\r\n");
      out.write("window.onresize = function(){\r\n");
      out.write("\tsetTimeout(domresize,500);\r\n");
      out.write("};\r\n");
      out.write("//改变表格宽高\r\n");
      out.write("function domresize(){\r\n");
      out.write("\t$('#tt').datagrid('resize',{  \r\n");
      out.write("\t\theight:$(\"#body\").height()-$('#search_area').height()-5,\r\n");
      out.write("\t\twidth:$(\"#body\").width()\r\n");
      out.write("\t});\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"easyui-layout\" >\r\n");
      out.write("<div id=\"body\" region=\"center\" > \r\n");
      out.write(" \r\n");
      out.write("  <!-- 数据表格区域 -->\r\n");
      out.write("  <table id=\"tt\" style=\"table-layout:fixed;\" ></table>\r\n");
      out.write("  <!-- 表格顶部工具按钮 -->\r\n");
      out.write("  <div id=\"tt_btn\">\r\n");
      out.write("      <a href=\"addActivity\"  id=\"save\" class=\"easyui-linkbutton\" iconCls=\"icon-add\" plain=\"true\">新增</a>\r\n");
      out.write("      <a href=\"javascript:void(0)\"  id=\"update\" class=\"easyui-linkbutton\" iconCls=\"icon-edit\" plain=\"true\">修改</a> \r\n");
      out.write("      <a href=\"javascript:void(0)\"  id=\"delete\" class=\"easyui-linkbutton\" iconCls=\"icon-remove\" plain=\"true\">删除</a>\r\n");
      out.write("   </div>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
