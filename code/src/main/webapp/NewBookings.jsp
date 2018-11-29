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

<div class="four"><h1>Here are new bookings</h1></div>

<div class="sec-page">
  <div class="form">
<table class="table_blur" class="login-form">
  <thead>
    <tr>
    <th>Id</th>
      <th>Booking date</th>
      <th>Title</th>
      <th>Name</th>
      <th>Surname</th>
      <th>Accept</th>
      <th>Reject</th>
    </tr>
  </thead>
  <tbody>
     <c:forEach items="${showNewBookings}" var="booking">
       <tr>
         <td>${booking.getId()}</td>
         <td>${booking.getDateBooking()}</td>
         <td>${booking.getBook()}</td>
         <td>${booking.getName()}</td>
         <td>${booking.getSurname()}</td>
         <td> 
         <form action="MainServlet" method="GET">
	<input type="hidden" name="command" value="accept" />
	<input type="hidden" name="booking_id" value="${booking.getId()}" />
	<button> accept </button>
	</form>
	</td>
		<td> 
		<form action="MainServlet" method="GET">
	<input type="hidden" name="command" value="reject" />
	<input type="hidden" name="booking_id" value="${booking.getId()}" />
	<button> reject </button>
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