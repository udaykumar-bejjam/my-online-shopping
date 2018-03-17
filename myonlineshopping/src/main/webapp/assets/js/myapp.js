$(function(){
	switch(menu){
	case 'About':
		$('#about').addClass('active');
		break;
	case 'Home':
		$('#home').addClass('active');
		break;
	case 'Contact':
		$('#contact').addClass('active');
		break;
	case 'All Products':
		$('#listproducts').addClass('active');
		break;
	default:
		$('#listproducts').addClass('active');
		$('#a_'+menu).addClass('active');
		break;		
	}
});