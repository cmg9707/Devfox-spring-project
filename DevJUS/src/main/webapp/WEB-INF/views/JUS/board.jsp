<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
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
        <!-- Navigation-->
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
        <!-- Header-->
        <header class="bg-dark py-5">
            <div style="text-align: right; color: white; width: 80%;">
            <c:if test = "${not empty user}">
            	<a href="writing" style="color: white;">글쓰기</a>
            </c:if>
            </div>
        </header>
        <!-- Section-->
        <section class="py-5">
            <div class="container px-4 px-lg-5 mt-5">
                <div class="row gx-4 gx-lg-5 row-cols-2 row-cols-md-3 row-cols-xl-4 justify-content-center">
                
                <c:forEach var="board" items="${board}">
                    <div class="col mb-5">
                        <div class="card h-100">
                            <!-- Product image-->
                            <img class="card-img-top" src="/resources/css/uploadimg/${board.board_poto_new }" alt="..." />
                            <!-- Product details-->
                            <div class="card-body p-4">
                                <div class="text-center">
                                    <!-- Product name-->
                                    <h5 class="fw-bolder">${board.board_title }</h5>
                                    <!-- Product price-->
                                    ${board.board_address}
                                </div>
                            </div>
                            <!-- Product actions-->
                            <div class="card-footer p-4 pt-0 border-top-0 bg-transparent">
                                <div class="text-center"><a class="btn btn-outline-dark mt-auto" href="view?board_idx=${board.board_idx}">신청</a></div>
                            </div>
                        </div>
                    </div>
                   </c:forEach> 
               
                </div>
            </div>
        </section>
        <!-- Footer-->
        <footer class="py-5 bg-dark">
            <div class="container"><p class="m-0 text-center text-white">Copyright &copy; Your Website 2023</p></div>
        </footer>

    </body>
</html>
