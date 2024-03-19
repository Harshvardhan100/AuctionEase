<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<%@ include file="allCss.jsp"%>
<meta charset="ISO-8859-1">
<title>Admin:Bidding Details</title>
</head>
<body>
<%@ include file="navbar.jsp"%>

<div class="row">
		<div class="col-lg-12 text-center">
			<br>
			<br>
			<h2>List of Bids made by user</h2>
		</div>

<table class="table">
  <thead class="bg-primary">
    <tr>
      <th scope="col">Seller Id</th>
      <th scope="col">Item Name</th>
      <th scope="col">Bid amount</th>
      <th scope="col">user</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <th scope="row">1</th>
      <td>Tv</td>
      <td>1000</td>
      <td>@mdo</td>
    </tr>
    <tr>
      <th scope="row">2</th>
      <td>Cycle</td>
      <td>2000</td>
      <td>@fat</td>
    </tr>
    <tr>
      <th scope="row">3</th>
      <td>Phone</td>
      <td>3000</td>
      <td>@twitter</td>
    </tr>
        
  </tbody>
</table>
<div style="margin-top:150px;">
<%@ include file="footer.jsp"%></div>
</body>
</html>