<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
	<head>
		<jsp:include page="../Includes/Head.jsp"/>
	</head>

	<body>
	
		<jsp:include page="../Includes/Nav.jsp"/>
		<jsp:include page="../Includes/Jumbotron.jsp"/>

		<h3 class="text-center">
			Login Here
		</h3>

		<form action="j_security_check" method="POST">
			<div class="form-group row">
			    <label for="inputUsername" class="col-sm-3 col-form-label">User Name:</label>
			    <div class="col-sm-6">
			      <input type="text" class="form-control" name="j_username" placeholder="User Name" required autofocus>
			    </div>
			</div>
			
			<div class="form-group row">
			    <label for="inputPassword" class="col-sm-3 col-form-label">Password:</label>
			    <div class="col-sm-6">
			      <input type="password" class="form-control" name="j_password" placeholder="Password" required>
			    </div>
			</div>
			
			<div class="form-group row">
				<div class="col-sm-2"></div>
				<div class="col-sm-8">
					<button type="submit" class="btn btn-primary btn-lg btn-block">Login</button><br>
					<a  href="home" class="btn btn-primary btn-sm btn-block">Cancel</a>
				</div>
				<div class="col-sm-2"></div>
			</div>

		</form>
	
		<jsp:include page="../Includes/Footer.jsp"/>
	</body>
</html>