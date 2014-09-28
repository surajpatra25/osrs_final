<html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<head>
<meta charset="UTF-8">
<title>One Stop Review Site</title>
<link rel="stylesheet" type="text/css" href="resources/css/main_page.css">

</head>

<script src="resources/js/jquery-2.1.1.min.js"></script>
<script src="resources/js/FacebookLoggedin.js"></script>
<body>
<div class="main_body">
<div class="main">
<li class="fb-login-button" scope="public_profile,email,user_friends" data-max-rows="1" data-size="small" data-show-faces="true"
 data-auto-logout-link="true" onlogin="checkLoginState();"></li>

Welcome to ORS SITE -
<span class="sub_main">we help identifying the right product for you.</span>
</div>

<div class="navigation_main">
	<ul class="navigation">
		<li><a href="#">HOME</a></li>
		<li><a href="#">ABOUT US</a></li>
		<li class="product_reviews"><a  href="#">PRODUCT REVIEWS</a>
		
		<ul>
			<li><a href="#">ELECTRONICS</a></li>
			<li><a href="#">AUTOMOTIVES</a></li>
			<li><a href="#">FOOD ITEMS</a></li>
			<li><a href="#">HOUSE EQUIPMENTS</a></li>
			<li><a href="#">Many More...</a></li>			
		</ul>
		</li>
		<li class="online_seller_reviews"><a href="#">ONLINE SELLER REVIEWS</a>
		<ul>
			<li><a href="#">Amazon</a></li>
			<li><a href="#">BestBuy</a></li>
			<li><a href="#">FlipKart</a></li>
			<li><a href="#">SnapDeal</a></li>
			<li><a href="#">GroupOn</a></li>
			<li><a href="#">Many More</a></li>			
		</ul>
		</li>
		<li><a href="#">TRENDING</a></li>
		<li class="login"><a href="#">Hello, ${name}</a>
		<a href="/ors/signout">Signout</a> 
		</li>
				<!-- 
				
				
				<c:set var="name" value="${name}" scope="request"/>
		<c:if test="${name=='invalid'}">
		<form action="register.jsp"></form>
		response.sendredirect("register.jsp");
		<form action="register"></form>		
		request.getRequestDispatcher("register.jsp").forward();
		-->
		</c:if>
		
		
		
		<!--  <form  name="login" action="login" method="post">
			UserId/EmailId:<br><textarea rows="1" cols="20"></textarea>
			<br>Password:	
			<br><input type="password" name="pwd">
			<br><button>SUBMIT</button>
			<br>Dont have one ? <a href="register">register</a>
		</form> -->
		
	</ul>
</div>
<div>
<div class="chat">
chat with other consumers
<hr><hr><hr>
	<hr><hr><hr><hr><hr><hr><hr>
	<hr><hr><hr><hr>
<div class="login"><a>Login</a></div>
</div>

<div class="content">
	Latest News
	<hr><hr>
	<hr><hr><hr><hr><hr><hr><hr>
	<hr><hr><hr><hr>
</div>
<div class="comment_tweet">Comments from Twitter <hr><hr><hr><hr>
	<hr><hr><hr><hr></div><br>
<div class="comment_fb">Comments from Facebook<hr><hr><hr>
	<hr><hr><hr><hr></div>
</div>
</div>
<div>
<%@ include file="footer.jsp" %>
</div>
</body>
</html>
