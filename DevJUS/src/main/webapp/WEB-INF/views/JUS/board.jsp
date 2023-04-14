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
				<a href="info" ><img src="/resources/css/img/user.png" alt="" style="width: 10%;"></a>
				${user.user_name}
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
             	</div>
            </div>
            
        </nav>
        <!-- Header-->
        <header class="bg-dark py-5">
            <div style="text-align: right; color: white; width: 80%;">
            <div style="text-align: center;">
            	<select id="selectbox">
            		<option value="user_name">닉네임</option>
            	</select>
            	<input type="text" id="selectKey" value="">
            	<span  id="singUP" style="display:inline-block; height:20px; width:100px;">찾기</span>
            	<button type="button" id="upbut">추천수정렬</button>
            </div>
            <c:if test = "${not empty user}">
            	<a href="writing" style="color: white;">글쓰기</a>
            </c:if>
            </div>
        </header>
        <!-- Section-->
        <section class="py-5">
            <div class="container px-4 px-lg-5 mt-5">
                <div class="row gx-4 gx-lg-5 row-cols-2 row-cols-md-3 row-cols-xl-4 justify-content" id="boardid">
                <!-- List -->
                
                    
                 
               
                </div>
            </div>
        </section>
        <!-- 버튼 -->
         <div id="oup2">
				<div
					style="position: relative; min-height: 100px; margin-top: 12px; border: 1px solid #b3b3b3; box-sizing: border-box;">
					<nav aria-label="Page navigation example">
						<ul class="pagination justify-content-center pagination-xl">
						</ul>
					</nav>
				</div>
		</div>
        <!-- Footer-->
        <footer class="py-5 bg-dark">
            <div class="container"><p class="m-0 text-center text-white">Copyright &copy; Your Website 2023</p></div>
        </footer>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script>
var TotList = []; // コメントリスト 
var checkArr = []; // 因子配列
var pageCount = 0; // 全ページ
var startPage = 0;//最初の番号
var endPage =10 // 最後の番号
var nowPage = 1;//現在のページ
var UPbt = 0; //おすすめボタンを押したか確認
var pagination = $("#oup2 .pagination");// ボタン追加
var prevBtn = $("<li class='page-item page-link' id='prevBtn'>&laquo;</li>");//前のボタン
var nextBtn = $("<li class='page-item page-link' id='nextBtn'>&raquo;</li>");//次のボタン
 //page Load
	$(document).ready(function() {
	 	if (sessionStorage.getItem('user')  === 'undefined') { // セッション確認
			    window.location.href = 'index'; // 移動するページURL
			  }
	 
		 $.ajax({
			 url:"boardList",
			 type: "get",
			 data: {
	   	         nowPage: nowPage //現在ページ
	   	     },
	     	   success: function(data){
	     	   	console.log(data);
				// ページ数計算
		   	     pageCount = Math.ceil(data.size / 8);
		      	 console.log(pageCount);
	
	         	// ページボタン表示/非表示処理
	          	 setPageButtonVisibility(1, pageCount);
	         	
				 $('#selectKey').val('') //さがすのボタンの初期化
					 RList(data.startList) //リストの読み込み関数の実行
	       	 }
		 })
	})

