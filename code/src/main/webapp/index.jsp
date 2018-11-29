<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html >
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>Sign in</title>
  <style>
    <%@include file="/WEB-INF/style.css"%>
</style>
</head>
<body>

<div class="four"><h1>Welcome to online library</h1></div>

<div class="login-page">
  <div class="form">
<form name="LoginForm" method="POST" action="MainServlet" class="login-form">
  <input type="hidden" name="command" value="signInForm"/>
  <input type="text" name="login" placeholder="login"/>
  <input type="password" name="password" placeholder="password"/>
  <button>sign in</button>
  <!--  <input type="submit" value="Log in"/>-->
  <p class="message">
  <br/>If you don't have account 
  <a href="registration.jsp">Create account</a>
  </p>
</form>
<hr/>
</div>
</div>
</body>
</html>

	<!--  Hello user!!!
	<form action="MainServlet" method="post">
		<input type="hidden" name="action" value="test" /> 
		<input type="submit" value="test jsp" />
	</form>
	
	<form action="MainServlet" method="post">
		<input type="hidden" name="action" value="test2" /> 
		<input type="submit" value="test jsp 2" />
	</form> -->
