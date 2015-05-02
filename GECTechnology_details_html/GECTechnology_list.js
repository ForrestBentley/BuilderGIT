$(document).ready(function() {						// Document is ready
	$('#searchname').keyup(function() {				// searchname receives a keyup event
		var search_name_lower = $(this).val().toLowerCase();				// place the contents of the searchnamefield into the search_name variable
		var search_name = $(this).val();
		$('#technology_list td').removeClass('hilight');  // remove the hilight class from the list of names (remove all hilights)
		if  (jQuery.trim(search_name) != '') {		// check to see if a trimmed search_name is blank
			//var tech_data = $("#technology_list tr td").text().toLowerCase();
			//alert (tech_data);
			$("#technology_list td:contains('" + search_name +"')").addClass('hilight');    // hilight lines that contain search-name
			//if  (tech_data.indexOf(search_name) > -1) {
			//	$("#technology_list td").addClass('hilight');
			//}
		}
		var Firsttime = true;
		var CellText = '';
		$("#tabledata tr").each(function() {
			if  (Firsttime) {
				Firsttime = false;
			}
			else {
				cellText = $.trim($(this).text()).toLowerCase();
				$(this).show();
				if (cellText.indexOf(search_name_lower) > -1) {
				}
				else {
					$(this).hide();
				}
			}
		});
	});	
});



