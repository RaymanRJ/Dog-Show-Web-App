var inputID = "#search-criteria";
var searchType = "#search-type";
var questionHolder = "#search-question-content";

function addEventListeners(){
	$("a").each(function(){
		$(this).on("click", changeContent);
	});
}

function changeContent(){
	var elementId = $(this).attr("id");
	var question;
	var hidden;

	switch(elementId){
		case 'ID-search':
			question="<input type='number' class='form-control' name='search-question' placeholder='Enter ID' min='100'>";
			hidden="<input type='hidden' name='search-topic' value='ID'>";
			break;
		case 'DogName-search':
			question="<input type='text' class='form-control' name='search-question' placeholder='Enter Dog Name'>";
			hidden="<input type='hidden' name='search-topic' value='dog-name'>";
			break;
		case 'Owner-search':
			question="<input type='text' class='form-control' name='search-question' placeholder='Enter Owner Name'>";
			hidden="<input type='hidden' name='search-topic' value='owner-name'>";
			break;
		case 'Breed-search':
			question="<input type='text' class='form-control' name='search-question' placeholder='Enter Breed'>";
			hidden="<input type='hidden' name='search-topic' value='dog-breed'>";
			break;
		default:
			question="<select class='custom-select' name='search-question'>";
			question=question.concat("<option selected disabled value=''>Choose...</option>");
			question=question.concat("<option value='sporting'>Sporting</option>");
			question=question.concat("<option value='hounds'>Hounds</option>");
			question=question.concat("<option value='working'>Working</option>");
			question=question.concat("<option value='terriers'>Terriers</option>");
			question=question.concat("<option value='toys'>Toys</option>");
			question=question.concat("<option value='non-sporting'>Non-Sporting</option>");
			question=question.concat("<option value='herding'>Herding</option>");
			question=question.concat("</select>");
			hidden="<input type='hidden' name='search-topic' value='dog-group'>";
			break;
	}

	$(questionHolder).html(question + hidden);
}

addEventListeners();