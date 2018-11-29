<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Admin</title>
<style>
    <%@include file="/WEB-INF/style.css"%>
</style>
</head>
<body>

	<div class="four"><h1>Welcome to admin's main page</h1></div>
<div class="login-page">
  <div class="form">
  	
  <p class="message">
  <br/>Actions with users: </p>
  
	<form action="MainServlet" method="GET" class="login-form">
	<input type="hidden" name="command" value="showUserList" />
	<button>user list</button>
	<!-- <input type="submit" value="showUserList"/>  -->
	</form>
	
	<p class="message">
  <br/>Actions with books: </p>
	<form action="MainServlet" method="GET" class="login-form">
	<input type="hidden" name="command" value="showBookListAdmin" />
	<button>book list</button>
	</form>
	
	<p class="message"> 
  <a  href="createBook.jsp"><button>create book</button></a>
  </p>
	
	<p class="message">
  <br/>Actions with bookings and orders: </p>
	
	<form action="MainServlet" method="GET" class="login-form">
	<input type="hidden" name="command" value="showNewBookings" />
	<button>new bookings</button>
	</form>
	
	<br>
	
	<form action="MainServlet" method="GET" class="login-form">
	<input type="hidden" name="command" value="showActiveBookings" />
	<button>active bookings</button>
	</form>
	
	<br>
	
	<form action="MainServlet" method="GET" class="login-form">
	<input type="hidden" name="command" value="showActiveOrders" />
	<button>active orders</button>
	</form>


<p>

<p class="message"> 
  <hr/>
	<a  href="index.jsp">Logout</a>
  </p>
	</div>
</div>
</body>
</html>