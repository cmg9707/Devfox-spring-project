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
                <div class="dropdown">
 				 <button class="btn btn-primary  dropdown-toggle " type="button" id="dropdownMenuButton1" data-bs-toggle="dropdown" aria-expanded="false">
  					  로그인
  				 </button>
  				<div class="dropdown-menu" style="width: 300px;">
  					<form class="px-4 py-3" name="login" method="post" action="login">
    					<div class="mb-3">
      				       <label for="exampleDropdownFormEmail1" class="form-label">이메일</label>
     					   <input type="email" class="form-control" id="exampleDropdownFormEmail1" placeholder="email@example.com">
                        </div>
                        <div class="mb-3">
                           <label for="exampleDropdownFormPassword1" class="form-label">비밀번호</label>
                           <input type="password" class="form-control" id="exampleDropdownFormPassword1" placeholder="Password">
                        </div>
   				 		<button type="submit" class="btn btn-primary">로그인</button>
  					</form>
 			   	<div class="dropdown-divider"></div>
  					<a class="dropdown-item" href="join">회원가입</a>
  					<a class="dropdown-item" href="#">비밀번호 찾기</a>
				</div>
                   
                </div>
            </div>
        </nav>
        <!-- form -->
        <div class="container-sm" >
		<div class="input-form-backgroud row">
			<div class="input-form col-md-12 mx-auto">
				<h4 class="mb-3" style="text-align: center;">회원가입</h4>
				<form class="join" name="join" action="join"method="post">
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
								<label for="user_name">닉네임</label> <input type="text"
									class="form-control" id="user_name" name ="user_name" placeholder="닉네임 입력하세요" value="">
									<span class="user-name-error-message" style="color: red;">닉네임를 입력하세요.</span>
							</div>
					</div>
					<div class="row d-flex justify-content-center">
						<div class="col-md-5 mb-3">
							<label for="nickname">비밀번호</label> 
							<input type="password"class="form-control" size="15" id="passwd" name="passwd" placeholder="비밀번호를 입력하세요"value="" >
						</div>
					</div>

					<div class="row d-flex justify-content-center" >
						<div class="col-md-5 mb-3">
							<label for="email">이메일</label> 
							<input type="email"
								class="form-control" id="user_mail" name="user_mail" value="" placeholder="abc1@naver.com"
								pattern="[a-zA-Z0-9]+@[a-zA-Z0-9]+\.[a-zA-Z0-9]+">
							<button class="btn btn-primary btn-lg btn-block my-2" id="mailbut" name="mailbut"
								value=""type="button"  onclick="mailChack()" >인증하기</button>
						</div>
					</div>
					
					<div class="row d-flex justify-content-center" >
						<div class="col-md-5 mb-3">
							<label for="email">생년월일</label> 
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
		var user_pass = 0;
		var user_mail =0;
		
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
				var filteredText = user_name.replace(new RegExp('[a-zA-Z0-9가-힣]', 'g'), '');
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