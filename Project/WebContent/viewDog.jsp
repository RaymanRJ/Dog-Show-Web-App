<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
	
		<jsp:include page="Includes/Head.jsp" />
	
	</head>
	
	<body>
	
		<jsp:include page="Includes/Nav.jsp" />
		<jsp:include page="Includes/Jumbotron.jsp" />
	
		<div class="container">
	
			<h3>${dogBean.dogName } the ${dogBean.dogBreed }</h3>
	
			<div class="card" style="width: 50em;">
				<img class="card-img-top" src="${pic }" alt="Card image cap">
			</div>
	
			<form method="POST">
				<table class="table table-striped">
					<tr>
						<th>ID:</th>
						<td>${dogBean.dogNumber }</td>
						<input type="hidden" name="dog-number" value="${dogBean.dogNumber }" id="dog-number">
					</tr>
					<tr>
						<th>Owner Name:</th>
						<td class="edit-text edit" data-value="owner-name">${dogBean.ownerName }</td>
					</tr>
					<tr>
						<th>Owner Email:</th>
						<td class="edit-text edit" data-value="owner-email">${dogBean.ownerEmail }</td>
					</tr>
					<tr>
						<th>Dog Name:</th>
						<td class="edit-text edit" data-value="dog-name">${dogBean.dogName }</td>
					</tr>
					<tr>
						<th>Breed</th>
						<td class="edit-text edit" data-value="dog-breed">${dogBean.dogBreed }</td>
					</tr>
					<tr>
						<th>Group</th>
						<td id="edit-group" class="edit" data-value="dog-group">${dogBean.dogGroup }</td>
					</tr>
					<tr>
						<th>Gender</th>
						<td id="edit-gender" class="edit" data-value="dog-gender">${dogBean.dogGender.toString() }</td>
					</tr>
					<tr>
						<th>Class/Specialty</th>
						<td id="edit-speciality" class="edit" data-value="dog-speciality">${dogBean.dogSpeciality.toString() }</td>
					</tr>
				</table>
				
				<div class="btn-group" role="group">
					<button type="button" class="btn btn-primary" id="edit-button">Edit Competitor</button>
					<button type="submit" class="btn btn-primary" id="save-button" formaction="updateDog">Save Changes</button>
					<button type="button" class="btn btn-primary" id="cancel-button">Cancel Changes</button>
					<button type="submit" class="btn btn-primary" id="delete-dog" formaction="deleteDog">Delete Competitor</button>
				</div>
			</form>
	
		</div>
		<jsp:include page="Includes/Footer.jsp" />
		<script src="Scripts/view-edit-dog.js"></script>
	</body>
</html>