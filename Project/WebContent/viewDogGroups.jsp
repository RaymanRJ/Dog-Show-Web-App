<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
	<head>
	
		<jsp:include page="Includes/Head.jsp"/>
		
	</head>
	
	<body>
	
		<jsp:include page="Includes/Nav.jsp"/>
		<jsp:include page="Includes/Jumbotron.jsp"/>
		
		<!--
			HashMap : DogGroup - ArrayList<BreedBean>
			
				- ArrayList<BreedBean>
					total, breed, mlClss, fmlClss, mlSpcl, fmlSpcl
		-->
		
		<div class="container">
		
			<c:forEach var="group" items="${dogMap.keySet() }">
			
				<div class="card mb-5">
					<div class="card-body">
					
						<h6 class="text-left">${group.toString()}</h6>
						
						<table class="table">
							<c:forEach var="dogs" items="${dogMap.get(group)}">
									<tr>
										<td>${dogs.total }</td>
										<td>${dogs.breed }</td >
										<td>${dogs.mlClss } - ${dogs.fmlClss } - ${dogs.mlSpcl } - ${dogs.fmlSpcl }</td>
									</tr>
							</c:forEach>
						</table>
				  	</div>
				</div>
			
			</c:forEach>
		
		</div>

		<jsp:include page="Includes/Footer.jsp"/>
		
	</body>
</html>