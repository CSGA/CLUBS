/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.23
 * Generated at: 2016-12-01 06:40:03 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.content;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			"", true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <title>会员注册</title>\n");
      out.write("\n");
      out.write("        <!-- CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"http://fonts.googleapis.com/css?family=Roboto:400,100,300,500\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/bootstrap/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/font-awesome/css/font-awesome.min.css\">\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"assets/css/form-elements.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/style.css\">\n");
      out.write("\n");
      out.write("        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->\n");
      out.write("        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\n");
      out.write("        <!--[if lt IE 9]>\n");
      out.write("            <script src=\"https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js\"></script>\n");
      out.write("            <script src=\"https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js\"></script>\n");
      out.write("        <![endif]-->\n");
      out.write("\n");
      out.write("        <!-- Favicon and touch icons -->\n");
      out.write("        <link rel=\"shortcut icon\" href=\"assets/ico/favicon.png\">\n");
      out.write("        <link rel=\"apple-touch-icon-precomposed\" sizes=\"144x144\" href=\"assets/ico/apple-touch-icon-144-precomposed.png\">\n");
      out.write("        <link rel=\"apple-touch-icon-precomposed\" sizes=\"114x114\" href=\"assets/ico/apple-touch-icon-114-precomposed.png\">\n");
      out.write("        <link rel=\"apple-touch-icon-precomposed\" sizes=\"72x72\" href=\"assets/ico/apple-touch-icon-72-precomposed.png\">\n");
      out.write("        <link rel=\"apple-touch-icon-precomposed\" href=\"assets/ico/apple-touch-icon-57-precomposed.png\">\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("\t\t<!-- Top menu -->\n");
      out.write("\t\t<nav class=\"navbar navbar-inverse navbar-no-bg\" role=\"navigation\">\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t<div class=\"navbar-header\">\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#top-navbar-1\">\n");
      out.write("\t\t\t\t\t\t<span class=\"sr-only\"></span>\n");
      out.write("\t\t\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<!-- Collect the nav links, forms, and other content for toggling -->\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</nav>\n");
      out.write("\n");
      out.write("        <!-- Top content -->\n");
      out.write("        <div class=\"top-content\">\n");
      out.write("        \t\n");
      out.write("            <div class=\"inner-bg\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-sm-8 col-sm-offset-2 text\">\n");
      out.write("                            \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-sm-6 col-sm-offset-3 form-box\">\n");
      out.write("                        \t\n");
      out.write("                        \t<form role=\"form\" action=\"user_register\" method=\"post\" class=\"registration-form\">\n");
      out.write("                        \t\t\n");
      out.write("                        \t\t<fieldset>\n");
      out.write("\t\t                        \t<div class=\"form-top\">\n");
      out.write("\t\t                        \t\t<div class=\"form-top-left\">\n");
      out.write("\t\t                        \t\t\t<h3>步骤 1 / 3</h3>\n");
      out.write("\t\t                            \t\t<p>Tell us who you are:</p>\n");
      out.write("\t\t                        \t\t</div>\n");
      out.write("\t\t                        \t\t<div class=\"form-top-right\">\n");
      out.write("\t\t                        \t\t\t<i class=\"fa fa-user\"></i>\n");
      out.write("\t\t                        \t\t</div>\n");
      out.write("\t\t                            </div>\n");
      out.write("\t\t                            <div class=\"form-bottom\">\n");
      out.write("\t\t\t\t                    \t<div class=\"form-group\">\n");
      out.write("\t\t\t\t                    \t\t<label class=\"sr-only\" for=\"form-first-name\">学号</label>\n");
      out.write("\t\t\t\t                        \t<input type=\"text\" name=\"students_id\" placeholder=\"学号\" class=\"form-first-name form-control\" id=\"form-first-name\">\n");
      out.write("\t\t\t\t                        </div>\n");
      out.write("\t\t\t\t                        <div class=\"form-group\">\n");
      out.write("\t\t\t\t                        \t<label class=\"sr-only\" for=\"form-last-name\">学生姓名</label>\n");
      out.write("\t\t\t\t                        \t<input type=\"text\" name=\"students_name\" placeholder=\"学生姓名...\" class=\"form-last-name form-control\" id=\"form-last-name\">\n");
      out.write("\t\t\t\t                        </div>\n");
      out.write("\t\t\t\t                        <div class=\"form-group\">\n");
      out.write("\t\t\t\t                        \t<label class=\"sr-only\" for=\"form-about-yourself\">性别</label>\n");
      out.write("\t\t\t\t                        \t<input type=\"text\" name=\"students_sex\" placeholder=\"性别...\" class=\"form-last-name form-control\" id=\"form-last-name\">\n");
      out.write("\t\t\t\t                        </div>\n");
      out.write("\t\t\t\t                        <button type=\"button\" class=\"btn btn-next\">下一步</button>\n");
      out.write("\t\t\t\t                    </div>\n");
      out.write("\t\t\t                    </fieldset>\n");
      out.write("\t\t\t                    \n");
      out.write("\t\t\t                    <fieldset>\n");
      out.write("\t\t                        \t<div class=\"form-top\">\n");
      out.write("\t\t                        \t\t<div class=\"form-top-left\">\n");
      out.write("\t\t                        \t\t\t<h3>步骤 2 / 3</h3>\n");
      out.write("\t\t                            \t\t\n");
      out.write("\t\t                        \t\t</div>\n");
      out.write("\t\t                        \t\t<div class=\"form-top-right\">\n");
      out.write("\t\t                        \t\t\t<i class=\"fa fa-key\"></i>\n");
      out.write("\t\t                        \t\t</div>\n");
      out.write("\t\t                            </div>\n");
      out.write("\t\t                            <div class=\"form-bottom\">\n");
      out.write("\t\t\t\t                        <div class=\"form-group\">\n");
      out.write("\t\t\t\t                        \t<label class=\"sr-only\" for=\"form-email\">邮箱</label>\n");
      out.write("\t\t\t\t                        \t<input type=\"email\" name=\"students_email\" placeholder=\"邮箱...\" class=\"form-email form-control\" id=\"form-email\">\n");
      out.write("\t\t\t\t                        </div>\n");
      out.write("\t\t\t\t                        <div class=\"form-group\">\n");
      out.write("\t\t\t\t                    \t\t<label class=\"sr-only\" for=\"form-password\">密码</label>\n");
      out.write("\t\t\t\t                        \t<input type=\"password\" name=\"students_password\" placeholder=\"密码...\" class=\"form-password form-control\" id=\"form-password\">\n");
      out.write("\t\t\t\t                        </div>\n");
      out.write("\t\t\t\t                        <div class=\"form-group\">\n");
      out.write("\t\t\t\t                        \t<label class=\"sr-only\" for=\"form-repeat-password\">确认密码</label>\n");
      out.write("\t\t\t\t                        \t<input type=\"password\" name=\"form-repeat-password\" placeholder=\"再次输入密码...\" \n");
      out.write("\t\t\t\t                        \t\t\t\tclass=\"form-repeat-password form-control\" id=\"form-repeat-password\">\n");
      out.write("\t\t\t\t                        </div>\n");
      out.write("\t\t\t\t                        <button type=\"button\" class=\"btn btn-previous\">上一步</button>\n");
      out.write("\t\t\t\t                        <button type=\"button\" class=\"btn btn-next\">下一步</button>\n");
      out.write("\t\t\t\t                    </div>\n");
      out.write("\t\t\t                    </fieldset>\n");
      out.write("\t\t\t                    \n");
      out.write("\t\t\t                    <fieldset>\n");
      out.write("\t\t                        \t<div class=\"form-top\">\n");
      out.write("\t\t                        \t\t<div class=\"form-top-left\">\n");
      out.write("\t\t                        \t\t\t<h3>步骤 3 / 3</h3>\n");
      out.write("\t\t                            \t\t\n");
      out.write("\t\t                        \t\t</div>\n");
      out.write("\t\t                        \t\t<div class=\"form-top-right\">\n");
      out.write("\t\t                        \t\t\t<i class=\"fa fa-twitter\"></i>\n");
      out.write("\t\t                        \t\t</div>\n");
      out.write("\t\t                            </div>\n");
      out.write("\t\t                            <div class=\"form-bottom\">\n");
      out.write("\t\t\t\t                    \t<div class=\"form-group\">\n");
      out.write("\t\t\t\t                    \t\t<label class=\"sr-only\" for=\"form-facebook\">学院</label>\n");
      out.write("\t\t\t\t                        \t<input type=\"text\" name=\"students_school\" placeholder=\"学院...\" class=\"form-facebook form-control\" id=\"form-facebook\">\n");
      out.write("\t\t\t\t                        </div>\n");
      out.write("\t\t\t\t                        <div class=\"form-group\">\n");
      out.write("\t\t\t\t                        \t<label class=\"sr-only\" for=\"form-twitter\">班级</label>\n");
      out.write("\t\t\t\t                        \t<input type=\"text\" name=\"students_class\" placeholder=\"班级...\" class=\"form-twitter form-control\" id=\"form-twitter\">\n");
      out.write("\t\t\t\t                        </div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t <div class=\"form-group\">\n");
      out.write("\t\t\t\t                        \t<label class=\"sr-only\" for=\"form-twitter\">电话</label>\n");
      out.write("\t\t\t\t                        \t<input type=\"text\" name=\"students_tel\" placeholder=\"电话...\" class=\"form-twitter form-control\" id=\"form-twitter\">\n");
      out.write("\t\t\t\t                        </div>\n");
      out.write("\t\t\t\t                        \n");
      out.write("\t\t\t\t                        <button type=\"button\" class=\"btn btn-previous\">上一步</button>\n");
      out.write("\t\t\t\t                        <button type=\"submit\" class=\"btn\">注册</button>\n");
      out.write("\t\t\t\t                    </div>\n");
      out.write("\t\t\t                    </fieldset>\n");
      out.write("\t\t                    \n");
      out.write("\t\t                    </form>\n");
      out.write("\t\t                    \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Javascript -->\n");
      out.write("        <script src=\"assets/js/jquery-1.11.1.min.js\"></script>\n");
      out.write("        <script src=\"assets/bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"assets/js/jquery.backstretch.min.js\"></script>\n");
      out.write("        <script src=\"assets/js/retina-1.1.0.min.js\"></script>\n");
      out.write("        <script src=\"assets/js/scripts.js\"></script>\n");
      out.write("        \n");
      out.write("        <!--[if lt IE 10]>\n");
      out.write("            <script src=\"assets/js/placeholder.js\"></script>\n");
      out.write("        <![endif]-->\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("</html>");
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
