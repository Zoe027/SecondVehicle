/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2022-04-13 07:05:00 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.pages.goods;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class pubGoods_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005fform_0026_005frole_005fmethod_005fenctype_005faction;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fform_005fform_0026_005frole_005fmethod_005fenctype_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fform_005fform_0026_005frole_005fmethod_005fenctype_005faction.release();
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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <title>发布电瓶车</title>\r\n");
      out.write("    <link rel=\"icon\" href=\"");
      out.print(basePath);
      out.write("img/logo.jpg\" type=\"image/x-icon\"/>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(basePath);
      out.write("css/font-awesome.min.css\" />\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(basePath);
      out.write("css/userhome.css\" />\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(basePath);
      out.write("css/user.css\" />\r\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.print(basePath);
      out.write("js/jquery-3.1.1.min.js\"></script>\r\n");
      out.write("   <!-- bootstrap -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(basePath);
      out.write("css/bootstrap.min.css\" />\r\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.print(basePath);
      out.write("js/jquery-3.1.1.min.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.print(basePath);
      out.write("js/bootstrap.min.js\"></script>\r\n");
      out.write("    <!-- 图片上传即使预览插件 -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(basePath);
      out.write("css/fileinput.min.css\">\r\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.print(basePath);
      out.write("js/fileinput.min.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.print(basePath);
      out.write("js/zh.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <style>\r\n");
      out.write("        .container{padding-top:10px}\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"pre-2\" id=\"big_img\">\r\n");
      out.write("    <img src=\"http://findfun.oss-cn-shanghai.aliyuncs.com/images/head_loading.gif\" class=\"jcrop-preview jcrop_preview_s\">\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"cover\" style=\"min-height: 639px;\">\r\n");
      out.write("    <div id=\"user_area\">\r\n");
      out.write("        <div id=\"home_header\">\r\n");
      out.write("            <a href=\"");
      out.print(basePath);
      out.write("goods/homeGoods\">\r\n");
      out.write("                <h1 class=\"logo\"></h1>\r\n");
      out.write("            </a>\r\n");
      out.write("            <a href=\"");
      out.print(basePath);
      out.write("user/home\">\r\n");
      out.write("                 <img src=\"");
      out.print(basePath);
      out.write("img/home_header.png\"  style=\"margin-left: 20px;\" >\r\n");
      out.write("            </a>\r\n");
      out.write("            <a href=\"");
      out.print(basePath);
      out.write("user/home\">\r\n");
      out.write("                <div class=\"home\"></div>\r\n");
      out.write("            </a>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!--\r\n");
      out.write("\r\n");
      out.write("            描述：左侧个人中心栏\r\n");
      out.write("        -->\r\n");
      out.write("        <div id=\"user_nav\">\r\n");
      out.write("            <div class=\"user_info\">\r\n");
      out.write("                <div class=\"head_img\">\r\n");
      out.write("                    <img src=\"");
      out.print(basePath);
      out.write("img/photo.jpg\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"big_headimg\">\r\n");
      out.write("                    <img src=\"\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <span class=\"name\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cur_user.username}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</span><hr>\r\n");
      out.write("              <!--   <span class=\"school\">浙师大</span> -->\r\n");
      out.write("                 <a class=\"btn\" style=\"width: 98%;background-color: rgb(79, 190, 246);color:rgba(255, 255, 255, 1);\" href=\"");
      out.print(basePath);
      out.write("user/myPurse\">我的钱包：￥");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${myPurse.balance}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</a>\r\n");
      out.write("                <input type=\"hidden\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${myPurse.recharge}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" id=\"recharge\"/>\r\n");
      out.write("                <input type=\"hidden\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${myPurse.withdrawals}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" id=\"withdrawals\"/>\r\n");
      out.write("               <span class=\"btn\" data-toggle=\"modal\" data-target=\"#myModal\" style=\"width: 98%;background-color: rgb(79, 190, 246); color:rgba(255, 255, 255, 1);margin-top:0.5cm;\">我的信用积分：");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cur_user.power}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</span>\r\n");
      out.write("                \r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"home_nav\">\r\n");
      out.write("                <ul>\r\n");
      out.write("                    <a href=\"");
      out.print(basePath);
      out.write("orders/myOrders\">\r\n");
      out.write("                        <li class=\"notice\">\r\n");
      out.write("                            <div></div>\r\n");
      out.write("                            <span>订单中心</span>\r\n");
      out.write("                            <strong></strong>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <a href=\"");
      out.print(basePath);
      out.write("user/allFocus\">\r\n");
      out.write("                        <li class=\"fri\">\r\n");
      out.write("                            <div></div>\r\n");
      out.write("                            <span>关注列表</span>\r\n");
      out.write("                            <strong></strong>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <a href=\"");
      out.print(basePath);
      out.write("goods/publishGoods\">\r\n");
      out.write("                        <li class=\"store\">\r\n");
      out.write("                            <div></div>\r\n");
      out.write("                            <span>发布电瓶车</span>\r\n");
      out.write("                            <strong></strong>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <a href=\"");
      out.print(basePath);
      out.write("user/allGoods\">\r\n");
      out.write("                        <li class=\"second\">\r\n");
      out.write("                            <div></div>\r\n");
      out.write("                            <span>我的电瓶车</span>\r\n");
      out.write("                            <strong></strong>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <a href=\"");
      out.print(basePath);
      out.write("user/basic\">\r\n");
      out.write("                        <li class=\"set\">\r\n");
      out.write("                            <div></div>\r\n");
      out.write("                            <span>个人设置</span>\r\n");
      out.write("                            <strong></strong>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </a>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!--\r\n");
      out.write("\r\n");
      out.write("\t            描述：发布二手电瓶车\r\n");
      out.write("        -->\r\n");
      out.write("        <div id=\"user_content\">\r\n");
      out.write("            <div class=\"basic\">\r\n");
      out.write("                ");
      if (_jspx_meth_form_005fform_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("            <!--\r\n");
      out.write("\r\n");
      out.write("                描述：最右侧，可能认识的人\r\n");
      out.write("            -->\r\n");
      out.write("            <div class=\"recommend\">\r\n");
      out.write("                <div class=\"title\">\r\n");
      out.write("                    <span class=\"text\">可能认识的人</span>\r\n");
      out.write("                    <span class=\"change\">换一组</span>\r\n");
      out.write("                    <span class=\"underline\"></span>\r\n");
      out.write("                </div>\r\n");
      out.write("                <ul>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"\" class=\"head_img\">\r\n");
      out.write("                            <img src=\"");
      out.print(basePath);
      out.write("img/photo1.jpg\">\r\n");
      out.write("                        </a>\r\n");
      out.write("                        <span>Brudce</span>\r\n");
      out.write("                        <div class=\"fa fa-plus-square\"></div>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"\" class=\"head_img\">\r\n");
      out.write("                            <img src=\"");
      out.print(basePath);
      out.write("img/photo2.jpg\">\r\n");
      out.write("                        </a>\r\n");
      out.write("                        <span>Graham</span>\r\n");
      out.write("                        <div class=\"fa fa-plus-square\"></div>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"\" class=\"head_img\">\r\n");
      out.write("                            <img src=\"");
      out.print(basePath);
      out.write("img/photo3.jpg\">\r\n");
      out.write("                        </a>\r\n");
      out.write("                        <span>策马奔腾hly</span>\r\n");
      out.write("                        <div class=\"fa fa-plus-square\"></div>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"\" class=\"head_img\">\r\n");
      out.write("                            <img src=\"");
      out.print(basePath);
      out.write("img/photo4.jpg\">\r\n");
      out.write("                        </a>\r\n");
      out.write("                        <span>Danger-XFH</span>\r\n");
      out.write("                        <div class=\"fa fa-plus-square\"></div>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"\" class=\"head_img\">\r\n");
      out.write("                            <img src=\"");
      out.print(basePath);
      out.write("img/photo5.jpg\">\r\n");
      out.write("                        </a>\r\n");
      out.write("                        <span>Keithw</span>\r\n");
      out.write("                        <div class=\"fa fa-plus-square\"></div>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("    $(\".myfile\").fileinput({\r\n");
      out.write("        uploadUrl:\"");
      out.print(basePath);
      out.write("goods/uploadFile\",//上传的地址\r\n");
      out.write("        uploadAsync:true, //默认异步上传\r\n");
      out.write("        showUpload: false, //是否显示上传按钮,跟随文本框的那个\r\n");
      out.write("        showRemove : false, //显示移除按钮,跟随文本框的那个\r\n");
      out.write("        showCaption: true,//是否显示标题,就是那个文本框\r\n");
      out.write("        showPreview : true, //是否显示预览,不写默认为true\r\n");
      out.write("        dropZoneEnabled: true,//是否显示拖拽区域，默认不写为true，但是会占用很大区域\r\n");
      out.write("        //minImageWidth: 50, //图片的最小宽度\r\n");
      out.write("        //minImageHeight: 50,//图片的最小高度\r\n");
      out.write("        //maxImageWidth: 1000,//图片的最大宽度\r\n");
      out.write("        //maxImageHeight: 1000,//图片的最大高度\r\n");
      out.write("        //maxFileSize: 0,//单位为kb，如果为0表示不限制文件大小\r\n");
      out.write("        //minFileCount: 0,\r\n");
      out.write("        maxFileCount: 3, //表示允许同时上传的最大文件个数\r\n");
      out.write("        enctype: 'multipart/form-data',\r\n");
      out.write("        validateInitialCount:true,\r\n");
      out.write("        previewFileIcon: \"<i class='glyphicon glyphicon-king'></i>\",\r\n");
      out.write("        msgFilesTooMany: \"选择上传的文件数量({n}) 超过允许的最大数值{m}！\",\r\n");
      out.write("        allowedFileTypes: ['image'],//配置允许文件上传的类型\r\n");
      out.write("        allowedPreviewTypes : [ 'image' ],//配置所有的被预览文件类型\r\n");
      out.write("        allowedPreviewMimeTypes : [ 'jpg', 'png', 'gif' ],//控制被预览的所有mime类型\r\n");
      out.write("        language : 'zh'\r\n");
      out.write("    })\r\n");
      out.write("    //异步上传返回结果处理\r\n");
      out.write("    $('.myfile').on('fileerror', function(event, data, msg) {\r\n");
      out.write("        console.log(\"fileerror\");\r\n");
      out.write("        console.log(data);\r\n");
      out.write("    });\r\n");
      out.write("    //异步上传返回结果处理\r\n");
      out.write("    $(\".myfile\").on(\"fileuploaded\", function (event, data, previewId, index) {\r\n");
      out.write("        console.log(\"fileuploaded\");\r\n");
      out.write("        var ref=$(this).attr(\"data-ref\");\r\n");
      out.write("        $(\"input[name='\"+ref+\"']\").val(data.response.imgUrl);\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("    //同步上传错误处理\r\n");
      out.write("    $('.myfile').on('filebatchuploaderror', function(event, data, msg) {\r\n");
      out.write("        console.log(\"filebatchuploaderror\");\r\n");
      out.write("        console.log(data);\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("    //同步上传返回结果处理\r\n");
      out.write("    $(\".myfile\").on(\"filebatchuploadsuccess\", function (event, data, previewId, index) {\r\n");
      out.write("        console.log(\"filebatchuploadsuccess\");\r\n");
      out.write("        console.log(data);\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("    //上传前\r\n");
      out.write("    $('.myfile').on('filepreupload', function(event, data, previewId, index) {\r\n");
      out.write("        console.log(\"filepreupload\");\r\n");
      out.write("    });\r\n");
      out.write("    //估值计算方法\r\n");
      out.write("    //y=-327.469+(-59.99)*years+11.73*voltage+59.114*batteryHealth+\r\n");
      out.write("    //30.116*numBrokenParts+(-110.804)*size+34.695*overallHealth+(-172.611)*brand_2+20.938*brand_3+190.453*brand_4+148.979*brand_5\r\n");
      out.write("    function getEvaluation(){\r\n");
      out.write("    \tvar result =0;\r\n");
      out.write("    \tvar brand =$(\"#brand\").val();\r\n");
      out.write("    \tvar years =$(\"#years\").val();\r\n");
      out.write("    \tvar voltage =$(\"#voltage\").val();\r\n");
      out.write("    \tvar size =$(\"#size\").val();\r\n");
      out.write("    \tvar overallHealth =$(\"#overallHealth\").val();\r\n");
      out.write("    \tvar numBrokenParts =$(\"#numBrokenParts\").val();\r\n");
      out.write("    \tvar batteryHealth =$(\"#batteryHealth\").val();\r\n");
      out.write("    \tresult = -7.196+(-39.391)*years+7.165*voltage+21.736*overallHealth+23.153*batteryHealth+(-10.047)*numBrokenParts+59.508*size;\r\n");
      out.write("    \tif(brand==2){\r\n");
      out.write("    \t\tresult = result + 66.598;\r\n");
      out.write("    \t}else if(brand==3){\r\n");
      out.write("    \t\tresult = result + 70.338;\r\n");
      out.write("    \t}else if(brand==4){\r\n");
      out.write("    \t\tresult = result + 186.803;\r\n");
      out.write("    \t}else if(brand==5){\r\n");
      out.write("    \t\tresult = result + 202.796;\r\n");
      out.write("    \t}\r\n");
      out.write("    \t$(\"#realPrice\").val(result);\r\n");
      out.write("    \treturn result;\r\n");
      out.write("    }\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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

  private boolean _jspx_meth_form_005fform_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  form:form
    org.springframework.web.servlet.tags.form.FormTag _jspx_th_form_005fform_005f0 = (org.springframework.web.servlet.tags.form.FormTag) _005fjspx_005ftagPool_005fform_005fform_0026_005frole_005fmethod_005fenctype_005faction.get(org.springframework.web.servlet.tags.form.FormTag.class);
    _jspx_th_form_005fform_005f0.setPageContext(_jspx_page_context);
    _jspx_th_form_005fform_005f0.setParent(null);
    // /WEB-INF/pages/goods/pubGoods.jsp(114,16) name = action type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fform_005f0.setAction("../goods/publishGoodsSubmit");
    // /WEB-INF/pages/goods/pubGoods.jsp(114,16) name = method type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fform_005f0.setMethod("post");
    // /WEB-INF/pages/goods/pubGoods.jsp(114,16) null
    _jspx_th_form_005fform_005f0.setDynamicAttribute(null, "role", "form");
    // /WEB-INF/pages/goods/pubGoods.jsp(114,16) name = enctype type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fform_005f0.setEnctype("multipart/form-data");
    int[] _jspx_push_body_count_form_005fform_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_form_005fform_005f0 = _jspx_th_form_005fform_005f0.doStartTag();
      if (_jspx_eval_form_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                    <h1 style=\"margin-left: 210px;\">发布二手电瓶车</h1><hr />\r\n");
          out.write("                    <div class=\"changeinfo\">\r\n");
          out.write("                        <span>二手电瓶车名：</span>\r\n");
          out.write("                        <input class=\"in_info\" type=\"text\" name=\"name\" placeholder=\"请输入二手电瓶车名\"/>\r\n");
          out.write("                        <span>(*必填)</span>\r\n");
          out.write("                    </div>\r\n");
          out.write("                      <div class=\"changeinfo\">\r\n");
          out.write("                        <span>电瓶车品牌：</span>\r\n");
          out.write("                        <select class=\"in_info\" id=\"brand\" name=\"brand\">\r\n");
          out.write("                            <option value=\"1\">无牌</option>\r\n");
          out.write("                            <option value=\"2\">普通品牌2</option>\r\n");
          out.write("                            <option value=\"3\">普通品牌3</option>\r\n");
          out.write("                            <option value=\"4\">知名品牌4</option>\r\n");
          out.write("                            <option value=\"5\">知名品牌5</option>\r\n");
          out.write("                        </select>\r\n");
          out.write("                    </div>\r\n");
          out.write("                      \r\n");
          out.write("                    <div class=\"changeinfo\">\r\n");
          out.write("                        <span>使用年限：</span>\r\n");
          out.write("                        <input class=\"in_info\" type=\"text\" id=\"years\" name=\"years\" placeholder=\"请输入使用年限\"/>\r\n");
          out.write("                        <span>(*必填)</span>\r\n");
          out.write("                    </div>\r\n");
          out.write("                      \r\n");
          out.write("                    <div class=\"changeinfo\">\r\n");
          out.write("                        <span>电瓶车型号：</span>\r\n");
          out.write("                        <input class=\"in_info\" type=\"text\" id=\"voltage\"  name=\"voltage\" placeholder=\"请输入型号\"/>\r\n");
          out.write("                        <span>（48/60/72）(*必填)</span>\r\n");
          out.write("                    </div>\r\n");
          out.write("                      \r\n");
          out.write("                    <div class=\"changeinfo\">\r\n");
          out.write("                        <span>电瓶车大小：</span>\r\n");
          out.write("                        <input class=\"in_info\" type=\"text\" id=\"size\" name=\"size\" placeholder=\"请输入电瓶车大小\"/>\r\n");
          out.write("                        <span>（1小，2大）(*必填)</span>\r\n");
          out.write("                    </div>\r\n");
          out.write("                    \r\n");
          out.write("                     <div class=\"changeinfo\">\r\n");
          out.write("                        <span>新旧程度：</span>\r\n");
          out.write("                        <input class=\"in_info\" type=\"text\" id=\"overallHealth\" name=\"overallHealth\" placeholder=\"请输入新旧程度\"/>\r\n");
          out.write("                        <span>（1-10）(*必填)</span>\r\n");
          out.write("                    </div>\r\n");
          out.write("                    \r\n");
          out.write("                     <div class=\"changeinfo\">\r\n");
          out.write("                        <span>破损处个数：</span>\r\n");
          out.write("                        <input class=\"in_info\" type=\"text\" id=\"numBrokenParts\" name=\"numBrokenParts\" placeholder=\"请输入破损处个数\"/>\r\n");
          out.write("                        <span>(*必填)</span>\r\n");
          out.write("                    </div>\r\n");
          out.write("                    \r\n");
          out.write("                    <div class=\"changeinfo\">\r\n");
          out.write("                        <span>电瓶新旧：</span>\r\n");
          out.write("                        <input class=\"in_info\" type=\"text\"  id=\"batteryHealth\"  name=\"batteryHealth\" placeholder=\"请输入电瓶电瓶新旧\"/>\r\n");
          out.write("                        <span>（1-10）(*必填)</span>\r\n");
          out.write("                    </div>\r\n");
          out.write("                     <input type=\"button\" class=\"setting-save\" value=\"估价\" onclick=\"getEvaluation()\" style=\"margin-top: 20px;background-color: blue;\"/>\r\n");
          out.write("                     <div class=\"changeinfo\">\r\n");
          out.write("                        <span>估价：</span>\r\n");
          out.write("                        <input class=\"in_info\" type=\"text\" id=\"realPrice\"  name=\"realPrice\" placeholder=\"\"/>\r\n");
          out.write("                        <span id=\"checkphone\"></span>\r\n");
          out.write("                    </div>\r\n");
          out.write("                    \r\n");
          out.write("                    <div class=\"changeinfo\">\r\n");
          out.write("                        <span>出售价格：</span>\r\n");
          out.write("                        <input class=\"in_info\" type=\"text\" name=\"price\" placeholder=\"请输入出售价格\"/>\r\n");
          out.write("                        <span>(*必填)</span>\r\n");
          out.write("                    </div>\r\n");
          out.write("                \r\n");
          out.write("                    <div class=\"changeinfo\">\r\n");
          out.write("                        <span>二手电瓶车类别：</span>\r\n");
          out.write("                        <select class=\"in_info\" name=\"catelogId\">\r\n");
          out.write("                            <option value=\"1\">二手电瓶车</option>\r\n");
          out.write("                            <option value=\"2\">校园代步</option>\r\n");
          out.write("                            <option value=\"3\">家庭日用</option>\r\n");
          out.write("                            <option value=\"4\">品牌</option>\r\n");
          out.write("                            <option value=\"5\">推荐</option>\r\n");
          out.write("                            <option value=\"6\">上新</option>\r\n");
          out.write("                            <option value=\"7\">优惠活动</option>\r\n");
          out.write("                        </select>\r\n");
          out.write("                    </div>\r\n");
          out.write("                    <div class=\"changeinfo\" id=\"dir\">\r\n");
          out.write("                        <span>电瓶车描述：</span>\r\n");
          out.write("                        <div class=\"sha\">\r\n");
          out.write("                            <div class=\"publ\">\r\n");
          out.write("                                <div class=\"pub_con\">\r\n");
          out.write("                                    <div class=\"text_pu\">\r\n");
          out.write("                                        <input type=\"text\" name=\"describle\" class=\"emoji-wysiwyg-editor\"/>\r\n");
          out.write("                                    </div>\r\n");
          out.write("                                </div>\r\n");
          out.write("                            </div>\r\n");
          out.write("                        </div>\r\n");
          out.write("                    </div>\r\n");
          out.write("                    <br />\r\n");
          out.write("                    <hr />\r\n");
          out.write("                    <div class=\"changeinfo\">\r\n");
          out.write("                        <span>电瓶车图片：</span>\r\n");
          out.write("                        <div class=\"container\">\r\n");
          out.write("                            <div class=\"row\">\r\n");
          out.write("                                <div class=\"col-sm-6 col-sm-offset-1\">\r\n");
          out.write("                                    <div class=\"form-group\">\r\n");
          out.write("                                        <div class=\"col-sm-10\">\r\n");
          out.write("                                            <input type=\"file\" name=\"myfile\" data-ref=\"imgUrl\" class=\"col-sm-10 myfile\" value=\"\"/>\r\n");
          out.write("                                            <input type=\"hidden\" name=\"imgUrl\" value=\"\">\r\n");
          out.write("                                        </div>\r\n");
          out.write("                                    </div>\r\n");
          out.write("                                </div>\r\n");
          out.write("                            </div>\r\n");
          out.write("                        </div>\r\n");
          out.write("                    </div>\r\n");
          out.write("                    <input type=\"submit\" class=\"setting-save\" value=\"发布二手电瓶车\" style=\"margin-top: 20px;background-color: blue;\"/>\r\n");
          out.write("                ");
          int evalDoAfterBody = _jspx_th_form_005fform_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_form_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005fform_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005fform_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005fform_005f0.doFinally();
      _005fjspx_005ftagPool_005fform_005fform_0026_005frole_005fmethod_005fenctype_005faction.reuse(_jspx_th_form_005fform_005f0);
    }
    return false;
  }
}
