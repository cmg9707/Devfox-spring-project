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
		<c:if test = "${user.user_power == 'o'}"> <!-- admin -->
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
                <div class="col-lg-7"><img class="img-fluid rounded mb-4 mb-lg-0" src="/resources/css/uploadimg/${board.board_poto_new}" alt="..." /></div>
                <div class="col-lg-5" id="title">
                    <h2 class="font-weight-light">${board.board_title}</h2>
                    <h3>${board.board_content}</h3>
                    <h4>시작일 :  ${board.board_period_start} / 종료일 :  ${board.board_period_end}</h4>
                    <h4 id="limitday">마감인원 : ${board.board_limit}  / 신청인원 : ${board.request_order}</h4>
                    
                  <c:choose>
                  	<c:when test="${board.board_limit !=board.request_order}">
                  		<c:if test = "${reqOK == 0}">  
                    		<a class="btn" id="request" data-value="0" style="background-color: blue; color: white;">신청하기</a>
                 		</c:if>
                 		<c:if test = "${reqOK != 0}">  
                  			<a class="btn" id="request" style="background-color: red; color: white;" data-value="1">신청취소</a>
                  		</c:if> 
                  	</c:when>
                  	<c:when test="${reqOK != 0}">
                  			<a class="btn" id="request" style="background-color: red; color: white;" data-value="1">신청취소</a>
                  	</c:when>
                  	<c:otherwise>
                  		<h2>마감입니다</h2>
                  	</c:otherwise>
                  </c:choose>
                  
                  <c:if test = "${recooOK == 0}"> 
                     <!-- 추천 기능 -->
                    <button class="w3-button w3-black w3-round" id="recommend" style="margin: 10px;">
                    	<img src="/resources/css/img/heartO.png" alt="" style="width:50px; height:50px">
						&nbsp;<span class="recommend_count"> ${board.board_recommend}</span>
					</button> 
                   </c:if>
                   
                   <c:if test = "${recooOK != 0}"> 
                     <!-- 추천 기능 -->
                    <button class="w3-button w3-black w3-round" id="recommend" style="margin: 10px;">
                    	<img src="/resources/css/img/heartsX.png" alt="" style="width:50px; height:50px">
						&nbsp;<span class="recommend_count"> ${board.board_recommend}</span>
					</button> 
					
                   </c:if>  
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
                            <h3 class="card-text">${board.board_end} 까지</h3>
                        </div>
                    </div>
                </div>
            </div>
        
        <!-- Comments section-->
                    <section class="mb-5">
                        <div class="card bg-light">
                            <div class="card-body">
                                <!-- Comment form-->
                                <form class="mb-4"><textarea class="form-control" rows="3" placeholder="Join the discussion and leave a comment!"></textarea>
                                	<div style="text-align: right;">
                                	<button type="button">등록</button>
                                	</div>
                                </form>
                                <!-- Comment with nested comments-->
                                
                                <div class="d-flex mb-4">
                                    <!-- Parent comment-->
                                    <div class="flex-shrink-0"><img class="rounded-circle" src="https://dummyimage.com/50x50/ced4da/6c757d.jpg" alt="..." /></div>
                                    <div class="ms-3">
                                        <div class="fw-bold">Commenter Name</div>
                                        If you're going to lead a space frontier, it has to be government; it'll never be private enterprise. Because the space frontier is dangerous, and it's expensive, and it has unquantified risks.
                                    </div>
                                </div>
                                
                            </div>
                        </div>
                    </section>
         </div>
        <!-- Footer-->
        <footer class="py-5 bg-dark">
            <div class="container px-4 px-lg-5"><p class="m-0 text-center text-white">Copyright &copy; Your Website 2023</p></div>
        </footer>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script>
	//신청버튼 이벤트
	$("#request").click(function() {
		var requestvalue  = $('#request').data('value');
		console.log(requestvalue);
		  var user_name = '${board.user_name}';
		  var board_idx = '${board.board_idx}';
		  var request_user = '${user.user_name}';
		 if(requestvalue == 0){
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
						console.log(data+"성공");
						$("#request").text("신청취소");
						$("#request").css("background-color", "red" , "color" , "white");
						$("#request").data("value", 1);
						$("#limitday").text("마감인원 : ${board.board_limit}  / 신청인원 : "+data);
						
						}
				  })
		 }else{
			 $.ajax({
					url: "view_request_m" ,
					type: "Post",
					dataType: "text",
					data: { 
						board_idx : board_idx,
						request_user : request_user
						},
					success: function(data) {
						console.log("성공");
						$("#request").text("신청하기");
						$("#request").css("background-color", "blue", "color" , "white");
						$("#request").data("value", 0);
						$("#limitday").text("마감인원 : ${board.board_limit}  / 신청인원 : "+data);
						}
				  })
		 }
		  
		
		});
	
	//추천버튼
	$("#recommend").click(function() {
		  var user_name = '${board.user_name}';
		  var board_idx = '${board.board_idx}';
		  var recommend_user = '${user.user_name}';
		  var recommendButton = $('#recommend');

		  $.ajax({
				url: "view_recommend",
				type: "Post",
				dataType: "text",
				data: { 
					user_name: user_name,
					board_idx : board_idx,
					recommend_user : recommend_user
					},
				success: function(data) {
					if(data ==0){
						alert("이미 추천하셨습니다")
					}else{
						$("#recommend img").attr("src", "/resources/css/img/heartsX.png");
						$("#recommend span").text(data);
					}
					
					
					}
			  })
		  
	})
</script>
    </body>
</html>
