<html>
<head>
<meta charset="UTF-8">
<title>One Stop Review Site</title>
<link rel="stylesheet" type="text/css" href="resources/css/main_page.css">
</head>
<body>

<script src="resources/js/jquery-2.1.1.min.js"></script>
<script src="resources/js/FacebookLogin.js"></script>
<script src="resources/js/googlelogin.js"></script>

<div class="main_body">
<div class="main">
Welcome to ORS SITE -
<span class="sub_main">we help identifying the right product for you.</span>
<li class="fb-login-button" scope="public_profile,email,user_friends" 
data-max-rows="1" data-size="small" data-show-faces="true" data-auto-logout-link="true" onlogin="checkLoginState();"></li>
<%@ include file="googleloginbutton.jsp" %>

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
		<li class="login"><a href="#">Hello, Guest LOGIN</a>
		<form method="post" action="login">		
			<p>
				<label>Username</label>
				<input class="field" type="text" name="user_name">
			</p>
			
			<p>
				<label>Password</label>
				<input class="field" type="password" name="password" value="">
			</p>
			
			
			<p class="submit">
				<button type="submit" name="sign in" id="send">Sign in</button>
				<span><input type="checkbox" name="keep signed in">Keep me signed in</span>
				<br>Not an user yet ? <a href="register">register</a>
			</p>
		</form>
		</li>
		</div>
</div>

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
	<hr><hr><hr><hr><hr><hr>
</div>
<div class="comment_tweet">Comments from Twitter <hr><hr><hr><hr>
	<hr><hr><hr><hr></div><br>
<div class="comment_fb">Comments from Facebook<hr><hr><hr>
	<hr><hr><hr><hr></div>
<div>
<%@ include file="footer.jsp" %>
</div>
</body>
</html>
