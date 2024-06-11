<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<title>Congratulation Page</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

</head>
<body>

	<div class="container">
		<h2>Congratulations!</h2>

		<table class="table table-hover">
			<thead>
				<tr bgcolor ="orange">
					<th>Username</th>
					<th>Password</th>
					<th>fullname</th>
					<th>email</th>
					<th>address</th>
				</tr>
			</thead>
			<tbody>
			
			<tr bgcolor ="sky blue">
				<td>${userObj.username}</td>
				<td>${userObj.password}</td>
				<td>${userObj.fullname}</td>
				<td>${userObj.email}</td>
				<td>${userObj.address}</td>
			</tr>

			</tbody>
		</table>
		<a href = "FetchingAllRecords" ><button type="button" class="btn btn-success">Click here to get all the results </button> </a>
		  
	</div>


</body>
</html>