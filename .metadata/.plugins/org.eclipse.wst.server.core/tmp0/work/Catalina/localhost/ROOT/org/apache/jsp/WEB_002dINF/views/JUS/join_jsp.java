/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.83
 * Generated at: 2023-04-13 15:45:07 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.JUS;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class join_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<!-- Navigation-->\r\n");
      out.write("        <nav class=\"navbar navbar-light bg-light static-top\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <a class=\"navbar-brand\" href=\"#!\">모임나라</a>\r\n");
      out.write("                <div >\r\n");
      out.write("				<a href=\"login\" style=\"margin: 10px;\">로그인</a>\r\n");
      out.write("                <a href=\"join\">회원가입</a>   \r\n");
      out.write("             	</div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </nav>\r\n");
      out.write("        <!-- form -->\r\n");
      out.write("        <div class=\"container-sm\" >\r\n");
      out.write("		<div class=\"input-form-backgroud row\">\r\n");
      out.write("			<div class=\"input-form col-md-12 mx-auto\">\r\n");
      out.write("				<h4 class=\"mb-3\" style=\"text-align: center;\">회원가입</h4>\r\n");
      out.write("				<form class=\"join\" name=\"join\" action=\"index\"method=\"post\">\r\n");
      out.write("					<div class=\"row d-flex justify-content-center\">\r\n");
      out.write("						<div class=\"col-md-5 mb-3\" id=\"user_id1\">\r\n");
      out.write("							<label for=\"user_id\">아이디</label> \r\n");
      out.write("							<input type=\"text\" class=\"form-control\" id=\"user_id\" maxlength=\"8\" name=\"user_id\" \r\n");
      out.write("								 placeholder=\"아이디를 입력하세요\" value=\"\" >\r\n");
      out.write("							   <span class=\"user-id-error-message\" style=\"color: red;\">아이디를 입력하세요.</span>\r\n");
      out.write("							   \r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"row d-flex justify-content-center\">\r\n");
      out.write("						<div class=\"col-md-5 mb-3\">\r\n");
      out.write("								<label for=\"user_name\">닉네임</label> \r\n");
      out.write("								<input type=\"text\" maxlength=\"8\"\r\n");
      out.write("									class=\"form-control\" id=\"user_name\" name =\"user_name\" placeholder=\"닉네임 입력하세요\" value=\"\">\r\n");
      out.write("									<span class=\"user-name-error-message\" style=\"color: red;\">닉네임를 입력하세요.</span>\r\n");
      out.write("							</div>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"row d-flex justify-content-center\">\r\n");
      out.write("						<div class=\"col-md-5 mb-3\">\r\n");
      out.write("							<label for=\"user_pass\">비밀번호</label> \r\n");
      out.write("							<input type=\"password\"class=\"form-control\" size=\"15\" id=\"user_pass\" name=\"user_pass\" placeholder=\"비밀번호를 입력하세요\"value=\"\"\r\n");
      out.write("							maxlength=\"15\" >\r\n");
      out.write("							<span class=\"user-pass-error-message\" style=\"color: red;\">비밀번호를 입력하세요.</span>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("\r\n");
      out.write("					<div class=\"row d-flex justify-content-center\">\r\n");
      out.write(" 						 <div class=\"col-md-5 mb-2\">\r\n");
      out.write("    						<div class=\"row\">\r\n");
      out.write("      							<div class=\"col-md-8\">\r\n");
      out.write("        							<label for=\"user_mail\">이메일</label> \r\n");
      out.write("        							<input type=\"email\" class=\"form-control\" id=\"user_mail\" name=\"user_mail\" value=\"\" \r\n");
      out.write("        							placeholder=\"abc1@naver.com / 네이버 , 구글만\"  >\r\n");
      out.write("      							</div>\r\n");
      out.write("      							<div class=\"col-md-4\" style=\"margin-top: 2%;\">\r\n");
      out.write("        							<button class=\"btn btn-primary btn-lg btn-block my-2\" id=\"mailbut\" name=\"mailbut\" value=\"\" \r\n");
      out.write("        							type=\"button\" onclick=\"mailChack()\" style=\"width: 100%; height: 70%; \">번호전송</button>\r\n");
      out.write("      							</div>\r\n");
      out.write("    						</div>\r\n");
      out.write("    						<div class=\"mb-4\" >\r\n");
      out.write("							<input type=\"email\" class=\"form-control\" id=\"mail_ok\" name=\"mail_ok\" value=\"\" placeholder=\"인증번호\" style=\"display:none;\">\r\n");
      out.write("							<span class=\"user-mail-error-message\" style=\"color: red;\"></span>\r\n");
      out.write("							<input type=\"hidden\" name=mail_ch_value id=\"mail_ch_value\" value=\"\">\r\n");
      out.write("							</div>\r\n");
      out.write("  						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("					\r\n");
      out.write("					<div class=\"row d-flex justify-content-center\" >\r\n");
      out.write("						<div class=\"col-md-5 mb-3\">\r\n");
      out.write("							<label for=\"user_birth\">생년월일</label> \r\n");
      out.write("							<input type=\"date\" class=\"form-control\" id=\"user_birth\" name=\"user_birth\" value=\"\" >\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("					\r\n");
      out.write("					<div class=\"mb-4\" style=\"text-align: center;\">\r\n");
      out.write("					<button type=\"button\" class=\"btn btn-primary btn-lg btn-block\" onclick=\"send()\" style=\"width: 41%;\">가입완료</button>\r\n");
      out.write("						</div>\r\n");
      out.write("				</form>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("		\r\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js\"></script>\r\n");
      out.write("		<script>\r\n");
      out.write("		//全部入力したか確認\r\n");
      out.write("		var user_id_check = 0;  \r\n");
      out.write("		var user_name_check = 0;\r\n");
      out.write("		var user_pass_check = 0;\r\n");
      out.write("		var user_mail_check =0;\r\n");
      out.write("		\r\n");
      out.write("		//user_id で入力が発生したとき\r\n");
      out.write("		$(\"#user_id\").on(\"input\", function() {\r\n");
      out.write("			var user_id = $(this).val(); //user_idの値\r\n");
      out.write("			  //console.log(user_id);\r\n");
      out.write("			  // replaceを使ってidの文字列を表現式を使って、もし英語や数字でない場合は\" \"をリターンしてもらう。\r\n");
      out.write("			  if(user_id != \"\"){\r\n");
      out.write("			  var filteredText = user_id.replace(new RegExp('[^a-zA-Z0-9]', 'g'), '');\r\n");
      out.write("			  //けんえつされた文字列を再び入れてあげる\r\n");
      out.write("			  $(this).val(filteredText);\r\n");
      out.write("			  var lengt = $(this).val().length; //じかず\r\n");
      out.write("			  $.ajax({\r\n");
      out.write("		        	url: \"user_idChk\",\r\n");
      out.write("			        type: \"Post\",\r\n");
      out.write("			        contentType: \"application/text; charset=UTF-8\",\r\n");
      out.write("			        dataType: \"text\",\r\n");
      out.write("			        data: { user_id: user_id },\r\n");
      out.write("			        success: function(data) {\r\n");
      out.write("			        	//console.log(\"성공\");\r\n");
      out.write("			        	//console.log(lengt);\r\n");
      out.write("			        	console.log(data);\r\n");
      out.write("			        	if(lengt <=3){\r\n");
      out.write("			        		$('.user-id-error-message').text('3글자 이하는 안됩니다.').css('color', 'red');\r\n");
      out.write("			        		user_id_check  = 0;\r\n");
      out.write("			        	}else if(data ==\"0\"){\r\n");
      out.write("			        		$('.user-id-error-message').text('사용할 수 있는 아이디입니다.').css('color', 'blue');\r\n");
      out.write("			        		user_id_check  = 1;\r\n");
      out.write("			        	}else{\r\n");
      out.write("			        		$('.user-id-error-message').text('이미 존재 하는아이디입니다.').css('color', 'red');\r\n");
      out.write("			        		user_id_check  = 0;\r\n");
      out.write("			        	}\r\n");
      out.write("			        \r\n");
      out.write("			        }\r\n");
      out.write("			    })\r\n");
      out.write("			  }else{\r\n");
      out.write("				  $('.user-id-error-message').text('아이디를 입력하세요.').css('color', 'red');\r\n");
      out.write("				  user_id_check = 0;\r\n");
      out.write("			  }\r\n");
      out.write("			});\r\n");
      out.write("		\r\n");
      out.write("		$(\"#user_name\").on(\"input\", function() {\r\n");
      out.write("			var user_name = $(this).val(); //user_nameの値\r\n");
      out.write("			if(user_name != \"\"){\r\n");
      out.write("				var filteredText = user_name.replace(new RegExp('[^a-zA-Z0-9가-힣]', 'g'), '');\r\n");
      out.write("		 		//けんえつされた文字列を再び入れてあげる\r\n");
      out.write("				$(this).val(filteredText);\r\n");
      out.write("				var lengt = $(this).val().length; //じかず\r\n");
      out.write("				$.ajax({\r\n");
      out.write("			       url: \"user_nameChk\",\r\n");
      out.write("				      type: \"Post\",\r\n");
      out.write("				      contentType: \"application/text; charset=UTF-8\",\r\n");
      out.write("				      dataType: \"text\",\r\n");
      out.write("				      data: { user_name: user_name },\r\n");
      out.write("				      success: function(data) {\r\n");
      out.write("				      	//console.log(\"성공\");\r\n");
      out.write("				      	//console.log(lengt);\r\n");
      out.write("				      	console.log(data);\r\n");
      out.write("				      	if(lengt <=2){\r\n");
      out.write("				      		$('.user-name-error-message').text('2글자 이하는 안됩니다.').css('color', 'red');\r\n");
      out.write("				      		user_name_check  = 0;\r\n");
      out.write("				      	}else if(data ==\"0\"){\r\n");
      out.write("				      		$('.user-name-error-message').text('사용할 수 있는 닉네임입니다.').css('color', 'blue');\r\n");
      out.write("				      		user_name_check  = 1;\r\n");
      out.write("				       }else{\r\n");
      out.write("				      		$('.user-name-error-message').text('이미 존재 하는 닉네임입니다.').css('color', 'red');\r\n");
      out.write("				      		user_name_check  = 0;\r\n");
      out.write("				      	}\r\n");
      out.write("				      \r\n");
      out.write("				      }\r\n");
      out.write("				  })\r\n");
      out.write("				}else{\r\n");
      out.write("			  		$('.user-name-error-message').text('닉네임를 입력하세요.').css('color', 'red');\r\n");
      out.write("			  		user_name_check = 0;\r\n");
      out.write("				}\r\n");
      out.write("		})\r\n");
      out.write("			$(\"#user_pass\").on(\"input\", function() {\r\n");
      out.write("				var user_pass = $(this).val().length; //user_passの値\r\n");
      out.write("				if(user_pass <= 3 && user_pass !=\"\" ){\r\n");
      out.write("					$('.user-pass-error-message').text('3글자 이하는 안됩니다.').css('color', 'red');\r\n");
      out.write("					user_pass_check = 0;\r\n");
      out.write("				}else if(user_pass ==\"\"){\r\n");
      out.write("					$('.user-pass-error-message').text('비밀번호를 입력하세요.').css('color', 'red');\r\n");
      out.write("					user_pass_check = 0;\r\n");
      out.write("				}else{\r\n");
      out.write("					$('.user-pass-error-message').text('사용할 수 있는 비밀번호입니다.').css('color', 'blue');\r\n");
      out.write("					user_pass_check = 1;\r\n");
      out.write("				}\r\n");
      out.write("			});\r\n");
      out.write("	\r\n");
      out.write("		function mailChack() {\r\n");
      out.write("			  var email = $('#user_mail').val();\r\n");
      out.write("			  var emailRegex = /^[a-zA-Z0-9]+@[a-zA-Z0-9]+\\.[a-zA-Z0-9]+$/;\r\n");
      out.write("			  if (!emailRegex.test(email)) {\r\n");
      out.write("			    alert(\"올바른 이메일 주소를 입력해주세요.\");\r\n");
      out.write("			    $('#user_mail').focus()\r\n");
      out.write("			    return;\r\n");
      out.write("			  } \r\n");
      out.write("				console.log(email);\r\n");
      out.write("			  	$.ajax({\r\n");
      out.write("			  		url :\"user_mailck?user_mail=\"+email,\r\n");
      out.write("			  		type :\"GET\",\r\n");
      out.write("			  		success:function(data){\r\n");
      out.write("			  			//console.log(\"data : \"+ data);\r\n");
      out.write("			  			var mailChValue = data;\r\n");
      out.write("			  			 $('#mail_ch_value').val(mailChValue);\r\n");
      out.write("			  			 $('#mail_ok').show();\r\n");
      out.write("			  		}\r\n");
      out.write("			  	});\r\n");
      out.write("			};\r\n");
      out.write("			\r\n");
      out.write("			$(\"#mail_ok\").on(\"input\", function() {\r\n");
      out.write("				var mail_ok = $(this).val();\r\n");
      out.write("				var mail_ch_value = $(\"#mail_ch_value\").val();\r\n");
      out.write("				console.log(\"mail_ch_value : \"+ mail_ch_value);\r\n");
      out.write("				if(mail_ok != mail_ch_value){\r\n");
      out.write("					$('.user-mail-error-message').text('인증번호가 다릅니다.').css('color', 'red');\r\n");
      out.write("					user_mail_check = 0;\r\n");
      out.write("				}else{\r\n");
      out.write("					$('.user-mail-error-message').text('인증번호가 맞습니다.').css('color', 'blue');\r\n");
      out.write("					user_mail_check = 1;\r\n");
      out.write("				}\r\n");
      out.write("			});\r\n");
      out.write("			\r\n");
      out.write("			function send(){\r\n");
      out.write("				var user_birth = $('#user_birth').val();\r\n");
      out.write("				if(user_id_check==0){\r\n");
      out.write("					alert(\"아이디를 확인하세요\")\r\n");
      out.write("					$('#user_id').focus()\r\n");
      out.write("					return\r\n");
      out.write("				}\r\n");
      out.write("				if(user_name_check == 0){\r\n");
      out.write("					alert(\"닉네임를 확인하세요\")\r\n");
      out.write("					$('#user_name').focus()\r\n");
      out.write("					return\r\n");
      out.write("				}\r\n");
      out.write("				if(user_pass_check == 0){\r\n");
      out.write("					alert(\"비밀번호를 확인하세요\")\r\n");
      out.write("					$('#user_pass').focus()\r\n");
      out.write("					return\r\n");
      out.write("				}\r\n");
      out.write("				if(user_mail_check == 0){\r\n");
      out.write("					alert(\"이메일을 확인하세요\")\r\n");
      out.write("					$('#user_mail').focus()\r\n");
      out.write("					return\r\n");
      out.write("				}\r\n");
      out.write("				if(user_birth == \"\"){\r\n");
      out.write("					alert(\"생년월일을 확인하세요\")\r\n");
      out.write("					return\r\n");
      out.write("				}\r\n");
      out.write("				alert(\"회원가입을 환영합니다.\")\r\n");
      out.write("				join.submit();\r\n");
      out.write("			}\r\n");
      out.write("		</script>\r\n");
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
}
