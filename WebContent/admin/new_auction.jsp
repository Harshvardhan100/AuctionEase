<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>New Auction</title>
<%@ include file="allCss.jsp"%>
</head>
<body">

	<%@ include file="navbar.jsp"%>

	<div class="row">
		<div class="col-lg-12 text-center">
			<br> <br>
			<h2>ADD Item</h2>
		</div>

		<div class="container py-3">
			<div class="row">
				<div class="col-md-5 mx-auto">
					<c:if test="${not empty succMsg }">
						<h5 class="text-center text-danger">${succMsg }</h5>
						<c:remove var="failedMsg" scope="session" />
					</c:if>
					<c:if test="${not empty failedMsg }">
						<h5 class="text-center text-danger">${failedMsg }</h5>
						<c:remove var="failedMsg" scope="session" />
					</c:if>
					<form action="../AdminAddItem" method="post"
						enctype="multipart/form-data">
						<div class="form-group row">

							<label for="itemName">Item Name</label> <input name="itemName"
								type="text" class="form-control" id="itemName"
								placeholder="Enter Item Name">
						</div>

						<div class="form-group row">
							<label for="sellerName">Seller Id</label> <input name="sellerId"
								type="text" class="form-control" id="sellerName"
								placeholder="Enter Seller Id">
						</div>
						<div class="form-group row">
							<label for="price">Price</label> <input name="price" type="text"
								class="form-control" id="price"
								placeholder="Enter Starting Price">
						</div>
						<div class="form-group row">
							<label for="reservePrice">Reserve Price</label> <input
								name="reservePrice" type="text" class="form-control"
								id="reservePrice" placeholder="Enter reservePrice">
						</div>
						<div class="form-group row">
							<label for="startDate">Start Date</label> <input name="startDate"
								type="date" class="form-control" id="startDate">
						</div>
						<div class="form-group row">
							<label for="endDate">End Date</label> <input name="endDate"
								type="date" class="form-control" id="endDate">
						</div>
						<div class="form-group row">
							<label for="status">Status</label> <select name="status"
								type="text" class="form-control" id="istatus">
								<option selected>--select---</option>
								<option value="Active">Active</option>
								</options>
								<option value="Active">Inactive</option>
								</options>
							</select>
						</div>
						<div class="form-group row">
							<label for="description">Description</label>
							<textarea class="form-control" id="description" rows="5"
								name="description"></textarea>
						</div>
						<div class="form-group row">
							<label for="endDate">Choose Image</label> <input name="upload"
								type="file" class="form-control" id="upload">
						</div>
						<button type="submit" class="btn btn-primary">Submit</button>
					</form>

				</div>
			</div>
		</div>
	</div>

</body>
</html>