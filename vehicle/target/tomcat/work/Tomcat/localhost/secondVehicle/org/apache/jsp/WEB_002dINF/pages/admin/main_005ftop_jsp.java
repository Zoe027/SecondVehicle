/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2022-03-19 15:38:08 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.pages.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class main_005ftop_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\" />\r\n");
      out.write("</head>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(basePath);
      out.write("css/bootstrap.min.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(basePath);
      out.write("css/bootstrap-responsive.min.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(basePath);
      out.write("css/matrix-style.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(basePath);
      out.write("css/matrix-media.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(basePath);
      out.write("font-awesome/css/font-awesome.css\" />\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t<!--Header-part-->\r\n");
      out.write("\t<div id=\"headers\" >\r\n");
      out.write("\t\r\n");
      out.write("\t   \t<div style=\"float:letf;height:50px;background-color:#323232;\">\r\n");
      out.write("\t   \t<div style=\"float:left;background-color:#FFB53E;height:50px;width:220px;\">\r\n");
      out.write("\t   \t<a href=\"");
      out.print(basePath);
      out.write("admin/indexs\">\r\n");
      out.write("\t   \t<p style=\"font-size:30px;text-align:center;\">首页</p>\r\n");
      out.write("\t   \t</a>\r\n");
      out.write("\t   \t</div>\r\n");
      out.write("\t   \t<h1 style=\"text-align:center;margin-top: 10px;margin-bottom: 0px;\">二手电瓶车估值网站管理系统</h1>\r\n");
      out.write("\t   \t</div>\r\n");
      out.write("\t    \r\n");
      out.write("\t  \r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!--close-Header-part-->\r\n");
      out.write("\t<!--top-Header-menu-->\r\n");
      out.write("\t<div id=\"user-nav\" class=\"navbar navbar-inverse\" >\r\n");
      out.write("\t\t<ul class=\"nav\" style=\"height:50px;\">\r\n");
      out.write("\t\t\t<li class=\"dropdown\" id=\"profile-messages\"><a title=\"\" href=\"#\"\r\n");
      out.write("\t\t\t\tdata-toggle=\"dropdown\" data-target=\"#profile-messages\"\r\n");
      out.write("\t\t\t\tclass=\"dropdown-toggle\"> <i class=\"icon icon-user\"></i> \r\n");
      out.write("\t\t\t\t<span class=\"text\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.admin.userName }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</span><b class=\"caret\"></b> </a>\r\n");
      out.write("\t\t\t\t<ul class=\"dropdown-menu\">\r\n");
      out.write("\t\t\t\t\t<li><a href=\"");
      out.print(basePath);
      out.write("admin/info\"><i class=\"icon-user\"></i>个人信息</a></li>\r\n");
      out.write("\t\t\t\t\t<li class=\"divider\"></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"");
      out.print(basePath);
      out.write("admin/modify\"><i class=\"icon-check\"></i>修改密码</a></li>\r\n");
      out.write("\t\t\t\t\t<li class=\"divider\"></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"");
      out.print(basePath);
      out.write("admin\"\r\n");
      out.write("\t\t\t\t\t\tonclick=\"return confirm('确认退出吗？');\"><i class=\"icon-key\"></i>退出</a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</li>\r\n");
      out.write("\t\t\t<li class=\"\"><a title=\"\" href=\"");
      out.print(basePath);
      out.write("admin\"\r\n");
      out.write("\t\t\t\tonclick=\"return confirm('确认退出吗？');\"><i\r\n");
      out.write("\t\t\t\t\tclass=\"icon icon-share-alt\"></i> <span class=\"text\">退出</span> </a></li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- 实现左边动画 -->\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.print(basePath);
      out.write("js/jquery-3.1.1.min.js\"></script>\r\n");
      out.write("\t<script src=\"");
      out.print(basePath);
      out.write("js/matrix.js\"/></script>\r\n");
      out.write("\t<!-- 实现上边动画 -->\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.print(basePath);
      out.write("js/bootstrap.min.js\"></script>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
