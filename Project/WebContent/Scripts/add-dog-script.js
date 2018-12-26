var submitBtn = $("#submit-btn");
var checkboxes = $(".show-date");


function addEventListeners(){
	submitBtn.each(function(){
		$(this).on("click", validateBoxes);
	});
}

function validateBoxes(){
	var submitForm = false;
	checkboxes.each(function(){
		if($(this).is(":checked")){
			$("form").submit();
			submitForm = true;
		}
	})
	
	if(!submitForm){

	    $("#red").css('border', '5px solid red');
	}
}


addEventListeners();