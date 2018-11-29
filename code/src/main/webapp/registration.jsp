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

<div class="login-page">
  <div class="form">
<form name="SignUpForm" method="POST" action="MainServlet" class="login-form">
<input type="hidden" name="command" value="signUpForm"/>
<input type="text" name="name" placeholder="name"/>
<input type="text" name="surname" placeholder="surname"/>
<input type="text" name="email" placeholder="email"/>
<input type="text" name="login" placeholder="login"/>
<input type="password" name="password" placeholder="password"/>
<br/>
<hr/>
<button>sign up</button>
</form>
</div>
</div>
</body>
</html>