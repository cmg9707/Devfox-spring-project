/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.83
 * Generated at: 2023-04-14 00:48:35 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.JUS;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class writing_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/C:/JUS/work/DevfoxProject/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/DevJUS/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1672725238227L));
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

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

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
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<!-- Bootstrap ! -->\r\n");
      out.write("  		<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ\" crossorigin=\"anonymous\">\r\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <!-- Google fonts-->\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Lato:300,400,700,300italic,400italic,700italic\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("        <!-- Core theme CSS (includes Bootstrap)-->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"/resources/css/styles.css\">\r\n");
      out.write("     \r\n");
      out.write("<title>글쓰기</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<!-- Navigation-->\r\n");
      out.write("        <nav class=\"navbar navbar-light bg-light static-top\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <a class=\"navbar-brand\" href=\"index\">모임나라</a>\r\n");
      out.write("                <div style=\"text-align: right;\">\r\n");
      out.write("                    ");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("					");
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                		<a href=\"board\" >게시판으로</a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </nav>\r\n");
      out.write("        <!-- form -->\r\n");
      out.write("        <div class=\"container-sm\" >\r\n");
      out.write("		<div class=\"input-form-backgroud row\">\r\n");
      out.write("			<div class=\"input-form col-md-12 mx-auto\">\r\n");
      out.write("				<h4 class=\"mb-3\" style=\"text-align: center;\">글쓰기</h4>\r\n");
      out.write("				<form class=\"writing\" name=\"writing\" action=\"writing\" method=\"post\" enctype=\"multipart/form-data\"\r\n");
      out.write("					onsubmit=\"return sendit()\">\r\n");
      out.write("					<div class=\"row d-flex justify-content-center\">\r\n");
      out.write("						<div class=\"col-md-5 mb-3\" id=\"user_id1\">\r\n");
      out.write("							<label for=\"board_title\">제목</label> \r\n");
      out.write("							<input type=\"text\" class=\"form-control\" id=\"board_title\"  name=\"board_title\" \r\n");
      out.write("								 value=\"\" >\r\n");
      out.write("							   \r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"row d-flex justify-content-center\">\r\n");
      out.write("						<div class=\"col-md-5 mb-3\">\r\n");
      out.write("								<label for=\"user_name\">닉네임</label> \r\n");
      out.write("								<input type=\"text\" \r\n");
      out.write("									class=\"form-control\" id=\"user_name\" name =\"user_name\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.user_name }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" readonly=\"readonly\" value=\"\">\r\n");
      out.write("							</div>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"row d-flex justify-content-center\">\r\n");
      out.write("						<div class=\"col-md-5 mb-3\">\r\n");
      out.write("							<label for=\"board_limit\">신청인원수</label> \r\n");
      out.write("							<input type=\"text\"class=\"form-control\" size=\"15\" id=\"board_limit\" name=\"board_limit\" value=\"\"\r\n");
      out.write("							 >\r\n");
      out.write("\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("					\r\n");
      out.write("					<div class=\"row d-flex justify-content-center\">\r\n");
      out.write("						<div class=\"col-md-5 mb-3\">\r\n");
      out.write("							<label for=\"board_address\">주소</label> \r\n");
      out.write("							<input type=\"text\"class=\"form-control\" size=\"15\" id=\"board_address\" name=\"board_address\" value=\"\">\r\n");
      out.write("\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("					\r\n");
      out.write("					<div class=\"row d-flex justify-content-center\">\r\n");
      out.write("						<div class=\"col-md-5 mb-3\">\r\n");
      out.write("							<label for=\"board_days\">일주일에</label> \r\n");
      out.write("							<input type=\"text\"class=\"form-control\" size=\"15\" id=\"board_days\" name=\"board_days\" value=\"\">\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("					\r\n");
      out.write("					<div class=\"row d-flex justify-content-center\">\r\n");
      out.write("						<div class=\"col-md-5 mb-3\">\r\n");
      out.write("							<label for=\"board_end\">모집 마감일</label> \r\n");
      out.write("							<input type=\"date\"class=\"form-control\" size=\"15\" id=\"board_end\" name=\"board_end\" value=\"\">\r\n");
      out.write("\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("					\r\n");
      out.write("					<div class=\"row d-flex justify-content-center\">\r\n");
      out.write("						<div class=\"col-md-5 mb-3\">\r\n");
      out.write("							<label for=\"board_content\">내용</label> \r\n");
      out.write("							<textarea class=\"form-control\"  id=\"board_content\" name=\"board_content\" ></textarea>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("\r\n");
      out.write("					<div class=\"row d-flex justify-content-center\">\r\n");
      out.write("						<div class=\"col-md-5 mb-3\">\r\n");
      out.write("							<label for=\"board_poto\">사진 업로드</label> \r\n");
      out.write("							<input type=\"file\"class=\"form-control\"  id=\"board_poto\" name=\"board_poto\" value=\"\">\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("\r\n");
      out.write("					\r\n");
      out.write("					<div class=\"row d-flex justify-content-center\" >\r\n");
      out.write("						<div class=\"col-md-5 mb-2\">\r\n");
      out.write("						<div class=\"row\">\r\n");
      out.write("							<div class=\"col-md-4\">\r\n");
      out.write("							<label for=\"board_period_start\">시작일</label>\r\n");
      out.write("							<input type=\"date\" class=\"form-control\" id=\"board_period_start\" name=\"board_period_start\" value=\"\" > \r\n");
      out.write("							</div>\r\n");
      out.write("							\r\n");
      out.write("							<div class=\"col-md-4\">\r\n");
      out.write("							<label for=\"board_period_end\">마감일</label> \r\n");
      out.write("							<input type=\"date\" class=\"form-control\" id=\"board_period_end\" name=\"board_period_end\" value=\"\" >\r\n");
      out.write("							</div>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("					\r\n");
      out.write("					<div class=\"mb-4\" style=\"text-align: center;\">\r\n");
      out.write("					<button   class=\"btn btn-primary btn-lg btn-block\" style=\"width: 41%;\">완료</button>\r\n");
      out.write("						</div>\r\n");
      out.write("				</form>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>	\r\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("	function sendit(){\r\n");
      out.write("		if($('#board_poto').val() == \"\"){\r\n");
      out.write("			alert(\"사진은 필수입니다.\")\r\n");
      out.write("			return false;\r\n");
      out.write("		}else{\r\n");
      out.write("			writing.submit()\r\n");
      out.write("		}\r\n");
      out.write("		\r\n");
      out.write("	}\r\n");
      out.write("</script>\r\n");
      out.write("		<!-- Footer-->\r\n");
      out.write("        <footer class=\"footer bg-light\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-lg-6 h-100 text-center text-lg-start my-auto\">\r\n");
      out.write("                        <ul class=\"list-inline mb-2\">\r\n");
      out.write("                            \r\n");
      out.write("                        </ul>\r\n");
      out.write("                        <p class=\"text-muted small mb-4 mb-lg-0\">&copy; 2023.</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-lg-6 h-100 text-center text-lg-end my-auto\">\r\n");
      out.write("                        <ul class=\"list-inline mb-0\">\r\n");
      out.write("                            <li class=\"list-inline-item me-4\">\r\n");
      out.write("                                <a href=\"#!\"><i class=\"bi-facebook fs-3\"></i></a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li class=\"list-inline-item me-4\">\r\n");
      out.write("                                <a href=\"#!\"><i class=\"bi-twitter fs-3\"></i></a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li class=\"list-inline-item\">\r\n");
      out.write("                                <a href=\"#!\"><i class=\"bi-instagram fs-3\"></i></a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </footer>\r\n");
      out.write("	</div>\r\n");
      out.write("</body>\r\n");
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

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f0_reused = false;
    try {
      _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f0.setParent(null);
      // /WEB-INF/views/JUS/writing.jsp(24,20) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.user_power == 'x'}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
      if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write(" <!-- user -->\r\n");
          out.write("						<a href=\"info\" ><img src=\"/resources/css/img/user.png\" alt=\"\" style=\"width: 10%;\"></a>\r\n");
          out.write("						");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.user_name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("\r\n");
          out.write("						<a href=\"index\" ><img src=\"/resources/css/img/logout.png\" alt=\"\" style=\"width: 10%;\"></a>\r\n");
          out.write("					");
          int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      _jspx_th_c_005fif_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f1_reused = false;
    try {
      _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f1.setParent(null);
      // /WEB-INF/views/JUS/writing.jsp(29,5) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.user_power == 'o'}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
      if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write(" <!-- admin -->\r\n");
          out.write("						<a href=\"info\" >관리자</a>\r\n");
          out.write("						<a href=\"index\" ><img src=\"/resources/css/img/logout.png\" alt=\"\" style=\"width: 10%;\"></a>\r\n");
          out.write("					");
          int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
      _jspx_th_c_005fif_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f1, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f1_reused);
    }
    return false;
  }
}