//ページをクリックすると
 	$(document).on('click', '.os', function() {
 		
 		nowPage = $(this).val();//インポートされたページ番号
 		console.log("현재페이지"+nowPage)
 		startPage = (nowPage - 1) * 8 //最初の番号
 		//配列からその名前などのオブジェクトを見つけて削除
	    checkArr = checkArr.filter(function(item) {
	      return item.name !== "nowPage";
	    });
 		// 現在のページ因子
 		checkArr.push({
 		      name: "nowPage",
 		      value: nowPage,
 		});
		if(UPbt==0){
			$.ajax({
	 			url: "boardPage",
	 			data : JSON.stringify(checkArr),//配列をjson文字列に
	 			contentType: "application/json; charset=UTF-8",
	 			type : "post",
	 			success : function(data){
					console.log(data.size);

					// ページ数計算
			        pageCount = Math.ceil(data.size / 8);
			        console.log(pageCount);

		         	// ページボタン表示/非表示処理
		            setPageButtonVisibility(1, pageCount);
		         	
						 RList(data.startList) //リストの読み込み関数の実行
	 			}
	 			
	 		
	 		})
		}else{
			checkArr = []; //配列初期化
			
	 		
	 		$.ajax({
	 			url: "UPpage",
	 			data : {
	 				startPage : startPage
	 			},
	 			type : "get",
	 			success : function(data){

					
			        pageCount = Math.ceil(data.size / 8);
			        console.log(pageCount);

		         	
		            setPageButtonVisibility(1, pageCount);
		         	
					RList(data.startList) 
	 			}
	 			
	 		
	 		})
		}
 		
 	})
	
 	//さがすボタンをクリックすると
	$(document).on('click', '#singUP', function() {
 		var selecteName = $('#selectbox').val(); //select名
 		var selectedValue = $('#selectKey').val(); // select value
		nowPage = 1;
		startPage = (nowPage - 1) * 8 //最初の番号
		console.log("selecteName"+selecteName);
		//配列からその名前などのオブジェクトを見つけて削除
	    checkArr = [];  //配列初期化
		
 		// 현재 페이지 인자
 		checkArr.push({
 		      name: "nowPage",
 		      value: nowPage,
 		});

 		checkArr.push({
 	 		      name: selecteName,
 	 		      value: selectedValue,
 	 		});
 		
 		$.ajax({
 			url: "boardPage",
 			data : JSON.stringify(checkArr),
 			contentType: "application/json; charset=UTF-8",
 			type : "post",
 			success : function(data){
				console.log(data.size);

				
		        pageCount = Math.ceil(data.size / 8);
		        console.log(pageCount);

	         	
	            setPageButtonVisibility(1, pageCount);
	         	
				RList(data.startList)
 			}
 			
 		
 		})

	});

	//推薦数整列
	$(document).on('click', '#upbut', function() {
		nowPage = 1;
		startPage = (nowPage - 1) * 8 
	    checkArr = []; 
	    UPbt = 1;
 		
 		$.ajax({
 			url: "UPpage",
 			data : {
 				startPage : startPage
 			},
 			type : "get",
 			success : function(data){

				
		        pageCount = Math.ceil(data.size / 8);
		        console.log(pageCount);

	         	
	            setPageButtonVisibility(1, pageCount);
	         	
				RList(data.startList) 
 			}
 			
 		
 		})
	});
	

	//前のボタンをクリックすると
	$(document).on('click', '#prevBtn', function() {

		nowPage = nowPage -1; 
		if(nowPage == 0){
			nowPage = 1;
		}
		console.log(nowPage);
		startPage = (nowPage - 1) * 8;
			console.log(startPage);
			// 현재 페이지 인자
	 		checkArr.push({
	 		      name: "nowPage",
	 		      value: nowPage,
	 		});	
		
			if(UPbt==0){
				$.ajax({
		 			url: "boardPage",
		 			data : JSON.stringify(checkArr),
		 			contentType: "application/json; charset=UTF-8",
		 			type : "post",
		 			success : function(data){
						console.log(data.size);

						
				        pageCount = Math.ceil(data.size / 8);
				        console.log(pageCount);

			            setPageButtonVisibility(1, pageCount);
			         	
							 RList(data.startList) 
		 			}
		 			
		 		
		 		})
			}else{
				checkArr = []; 
				
		 		
		 		$.ajax({
		 			url: "UPpage",
		 			data : {
		 				startPage : startPage
		 			},
		 			type : "get",
		 			success : function(data){

						
				        pageCount = Math.ceil(data.size / 8);
				        console.log(pageCount);

			         	
			            setPageButtonVisibility(1, pageCount);
			         	
						RList(data.startList) 
		 			}
		 			
		 		
		 		})
			}
	})

	//次のボタンをクリックすると
	$(document).on('click', '#nextBtn', function() {

		nowPage = nowPage + 1; // 次ページ
		if(nowPage >= pageCount){
			nowPage = pageCount;
		}
		console.log(nowPage);
		startPage = (nowPage - 1) * 8; 
			console.log(startPage);
			
			
	 		checkArr.push({
	 		      name: "nowPage",
	 		      value: nowPage,
	 		});	
		
			if(UPbt==0){
				$.ajax({
		 			url: "boardPage",
		 			data : JSON.stringify(checkArr),
		 			contentType: "application/json; charset=UTF-8",
		 			type : "post",
		 			success : function(data){
						console.log(data.size);

						
				        pageCount = Math.ceil(data.size / 8);
				        console.log(pageCount);

			         	
			            setPageButtonVisibility(1, pageCount);
			         	
							 RList(data.startList) 
		 			}
		 			
		 		
		 		})
			}else{
				checkArr = [];
				
		 		
		 		$.ajax({
		 			url: "UPpage",
		 			data : {
		 				startPage : startPage
		 			},
		 			type : "get",
		 			success : function(data){

					
				        pageCount = Math.ceil(data.size / 8);
				        console.log(pageCount);

			         	
			            setPageButtonVisibility(1, pageCount);
			         	
						RList(data.startList)
		 			}
		 			
		 		
		 		})
			}
	})
	
	
//文出力
 	function RList(data){
 		var html = "";   
         $.each(data.slice(0, 8), function(index , item){

        		 html += '<div class="col mb-5">';
                 html += '<div class="card h-100">'; 
                 html += '<img class="card-img-top" src="/img/'+item.board_poto_new+'" alt="..." style="width:100%; height:100%"/>';
                 html += '<div class="card-body p-4">';
                 html += '<div class="text-center">';
                 html += '<h5 class="fw-bolder">'+item.board_title+'</h5>';
                 html += '지역 : '+item.board_address+"<br>";
                 html += '작성자 : '+item.user_name+"<br>";
                 html += '추천수 : '+item.board_recommend;

                
                 html += '</div>';
                 html += '</div>';
                 html += '<div class="card-footer p-4 pt-0 border-top-0 bg-transparent">';
                 html += '<div class="text-center"><a class="btn btn-outline-dark mt-auto" href="view?board_idx=' + item.board_idx + '&user_name=${sessionScope.user_name}">신청</a></div>';
                 
                 html += '</div>';
                 html += '</div>';
                 html += '</div>';
        	 });

          // 生成したHTMLコードを所望の場所に挿入
             $('#boardid').html(html);
         }
         
//ページボタン生成関数
	function createPageButton(pageNum) {
		var pageLink = $("<li class='page-link os'></li>").text(pageNum).attr('value', pageNum);
			if (pageNum == nowPage ) {
	   			 pageLink.css('color', 'red');
	  			}
	    var pageBtn = $("<li class='page-item'></li>").append(pageLink);
	    
  		return pageBtn;
}

// ページボタン表示/非表示処理
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

</script>
    </body>
</html>
