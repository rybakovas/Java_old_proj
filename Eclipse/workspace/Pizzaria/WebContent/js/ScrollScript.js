$(document).ready(function(){
	//Essa parte do código só será chamada assim que a página estiver toda carregada. 
	
	$('nav a,footer a.up').click(function(e){

										  
		// scrolla até o hash do link clicado.
		
		$.scrollTo( this.hash || 0, 500);
		e.preventDefault();
	});

});


jQuery("document").ready(function($){
    
    var nav = $('.nav-total');
    
    $(window).scroll(function () {
        if ($(this).scrollTop() > 100) {
            nav.addClass("f-nav");
        } else {
            nav.removeClass("f-nav");
        }
    });
 
});