<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>register</title>
<link rel="stylesheet" type="text/css" href="resources/css/main_page.css">
</head>
<body>
<script>
  window.fbAsyncInit = function() {
    FB.init({
      appId      : '299345053594392',
      xfbml      : true,
      version    : 'v2.1'
    });
  };

  (function(d, s, id){
     var js, fjs = d.getElementsByTagName(s)[0];
     if (d.getElementById(id)) {return;}
     js = d.createElement(s); js.id = id;
     js.src = "//connect.facebook.net/en_US/sdk.js";
     fjs.parentNode.insertBefore(js, fjs);
   }(document, 'script', 'facebook-jssdk'));
  
  function checkLoginState() {
	  FB.getLoginStatus(function(response) {
	    statusChangeCallback(response);
	  });
	}
  FB.logout(function(response) {
      // Person is now logged out
  });
  
  function statusChangeCallback(response) {
	    console.log('statusChangeCallback');
	    console.log(response);
	    console.log(response.authResponse.accessToken);
	    console.log("suraj");
	    // The response object is returned with a status field that lets the
	    // app know the current login status of the person.
	    // Full docs on the response object can be found in the documentation
	    // for FB.getLoginStatus().
	    if (response.status === 'connected') {
	      // Logged into your app and Facebook.
	      //testAPI();
	      console.log(response.authResponse.accessToken);
	      console.log(response.name);
	    } else if (response.status === 'not_authorized') {
	      // The person is logged into Facebook, but not your app.
	      document.getElementById('status').innerHTML = 'Please log ' +
	        'into this app.';
	        } else {
	      // The person is not logged into Facebook, so we're not sure if
	      // they are logged into this app or not.
	      document.getElementById('status').innerHTML = 'Please log ' +
	        'into Facebook.';
	    }
	  }
</script>
<div class="relogin">
<form method="post" action="login">	
<table class="register_page">	
		<p>Sorry ! Could not find you with the login details entered. 
		Please try again. If you are not registered yet, you can register yourself by entering few details on the right side.<p>	
				<tr><td><label>Username</label></td>
				<td><input class="field" type="text" name="user_name"></td></tr>
				<tr><td><label>Enter Password</label></td>
				<td><input class="field" type="password" name="password" value=""></td></tr>
				<tr><td colspan="2" ><p class="submit">
				<button type="submit" name="sign in" id="sign in">Log In</button>
				<br>
				<span><input type="checkbox" name="keep signed in">Send me occasional product updates on the products i like</span>
			</p></td></tr>
				</table>
				<fb:login-button scope="public_profile,email" onlogin="checkLoginState();"></fb:login-button>
	</form>
</div>
<div class="main_register">
<form method="post" action="enroll">	
<p> Registering is easy !</p>
			<table class="register_page">	
				<tr><td><label>First Name</label></td>
				<td><input class="field" type="text" name="firstName"></td></tr>
		        <tr><td><label>Last Name</label></td>
				<td><input class="field" type="text" name="lastName"></td></tr>
				<tr><td><label>Username</label></td>
				<td><input class="field" type="text" name="userName"></td></tr>
				<tr><td><label>Enter Password</label></td>
				<td><input class="field" type="password" name="password" value=""></td></tr>
				
				<tr><td><label>Re-enter Password</label></td>
				<td><input class="field" type="password" name="re-password" value=""></td></tr>
				<tr><td><label>Email Id</label></td>
				<td><input class="field" type="text" name="emailId" value=""></td></tr>
				<tr><td><label>Country</label></td>
				<td>
				<select>
  					<option value="volvo">Volvo</option>
  					<option value="saab">Saab</option>
  					<option value="mercedes">Mercedes</option>
  					<option value="audi">Audi</option>
				</select></td></tr>
				<tr><td colspan="2" ><p class="submit">
				 <input type="radio" name="gender" value="male">Male
				 <input type="radio" name="gender" value="female">Female
				 
				</td></tr>
				<tr><td colspan="2" ><p class="submit">
				 <input type="checkbox" name="gender" value="male">Male
				 <input type="checkbox" name="gender" value="female">Female 
				 
				</td></tr>
				<tr><td colspan="2" ><p class="submit">
				
				<button type="submit" name="register" id="register">Register</button>
				<br>
				<span><input type="checkbox" name="keep signed in">Send me occasional product updates on the products i like</span>
			</p></td></tr>
				</table>
		</form>
		
		<fb:login-button scope="public_profile,email" onlogin="checkLoginState();">
		
</fb:login-button>
<div
  class="fb-like"
  data-share="true"
  data-width="450"
  data-show-faces="true">
</div>
</div>
<div>
<%@ include file="footer.jsp" %>
</div>
</body>
</html>