<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<%@include file="css/allCss.jsp"%>
<link rel="stylesheet" type="text/css" href="css/style.css">
<title>Home Page</title>
<style type="text/css">
.back-img {
	background: url('images/online-auction.jpg');
	height: 60vh;
	width: 100%;
	background-repeat: no-repeat;
	background-size: cover;
}
.crd.ho:hover{
background-color:#fcf7f7;
}
</style>
</head>

<body style="background-color:#f7f7f7">

	<%@include file="navbar.jsp"%>
	<div class="container-fluid back-img">
		<h2 class="text-center">AuctionEase</h2>
	</div>
	<div class="container">
		<h3 class="text-center">Live auction</h3>
		<div class="row">
		<div class="col-md-3">
		<div class="card-body crd-ho">
		<div class="card-body text-center">
		<img alt="" src="images/ballon.jpg" style="width: 150px; height:200px" class="img-thumblin">
		<p>Football</p>
		<p>Ritesh</p>
		<div class="row">
		<a href=" " class="btn btn-primary btn-sm ml-2">Add Cart</a>
		<a href=" " class="btn btn-primary btn-sm ml-2">Detail</a>
		<a href=" " class="btn btn-primary btn-sm ml-2">499</a>
		</div>
		</div>
		</div>
		</div>
		<div class="col-md-3">
		<div class="card-body crd-ho">
		<div class="card-body text-center">
		<img alt="" src="images/ecran.jpg" style="width: 150px; height:200px" class="img-thumblin">
		<p>Football</p>
		<p>Ritesh</p>
		<div class="row">
		<a href=" " class="btn btn-primary btn-sm ml-2">Add Cart</a>
		<a href=" " class="btn btn-primary btn-sm ml-2">Detail</a>
		<a href=" " class="btn btn-primary btn-sm ml-2">499</a>
		</div>
		</div>
		</div>
		</div>
		
		<div class="col-md-3">
		<div class="card-body crd-ho">
		<div class="card-body text-center">
		<img alt="" src="images/botte.jpg" style="width: 150px; height:200px" class="img-thumblin">
		<p>Botte</p>
		<p>Ritesh</p>
		<div class="row">
		<a href=" " class="btn btn-primary btn-sm ml-2">Add Cart</a>
		<a href=" " class="btn btn-primary btn-sm ml-2">Detail</a>
		<a href=" " class="btn btn-primary btn-sm ml-2">499</a>
		</div>
		</div>
		</div>
		</div>
		
		<div class="col-md-3">
		<div class="card-body crd-ho">
		<div class="card-body text-center">
		<img alt="" src="images/cycle.jpg" style="width: 150px; height:200px" class="img-thumblin">
		<p>Football</p>
		<p>Ritesh</p>
		<div class="row">
		<a href=" " class="btn btn-primary btn-sm ml-2">Add Cart</a>
		<a href=" " class="btn btn-primary btn-sm ml-2">Detail</a>
		<a href=" " class="btn btn-primary btn-sm ml-2">499</a>
		</div>
		</div>
		</div>
		</div>
		</div>
		
		
		<div class="text-center mt-1">
		<a href="" class="btn btn-danger btn-sm text-white">View All</a>
		</div>
		
		</div>
		--end of live auction
		
		<div class="container">
		<h3 class="text-center">Old Auction</h3>
		<div class="row">
		<div class="col-md-3">
		<div class="card-body crd-ho">
		<div class="card-body text-center">
		<img alt="" src="images/ballon.jpg" style="width: 150px; height:200px" class="img-thumblin">
		<p>Football</p>
		<p>Ritesh</p>
		<div class="row">
		<a href=" " class=" text-center btn btn-primary btn-sm mt-1">Winner Detail</a>
		</div>
		</div>
		</div>
		</div>
		<div class="col-md-3">
		<div class="card-body crd-ho">
		<div class="card-body text-center">
		<img alt="" src="images/ballon.jpg" style="width: 150px; height:200px" class="img-thumblin">
		<p>Football</p>
		<p>Ritesh</p>
		<div class="row">
		<a href=" " class="btn btn-primary btn-sm mt-1">Winner Detail</a>
		</div>
		</div>
		</div>
		</div>
		
		<div class="col-md-3">
		<div class="card-body crd-ho">
		<div class="card-body text-center">
		<img alt="" src="images/botte.jpg" style="width: 150px; height:200px" class="img-thumblin">
		<p>Botte</p>
		<p>Ritesh</p>
		<div class="row">
		<a href=" " class="btn btn-primary btn-sm ml-2">Winner Detail</a>
		</div>
		</div>
		</div>
		</div>
		
		<div class="col-md-3">
		<div class="card-body crd-ho">
		<div class="card-body text-center">
		<img alt="" src="images/cycle.jpg" style="width: 150px; height:200px" class="img-thumblin">
		<p>Football</p>
		<p>Ritesh</p>
		<div class="row">
		<a href=" " class="btn btn-primary btn-sm ml-7">Winner Detail</a>

		</div>
		</div>
		</div>
		</div>
		</div>
		
		
		<div class="text-center mt-1 ml-7">
		<a href="" class="btn btn-danger btn-sm text-white">View All</a>
		</div>
		
		</div>
		<br>
		
		<%@include file="footer.jsp"%>
		
		
		
	
</body>
</html>