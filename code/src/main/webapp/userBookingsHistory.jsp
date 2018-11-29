<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Bookings</title>
<style>
    <%@include file="/WEB-INF/style.css"%>
</style>
</head>
<body>

<div class="four"><h1>Here is your bookings' history</h1></div> 

<div class="userss-page">
  <div class="form">

<table class="table_blur">
  <thead>
    <tr>
    <th>Id</th>
      <th>Taking date</th>
      <th>Book</th>
      <th>Cancel</th>
    </tr>
  </thead>
  <tbody>
     <c:forEach items= "${showBookings}" var="booking">
       <tr>
         <td>${booking.getId()}</td>
         <td>${booking.getDateBooking()}</td>
         <td>${booking.getBook()}</td>
         <td> 
         <form action="MainServlet" method="GET">
	<input type="hidden" name="command" value="cancelBooking" />
	<input type="hidden" name="booking_id" value="${booking.getId()}" />
	<button> cancel </button>
	</form>
	</td>
       </tr>
     </c:forEach>
  </tbody>
</table>

<br/>
<p class="message"> 
  <hr/>
	<a  href="user.jsp">Back to user page</a>
  </p>

</div>
</div>
</body>
</html>