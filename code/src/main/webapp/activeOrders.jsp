<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>New Bookings</title>
<style>
    <%@include file="/WEB-INF/style.css"%>
</style>
</head>
<body>

<div class="four"><h1>Here are all active orders</h1></div>

<div class="table-page">
  <div class="form">

<table class="table_blur" class="login-form">
  <thead>
    <tr>
    <th>Id</th>
      <th>Taking date</th>
      <th>Title</th>
      <th>Name</th>
      <th>Surname</th>
      <th>Was returned</th>
    </tr>
  </thead>
  <tbody>
     <c:forEach items="${showActiveOrders}" var="order">
       <tr>
         <td>${order.getId()}</td>
         <td>${order.getDateTaking()}</td>
         <td>${order.getBook()}</td>
         <td>${order.getName()}</td>
         <td>${order.getSurname()}</td>
         <td> 
         <form action="MainServlet" method="GET">
	<input type="hidden" name="command" value="wasReturned" />
	<input type="hidden" name="order_id" value="${order.getId()}" />
	<button> was returned </button>
	</form>
	</td>
       </tr>
     </c:forEach>
  </tbody>
</table>

</div>
</div>

</body>
</html>