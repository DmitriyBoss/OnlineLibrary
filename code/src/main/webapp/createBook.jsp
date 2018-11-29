<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create Book</title>
<style>
    <%@include file="/WEB-INF/style.css"%>
</style>
</head>
<body>

<div class="four"><h1>Create new book</h1></div>

<div class="login-page">
  <div class="form">
<form action="MainServlet" method="GET" class="login-form">
	<input type="hidden" name="command" value="createBook" />
	
    <input type="text" name="createTitle" placeholder="title"/>
    
    <input type="text" name="createAuthorId" placeholder="author"/>
    
    <input type="text" name="createAmount" placeholder="amount"/>
    <br/>
	<button>create</button>
	</form>

</div>
</div>

</body>
</html>