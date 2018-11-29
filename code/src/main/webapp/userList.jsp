<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Show Users</title>
<style>
    <%@include file="/WEB-INF/style.css"%>
</style>
</head>
<body>

<div class="four"><h1>Here are all users</h1></div>

<div class="user-page">
  <div class="form">
<table class="table_blur" class="login-form">
  <thead>
    <tr>
    <th>Id</th>
      <th>Name</th>
      <th>Surname</th>
      <th>Email</th>
      <th>Login</th>
    </tr>
  </thead>
  <tbody>
     <c:forEach items= "${showUserList}" var="user">
       <tr>
         <td>${user.getId()}</td>
         <td>${user.getName()}</td>
         <td>${user.getSurname()}</td>
         <td>${user.getEmail()}</td>
         <td>${user.getLogin()}</td>
       </tr>
     </c:forEach>
  </tbody>
</table>

<p class="message"> 
  <hr/>
	<a  href="admin.jsp">Back to the main page</a>
  </p>

</body>
</html>