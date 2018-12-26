<!DOCTYPE html>
<html>
	<head>
	
		<jsp:include page="Includes/Head.jsp"/>
		
	</head>
	
	<body>
	
		<jsp:include page="Includes/Nav.jsp"/>
		<jsp:include page="Includes/Jumbotron.jsp"/>

		<div class="container">

			<form method="post" action="searchDogs">
				
				<div class="form-group row">
					<div class="card">
						<div class="card-body">
						    <h5 class="card-title">Search For Comptetitor</h5>
						    <p class="card-text">Choose Search Criteria.</p>
						</div>
					</div>
				</div>

				<div class="form-group row">
					<div class="btn-group mx-auto">
						<a class="btn btn-primary btn-lg m-1" data-toggle="collapse" href="#collapse-question-card" role="button" aria-expanded="false" id="ID-search">
				    		ID Number
				  		</a>
					  	<a class="btn btn-primary btn-lg m-1" data-toggle="collapse" href="#collapse-question-card" role="button" aria-expanded="false" id="DogName-search">
						    Dog Name
						</a>
						<a class="btn btn-primary btn-lg m-1" data-toggle="collapse" href="#collapse-question-card" role="button" aria-expanded="false" id="Owner-search">
							Owner Name
						</a>
						<a class="btn btn-primary btn-lg m-1" data-toggle="collapse" href="#collapse-question-card" role="button" aria-expanded="false" id="Breed-search">
						    Breed
						</a>
						<a class="btn btn-primary btn-lg m-1" data-toggle="collapse" href="#collapse-question-card" role="button" aria-expanded="false" id="Group-search">
						    Group
						</a>
					</div>
				</div>

				<div class="collapse" id="collapse-question-card">
				  <div class="card card-body" id="form-question">
				  	<p id="search-question-content"></p>
					<button class="btn btn-primary" type="submit">Search</button>
				  </div>
				</div>
				
			</form>
		</div>

		<jsp:include page="Includes/Footer.jsp"/>
		<script src="Scripts/search-script.js"></script>
	</body>
</html>