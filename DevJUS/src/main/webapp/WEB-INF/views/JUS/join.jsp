<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- Bootstrap ! -->
  		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
        <!-- Google fonts-->
        <link href="https://fonts.googleapis.com/css?family=Lato:300,400,700,300italic,400italic,700italic" rel="stylesheet" type="text/css" />
        <!-- Core theme CSS (includes Bootstrap)-->
        <link rel="stylesheet" href="/resources/css/styles.css">
     
<title>Insert title here</title>
</head>
<body>
	<!-- Navigation-->
        <nav class="navbar navbar-light bg-light static-top">
            <div class="container">
                <a class="navbar-brand" href="#!">모임나라</a>
                <div >
				<a href="login" style="margin: 10px;">로그인</a>
                <a href="join">회원가입</a>   
             	</div>
            </div>
        </nav>
        <!-- form -->
        <div class="container-sm" >
		<div class="input-form-backgroud row">
			<div class="input-form col-md-12 mx-auto">
				<h4 class="mb-3" style="text-align: center;">회원가입</h4>
				<form class="join" name="join" action="index"method="post">
					<div class="row d-flex justify-content-center">
						<div class="col-md-5 mb-3" id="user_id1">
							<label for="user_id">아이디</label> 
							<input type="text" class="form-control" id="user_id" maxlength="8" name="user_id" 
								 placeholder="아이디를 입력하세요" value="" >
							   <span class="user-id-error-message" style="color: red;">아이디를 입력하세요.</span>
							   
						</div>
					</div>
					<div class="row d-flex justify-content-center">
						<div class="col-md-5 mb-3">
								<label for="user_name">닉네임</label> 
								<input type="text" maxlength="8"
									class="form-control" id="user_name" name ="user_name" placeholder="닉네임 입력하세요" value="">
									<span class="user-name-error-message" style="color: red;">닉네임를 입력하세요.</span>
							</div>
					</div>
					<div class="row d-flex justify-content-center">
						<div class="col-md-5 mb-3">
							<label for="user_pass">비밀번호</label> 
							<input type="password"class="form-control" size="15" id="user_pass" name="user_pass" placeholder="비밀번호를 입력하세요"value=""
							maxlength="15" >
							<span class="user-pass-error-message" style="color: red;">비밀번호를 입력하세요.</span>
						</div>
					</div>

					<div class="row d-flex justify-content-center">
 						 <div class="col-md-5 mb-2">
    						<div class="row">
      							<div class="col-md-8">
        							<label for="user_mail">이메일</label> 
        							<input type="email" class="form-control" id="user_mail" name="user_mail" value="" 
        							placeholder="abc1@naver.com / 네이버 , 구글만"  >
      							</div>
      							<div class="col-md-4" style="margin-top: 2%;">
        							<button class="btn btn-primary btn-lg btn-block my-2" id="mailbut" name="mailbut" value="" 
        							type="button" onclick="mailChack()" style="width: 100%; height: 70%; ">번호전송</button>
      							</div>
    						</div>
    						<div class="mb-4" >
							<input type="email" class="form-control" id="mail_ok" name="mail_ok" value="" placeholder="인증번호" style="display:none;">
							<span class="user-mail-error-message" style="color: red;"></span>
							<input type="hidden" name=mail_ch_value id="mail_ch_value" value="">
							</div>
  						</div>
					</div>
					
					<div class="row d-flex justify-content-center" >
						<div class="col-md-5 mb-3">
							<label for="user_birth">생년월일</label> 
							<input type="date" class="form-control" id="user_birth" name="user_birth" value="" >
						</div>
					</div>
					
					<div class="mb-4" style="text-align: center;">
					<button type="button" class="btn btn-primary btn-lg btn-block" onclick="send()" style="width: 41%;">가입완료</button>
						</div>
				</form>
			</div>
		</div>
		
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
		<script>
		//全部入力したか確認
		var user_id_check = 0;  
		var user_name_check = 0;
		var user_pass_check = 0;
		var user_mail_check =0;
		
		//user_id で入力が発生したとき
		$("#user_id").on("input", function() {
			var user_id = $(this).val(); //user_idの値
			  //console.log(user_id);
			  // replaceを使ってidの文字列を表現式を使って、もし英語や数字でない場合は" "をリターンしてもらう。
			  if(user_id != ""){
			  var filteredText = user_id.replace(new RegExp('[^a-zA-Z0-9]', 'g'), '');
			  //けんえつされた文字列を再び入れてあげる
			  $(this).val(filteredText);
			  var lengt = $(this).val().length; //じかず
			  $.ajax({
		        	url: "user_idChk",
			        type: "Post",
			        contentType: "application/text; charset=UTF-8",
			        dataType: "text",
			        data: { user_id: user_id },
			        success: function(data) {
			        	//console.log("성공");
			        	//console.log(lengt);
			        	console.log(data);
			        	if(lengt <=3){
			        		$('.user-id-error-message').text('3글자 이하는 안됩니다.').css('color', 'red');
			        		user_id_check  = 0;
			        	}else if(data =="0"){
			        		$('.user-id-error-message').text('사용할 수 있는 아이디입니다.').css('color', 'blue');
			        		user_id_check  = 1;
			        	}else{
			        		$('.user-id-error-message').text('이미 존재 하는아이디입니다.').css('color', 'red');
			        		user_id_check  = 0;
			        	}
			        
			        }
			    })
			  }else{
				  $('.user-id-error-message').text('아이디를 입력하세요.').css('color', 'red');
				  user_id_check = 0;
			  }
			});
		
		$("#user_name").on("input", function() {
			var user_name = $(this).val(); //user_nameの値
			if(user_name != ""){
				var filteredText = user_name.replace(new RegExp('[^a-zA-Z0-9가-힣]', 'g'), '');
		 		//けんえつされた文字列を再び入れてあげる
				$(this).val(filteredText);
				var lengt = $(this).val().length; //じかず
				$.ajax({
			       url: "user_nameChk",
				      type: "Post",
				      contentType: "application/text; charset=UTF-8",
				      dataType: "text",
				      data: { user_name: user_name },
				      success: function(data) {
				      	//console.log("성공");
				      	//console.log(lengt);
				      	console.log(data);
				      	if(lengt <=2){
				      		$('.user-name-error-message').text('2글자 이하는 안됩니다.').css('color', 'red');
				      		user_name_check  = 0;
				      	}else if(data =="0"){
				      		$('.user-name-error-message').text('사용할 수 있는 닉네임입니다.').css('color', 'blue');
				      		user_name_check  = 1;
				       }else{
				      		$('.user-name-error-message').text('이미 존재 하는 닉네임입니다.').css('color', 'red');
				      		user_name_check  = 0;
				      	}
				      
				      }
				  })
				}else{
			  		$('.user-name-error-message').text('아이디를 입력하세요.').css('color', 'red');
			  		user_id_check = 0;
				}
		})
			$("#user_pass").on("input", function() {
				var user_pass = $(this).val().length; //user_passの値
				if(user_pass <= 3 && user_pass !="" ){
					$('.user-pass-error-message').text('3글자 이하는 안됩니다.').css('color', 'red');
					user_pass_check = 0;
				}else if(user_pass ==""){
					$('.user-pass-error-message').text('비밀번호를 입력하세요.').css('color', 'red');
					user_pass_check = 0;
				}else{
					$('.user-pass-error-message').text('사용할 수 있는 비밀번호입니다.').css('color', 'blue');
					user_pass_check = 1;
				}
			});
	
		function mailChack() {
			  var email = $('#user_mail').val();
			  var emailRegex = /^[a-zA-Z0-9]+@[a-zA-Z0-9]+\.[a-zA-Z0-9]+$/;
			  if (!emailRegex.test(email)) {
			    alert("올바른 이메일 주소를 입력해주세요.");
			    $('#user_mail').focus()
			    return;
			  } 
				console.log(email);
			  	$.ajax({
			  		url :"user_mailck?user_mail="+email,
			  		type :"GET",
			  		success:function(data){
			  			//console.log("data : "+ data);
			  			var mailChValue = data;
			  			 $('#mail_ch_value').val(mailChValue);
			  			 $('#mail_ok').show();
			  		}
			  	});
			};
			
			$("#mail_ok").on("input", function() {
				var mail_ok = $(this).val();
				var mail_ch_value = $("#mail_ch_value").val();
				console.log("mail_ch_value : "+ mail_ch_value);
				if(mail_ok != mail_ch_value){
					$('.user-mail-error-message').text('인증번호가 다릅니다.').css('color', 'red');
					user_mail_check = 0;
				}else{
					$('.user-mail-error-message').text('인증번호가 맞습니다.').css('color', 'blue');
					user_mail_check = 1;
				}
			});
			
			function send(){
				var user_birth = $('#user_birth').val();
				if(user_id_check==0){
					alert("아이디를 확인하세요")
					$('#user_id').focus()
					return
				}
				if(user_name_check == 0){
					alert("닉네임를 확인하세요")
					$('#user_name').focus()
					return
				}
				if(user_pass_check == 0){
					alert("비밀번호를 확인하세요")
					$('#user_pass').focus()
					return
				}
				if(user_mail_check == 0){
					alert("비밀번호를 확인하세요")
					$('#user_mail').focus()
					return
				}
				if(user_birth == ""){
					alert("생년월일을 확인하세요")
					return
				}
				alert("회원가입을 환영합니다.")
				join.submit();
			}
		</script>
		<!-- Footer-->
        <footer class="footer bg-light">
            <div class="container">
                <div class="row">
                    <div class="col-lg-6 h-100 text-center text-lg-start my-auto">
                        <ul class="list-inline mb-2">
                            
                        </ul>
                        <p class="text-muted small mb-4 mb-lg-0">&copy; 2023.</p>
                    </div>
                    <div class="col-lg-6 h-100 text-center text-lg-end my-auto">
                        <ul class="list-inline mb-0">
                            <li class="list-inline-item me-4">
                                <a href="#!"><i class="bi-facebook fs-3"></i></a>
                            </li>
                            <li class="list-inline-item me-4">
                                <a href="#!"><i class="bi-twitter fs-3"></i></a>
                            </li>
                            <li class="list-inline-item">
                                <a href="#!"><i class="bi-instagram fs-3"></i></a>
                            </li>
                        </ul>
                    </div>
                </div>
            </div>
        </footer>
	</div>
</body>
</html>