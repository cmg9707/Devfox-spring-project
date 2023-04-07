/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.83
 * Generated at: 2023-04-07 02:21:09 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.JUS;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\" />\n");
      out.write("        <title>모임</title>\n");
      out.write("        <!-- Bootstrap ! -->\n");
      out.write("  		<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ\" crossorigin=\"anonymous\">\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <!-- Google fonts-->\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Lato:300,400,700,300italic,400italic,700italic\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <!-- Core theme CSS (includes Bootstrap)-->\n");
      out.write("        <link rel=\"stylesheet\" href=\"/resources/css/styles.css\">\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!-- Navigation-->\n");
      out.write("        <nav class=\"navbar navbar-light bg-light static-top\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <a class=\"navbar-brand\" href=\"#!\">모임나라</a>\n");
      out.write("                <div class=\"dropdown\">\n");
      out.write(" 				 <button class=\"btn btn-primary  dropdown-toggle \" type=\"button\" id=\"dropdownMenuButton1\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\n");
      out.write("  					  로그인\n");
      out.write("  				 </button>\n");
      out.write("  				<div class=\"dropdown-menu\" style=\"width: 300px;\">\n");
      out.write("  					<form class=\"px-4 py-3\" name=\"login\" method=\"post\" action=\"login\">\n");
      out.write("    					<div class=\"mb-3\">\n");
      out.write("      				       <label for=\"exampleDropdownFormEmail1\" class=\"form-label\">이메일</label>\n");
      out.write("     					   <input type=\"email\" class=\"form-control\" id=\"exampleDropdownFormEmail1\" placeholder=\"email@example.com\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"mb-3\">\n");
      out.write("                           <label for=\"exampleDropdownFormPassword1\" class=\"form-label\">비밀번호</label>\n");
      out.write("                           <input type=\"password\" class=\"form-control\" id=\"exampleDropdownFormPassword1\" placeholder=\"Password\">\n");
      out.write("                        </div>\n");
      out.write("   				 		<button type=\"submit\" class=\"btn btn-primary\">로그인</button>\n");
      out.write("  					</form>\n");
      out.write(" 			   	<div class=\"dropdown-divider\"></div>\n");
      out.write("  					<a class=\"dropdown-item\" href=\"join\">회원가입</a>\n");
      out.write("  					<a class=\"dropdown-item\" href=\"#\">비밀번호 찾기</a>\n");
      out.write("				</div>\n");
      out.write("                   \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <!-- Masthead-->\n");
      out.write("        <header class=\"masthead\" style=\"background-image: url('/resources/css/img/group1920.jpg')\">\n");
      out.write("            <div class=\"container position-relative\">\n");
      out.write("                <div class=\"row justify-content-center\">\n");
      out.write("                    <div class=\"col-xl-6\">\n");
      out.write("                        <div class=\"text-center text-white\">\n");
      out.write("                            <!-- Page heading-->\n");
      out.write("                            <h1 class=\"mb-5\" >어서오세요</h1>\n");
      out.write("                            <!-- Signup form-->\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </header>\n");
      out.write("        \n");
      out.write("        <section class=\"features-icons bg-light text-center\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-4\">\n");
      out.write("                        <div class=\"features-icons-item mx-auto mb-5 mb-lg-0 mb-lg-3\">\n");
      out.write("                            <div class=\"features-icons-icon d-flex\"><i class=\"bi-window m-auto text-primary\"></i></div>\n");
      out.write("                            <h3>편리함</h3>\n");
      out.write("                            <p class=\"lead mb-0\">손쉬운 방법으로 스터디 모임 가능</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-4\">\n");
      out.write("                        <div class=\"features-icons-item mx-auto mb-5 mb-lg-0 mb-lg-3\">\n");
      out.write("                            <div class=\"features-icons-icon d-flex\"><i class=\"bi-layers m-auto text-primary\"></i></div>\n");
      out.write("                            <h3>공부 , 여가활동 , 취직</h3>\n");
      out.write("                            <p class=\"lead mb-0\">어떤것이든 상관없이 모임 가능</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-4\">\n");
      out.write("                        <div class=\"features-icons-item mx-auto mb-0 mb-lg-3\">\n");
      out.write("                            <div class=\"features-icons-icon d-flex\"><i class=\"bi-terminal m-auto text-primary\"></i></div>\n");
      out.write("                            <h3>향상</h3>\n");
      out.write("                            <p class=\"lead mb-0\">혼자는 힘드신 분들에게 추천</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        <!-- Image Showcases-->\n");
      out.write("        <section class=\"showcase\">\n");
      out.write("            <div class=\"container-fluid p-0\">\n");
      out.write("                <div class=\"row g-0\">\n");
      out.write("                    <div class=\"col-lg-6 order-lg-2 text-white showcase-img\" style=\"background-image: url('/resources/css/img/email.png')\"></div>\n");
      out.write("                    <div class=\"col-lg-6 order-lg-1 my-auto showcase-text\">\n");
      out.write("                        <h2>편리함</h2>\n");
      out.write("                        <p class=\"lead mb-0\">이메일 하나만 있으면 간편하게 회원가입 완료!</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"row g-0\">\n");
      out.write("                    <div class=\"col-lg-6 text-white showcase-img\" style=\"background-image: url('/resources/css/img/group3.jpg')\"></div>\n");
      out.write("                    <div class=\"col-lg-6 my-auto showcase-text\">\n");
      out.write("                        <h2>공부 , 여가활동 , 취직</h2>\n");
      out.write("                        <p class=\"lead mb-0\">모임의 경우 어떠한 것도 상관이 없습니다!</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"row g-0\">\n");
      out.write("                    <div class=\"col-lg-6 order-lg-2 text-white showcase-img\" style=\"background-image: url('/resources/css/img/group2.jpg')\"></div>\n");
      out.write("                    <div class=\"col-lg-6 order-lg-1 my-auto showcase-text\">\n");
      out.write("                        <h2>향상</h2>\n");
      out.write("                        <p class=\"lead mb-0\">혼자서 했을 때보다 보다 효율좋게 공부와 여가를 합시다!  </p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        <!-- Testimonials-->\n");
      out.write("        <section class=\"testimonials text-center bg-light\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <h2 class=\"mb-5\">What people are saying...</h2>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-4\">\n");
      out.write("                        <div class=\"testimonial-item mx-auto mb-5 mb-lg-0\">\n");
      out.write("                            <img class=\"img-fluid rounded-circle mb-3\" src=\"/resources/css/img/testimonials-1.jpg\" alt=\"...\" />\n");
      out.write("                            <h5>Margaret E.</h5>\n");
      out.write("                            <p class=\"font-weight-light mb-0\">\"정말 좋았습니다.\"</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-4\">\n");
      out.write("                        <div class=\"testimonial-item mx-auto mb-5 mb-lg-0\">\n");
      out.write("                            <img class=\"img-fluid rounded-circle mb-3\" src=\"/resources/css/img/testimonials-2.jpg\" alt=\"...\" />\n");
      out.write("                            <h5>Fred S.</h5>\n");
      out.write("                            <p class=\"font-weight-light mb-0\">\"가입하고 인생이 달라졌어요.\"</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-4\">\n");
      out.write("                        <div class=\"testimonial-item mx-auto mb-5 mb-lg-0\">\n");
      out.write("                            <img class=\"img-fluid rounded-circle mb-3\" src=\"/resources/css/img/testimonials-3.jpg\" alt=\"...\" />\n");
      out.write("                            <h5>Sarah W.</h5>\n");
      out.write("                            <p class=\"font-weight-light mb-0\">\"모임을 가지고 실력이 향상되었습니다.\"</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        <!-- Call to Action-->\n");
      out.write("        <section class=\"call-to-action text-white text-center\" id=\"signup\">\n");
      out.write("            <div class=\"container position-relative\">\n");
      out.write("                <div class=\"row justify-content-center\">\n");
      out.write("                    <div class=\"col-xl-6\">\n");
      out.write("                        <h2 class=\"mb-4\">지금 바로 가입하세요!</h2>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        <!-- Footer-->\n");
      out.write("        <footer class=\"footer bg-light\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-6 h-100 text-center text-lg-start my-auto\">\n");
      out.write("                        <ul class=\"list-inline mb-2\">\n");
      out.write("                            \n");
      out.write("                        </ul>\n");
      out.write("                        <p class=\"text-muted small mb-4 mb-lg-0\">&copy; 2023.</p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-6 h-100 text-center text-lg-end my-auto\">\n");
      out.write("                        <ul class=\"list-inline mb-0\">\n");
      out.write("                            <li class=\"list-inline-item me-4\">\n");
      out.write("                                <a href=\"#!\"><i class=\"bi-facebook fs-3\"></i></a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"list-inline-item me-4\">\n");
      out.write("                                <a href=\"#!\"><i class=\"bi-twitter fs-3\"></i></a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"list-inline-item\">\n");
      out.write("                                <a href=\"#!\"><i class=\"bi-instagram fs-3\"></i></a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
