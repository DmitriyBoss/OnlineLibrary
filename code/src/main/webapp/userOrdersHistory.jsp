<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Orders</title>
<style>
    <%@include file="/WEB-INF/style.css"%>
</style>
</head>
<body>
<div class="four"><h1>Here is your orders' history</h1></div> 


<div class="userss-page">
  <div class="form">
  
  <p class="message">
  <br/>Active orders: </p>
<table class="table_blur">
  <thead>
    <tr>
    <th>Id</th>
      <th>Taking date</th>
      <th>Book</th>
    </tr>
  </thead>
  <tbody>
     <c:forEach items= "${showActiveOrderList}" var="order">
       <tr>
         <td>${order.getId()}</td>
         <td>${order.getDateTaking()}</td>
         <td>${order.getBook()}</td>
       </tr>
     </c:forEach>
  </tbody>
</table>

<p class="message">
  <br/>Inactive orders: </p>

<table class="table_blur">
  <thead>
    <tr>
    <th>Id</th>
      <th>Taking date</th>
      <th>Book</th>
    </tr>
  </thead>
  <tbody>
     <c:forEach items="${showInactiveOrderList}" var="order">
       <tr>
       <td>${order.getId()}</td>
         <td>${order.getDateTaking()}</td>
         <td>${order.getBook()}</td>
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