/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.33
 * Generated at: 2016-04-24 23:28:32 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.cse135.jsp.*;

public final class confirmation_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_packages.add("com.cse135.jsp");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<meta name=\"viewport\" content=\"width-device-width, initial-scale=1.0\">\r\n");
      out.write("\t\t<link href=\"css/bootstrap.min.css\" rel = \"stylesheet\">\r\n");
      out.write("\t\t<link href=\"css/styles.css\" rel = \"stylesheet\">\r\n");
      out.write("\t\t<title>Home Page</title>\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body>\r\n");
      out.write("\t<div class=\t\"navbar navbar-default navbar-static-top\">\r\n");
      out.write("\t\t<div class= \"container\">\r\n");
      out.write("\t\t\t<a href=\"./index.html\" class=\"pull-left\"><img src=\"./img/logo.png\"></a>\r\n");
      out.write("\t\t\t\t<button class = \"navbar-toggle\" data-toggle = \"collapse\" data-target = \".navHeaderCollapse\">\r\n");
      out.write("\t\t\t\t\t<span class = \"icon-bar\"></span>\r\n");
      out.write("\t\t\t\t\t<span class = \"icon-bar\"></span>\r\n");
      out.write("\t\t\t\t\t<span class = \"icon-bar\"></span>\r\n");
      out.write("\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t<div class= \"collapse navbar-collapse navHeaderCollapse\">\r\n");
      out.write("\t\t\t\t\t<ul class= \"nav navbar-nav navbar-right\">\r\n");
      out.write("\t\t\t\t\t\t<li class = \"active\"><a href= \"./index.html\">Home</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href= \"./categories.html\">Categories</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href= \"./products.html\">Products</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href= \"./signup.html\">Signup</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href= \"./login.html\">Login</a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div >\r\n");
      out.write("\t<div align = \"center\" class = \"jumbotron\">\r\n");
      out.write("\t\t<div class = \"row\">\r\n");
      out.write("\t\t\t<h1>Confirmation Page</h1>\r\n");
      out.write("\t");

	for(int i=0; i < FunUtils.boxTest(5); i++){
		out.println("<br/>NEW BOX HERE");
	}
	
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<div class = \"navbar navbar-inverse navbar-fixed-bottom\">\r\n");
      out.write("\t\t<div class = \"container\">\r\n");
      out.write("\t\t\t<p class = \"navbar-text pull-left\"></p>\r\n");
      out.write("\t\t\t<!--\r\n");
      out.write("\t\t\t<a href= \"http://www.twitch.tv/esportscollective\" \r\n");
      out.write("\t\t\tclass = \"navbar-btn btn-link btn pull-right\">Follow us on Twitch!</a>  -->\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\t<script src=\"http://ajax.googleapis.com/ajax/libs/jquery/2.2.0/jquery.min.js\"></script>\r\n");
      out.write("\t\t<script src=\"js/bootstrap.js\"></script>\r\n");
      out.write("\t</body>\r\n");
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