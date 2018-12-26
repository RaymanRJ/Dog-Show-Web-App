<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
	
		<jsp:include page="Includes/Head.jsp"/>
		
		<style>
			#map {
				height: 400px;
				background-color: grey;
			}
			
			body{
				margin-top: 3%
			}
			.card{
				width: 40rem;
				text-align:center;
			}
			
			.carousel{
				margin-top: 10%;
				margin-bottom: 5%;
			}
		</style>
	</head>
	
	<body>
	
		<jsp:include page="Includes/Nav.jsp"/>
		<jsp:include page="Includes/Jumbotron.jsp"/>
		
		<div class="container">
		
			<div class="card mx-auto">
				<a href="home">
					<img class="card-img-top" src="Images/SplashPage/Icon.png"/>
				</a>
				<div class="card-body">
					<h5 class="card-title">Toronto's BIGGEST Show!</h5>
					<p class="card-text">Come watch the fierce competition!</p>
					<a href="home" class="btn btn-primary">Enter</a>
				</div>
			</div>		
			
			<div id="myCarousel" class="carousel slide" data-ride="carousel">

			  <ol class="carousel-indicators">
			    <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
			    <li data-target="#myCarousel" data-slide-to="1"></li>
			  </ol>

			  <div class="carousel-inner">
			    <div class="carousel-item active">
			  		<div class="card mx-auto">
						<div class="card-body">
							<div id="map"></div>
						</div>
					</div>
			    </div>
			    <div class="carousel-item">
			    	<div class="card mx-auto">
			    		<img src="Images/SplashPage/Schedule.png">
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
		
		<script>
			// Initialize and add the map
			function initMap() {
			  // The location of TMCC
			  var tmcc = {lat: 43.64383755, lng: -79.38669247414063};
			  // The map, centered at TMCC
			  var map = new google.maps.Map(
			      document.getElementById('map'), {zoom: 15, center: tmcc});
			  // The marker, positioned at TMCC
			  var marker = new google.maps.Marker({position: tmcc, map: map});
			}
    	</script>
    	<!-- INSERT API KEY INTO SCRIPT TAG BELOW -->
	    <script async defer
	    src="https://maps.googleapis.com/maps/api/js?key=API-KEY-HERE&callback=initMap">
	    </script>
	</body>
</html>