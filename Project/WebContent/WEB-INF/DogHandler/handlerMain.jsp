<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="..//MyTagLib.tld" prefix="f" %>

<!DOCTYPE html>
<html>
	<head>
	
		<title>2019 Toronto Dog Show</title>
		
		<meta name="viewport" content="width = device-width, initial-scale = 1">
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/Styles/style-main.css">
	</head>
	
	<body>
		<nav class="navbar fixed-top navbar-expand-lg navbar-light bg-light h-5">
			<a class="navbar-brand" href="splash">
		    	<img src="Images/Icon-sm.png" width="30" height="30" alt="">
		  	</a>
		  	<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav mr-auto">
					<li class="nav-item">
					    <a class="nav-link py-0" href="home">Home</a>
					</li>
					<li class="nav-item">
						<a class="nav-link py-0" href="addDogForm">Add Competitor</a>
					</li>
					<li class="nav-item">
						<a class="nav-link py-0" href="viewDogs">View All Competitors</a>
					</li>
					<li class="nav-item">
					    <a class="nav-link py-0" href="searchForm">Search For Competitors</a>
					</li>
					<li class="nav-item">
						<a class="nav-link py-0" href="listDogs">List Dog Groupings</a>
					</li>
					<li class="nav-item">
						<a class="nav-link py-0" href="logout">Logout</a>
					</li>
				</ul>
			</div>
		</nav>
		
		<div class="jumbotron">
			<h1>2019 Toronto Dog Show</h1>
		</div>
		
		<h3>Your Dogs:</h3>
		
		<table class="table table-striped table-hover">
			<thead>
				<tr>
					<th>ID</th>
					<th>Owner Name</th>
					<th>Dog Name</th>
					<th>Breed</th>
					<th>Group</th>
					<th>Gender</th>
					<th>Class/Specialty</th>
					<th>Friday</th>
					<th>Saturday</th>
					<th>Sunday</th>
					</tr>
			</thead>
			
			<c:forEach var="dog" items="${dogBeans }">
					
				<f:DisplayHandlerDog dogBean="${dog }"/>
				
			</c:forEach>
		
		</table>
		
		<div class="btn-group" role="group">
			<a type="button" class="btn btn-primary" href="buildPage">Add Dog</a>
		  	<a type="button" class="btn btn-primary" href="logout">Logout</a>
		</div>
		
		<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
		<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
		<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
	</body>
</html>