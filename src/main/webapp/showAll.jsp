<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
				<tr bgcolor="orange">
					<th>Username</th>
					<th>Password</th>
					<th>fullname</th>
					<th>email</th>
					<th>address</th>
				</tr>
			</thead>
			<tbody>

				<c:forEach items="${userList}" var="tempa">

					<tr bgcolor="sky blue">
						<td>${tempa.username}</td>
						<td>${tempa.password}</td>
						<td>${tempa.fullname}</td>
						<td>${tempa.email}</td>
						<td>${tempa.address}</td>
					</tr>

				</c:forEach>

			</tbody>
		</table>
		<a href="login.jsp"><button type="button" class="btn btn-success">Click here toget all the results</button></a>
		<a href="login.jsp"><button type="button" class="btn btn-success">Click here to go back to Login Page</button></a>
		

	</div>


</body>
</html>