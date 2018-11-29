<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>User</title>
<style>
    <%@include file="/WEB-INF/style.css"%>
</style>
</head>
<body>

<div class="four"><h1>Welcome to your personal account</h1></div>
	
<div class="login-page">
  <div class="form">	
<form action="MainServlet" method="GET" class="login-form">
		<input type="hidden" name="command" value="showBookList" /> 
		<button>book list</button>
</form>

<br>

<form action="MainServlet" method="GET" class="login-form">
<input type="hidden" name="command" value="searchBook"/> 
<input type="text" name="bookValue" placeholder="book or author"/>
<button>search</button>
</form>

<br>

<form action="MainServlet" method="GET" class="login-form">
<input type="hidden" name="command" value="showOrdersHistory"/>
<button>orders' history</button>
</form>

<br>

<form action="MainServlet" method="GET" class="login-form">
<input type="hidden" name="command" value="showBookingsHistory"/>
<button>bookings' history</button>
</form>

<p class="message"> 
  <hr/>
	<a  href="index.jsp">Logout</a>
  </p>

</body>
</html>