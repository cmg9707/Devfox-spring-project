/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.83
 * Generated at: 2023-04-10 00:36:22 UTC
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

      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"utf-8\" />\r\n");
      out.write("        <title>모임</title>\r\n");
      out.write("        <!-- Bootstrap ! -->\r\n");
      out.write("  		<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ\" crossorigin=\"anonymous\">\r\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <!-- Google fonts-->\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Lato:300,400,700,300italic,400italic,700italic\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("        <!-- Core theme CSS (includes Bootstrap)-->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"/resources/css/styles.css\">\r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <!-- Navigation-->\r\n");
      out.write("        <nav class=\"navbar navbar-light bg-light static-top\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <a class=\"navbar-brand\" href=\"#!\">모임나라</a>\r\n");
      out.write("                <div >\r\n");
      out.write("				<a href=\"login\" style=\"margin: 10px;\">로그인</a>\r\n");
      out.write("                <a href=\"join\">회원가입</a>   \r\n");
      out.write("             	</div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </nav>\r\n");
      out.write("        <!-- login -->\r\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        \r\n");
      out.write("        <!-- Masthead-->\r\n");
      out.write("        <header class=\"masthead\" style=\"background-image: url('/resources/css/img/group1920.jpg');background-size: 100% 100%;\">\r\n");
      out.write("            <div class=\"container position-relative\">\r\n");
      out.write("                <div class=\"row justify-content-center\">\r\n");
      out.write("                    <div class=\"col-xl-6\">\r\n");
      out.write("                        <div class=\"text-center text-white\">\r\n");
      out.write("                            <!-- Page heading-->\r\n");
      out.write("                            <h1 class=\"mb-5\" >어서오세요</h1>\r\n");
      out.write("                            \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </header>\r\n");
      out.write("        \r\n");
      out.write("        <section class=\"features-icons bg-light text-center\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-lg-4\">\r\n");
      out.write("                        <div class=\"features-icons-item mx-auto mb-5 mb-lg-0 mb-lg-3\">\r\n");
      out.write("                            <div class=\"features-icons-icon d-flex\"><i class=\"bi-window m-auto text-primary\"></i></div>\r\n");
      out.write("                            <h3>편리함</h3>\r\n");
      out.write("                            <p class=\"lead mb-0\">손쉬운 방법으로 스터디 모임 가능</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-lg-4\">\r\n");
      out.write("                        <div class=\"features-icons-item mx-auto mb-5 mb-lg-0 mb-lg-3\">\r\n");
      out.write("                            <div class=\"features-icons-icon d-flex\"><i class=\"bi-layers m-auto text-primary\"></i></div>\r\n");
      out.write("                            <h3>공부 , 여가활동 , 취직</h3>\r\n");
      out.write("                            <p class=\"lead mb-0\">어떤것이든 상관없이 모임 가능</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-lg-4\">\r\n");
      out.write("                        <div class=\"features-icons-item mx-auto mb-0 mb-lg-3\">\r\n");
      out.write("                            <div class=\"features-icons-icon d-flex\"><i class=\"bi-terminal m-auto text-primary\"></i></div>\r\n");
      out.write("                            <h3>향상</h3>\r\n");
      out.write("                            <p class=\"lead mb-0\">혼자는 힘드신 분들에게 추천</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("        <!-- Image Showcases-->\r\n");
      out.write("        <section class=\"showcase\">\r\n");
      out.write("            <div class=\"container-fluid p-0\">\r\n");
      out.write("                <div class=\"row g-0\">\r\n");
      out.write("                    <div class=\"col-lg-6 order-lg-2 text-white showcase-img\" style=\"background-image: url('/resources/css/img/email.png');background-size: 100% 100%;\"></div>\r\n");
      out.write("                    <div class=\"col-lg-6 order-lg-1 my-auto showcase-text\">\r\n");
      out.write("                        <h2>편리함</h2>\r\n");
      out.write("                        <p class=\"lead mb-0\">이메일 하나만 있으면 간편하게 회원가입 완료!</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"row g-0\">\r\n");
      out.write("                    <div class=\"col-lg-6 text-white showcase-img\" style=\"background-image: url('/resources/css/img/group3.jpg');background-size: 100% 100%;\"></div>\r\n");
      out.write("                    <div class=\"col-lg-6 my-auto showcase-text\">\r\n");
      out.write("                        <h2>공부 , 여가활동 , 취직</h2>\r\n");
      out.write("                        <p class=\"lead mb-0\">모임의 경우 어떠한 것도 상관이 없습니다!</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"row g-0\">\r\n");
      out.write("                    <div class=\"col-lg-6 order-lg-2 text-white showcase-img\" style=\"background-image: url('/resources/css/img/group2.jpg');background-size: 100% 100%;\"></div>\r\n");
      out.write("                    <div class=\"col-lg-6 order-lg-1 my-auto showcase-text\">\r\n");
      out.write("                        <h2>향상</h2>\r\n");
      out.write("                        <p class=\"lead mb-0\">혼자서 했을 때보다 보다 효율좋게 공부와 여가를 합시다!  </p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("        <!-- Testimonials-->\r\n");
      out.write("        <section class=\"testimonials text-center bg-light\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <h2 class=\"mb-5\">What people are saying...</h2>\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-lg-4\">\r\n");
      out.write("                        <div class=\"testimonial-item mx-auto mb-5 mb-lg-0\">\r\n");
      out.write("                            <img class=\"img-fluid rounded-circle mb-3\" src=\"/resources/css/img/testimonials-1.jpg\" alt=\"...\" />\r\n");
      out.write("                            <h5>Margaret E.</h5>\r\n");
      out.write("                            <p class=\"font-weight-light mb-0\">\"정말 좋았습니다.\"</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-lg-4\">\r\n");
      out.write("                        <div class=\"testimonial-item mx-auto mb-5 mb-lg-0\">\r\n");
      out.write("                            <img class=\"img-fluid rounded-circle mb-3\" src=\"/resources/css/img/testimonials-2.jpg\" alt=\"...\" />\r\n");
      out.write("                            <h5>Fred S.</h5>\r\n");
      out.write("                            <p class=\"font-weight-light mb-0\">\"가입하고 인생이 달라졌어요.\"</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-lg-4\">\r\n");
      out.write("                        <div class=\"testimonial-item mx-auto mb-5 mb-lg-0\">\r\n");
      out.write("                            <img class=\"img-fluid rounded-circle mb-3\" src=\"/resources/css/img/testimonials-3.jpg\" alt=\"...\" />\r\n");
      out.write("                            <h5>Sarah W.</h5>\r\n");
      out.write("                            <p class=\"font-weight-light mb-0\">\"모임을 가지고 실력이 향상되었습니다.\"</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("        <!-- Call to Action-->\r\n");
      out.write("        <section class=\"call-to-action text-white text-center\" id=\"signup\">\r\n");
      out.write("            <div class=\"container position-relative\">\r\n");
      out.write("                <div class=\"row justify-content-center\">\r\n");
      out.write("                    <div class=\"col-xl-6\">\r\n");
      out.write("                        <h2 class=\"mb-4\">지금 바로 가입하세요!</h2>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("        <!-- Footer-->\r\n");
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
      out.write("    </body>\r\n");
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
