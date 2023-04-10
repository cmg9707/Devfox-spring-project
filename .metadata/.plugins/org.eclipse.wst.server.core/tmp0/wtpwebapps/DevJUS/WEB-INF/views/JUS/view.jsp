<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
    <head>
        <meta charset="utf-8" />
		<!-- Bootstrap ! -->
  		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
        <!-- Google fonts-->
        <link href="https://fonts.googleapis.com/css?family=Lato:300,400,700,300italic,400italic,700italic" rel="stylesheet" type="text/css" />
        <!-- Core theme CSS (includes Bootstrap)-->
        <link rel="stylesheet" href="/resources/css/styles.css">
    </head>
    <body>
        <!-- Responsive navbar-->
        <nav class="navbar navbar-light bg-light static-top">
            <div class="container">
                <a class="navbar-brand" href="index">모임나라</a>
                <div style="text-align: right;">
        <c:if test = "${user.user_power == 'x'}"> <!-- user -->
				<a href="user_mu" ><img src="/resources/css/img/user.png" alt="" style="width: 10%;"></a>
		</c:if>
		<c:if test = "${user.user_power == 'o'}"> <!-- user -->
				<a href="user_mu" >관리자</a>
		</c:if>
		 <c:if test = "${empty user}">
                <div >
				<a href="login" style="margin: 10px;">로그인</a>
                <a href="join">회원가입</a>   
             	</div>
        </c:if>
        <a href="javascript:window.history.back();">뒤로가기</a>
             	</div>
            </div>
        </nav>
        <!-- Page Content-->
        <div class="container px-4 px-lg-5">
            <!-- Heading Row-->
            <div class="row gx-4 gx-lg-5 align-items-center my-5">
                <div class="col-lg-7"><img class="img-fluid rounded mb-4 mb-lg-0" src="/resources/css/uploadimg/${board.board_poto_new }" alt="..." /></div>
                <div class="col-lg-5">
                    <h2 class="font-weight-light">${board.board_title}</h2>
                    <h3>${board.board_content}</h3>
                    <h4>시작일  ${board.board_period_start} / 종료일  ${board.board_period_end}</h4>
                    <a class="btn btn-primary" id="recommend">신청하기</a>
                     <!-- 추천 기능 -->
                    <button class="w3-button w3-black w3-round" id="rec_update" style="margin: 10px;">
						<i class="fa fa-heart" style="font-size:16px;color:red"></i>
						&nbsp;<span class="rec_count">추천 ${board.board_recommend}</span>
					</button> 
                    
                </div>
            </div>
            <div class="card text-white bg-secondary my-5 py-4">
                <div class="card-body">
                
                <h1 class="text-white m-0">주최자 닉네임 :   ${board.user_name}</h1>
                
                </div>
            </div>
            <!-- Content Row-->
            <div class="row gx-4 gx-lg-5">
                <div class="col-md-4 mb-5">
                    <div class="card h-100">
                        <div class="card-body">
                            <h2 class="card-title">만나는 요일</h2>
                            <h3 class="card-text">${board.board_days}</h3>
                        </div>
                    </div>
                </div>
                <div class="col-md-4 mb-5">
                    <div class="card h-100">
                        <div class="card-body">
                            <h2 class="card-title">장소</h2>
                            <h3 class="card-text">${board.board_address}</h3>
                        </div>
                    </div>
                </div>
                <div class="col-md-4 mb-5">
                    <div class="card h-100">
                        <div class="card-body">
                            <h2 class="card-title">신청마감</h2>
                            <h3 class="card-text">${board.board_end}</h3>
                        </div>
                        <div class="card-footer"><a class="btn btn-primary btn-sm" href="#!">More Info</a></div>
                    </div>
                </div>
            </div>
        </div>
        <!-- Footer-->
        <footer class="py-5 bg-dark">
            <div class="container px-4 px-lg-5"><p class="m-0 text-center text-white">Copyright &copy; Your Website 2023</p></div>
        </footer>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script>
	$("#recommend").click(function() {
		  var user_name = '${board.user_name}';
		  var board_idx = '${board.board_idx}';
		  var request_user = '${user.user_name}';
		  
		  $.ajax({
			url: "view_request" ,
			type: "Post",
			dataType: "text",
			data: { 
				user_name: user_name,
				board_idx : board_idx,
				request_user : request_user
				},
			success: function(data) {
				console.log("성공");
				}
		  })
		
		});
</script>
    </body>
</html>
