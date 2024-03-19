<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Create Profile</title>
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

.container {
	width: 50%;
	margin: 0 auto;
	padding: 20px;
	background-color: #fff;
	border-radius: 5px;
	box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
	align
	="center";
}

h2 {
	text-align: center;
	margin-bottom: 20px;
}

.form-group {
	margin-bottom: 20px;
}

</style>
</head>
<body>
	<div class="container">
		<h2>Create Profile</h2>
		<c:if test="${not empty succMsg}">
		<p class="text-center text-success">${succMsg}</p>
		<c:remove var="succMsg" scope="session"/></c:if>
		<c:if test="${not empty failedMsg}">
		<p class="text-center text-success">${failedMsg}</p>
		<c:remove var="failedMsg" scope="session"/></c:if>
		<form action="RegisterServlet" method="post">
			<div class="form-group">
				<label for="username">Username:</label> <input type="text"
					name="username" placeholder="Enter Username">
			</div>
			<div class="form-group">
				<label for="password">Password:</label> <input type="password"
					id="password" name="password" placeholder="Enter Password">
			</div>
			<div class="form-group">
				<label for="fullname">Full Name:</label> <input type="text"
					id="fullname" name="fullname" placeholder="Full Name">
			</div>
			<div class="form-group">
				<label for="phone">Phone:</label> <input type="text" name="phone"
					placeholder="Enter Phone">
			</div>
			
			<div class="form-group">
				<input type="submit" value="Create Profile">
			</div>
		</form>
	</div>
</body>
</html>