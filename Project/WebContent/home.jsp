<!DOCTYPE html>

<!--
	Rayman Jamal
	991488809

	PROG 32758
	Jonathan Penava

	Nov. 18, 2018
-->

<html lang="en">
	<head>
	
		<jsp:include page="Includes/Head.jsp"/>
		
	</head>
	
	<body>
	
		<jsp:include page="Includes/Nav.jsp"/>
		<jsp:include page="Includes/Jumbotron.jsp"/>

		<div class="container">

			<div id="myCarousel" class="carousel slide" data-ride="carousel">

			  <ol class="carousel-indicators">
			    <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
			    <li data-target="#myCarousel" data-slide-to="1"></li>
			    <li data-target="#myCarousel" data-slide-to="2"></li>
			    <li data-target="#myCarousel" data-slide-to="3"></li>
			    <li data-target="#myCarousel" data-slide-to="4"></li>
			    <li data-target="#myCarousel" data-slide-to="5"></li>
			  </ol>

			  <div class="carousel-inner">
			    <div class="carousel-item active">
			      <img src="Images/Main/1.jpg" alt="First slide">
			      <div class="carousel-caption">
			        <h3>Welcome!</h3>
			      </div>
			    </div>
			    <div class="carousel-item">
			      <img src="Images/Main/6.jpg" alt="Sixth slide">
			      <div class="carousel-caption">
			        <a href="genDogs"><h3>Generate 100 Dogs</h3></a>
			      </div>
			    </div>
			    <div class="carousel-item">
			      <img src="Images/Main/2.jpg" alt="Second slide">
			      <div class="carousel-caption">
			        <a href="addDogForm"><h3>Add Competitor</h3></a>
			      </div>
			    </div>
			    <div class="carousel-item">
			      <img src="Images/Main/3.jpg" alt="Third slide">
			      <div class="carousel-caption">
			        <a href="viewDogs"><h3>View All Competitors</h3></a>
			      </div>
			    </div>
			    <div class="carousel-item">
			      <img src="Images/Main/4.jpg" alt="Fourth slide">
			      <div class="carousel-caption">
			        <a href="searchForm"><h3>Search For a Competitor</h3></a>
			      </div>
			    </div>
			    <div class="carousel-item">
			      <img src="Images/Main/5.jpg" alt="Fifth slide">
			      <div class="carousel-caption">
			        <a href="listDogs"><h3>List Dog Groupings</h3></a>
			      </div>
			    </div>
			  </div>

			  <a class="carousel-control-prev" href="#myCarousel" role="button" data-slide="prev">
			    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
			    <span class="sr-only">Previous</span>
			  </a>
			  <a class="carousel-control-next" href="#myCarousel" role="button" data-slide="next">
			    <span class="carousel-control-next-icon" aria-hidden="true"></span>
			    <span class="sr-only">Next</span>
			  </a>
			</div>
		</div>
		
		<jsp:include page="Includes/Footer.jsp"/>

	</body>
</html>