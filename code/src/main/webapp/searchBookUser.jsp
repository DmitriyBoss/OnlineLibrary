<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Search Book</title>
<style>
    <%@include file="/WEB-INF/style.css"%>
</style>
</head>
<body>

	<div class="four"><h1>Searching result</h1></div> 
	
	<div class="users-page">
  <div class="form">
	<table class="table_blur">
  <thead>
    <tr>
    <th>Id</th>
      <th>Title</th>
      <th>Author</th>
      <th>Action</th>
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
	<input type="hidden" name="command" value="bookBook" />
	<input type="hidden" name="book_id" value="${book.getId()}" />
	<button> to book </button>
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