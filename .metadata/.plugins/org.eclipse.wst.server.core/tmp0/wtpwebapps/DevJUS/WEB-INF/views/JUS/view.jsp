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
        <!--navbar-->
        <nav class="navbar navbar-light bg-light static-top">
            <div class="container">
                <a class="navbar-brand" href="index">모임나라</a>
                <div style="text-align: right;">
        <c:if test = "${user.user_power == 'x'}"> <!-- user -->
				<a href="info" ><img src="/resources/css/img/user.png" alt="" style="width: 10%;"></a>
				<a href="index" ><img src="/resources/css/img/logout.png" alt="" style="width: 10%;"></a>
		</c:if>
		<c:if test = "${user.user_power == 'o'}"> <!-- admin -->
				<a href="info" >관리자</a>
				<a href="index" ><img src="/resources/css/img/logout.png" alt="" style="width: 10%;"></a>
		</c:if>
		 <c:if test = "${empty user}">
                <div >
				<a href="login" style="margin: 10px;">로그인</a>
                <a href="join">회원가입</a>   
             	</div>
        </c:if>
        <a href="board">게시판으로</a>
             	</div>
            </div>
        </nav>
        <!-- Page Content-->
        <div class="container px-4 px-lg-5">
            <!-- Heading Row-->
            <div class="row gx-4 gx-lg-5 align-items-center my-5">
                <div class="col-lg-7"><img class="img-fluid rounded mb-4 mb-lg-0" src="/img/${board.board_poto_new}" alt="..." /></div>
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
                  	<!-- 終わったとき -->
                  		<h2>마감입니다</h2>
                  	</c:otherwise>
                  </c:choose>
                  
                  <c:if test = "${recooOK == 0}"> 
                     <!-- 推薦しなかったとき -->
                    <button class="w3-button w3-black w3-round" id="recommend" style="margin: 10px;">
                    	<img src="/resources/css/img/heartO.png" alt="" style="width:50px; height:50px">
						&nbsp;<span class="recommend_count"> ${board.board_recommend}</span>
					</button> 
                   </c:if>
                   
                   <c:if test = "${recooOK != 0}"> 
                     <!-- 推薦したとき -->
                    <button class="w3-button w3-black w3-round" id="recommend" style="margin: 10px;">
                    	<img src="/resources/css/img/heartsX.png" alt="" style="width:50px; height:50px">
						&nbsp;<span class="recommend_count"> ${board.board_recommend}</span>
					</button> 
					
                   </c:if>
                   <c:if test = "${user.user_name == board.user_name}">  
                    	<a class="btn" href="delete?board_idx=${board.board_idx }" id="writingdel" style="background-color: blue; color: white;">글 삭제</a>
                    	<a class="btn" href="modify?board_idx=${board.board_idx }" id="writingmod" style="background-color: blue; color: white;">글 수정</a>
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
               <div class="card-body" >
				<input type="hidden" name="board_idx" value="${board.board_idx }">
				<input type="hidden" name="user_name" value="${user.user_name }">
                     <textarea class="form-control" rows="1" id="reContent"></textarea>
                          <div style="text-align: right;">
                           <button type="button" id="bsub" style="padding: 15px; margin: 20px;">등록</button>
                            </div>
                         <!-- コメント ajax 位置-->
                            <div id="card-bodyo">
                            
                            </div>    
 
                            </div>
                        </div>
                        <!-- ページボタン位置 -->
                        <div id="oup2">
				<div
					style="position: relative; min-height: 100px; margin-top: 12px; border: 1px solid #b3b3b3; box-sizing: border-box;">
					<nav aria-label="Page navigation example">
						<ul class="pagination justify-content-center pagination-xl">
							
							
						</ul>
					</nav>

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
	//申し込みボタンイベント
	$("#request").click(function() {
		var requestvalue  = $('#request').data('value'); //申し込み確認
		console.log(requestvalue);
		  var user_name = '${board.user_name}'; // 作成者
		  var board_idx = '${board.board_idx}';//文順序
		  var request_user = '${user.user_name}';//申込者
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
	
	//おすすめボタン
	$("#recommend").click(function() {
		  var user_name = '${board.user_name}'; //コメントの主人
		  var board_idx = '${board.board_idx}'; //文順序
		  var recommend_user = '${user.user_name}';//申込者
		  //var recommendButton = $('#recommend');

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
	 var TotList = []; // コメントリスト配列
	 var pageCount = 0; // 全ページ
	 var startPage = 0;//最初の番号
	 var endPage =10 // 最後の番号
	 //var totPage = 0;	
	 var nowPage = 1;//現在のページ
	 var pagination = $("#oup2 .pagination");// ボタン追加
	 var prevBtn = $("<li class='page-item page-link' id='prevBtn'>&laquo;</li>");//前のボタン
	 var nextBtn = $("<li class='page-item page-link' id='nextBtn'>&raquo;</li>");//次のボタン
		
		// ページボタン生成関数
	            function createPageButton(pageNum) {
			
				var pageLink = $("<li class='page-link os'></li>").text(pageNum).attr('value', pageNum);
				
				  if (pageNum == nowPage ) {
					    pageLink.css('color', 'red');
					  }

	            var pageBtn = $("<li class='page-item'></li>").append(pageLink);
	              return pageBtn;
	 }
	            //ページボタン表示/非表示処理
	     function setPageButtonVisibility(start, end) {
	  	pagination.find('.page-item').remove();
			if (pageCount > 1) {
			    for (var i = start; i <= Math.min(end, 10); i++) {
			      pagination.find('.page-item:nth-child(' + i + ')').show();
			    }

				 }
			// ページ ボタン 追加
			if(pageCount > 1) {
				pagination.empty();
				pagination.append(prevBtn);
	      	for (var i = 1; i <= Math.min(end, 10)  ; i++) {
	       	 pagination.append(createPageButton(i));
	       		
	    		  }
	      	
	      	 pagination.append(nextBtn);
			}else{
				pagination.empty()
				pagination.append(createPageButton(1));
			}
			
			}
	   //page Load		
$(document).ready(function() {
	 if (sessionStorage.getItem('user')  === 'undefined') { // セッション確認
		    window.location.href = 'index'; // 移動するページURL
		  }
	

	 $.ajax({
		 url: "CommentList",
		 type: "get",
		 contentType: "application/json; charset=UTF-8",
		 dataType: "json",
		 success: function(data){
			 
			 TotList = data;
			 Listsize = TotList.length;
			
	        pageCount = Math.ceil(Listsize / 10);
	        console.log(pageCount);

         	
            setPageButtonVisibility(1, pageCount);

	        RList(data)
    
	 	}
 	})
 	 
	 
	 
 	//ページをクリックすると
 	$(document).on('click', '.os', function() {
 		
 		nowPage = $(this).val();//インポートされたページ番号
 		startPage = (nowPage - 1) * 10 //最初の番号
 		$.ajax({
 			url: "commentPage",
 			data :{
 				startPage : startPage
 			},
 			type : "get",
 			success : function(data){
 				

				
		        pageCount = Math.ceil(data.size / 10);
		        console.log(pageCount);

	         	
	            setPageButtonVisibility(1, pageCount);
	         	
				 $('#reContent').val('')
					 RList(data.list) 
 			}
 			
 		
 		})
 	})
 	
 })
 //Reボタンを押す時
 $(document).on("click",'button[name="but"]',function() {
		// コメント作成ボタンのIDからコメント番号を抽出
 	    var commentIdx = $(this).attr('id').split('-')[2];
 	    var dvreCont = $('#dvreCont' + commentIdx);
 	    
 		// 現在の要素のdisplayプロパティをチェックして表示または非表示にする
 	    if (dvreCont.css('display') === 'none') {
 	    	dvreCont.show();
 	    } else {
 	    	dvreCont.hide();
 	    }
 	});
 
 
 //コメント insert
 $('#bsub').on("click", function() {
	 var board_idx = "${board.board_idx}"
	 var user_name = "${user.user_name}"
	 var comment_content = $("#reContent").val();
	 console.log(board_idx);
	 console.log(comment_content);
	 console.log(user_name);
	 $.ajax({
		 url : "reTestComment",
		 data : {
			 board_idx : board_idx,
			 comment_content : comment_content,
			 user_name : user_name
		 },
		 type : "Post",
		 success : function(data){
			 console.log("성공")
			 
			 TotList = data;
			 Listsize = TotList.length;
			
	        pageCount = Math.ceil(Listsize / 10);
	        console.log(pageCount);
	        nowPage = pageCount;
         	
            setPageButtonVisibility(1, pageCount);
			 
			 $('#reContent').val('') 
			
				getReplyList();//등록후 마지막 댓글 목록 불러오기 함수 실행
				
		 }
	 })
 });
 //REコメント登録
 $(document).on("click",'button[name="bsub"]',function(){
	// コメント作成ボタンのIDからコメント番号を抽出
	  
	   var comment_idx = $(this).attr('id').split('-')[1];//親コメントidx
	   var comment_nb = $(this).attr('id').split('-')[2];//REコメントの上の人
	   var board_idx = "${board.board_idx}"// 文 idx
	   var user_name = "${user.user_name}" // コメント作成ユーザー
	   var comment_content = $("#reContent"+comment_nb).val();
	   console.log(comment_idx);
	   console.log(board_idx);
	   console.log(user_name);
	   console.log(comment_content);
	   
		 $.ajax({
			 url : "rereTestComment",
			 data : {
				 nowPage :nowPage,
				 comment_idx : comment_idx,
				 comment_nb : comment_nb,
				 board_idx : board_idx,
				 user_name : user_name,
				 comment_content : comment_content	 
			 },
			 type : "Post",
			 success : function(data){
				 

				
		        pageCount = Math.ceil(data.size / 10);
		        console.log(pageCount);

	         	
	            setPageButtonVisibility(1, pageCount);
	         	
				 $('#reContent').val('') 
					 RList(data.startList) 
			 }
		 })
 });
 
//コメント削除
 $(document).on("click",'button[name="butdel"]',function(){
	// コメント作成ボタンのIDからコメント番号を抽出
	   var comment_nb = $(this).attr('id').split('-')[2];//削除するコメントの固有値
		 $.ajax({
			 url : "CommentDel",
			 data : {
				 nowPage : nowPage,
				 comment_nb : comment_nb
			 },
			 type : "Post",
			 success : function(data){
				
			     pageCount = Math.ceil(data.size / 10);
			     console.log(pageCount);

		        
		          setPageButtonVisibility(1, pageCount);
		         	
				  $('#reContent').val('') 
				   RList(data.startList) 
			 }
		 })
 });
 
 
//コメント修正textを開く
$(document).on("click",'button[name="butmod"]',function(){

	
	   	// コメント作成ボタンのIDからコメント番号を抽出
 	    var commentIdx = $(this).attr('id').split('-')[2];
 	    var dvreContmod = $('#dvreContmod' + commentIdx);
 	    
 	    // 現在の要素のdisplayプロパティをチェックして表示または非表示にする
 	    if (dvreContmod.css('display') === 'none') {
 	    	dvreContmod.show();
 	    } else {
 	    	dvreContmod.hide();
 	    }
});

//コメント修正
$(document).on("click",'button[name="bsubmod"]',function(){
	
	   var comment_nb = $(this).attr('id').split('-')[2];//僕が書いたコメント固有値
	   var comment_content = $("#reContentmod"+comment_nb).val();
	   console.log(comment_nb);
	   console.log(comment_content);
	   
		 $.ajax({
			 url : "CommentMod",
			 data : {
				 nowPage : nowPage,
				 comment_nb : comment_nb,
				 comment_content : comment_content	 
			 },
			 type : "Post",
			 success : function(data){
					
			     pageCount = Math.ceil(data.size / 10);
			     console.log(pageCount);

		        
		          setPageButtonVisibility(1, pageCount);
		         	
				  $('#reContent').val('') 
				   RList(data.startList) 
			 }
		 })
});


//前のボタンをクリックすると
$(document).on('click', '#prevBtn', function() {

	nowPage = nowPage -1; // 次ページ
	if(nowPage == 0){
		nowPage = 1;
	}
	console.log(nowPage);
	startPage = (nowPage - 1) * 10; //最初の番号
		console.log(startPage);
		$.ajax({
 			url: "commentPage",
 			data :{
 				startPage : startPage
 			},
 			type : "get",
 			success : function(data){
 				

				
		        pageCount = Math.ceil(data.size / 10);
		        console.log(pageCount);

	         	
	            setPageButtonVisibility(1, pageCount);
	         	
				 $('#reContent').val('') 
					 RList(data.list) 
 			}
 			
 		
 		})
})

//次のボタンをクリックすると
$(document).on('click', '#nextBtn', function() {

	nowPage = nowPage + 1; // 次のボタン
	if(nowPage >= pageCount){
		nowPage = pageCount;
	}
	console.log(nowPage);
	startPage = (nowPage - 1) * 10; //最初の番号
		console.log(startPage);
		$.ajax({
 			url: "commentPage",
 			data :{
 				startPage : startPage
 			},
 			type : "get",
 			success : function(data){
 				

				
		        pageCount = Math.ceil(data.size / 10);
		        console.log(pageCount);

	         	
	            setPageButtonVisibility(1, pageCount);
	         	
				 $('#reContent').val('') 
					 RList(data.list) 
 			}
 			
 		
 		})
})

 
 	function getReplyList(){
 		
 		$.ajax({
 			url : "Commint_insert_list",
 			type : "Get",
 			dataType : "json",
 			success : function(data){
 				RList(data);
 			}
 		})
 		
 	}
 	function RList(data){
 		var html = "";   
         $.each(data.slice(0, 10), function(index , item){
        	 if(item.comment_grps !=1){
        		 html += '<div class="card bg-light" style="width: 80%; float:right;>';
                 html += '<div class="d-flex mb-4">'; 
                 html += '<div class="flex-shrink-0"  style = "font-size:1.5em; color: green;">'+ item.user_name +'</div>';
                 html += '<div class="ms-3">';
                 html += '<div>' + item.comment_content + '</div>';
                 html += '<div>';
                if(item.comment_content != "삭제되었습니다"){
                     html += '<button type="button" name="but" style="margin : 10px;" id="but-'+ item.comment_idx +"-"
                     + item.comment_nb +'"</button>대댓글쓰기'
               	if(item.user_name == '${user.user_name}'){
               		html += '<button type="button" name="butdel" style="margin : 10px;" id="butdel-'+ item.comment_idx +"-"
                    + item.comment_nb +'"</button>댓글 삭제'
                    html += '<button type="button" name="butmod" style="margin : 10px;" id="butmod-'+ item.comment_idx +"-"
                    + item.comment_nb +'"</button>댓글 수정'
               	}
                }
                 html += '</div>';
                 html += '</div>';
                 html += '</div>';
                 
                 html += '<div style="text-align: right; display: none;" id="dvreCont'+item.comment_nb+'">';
                 html += '<textarea class="form-control"  rows="1" id="reContent'+item.comment_nb+'"></textarea>'  
                 html += '<button type="button" name="bsub" id="bsub-'+ item.comment_idx +"-"
                 + item.comment_nb +'"style="padding: 15px; margin: 20px;">등록</button>'	
                 html += '</div>';
                 
                 html += '<div style="text-align: right; display: none;" id="dvreContmod'+item.comment_nb+'">';
                 html += '<textarea class="form-control"  rows="1" id="reContentmod'+item.comment_nb+'"></textarea>'  
                 html += '<button type="button" name="bsubmod" id="bsubmod-'+ item.comment_idx +"-"
                 + item.comment_nb +'"style="padding: 15px; margin: 20px;">수정</button>'	
                 html += '</div>';
                 
                 html += '</div>'; 
        	 }else{
        		 html += '<div class="card bg-light" style="width: 100%;>';
                 html += '<div class="d-flex mb-4">'; 
                 html += '<div class="flex-shrink-0"  style = "font-size:1.5em; color: green;">'+ item.user_name +'</div>';
                 html += '<div class="ms-3">';
                 html += '<div>' + item.comment_content + '</div>';
                 html += '<div>';
                if(item.comment_content != "삭제되었습니다"){
                     html += '<button type="button" name="but" style="margin : 10px;" id="but-'+ item.comment_idx +"-"
                     + item.comment_nb +'"</button>대댓글쓰기'
               	if(item.user_name == '${user.user_name}'){
               		html += '<button type="button" name="butdel" style="margin : 10px;" id="butdel-'+ item.comment_idx +"-"
                    + item.comment_nb +'"</button>댓글 삭제'
                    html += '<button type="button" name="butmod" style="margin : 10px;" id="butmod-'+ item.comment_idx +"-"
                    + item.comment_nb +'"</button>댓글 수정'
               	}
                }
                 html += '</div>';
                 html += '</div>';
                 html += '</div>';
                 
                 html += '<div style="text-align: right; display: none;" id="dvreCont'+item.comment_nb+'">';
                 html += '<textarea class="form-control"  rows="1" id="reContent'+item.comment_nb+'"></textarea>'  
                 html += '<button type="button" name="bsub" id="bsub-'+ item.comment_idx +"-"
                 + item.comment_nb +'"style="padding: 15px; margin: 20px;">등록</button>'	
                 html += '</div>';
                 
                 html += '<div style="text-align: right; display: none;" id="dvreContmod'+item.comment_nb+'">';
                 html += '<textarea class="form-control"  rows="1" id="reContentmod'+item.comment_nb+'"></textarea>'  
                 html += '<button type="button" name="bsubmod" id="bsubmod-'+ item.comment_idx +"-"
                 + item.comment_nb +'"style="padding: 15px; margin: 20px;">수정</button>'	
                 html += '</div>';
                 
                 html += '</div>'; 
        	 }

          // 生成したHTMLコードを所望の場所に挿入
             $('#card-bodyo').html(html);
         })
 	}
</script>
    </body>
</html>
