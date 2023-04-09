<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
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
        <!-- login -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>

        
        <!-- Masthead-->
        <header class="masthead" style="background-image: url('/resources/css/img/group1920.jpg');background-size: 100% 100%;">
            <div class="container position-relative">
                <div class="row justify-content-center">
                    <div class="col-xl-6">
                        <div class="text-center text-white">
                            <!-- Page heading-->
                            <h1 class="mb-5" >어서오세요</h1>
                            


                        </div>
                    </div>
                </div>
            </div>
        </header>
        
        <section class="features-icons bg-light text-center">
            <div class="container">
                <div class="row">
                    <div class="col-lg-4">
                        <div class="features-icons-item mx-auto mb-5 mb-lg-0 mb-lg-3">
                            <div class="features-icons-icon d-flex"><i class="bi-window m-auto text-primary"></i></div>
                            <h3>편리함</h3>
                            <p class="lead mb-0">손쉬운 방법으로 스터디 모임 가능</p>
                        </div>
                    </div>
                    <div class="col-lg-4">
                        <div class="features-icons-item mx-auto mb-5 mb-lg-0 mb-lg-3">
                            <div class="features-icons-icon d-flex"><i class="bi-layers m-auto text-primary"></i></div>
                            <h3>공부 , 여가활동 , 취직</h3>
                            <p class="lead mb-0">어떤것이든 상관없이 모임 가능</p>
                        </div>
                    </div>
                    <div class="col-lg-4">
                        <div class="features-icons-item mx-auto mb-0 mb-lg-3">
                            <div class="features-icons-icon d-flex"><i class="bi-terminal m-auto text-primary"></i></div>
                            <h3>향상</h3>
                            <p class="lead mb-0">혼자는 힘드신 분들에게 추천</p>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <!-- Image Showcases-->
        <section class="showcase">
            <div class="container-fluid p-0">
                <div class="row g-0">
                    <div class="col-lg-6 order-lg-2 text-white showcase-img" style="background-image: url('/resources/css/img/email.png');background-size: 100% 100%;"></div>
                    <div class="col-lg-6 order-lg-1 my-auto showcase-text">
                        <h2>편리함</h2>
                        <p class="lead mb-0">이메일 하나만 있으면 간편하게 회원가입 완료!</p>
                    </div>
                </div>
                <div class="row g-0">
                    <div class="col-lg-6 text-white showcase-img" style="background-image: url('/resources/css/img/group3.jpg');background-size: 100% 100%;"></div>
                    <div class="col-lg-6 my-auto showcase-text">
                        <h2>공부 , 여가활동 , 취직</h2>
                        <p class="lead mb-0">모임의 경우 어떠한 것도 상관이 없습니다!</p>
                    </div>
                </div>
                <div class="row g-0">
                    <div class="col-lg-6 order-lg-2 text-white showcase-img" style="background-image: url('/resources/css/img/group2.jpg');background-size: 100% 100%;"></div>
                    <div class="col-lg-6 order-lg-1 my-auto showcase-text">
                        <h2>향상</h2>
                        <p class="lead mb-0">혼자서 했을 때보다 보다 효율좋게 공부와 여가를 합시다!  </p>
                    </div>
                </div>
            </div>
        </section>
        <!-- Testimonials-->
        <section class="testimonials text-center bg-light">
            <div class="container">
                <h2 class="mb-5">What people are saying...</h2>
                <div class="row">
                    <div class="col-lg-4">
                        <div class="testimonial-item mx-auto mb-5 mb-lg-0">
                            <img class="img-fluid rounded-circle mb-3" src="/resources/css/img/testimonials-1.jpg" alt="..." />
                            <h5>Margaret E.</h5>
                            <p class="font-weight-light mb-0">"정말 좋았습니다."</p>
                        </div>
                    </div>
                    <div class="col-lg-4">
                        <div class="testimonial-item mx-auto mb-5 mb-lg-0">
                            <img class="img-fluid rounded-circle mb-3" src="/resources/css/img/testimonials-2.jpg" alt="..." />
                            <h5>Fred S.</h5>
                            <p class="font-weight-light mb-0">"가입하고 인생이 달라졌어요."</p>
                        </div>
                    </div>
                    <div class="col-lg-4">
                        <div class="testimonial-item mx-auto mb-5 mb-lg-0">
                            <img class="img-fluid rounded-circle mb-3" src="/resources/css/img/testimonials-3.jpg" alt="..." />
                            <h5>Sarah W.</h5>
                            <p class="font-weight-light mb-0">"모임을 가지고 실력이 향상되었습니다."</p>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <!-- Call to Action-->
        <section class="call-to-action text-white text-center" id="signup">
            <div class="container position-relative">
                <div class="row justify-content-center">
                    <div class="col-xl-6">
                        <h2 class="mb-4">지금 바로 가입하세요!</h2>

                    </div>
                </div>
            </div>
        </section>
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
    </body>
</html>
