/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.68
 * Generated at: 2022-12-14 01:53:26 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.shared;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
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

      out.write('\n');

    String baseUrl = "http://localhost:8080/latihan_project_andri/";

      out.write("\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<meta name=\"description\" content=\"\">\n");
      out.write("<meta name=\"author\" content=\"Mark Otto, Jacob Thornton, and Bootstrap contributors\">\n");
      out.write("<meta name=\"generator\" content=\"Hugo 0.104.2\">\n");
      out.write("<link href=\"");
      out.print( baseUrl);
      out.write("bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("<link href=\"");
      out.print( baseUrl);
      out.write("media/aisyah.jpeg\" rel=\"icon\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.2/font/bootstrap-icons.css\">\n");
      out.write("\n");
      out.write("<style>\n");
      out.write("    @import url(\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.2/font/bootstrap-icons.css\");\n");
      out.write("\n");
      out.write("    .bd-placeholder-img {\n");
      out.write("        font-size: 1.125rem;\n");
      out.write("        text-anchor: middle;\n");
      out.write("        -webkit-user-select: none;\n");
      out.write("        -moz-user-select: none;\n");
      out.write("        user-select: none;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    @media (min-width: 768px) {\n");
      out.write("        .bd-placeholder-img-lg {\n");
      out.write("            font-size: 3.5rem;\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .b-example-divider {\n");
      out.write("        height: 3rem;\n");
      out.write("        background-color: rgba(0, 0, 0, .1);\n");
      out.write("        border: solid rgba(0, 0, 0, .15);\n");
      out.write("        border-width: 1px 0;\n");
      out.write("        box-shadow: inset 0 .5em 1.5em rgba(0, 0, 0, .1), inset 0 .125em .5em rgba(0, 0, 0, .15);\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .b-example-vr {\n");
      out.write("        flex-shrink: 0;\n");
      out.write("        width: 1.5rem;\n");
      out.write("        height: 100vh;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .bi {\n");
      out.write("        vertical-align: -.125em;\n");
      out.write("        fill: currentColor;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .nav-scroller {\n");
      out.write("        position: relative;\n");
      out.write("        z-index: 2;\n");
      out.write("        height: 2.75rem;\n");
      out.write("        overflow-y: hidden;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .nav-scroller .nav {\n");
      out.write("        display: flex;\n");
      out.write("        flex-wrap: nowrap;\n");
      out.write("        padding-bottom: 1rem;\n");
      out.write("        margin-top: -1px;\n");
      out.write("        overflow-x: auto;\n");
      out.write("        text-align: center;\n");
      out.write("        white-space: nowrap;\n");
      out.write("        -webkit-overflow-scrolling: touch;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    main > .container {\n");
      out.write("        padding: 60px 15px 0;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .form-signin {\n");
      out.write("        max-width: 330px;\n");
      out.write("        padding: 15px;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .form-signin .form-floating:focus-within {\n");
      out.write("        z-index: 2;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .form-signin input[type=\"text\"] {\n");
      out.write("        margin-bottom: -1px;\n");
      out.write("        border-bottom-right-radius: 0;\n");
      out.write("        border-bottom-left-radius: 0;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .form-signin input[type=\"password\"] {\n");
      out.write("        margin-bottom: 10px;\n");
      out.write("        border-top-left-radius: 0;\n");
      out.write("        border-top-right-radius: 0;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .img-profile {\n");
      out.write("        width: 200px;\n");
      out.write("        border-radius: 5px;\n");
      out.write("    }\n");
      out.write("</style>");
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
