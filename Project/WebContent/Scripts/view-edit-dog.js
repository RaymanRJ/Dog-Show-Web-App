var editmode = false;
var editBtn = $("#edit-button");
var saveBtn = $("#save-button");
var deleteBtn = $("#delete-dog");
var cancelBtn = $("#cancel-button");

function addEventListeners(){
	editBtn.on("click", editDog);
	deleteBtn.on("click", deleteDog);
	saveBtn.on("click", saveDog);
	cancelBtn.on("click", editDog);
}

function setVisibility(){
	editmode = false;
	editBtn.show();
	saveBtn.hide();
	deleteBtn.hide();
	cancelBtn.hide();
}


function editDog(){
	
	// Enter editmode
	if(!editmode){
		
		// Editmode for text-fields:
		
		$(".edit-text").each(function(){
			var placeholder = $(this).text();
			var inputname = $(this).data("value");
			
			$(this).data("text", placeholder);
			
			$(this).html(
					"<input type='text' name='"
					+ inputname
					+ "' placeholder='"
					+ placeholder
					+ "'value='"
					+ placeholder
					+ "' required/>"
			);
		});
		
		// Editmode for group (dropdown menu):

		var groupval = $("#edit-group").text();
		
		$("#edit-group").data("text", groupval);
		$("#edit-group").html(
			"<select class='form-control' id='dog-group' name='dog-group' required='true'>"
		    + "<option value='' disabled selected>Choose...</option>"
		    + "<option value='Sporting'>Sporting</option>"
		    + "<option value='Hounds'>Hounds</option>"
		    + "<option value='Working'>Working Dogs</option>"
		    + "<option value='Terriers'>Terriers</option>"
		    + "<option value='Toys'>Toys</option>"
		    + "<option value='Non-Sporting'>Non-Sporting</option>"
		    + "<option value='Herding'>Herding</option>"
		    + "</select>"
		);
		
		// Editmode for gender (2 buttons):
		
		var genderval = $("#edit-gender").text();
		
		$("#edit-gender").data("text", genderval);
		$("#edit-gender").html(
			"<div class='btn-group btn-group-toggle' data-toggle='buttons'>"
			+ "<label class='btn btn-primary btn-lg'>"
			+ "<input type='radio' name='dog-gender' id='dog-gender' value='Male' required> Male"
	     	+ "</label>"
	      	+ "<label class='btn btn-primary btn-lg'>"
	        + "<input type='radio' name='dog-gender' id='dog-gender' value='Female'> Female"
	      	+ "</label>"
	      	+ "</div>"
		);
		
		// Editmode for Speciality (2 buttons):
		
		var specval = $("#edit-speciality").text();
		
		$("#edit-speciality").data("text", specval);
		$("#edit-speciality").html(
				"<select class='form-control' id='dog-speciality' name='dog-speciality' required>"
			    + "<option value='' disabled selected>Choose...</option>"
			    + "<option value='Class'>Class</option>"
			    + "<option value='Speciality'>Specialty</option>"
			    + "</select>"
		);
		
		console.log("here");
		
		editBtn.hide();
		saveBtn.show();
		deleteBtn.show();
		cancelBtn.show();
		
		editmode = true;
		
	} else{
		// Triggered by pressing "cancel" Button

		// Return all fields to regular:
		
		$(".edit").each(function(){
			var text = $(this).data("text");
			
			$(this).html(text);
		});
		
		editBtn.show();
		saveBtn.hide();
		deleteBtn.hide();
		cancelBtn.hide();
		
		editmode = false;
	}
}


function deleteDog(){
}

function saveDog(){
	
}










addEventListeners();
setVisibility();