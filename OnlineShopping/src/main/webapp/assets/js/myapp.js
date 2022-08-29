$(function() {
	console.log('--->' + menu);
	console.log(menu == 'All Products');
	//Solving the menu active problem
	switch (menu) {
		
		case 'About Us':
			console.log('--->' + menu);
			$('#about').addClass('active');
			break;
		case 'Contact Us':
			$('#contact').addClass('active');
			break;
		case 'All Products':
			$('#listProducts').addClass('active');
			break;
		default:
			$('#listProducts').addClass('active');
			$('#a_'+menu).addClass('active');
			break;
	}

});