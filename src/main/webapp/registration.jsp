<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
 
 
 <title>Registration Form</title>
  <meta charset="utf-7">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
  <script src="https://cdn.jsdelivr.net/npm/jquery@3.7.1/dist/jquery.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>


</head>


<body>
<div class="container">
  <h2> Registration Form </h2>
  
  <form action="registrationServlet" method ="post">
	
 <h3>${xyz}</h3>
 <img alt="registration page" src="images/registrationi.jpg" style = "height: 150px">
  
   
    <div class="form-group">
      <label for="username">username</label>
      <input type="text" class="form-control" placeholder="Enter name" name="username">
    </div>
    
    <div class="form-group">
      <label for="password">password</label>
      <input type="text" class="form-control" placeholder="Enter password" name="password">
    </div>
    
    <div class="form-group">
      <label for="fname">fullname</label>
      <input type="text" class="form-control" placeholder="Enter fullname" name="fullname">
    </div>
    
        <div class="form-group">
      <label for="email">email</label>
      <input type="email"class ="form-control" placeholder = "Enter email" name="email">
    </div>
    
      <div class="form-group">
      <label for="address">address</label>
      <input type="text"class ="form-control" placeholder = "Enter address"  name="address">
    </div>
   
    <button type="submit" class="btn btn-success">Register</button>
  
  
  </form>
</div>




</body>
</html>