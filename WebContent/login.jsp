<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<%@ include file="admin/allCss.jsp"%>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Login Page</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
<style>
body {
	font-family: Arial, sans-serif;
	background-image: url('images/cover.jpg');
	background-size: cover;
	background-position: center;
	height: 100vh;
	margin: 0;
	display: flex;
	justify-content: center;
	align-items: center;
}

</style>
</head>
<body>
	<div class="login-box">
		<h2>Signup</h2>
		<c:if test="${not empty successMsg }">
		<h5 class="text-center text-success">${successMsg }</h5>
		<c:remove var="failedMsg" scope="session"/>
		</c:if>
		<c:if test="${not empty failedMsg }">
		<h5 class="text-center text-danger">${failedMsg }</h5>
		<c:remove var="failedMsg" scope="session"/>
		</c:if>
		<form action="Login" method="post">
			<label for="username">Username:</label> <br> <input type="text"
				id="username" name="username" placeholder="Enter Username"><br>

			<label for="password">Password:</label><br> <input
				type="password" id="password" name="password"
				placeholder="Enter Password"><br>
			
			
			<input type="submit" value="Login"> <br> <br> <a
				href="CreateProfile" class="btnCreateProfile">Create account</a>
		</form>
	</div>
</body>
</html>