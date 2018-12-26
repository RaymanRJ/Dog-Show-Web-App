<!DOCTYPE html>
<html lang="en">
	<head>
		
		<jsp:include page="Includes/Head.jsp"/>
		
	</head>
	<body>
		
		<jsp:include page="Includes/Nav.jsp"/>
		<jsp:include page="Includes/Jumbotron.jsp"/>

		<div class="container">

			<form method="post" action="addDog">
				<div class="form-group row">

					<div class="card">
						<div class="card-body">
						    <h5 class="card-title">Register Competitor</h5>
						    <p class="card-text">Enter your dog's information for competition. All fields are required. Upon completion, your dog will receive a registration number for competition.</p>
						</div>
					</div>

				</div>
				<div class="form-group row">
				    <label for="inputDogName" class="col-sm-3 col-form-label">Dog Name:</label>
				    <div class="col-sm-6">
				      <input type="text" class="form-control" id="dog-name" name="dog-name" placeholder="Dog Name" required autofocus>
				    </div>
				</div>
				<div class="form-group row">
				    <label for="inputOwnerName" class="col-sm-3 col-form-label">Owner Name:</label>
				    <div class="col-sm-6">
				      <input type="text" class="form-control" id="owner-name" name="owner-name" placeholder="Owner Name" required>
				    </div>
				</div>
				<div class="form-group row">
				    <label for="inputOwnerEmail" class="col-sm-3 col-form-label">Email:</label>
				    <div class="col-sm-6">
				      <input type="email" class="form-control" id="owner-email" name="owner-email" placeholder="Email Address" required>
				    </div>
				</div>
				<div class="form-group row">
				    <label for="inputDogBreed" class="col-sm-3 col-form-label">Dog Breed:</label>
				    <div class="col-sm-6">
				      <input type="text" class="form-control" id="dog-breed" name="dog-breed" placeholder="Dog Breed" required="true">
				    </div>
				</div>
				<div class="form-group row">
				    <label class="col-sm-3 col-form-label" for="DogGroup">Dog Group:</label>
				    <div class="col-sm-4">
						<select class="form-control" id="dog-group" name="dog-group" required>
					        <option value="" disabled selected>Choose...</option>
					        <option value="Sporting">Sporting</option>
					        <option value="Hounds">Hounds</option>
					        <option value="Working">Working Dogs</option>
					        <option value="Terriers">Terriers</option>
					        <option value="Toys">Toys</option>
					        <option value="Non-Sporting">Non-Sporting</option>
					        <option value="Herding">Herding</option>
					    </select>
				  	</div>
				  	<div class="col-sm-3">
						<div class="btn-group btn-group-toggle" data-toggle="buttons">
					    	<label class="btn btn-primary btn-lg">
					        	<input type="radio" name="dog-gender" id="dog-gender" value="Male" required> Male
					     	</label>
					      	<label class="btn btn-primary btn-lg">
					        	<input type="radio" name="dog-gender" id="dog-gender" value="Female"> Female
					      	</label>	
						</div>
					</div>
				</div>
				<div class="form-group row">
					<label class="col-sm-3 col-form-label" for="dogSpeciality">Dog Specialty:</label>
					<div class="col-sm-6">
						<select class="form-control" id="dog-speciality" name="dog-speciality" required>
					        <option value="" disabled selected>Choose...</option>
					        <option value="Class">Class</option>
					        <option value="Speciality">Specialty</option>
					    </select>
					</div>
				</div>
				<div class="form-group row" id="red">
					<label class="col-sm-3 col-form-label" for="dogShowDates">Dog Shows:</label>
					<div class="col-sm-6">
						<div class="form-check form-check-inline">
						  <input class="form-check-input show-date" type="checkbox" id="inlineCheckbox1" name="friday" value="friday">
						  <label class="form-check-label" for="inlineCheckbox1">Friday</label>
						</div>
						<div class="form-check form-check-inline">
						  <input class="form-check-input show-date" type="checkbox" id="inlineCheckbox2" name="saturday" value="saturday">
						  <label class="form-check-label" for="inlineCheckbox2">Saturday</label>
						</div>
						<div class="form-check form-check-inline">
						  <input class="form-check-input show-date" type="checkbox" id="inlineCheckbox3" name="sunday" value="sunday">
						  <label class="form-check-label" for="inlineCheckbox3">Sunday</label>
						</div>
					</div>
				</div>
				<div class="form-group row">
					<div class="col-sm-2"></div>
					<div class="col-sm-8">
						<button type="submit" class="btn btn-primary btn-lg btn-block" id="submit-btn">Add Dog</button><br>
						<a  href="home" class="btn btn-primary btn-sm btn-block">Cancel</a>
					</div>
					<div class="col-sm-2"></div>
				</div>

			</form>
		</div>
	
		<jsp:include page="Includes/Footer.jsp"/>
		<script src="Scripts/add-dog-script.js"></script>
	</body>
</html>