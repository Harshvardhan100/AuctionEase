<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Seller:home</title>
<%@include file="allCss.jsp"%>
<style text="text/css">
a {
	text-decoration: none;
	color: black;
}

a:hover {
	text-decoration: none;
	color: black;
}
</style>
</head>
<body>
     <%@ include file="navbar.jsp"%>
	<div class="container">
		<div class="row p-5">
			<div class="col-md-3">
				<a href="new_auction.jsp">
					<div class="card">
						<div class="card-body text-center text-primary">
							<i class="fa-solid fa-plus text-warning"></i><br>
							<h4>Add Item</h4>
						</div>
					</div>
				</a>
			</div>

			<div class="col-md-3">
				<a href="bidding_details.jsp">
					<div class="card">
						<div class="card-body text-center text-primary">
							<i class="fa-solid fa-arrow-up-right-dots text-success"></i><br>

							<h4>Bidding details</h4>
						</div>
					</div>
				</a>
			</div>
			<div class="col-md-3">
				<a href="index.jsp">
					<div class="card">
						<div class="card-body text-center text-primary">
							<i class="fa-solid fa-right-from-bracket text-danger"></i><br>
							<h4>Logout</h4>
						</div>
					</div>
				</a>
			</div>
			
		</div>
	</div>
     
</body>
</html>