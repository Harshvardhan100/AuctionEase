<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin:Add Seller</title>
<%@ include file="allCss.jsp" %>
</head>
<body>
<%@ include file="navbar.jsp"%>
    
	<div class="row">
		<div class="col-lg-12 text-center">
			<br>
			<br>
			<h2>Add Seller</h2>
		</div>

		<div class="container py-3">
			<div class="row">
				<div class="col-md-5 mx-auto">


					<form action="../AddSeller" method="post"
						>
						<div class="form-group row">

							<label for="itemName">Seller Name</label> <input name="fullname"
								type="text" class="form-control" id="itemName"
								placeholder="Enter Seller Name">
						</div>

						<div class="form-group row">
							<label for="sellerName">Seller Email</label> <input
								name="username" type="text" class="form-control"
								id="sellerName" placeholder="Enter Seller Email">
						</div>
						<div class="form-group row">
							<label for="price">Password</label> <input name="password" type="password"
								class="form-control" id="price"
								placeholder="Enter Enter Password">
						</div>
						<div class="form-group row">
							<label for="reservePrice">Phone</label> <input
								name="phone" type="text" class="form-control"
								id="reservePrice" placeholder="Enter Phone">
						</div>
						<button type="submit" class="btn btn-primary">Submit</button>
					</form>

				</div>
			</div>
		</div>
	</div>
<%@include file="footer.jsp" %>

</body>
</html>