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

<div class="four"><h1>Here are all books</h1></div>

<div class="hello-page">
  <div class="form">

<table class="table_blur" class="login-form">
  <thead>
    <tr>
    <th>Id</th>
      <th>Title</th>
      <th>Author</th>
      <th>Delete</th>
    </tr>
  </thead>
  <tbody>
     <c:forEach items="${showBookList}" var="book">
       <tr>
         <td>${book.getId()}</td>
         <td>${book.getName()}</td>
         <td>${book.getAuthor()}</td>
         <td> 
         <form action="MainServlet" method="GET">
	<input type="hidden" name="command" value="deleteBook" />
	<input type="hidden" name="book_id" value="${book.getId()}" />
	<button> delete </button>
	</form>
	</td>
       </tr>
     </c:forEach>
  </tbody>
</table>
	<br/>
	<hr/>
	<p class="message"> 
  
	<a  href="admin.jsp">Back to main page</a>
  </p>
	
</div>
</div>
</body>
</html>