<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
 <meta charset="utf-8" />
        <title>모임</title>
        <!-- Bootstrap ! -->
  		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
        <!-- Google fonts-->
        <link href="https://fonts.googleapis.com/css?family=Lato:300,400,700,300italic,400italic,700italic" rel="stylesheet" type="text/css" />
        <!-- Core theme CSS (includes Bootstrap)-->
        <link rel="stylesheet" href="/resources/css/styles.css">
        <style type="text/css">
        .divider:after,
		.divider:before {
		content: "";
		flex: 1;
		height: 1px;
		background: #eee;
		}
        </style>
</head>
<body>
	 <!-- Navigation-->
<nav class="navbar navbar-light bg-light static-top">
	<div class="container">
		<a class="navbar-brand" href="index">모임나라</a>
		<div>
			<a href="login" style="margin: 10px;">로그인</a>
			<a href="join">회원가입</a>   
		</div>
     </div>
</nav>
<section class="vh-100">
  <div class="container py-5 h-100">
    <div class="row d-flex align-items-center justify-content-center h-100">
      <div class="col-md-8 col-lg-7 col-xl-6">
        <img src="/resources/css/img/email.png"
          class="img-fluid" alt="Phone image">
      </div>
      <div class="col-md-7 col-lg-5 col-xl-5 offset-xl-1">
        <form name="login" id="login" method="get" action="login">
          <!-- id input -->
          <div class="form-outline mb-4">
            <input type="text" id="user_id" class="form-control form-control-lg" />
            <label class="form-label-user-id" for="user_id">아이디</label>
          </div>

          <!-- Password input -->
          <div class="form-outline mb-4">
            <input type="password" id="user_pass" class="form-control form-control-lg" />
            <label class="form-label-user-pass" for="form1Example23">비밀번호</label>
          </div>


          <!-- Submit button -->
          <button  class="btn btn-primary btn-lg btn-block" id="subbt" style="width: 100%;">로그인</button>
        </form>
        
      </div>
    </div>
  </div>
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
  <script>
	  $("#subbt").unbind("click").click(function(event){
		  event.preventDefault();

		 var user_id = $('#user_id').val();
		 var user_pass = $('#user_pass').val();
		 console.log(user_id);
		 console.log(user_pass);
			$.ajax({
				url : "login_Chk",
				type: "Get",
				dataType: "text",
				data : {
				 user_id: user_id,
				 user_pass: user_pass,
			     
				},	
				success: function(data) {
		    	console.log("성공" + data);
		    	if(data == "0"){
		    		$('.form-label-user-id').text('아이디가 존재하지 않거나 틀립니다').css('color', 'red');
		    	}else if(data =="1"){
		    		$('.form-label-user-pass').text('비밀번호가 틀립니다.').css('color', 'red');
		    	}else{
		    		window.location.href = "board";
		    	}
							    	
				}
			})
		});

  </script>
</section>
</body>
</html>