/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.23
 * Generated at: 2016-12-15 07:19:03 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.content;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class huodong_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/struts2-core-2.3.28.1.jar", Long.valueOf(1481106112938L));
    _jspx_dependants.put("jar:file:/F:/新建文件夹%20(2)/f/software/gradle-2.11/caches/modules-2/files-2.1/org.apache.struts/struts2-core/2.3.28.1/9cb875fde70fd8ba7bac0d33a6903d1bfe1ec860/struts2-core-2.3.28.1.jar!/META-INF/struts-tags.tld", Long.valueOf(1461048636000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvalue_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody;

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
    _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvalue_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvalue_005fid.release();
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.release();
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
      out.write("\t\r\n");
      out.write("<!--[if lt IE 7]>      <html class=\"no-js lt-ie9 lt-ie8 lt-ie7\"> <![endif]-->\r\n");
      out.write("<!--[if IE 7]>         <html class=\"no-js lt-ie9 lt-ie8\"> <![endif]-->\r\n");
      out.write("<!--[if IE 8]>         <html class=\"no-js lt-ie9\"> <![endif]-->\r\n");
      out.write("<!--[if gt IE 8]><!--> <html class=\"no-js\"> <!--<![endif]-->\r\n");
      out.write("\t<head>\r\n");
      out.write("\t<meta charset=\"utf-8\">\r\n");
      out.write("\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("\t<title>活动</title>\r\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("\t<meta name=\"description\" content=\"Free HTML5 Template by FREEHTML5.CO\" />\r\n");
      out.write("\t<meta name=\"keywords\" content=\"free html5, free template, free bootstrap, html5, css3, mobile first, responsive\" />\r\n");
      out.write("\t<meta name=\"author\" content=\"FREEHTML5.CO\" />\r\n");
      out.write("\r\n");
      out.write("  \t<!-- Facebook and Twitter integration -->\r\n");
      out.write("\t<meta property=\"og:title\" content=\"\"/>\r\n");
      out.write("\t<meta property=\"og:image\" content=\"\"/>\r\n");
      out.write("\t<meta property=\"og:url\" content=\"\"/>\r\n");
      out.write("\t<meta property=\"og:site_name\" content=\"\"/>\r\n");
      out.write("\t<meta property=\"og:description\" content=\"\"/>\r\n");
      out.write("\t<meta name=\"twitter:title\" content=\"\" />\r\n");
      out.write("\t<meta name=\"twitter:image\" content=\"\" />\r\n");
      out.write("\t<meta name=\"twitter:url\" content=\"\" />\r\n");
      out.write("\t<meta name=\"twitter:card\" content=\"\" />\r\n");
      out.write("\r\n");
      out.write("  \t<!-- Place favicon.ico and apple-touch-icon.png in the root directory -->\r\n");
      out.write("  \t<link rel=\"shortcut icon\" href=\"favicon.ico\">\r\n");
      out.write("\r\n");
      out.write("  \t<!-- Google Webfont -->\r\n");
      out.write("\t<link href='http://fonts.useso.com/css?family=Lato:300,400,700' rel='stylesheet' type='text/css'>\r\n");
      out.write("\t<!-- Themify Icons -->\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/themify-icons.css\">\r\n");
      out.write("\t<!-- Bootstrap -->\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/bootstrap.css\">\r\n");
      out.write("\t<!-- Owl Carousel -->\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/owl.carousel.min.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/owl.theme.default.min.css\">\r\n");
      out.write("\t<!-- Magnific Popup -->\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/magnific-popup.css\">\r\n");
      out.write("\t<!-- Superfish -->\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/superfish.css\">\r\n");
      out.write("\t<!-- Easy Responsive Tabs -->\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/easy-responsive-tabs.css\">\r\n");
      out.write("\t<!-- Animate.css -->\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/animate.css\">\r\n");
      out.write("\t<!-- Theme Style -->\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/style.css\">\r\n");
      out.write("\r\n");
      out.write("\t<!-- Modernizr JS -->\r\n");
      out.write("\t<script src=\"js/modernizr-2.6.2.min.js\"></script>\r\n");
      out.write("\t<!-- FOR IE9 below -->\r\n");
      out.write("\t<!--[if lt IE 9]>\r\n");
      out.write("\t<script src=\"js/respond.min.js\"></script>\r\n");
      out.write("\t<![endif]-->\r\n");
      out.write("\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body>\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- START #fh5co-header -->\r\n");
      out.write("\t\t<header id=\"fh5co-header-section\" role=\"header\" class=\"\" >\r\n");
      out.write("\t\t\t<div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<!-- <div id=\"fh5co-menu-logo\"> -->\r\n");
      out.write("\t\t\t\t\t<!-- START #fh5co-logo -->\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<!-- START #fh5co-menu-wrap -->\r\n");
      out.write("\t\t\t\t\t<nav id=\"fh5co-menu-wrap\" role=\"navigation\">\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"sf-menu\" id=\"fh5co-primary-menu\">\r\n");
      out.write("                           \r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"active\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"indexl\">首页</a>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</nav>\r\n");
      out.write("\t\t\t\t<!-- </div> -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</header>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div id=\"fh5co-hero\">\r\n");
      out.write("\t\t\t<a href=\"#fh5co-main\" class=\"smoothscroll fh5co-arrow to-animate hero-animate-4\"><i class=\"ti-angle-down\"></i></a>\r\n");
      out.write("\t\t\t<!-- End fh5co-arrow -->\r\n");
      out.write("\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t<div class=\"col-md-8 col-md-offset-2\">\r\n");
      out.write("\t\t\t\t\t<div class=\"fh5co-hero-wrap\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"fh5co-hero-intro\">\r\n");
      out.write("\t\t\t\t\t\t\t<h1 class=\"to-animate hero-animate-1\">We love,We do</h1>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("       \r\n");
      out.write("\t\r\n");
      out.write("\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t<div class=\"row\" id=\"fh5co-features\">\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-4 col-sm-6 text-center fh5co-feature feature-box\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"fh5co-feature-icon\">\r\n");
      out.write("\t\t\t\t\t\t\t<i class=\"ti-mobile\"></i>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-4 col-sm-6 text-center fh5co-feature feature-box\"> \r\n");
      out.write("\t\t\t\t\t\t<div class=\"fh5co-feature-icon\">\r\n");
      out.write("\t\t\t\t\t\t\t<i class=\"ti-lock\"></i>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"clearfix visible-sm-block\"></div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-4 col-sm-6 text-center fh5co-feature feature-box\"> \r\n");
      out.write("\t\t\t\t\t\t<div class=\"fh5co-feature-icon\">\r\n");
      out.write("\t\t\t\t\t\t\t<i class=\"ti-video-camera\"></i>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"clearfix visible-md-block visible-lg-block\"></div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!-- END row -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"fh5co-spacer fh5co-spacer-md\"></div>\r\n");
      out.write("\t\t\t\t<!-- End Spacer -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"row\" id=\"fh5co-works\">\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-8 col-md-offset-2 text-center fh5co-section-heading work-box\">\r\n");
      out.write("\t\t\t\t\t\t<h2 class=\"fh5co-lead\">活动公告栏</h2>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"fh5co-spacer fh5co-spacer-sm\"></div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_s_005fiterator_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-4 col-sm-6 col-xs-6 col-xxs-12 text-center fh5co-work-item work-box\">\r\n");
      out.write("\t\t\t\t\t\t<figure><img class=\"img-responsive\" src=\"images/work_1.jpg\" alt=\"Free HTML5 Template\"></figure>\r\n");
      out.write("\t\t\t\t\t\t<a href='singleactivity.html'><p class=\"fh5co-category\">舞神大赛</p></a>\r\n");
      out.write("\t\t\t\t\t\t<h3 class=\"heading\">No. 1</h3>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-4 col-sm-6 col-xs-6 col-xxs-12 text-center fh5co-work-item work-box\"> \r\n");
      out.write("\t\t\t\t\t\t<figure><img class=\"img-responsive\" src=\"images/work_2.jpg\" alt=\"Free HTML5 Template\"></figure>\r\n");
      out.write("\t\t\t\t\t\t<a href=''><p class=\"fh5co-category\">十佳歌手</p></a>\r\n");
      out.write("\t\t\t\t\t\t<h3 class=\"heading\">No. 2</h3>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-4 col-sm-6 col-xs-6 col-xxs-12 text-center fh5co-work-item work-box\"> \r\n");
      out.write("\t\t\t\t\t\t<figure><img class=\"img-responsive\" src=\"images/work_3.jpg\" alt=\"Free HTML5 Template\"></figure>\r\n");
      out.write("\t\t\t\t\t\t<a href=''><p class=\"fh5co-category\">五月采风</p></a>\r\n");
      out.write("\t\t\t\t\t\t<h3 class=\"heading\">No. 3</h3>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-4 col-sm-6 col-xs-6 col-xxs-12 text-center fh5co-work-item work-box\">\r\n");
      out.write("\t\t\t\t\t\t<figure><img class=\"img-responsive\" src=\"images/work_4.jpg\" alt=\"Free HTML5 Template\"></figure>\r\n");
      out.write("\t\t\t\t\t\t<a href=''><p class=\"fh5co-category\">马拉松</p></a>\r\n");
      out.write("\t\t\t\t\t\t<h3 class=\"heading\">No. 4</h3>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"clearfix visible-sm-block visible-xs-block\"></div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-4 col-sm-6 col-xs-6 col-xxs-12 text-center fh5co-work-item work-box\"> \r\n");
      out.write("\t\t\t\t\t\t<figure><img class=\"img-responsive\" src=\"images/work_5.jpg\" alt=\"Free HTML5 Template\"></figure>\r\n");
      out.write("\t\t\t\t\t\t<a href=''><p class=\"fh5co-category\">台球赛</p></a>\r\n");
      out.write("\t\t\t\t\t\t<h3 class=\"heading\">No. 5</h3>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-4 col-sm-6 col-xs-6 col-xxs-12 text-center fh5co-work-item work-box\"> \r\n");
      out.write("\t\t\t\t\t\t<figure><img class=\"img-responsive\" src=\"images/work_6.jpg\" alt=\"Free HTML5 Template\"></figure>\r\n");
      out.write("\t\t\t\t\t\t<a href=''><p class=\"fh5co-category\">高校演讲 </p></a>\r\n");
      out.write("\t\t\t\t\t\t<h3 class=\"heading\">No. 6</h3>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("                    <div class=\"col-md-4 col-sm-6 col-xs-6 col-xxs-12 text-center fh5co-work-item work-box\">\r\n");
      out.write("\t\t\t\t\t\t<figure><img class=\"img-responsive\" src=\"images/work_1.jpg\" alt=\"Free HTML5 Template\"></figure>\r\n");
      out.write("\t\t\t\t\t\t<a href=''><p class=\"fh5co-category\">谁羽争锋</p></a>\r\n");
      out.write("\t\t\t\t\t\t<h3 class=\"heading\">No. 1</h3>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-4 col-sm-6 col-xs-6 col-xxs-12 text-center fh5co-work-item work-box\"> \r\n");
      out.write("\t\t\t\t\t\t<figure><img class=\"img-responsive\" src=\"images/work_2.jpg\" alt=\"Free HTML5 Template\"></figure>\r\n");
      out.write("\t\t\t\t\t\t<a href=''><p class=\"fh5co-category\">辩论赛</p></a>\r\n");
      out.write("\t\t\t\t\t\t<h3 class=\"heading\">No. 2</h3>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"clearfix visible-sm-block visible-xs-block\"></div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-4 col-sm-6 col-xs-6 col-xxs-12 text-center fh5co-work-item work-box\"> \r\n");
      out.write("\t\t\t\t\t\t<figure><img class=\"img-responsive\" src=\"images/work_3.jpg\" alt=\"Free HTML5 Template\"></figure>\r\n");
      out.write("\t\t\t\t\t\t<a href=''><p class=\"fh5co-category\">GMC</p></a>\r\n");
      out.write("\t\t\t\t\t\t<h3 class=\"heading\">No. 3</h3>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!-- END row -->\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<div class=\"fh5co-spacer fh5co-spacer-md\"></div>\r\n");
      out.write("\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t<!-- Start Slider Testimonial -->\r\n");
      out.write("\t            <h1 class=\"fh5co-uppercase-heading-sm text-center animate-box\">更多...</h1>\r\n");
      out.write("\t            <div class=\"fh5co-spacer fh5co-spacer-xs\"></div>\r\n");
      out.write("\t            <div class=\"owl-carousel-fullwidth animate-box\">\r\n");
      out.write("\t            <div class=\"item\">\r\n");
      out.write("\t              <p class=\"text-center quote\">&ldquo;还等什么，hai起来ba</cite></p>\r\n");
      out.write("\t            </div>\r\n");
      out.write("\t            <div class=\"item\">\r\n");
      out.write("\t              <p class=\"text-center quote\">&ldquo;Creativity is just connecting things. When you ask creative people how they did something, they feel a little guilty because they didn’t really do it, they just saw something. It seemed obvious to them after a while. &rdquo;<cite class=\"author\">&mdash; Steve Jobs</cite></p>\r\n");
      out.write("\t            </div>\r\n");
      out.write("\t            <div class=\"item\">\r\n");
      out.write("\t              <p class=\"text-center quote\">&ldquo;I think design would be better if designers were much more skeptical about its applications. If you believe in the potency of your craft, where you choose to dole it out is not something to take lightly. &rdquo;<cite class=\"author\">&mdash; Frank Chimero</cite></p>\r\n");
      out.write("\t            </div>\r\n");
      out.write("\t          </div>\r\n");
      out.write("\t           <!-- End Slider Testimonial -->\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!-- END row -->\r\n");
      out.write("\t\t\t\t<div class=\"fh5co-spacer fh5co-spacer-md\"></div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- END container -->\r\n");
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- END fhtco-main -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<footer role=\"contentinfo\" id=\"fh5co-footer\">\r\n");
      out.write("\t\t\t<a href=\"#\" class=\"fh5co-arrow fh5co-gotop footer-box\"><i class=\"ti-angle-up\"></i></a>\r\n");
      out.write("\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-4 col-sm-6 footer-box\">\r\n");
      out.write("\t\t\t\t\t\t<h3 class=\"fh5co-footer-heading\">关于我们</h3>\r\n");
      out.write("\t\t\t\t\t\t<p>我们集中社团和同学提高工作效率和社团知名度。</p>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-4 col-sm-6 footer-box\">\r\n");
      out.write("\t\t\t\t\t\t<h1 class=\"fh5co-footer-heading\">更多</h1>\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"fh5co-footer-links\">\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"shetuan\">社团</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"tuanhuo\">活动</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-4 col-sm-12 footer-box\">\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!-- END row -->\r\n");
      out.write("\t\t\t\t<div class=\"fh5co-spacer fh5co-spacer-md\"></div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</footer>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t<!-- jQuery -->\r\n");
      out.write("\t\t<script src=\"js/jquery-1.10.2.min.js\"></script>\r\n");
      out.write("\t\t<!-- jQuery Easing -->\r\n");
      out.write("\t\t<script src=\"js/jquery.easing.1.3.js\"></script>\r\n");
      out.write("\t\t<!-- Bootstrap -->\r\n");
      out.write("\t\t<script src=\"js/bootstrap.js\"></script>\r\n");
      out.write("\t\t<!-- Owl carousel -->\r\n");
      out.write("\t\t<script src=\"js/owl.carousel.min.js\"></script>\r\n");
      out.write("\t\t<!-- Magnific Popup -->\r\n");
      out.write("\t\t<script src=\"js/jquery.magnific-popup.min.js\"></script>\r\n");
      out.write("\t\t<!-- Superfish -->\r\n");
      out.write("\t\t<script src=\"js/hoverIntent.js\"></script>\r\n");
      out.write("\t\t<script src=\"js/superfish.js\"></script>\r\n");
      out.write("\t\t<!-- Easy Responsive Tabs -->\r\n");
      out.write("\t\t<script src=\"js/easyResponsiveTabs.js\"></script>\r\n");
      out.write("\t\t<!-- FastClick for Mobile/Tablets -->\r\n");
      out.write("\t\t<script src=\"js/fastclick.js\"></script>\r\n");
      out.write("\t\t<!-- Parallax -->\r\n");
      out.write("\t\t<script src=\"js/jquery.parallax-scroll.min.js\"></script>\r\n");
      out.write("\t\t<!-- Waypoints -->\r\n");
      out.write("\t\t<script src=\"js/jquery.waypoints.min.js\"></script>\r\n");
      out.write("\t\t<!-- Main JS -->\r\n");
      out.write("\t\t<script src=\"js/main.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t</body>\r\n");
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

  private boolean _jspx_meth_s_005fiterator_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  s:iterator
    org.apache.struts2.views.jsp.IteratorTag _jspx_th_s_005fiterator_005f0 = (org.apache.struts2.views.jsp.IteratorTag) _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvalue_005fid.get(org.apache.struts2.views.jsp.IteratorTag.class);
    _jspx_th_s_005fiterator_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fiterator_005f0.setParent(null);
    // /WEB-INF/content/huodong.jsp(150,5) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fiterator_005f0.setValue("#session.activityList");
    // /WEB-INF/content/huodong.jsp(150,5) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fiterator_005f0.setId("activity");
    int _jspx_eval_s_005fiterator_005f0 = _jspx_th_s_005fiterator_005f0.doStartTag();
    if (_jspx_eval_s_005fiterator_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fiterator_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fiterator_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fiterator_005f0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t<a href=\"activity_activityshow1?activity_id=");
        if (_jspx_meth_s_005fproperty_005f0(_jspx_th_s_005fiterator_005f0, _jspx_page_context))
          return true;
        out.write("&club_id=");
        if (_jspx_meth_s_005fproperty_005f1(_jspx_th_s_005fiterator_005f0, _jspx_page_context))
          return true;
        out.write("\">\r\n");
        out.write("\t\t\t\t\t<div class=\"col-md-4 col-sm-6 col-xs-6 col-xxs-12 text-center fh5co-work-item work-box\">\r\n");
        out.write("\t\t\t\t\t\t<figure><img class=\"img-responsive\" src=\"images/work_1.jpg\" alt=\"Free HTML5 Template\"></figure>\r\n");
        out.write("\t\t\t\t\t\t<a href='singleactivity.html'><p class=\"fh5co-category\">");
        if (_jspx_meth_s_005fproperty_005f2(_jspx_th_s_005fiterator_005f0, _jspx_page_context))
          return true;
        out.write("</p></a>\r\n");
        out.write("\t\t\t\t\t\t<h3 class=\"heading\">No.");
        if (_jspx_meth_s_005fproperty_005f3(_jspx_th_s_005fiterator_005f0, _jspx_page_context))
          return true;
        out.write("</h3>\r\n");
        out.write("\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_s_005fiterator_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fiterator_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fiterator_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvalue_005fid.reuse(_jspx_th_s_005fiterator_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvalue_005fid.reuse(_jspx_th_s_005fiterator_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f0 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f0);
    // /WEB-INF/content/huodong.jsp(151,49) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f0.setValue("#activity.activity_id");
    int _jspx_eval_s_005fproperty_005f0 = _jspx_th_s_005fproperty_005f0.doStartTag();
    if (_jspx_th_s_005fproperty_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f1 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f1.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f0);
    // /WEB-INF/content/huodong.jsp(151,101) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f1.setValue("#activity.club_id");
    int _jspx_eval_s_005fproperty_005f1 = _jspx_th_s_005fproperty_005f1.doStartTag();
    if (_jspx_th_s_005fproperty_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f1);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f2 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f2.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f0);
    // /WEB-INF/content/huodong.jsp(154,62) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f2.setValue("#activity.actname");
    int _jspx_eval_s_005fproperty_005f2 = _jspx_th_s_005fproperty_005f2.doStartTag();
    if (_jspx_th_s_005fproperty_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f2);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f3 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f3.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f0);
    // /WEB-INF/content/huodong.jsp(155,29) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f3.setValue("#activity.activity_id");
    int _jspx_eval_s_005fproperty_005f3 = _jspx_th_s_005fproperty_005f3.doStartTag();
    if (_jspx_th_s_005fproperty_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f3);
    return false;
  }
}
