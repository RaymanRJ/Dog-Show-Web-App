function addEventListeners(){
	$("tr").each(function(){
		$(this).on("click", submitForm);
	});
	
	$("#remove-listener").off("click", submitForm); // Remove Event Listener from header row.
}

function submitForm(){
	var dogID = $(this).data("value");
	
	$("#dog-number").val(dogID);
	
	$("#view-dog-form").submit();
}

addEventListeners();