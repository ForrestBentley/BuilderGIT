$('.hover').mousemove(function (obj) {
	//alert('movemove');
	//$('#coord').text("X:" + obj.clientX + "-Y:"+ obj.clientY);				// show the coordinates of the mouse (relative to the page)
	
	var textforhover = $(this).attr('hovertext');								// get the text to display from the current object
	//alert(textforhover);
	$('#hoverdiv').text(textforhover).show();									// change the text and show the text
	$('#hoverdiv').css('top',obj.pageY+5).css('left', obj.pageX+5);			    // change the top and left properties of the text
	
}).mouseout(function () {
	$('#hoverdiv').hide();
});
	




