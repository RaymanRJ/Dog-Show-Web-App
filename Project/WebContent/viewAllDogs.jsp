<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="WEB-INF/MyTagLib.tld" prefix="f" %>

<!DOCTYPE html>
<html>
	<head>
	
		<jsp:include page="Includes/Head.jsp"/>
		
	</head>
	
	<body>
	
		<jsp:include page="Includes/Nav.jsp"/>
		<jsp:include page="Includes/Jumbotron.jsp"/>

		<div class="container">

			<table class="table table-striped table-hover">
				<thead>
					<tr id="remove-listener">
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

				<form method="POST" action="viewDog" id="view-dog-form">
				
					<c:forEach  var="dog" items="${dogs }">
					
						<f:DisplayDog dogBean="${dog }"/>
						
					</c:forEach>
					
					<input type="hidden" value="" name="dog-number" id="dog-number">
				</form>
				
			</table>
		</div>

		<jsp:include page="Includes/Footer.jsp"/>
		<script src="Scripts/view-script.js"></script>	
	</body>
</html>