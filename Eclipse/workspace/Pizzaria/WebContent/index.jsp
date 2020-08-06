<%@page import="java.io.PrintWriter"%>
<%@page import="org.apache.coyote.Request"%>
<%@page import="Pizzaria.Cadastra"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*,java.sql.*" %>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>

	<%@ page import="Pizzaria.DBHandler"%> 
	


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html lang="pt-br">
<head>
    <title>PIZZARIA DELIVERY</title>
    <meta charset="UTF-8">
    <link rel="shortcut icon" href="image/favicon.ico">
	<link href="css/styles.css" rel="stylesheet" type="text/css" media="all">
<!-- Habilitando o HTML5 no IE: -->
	<!--[if IE]-->
		<script src="http://html5shiv.googlecode.com/svn/trunk/html5.js"></script>
		<style type="text/css">

			.clear {
				zoom: 1;
				display: block;
			}

		</style>
	<!--[endif]-->

	<link   rel="stylesheet" href="css/skitter.styles.css" />
	<link   rel="stylesheet" href="css/jquery.lightbox-0.5.css" />
	<script src="js/jquery-1.11.1.min.js"></script>
	<script src="js/jquery.skitter.min.js"></script>
	<script src="js/jquery.easing.1.3.js"></script>
	<script src="js/jquery.animate-colors-min.js"></script>
	<script src="js/jquery.lightbox-0.5.js"></script>

<!-- Init Plugin -->
<script>

	$(document).ready(function() {
		$(".box_skitter_large").skitter({
			focus_position: 'center'
			
		});
	});

	
	function redimensiona(id_alvo){
		document.images[id_alvo].width=60;
		document.images[id_alvo].height=60;
	}	
	
	$(function() {
		$('#artigo3 a').lightBox()
	});
</script>
</head>
<body>
      <header>
	       <h1>Pizzaria Do Grupo 15</h1>
	  </header>
	  <div class="nav-total">
	      <nav>
		      <ul>
			      <li><a href="#">Home</a></li>
			      <li><a href="#artigo1">Cardapio</a></li>
				  <li><a href="#artigo2">Monte Sua Pizza</a></li>
				  <li><a href="#artigo3">Galeria</a></li>
				  <li><a href="#artigo5">Contato</a></li>
				  <li><a href="#artigo7">Meu Pedido</a></li>
			  </ul>
			  <div class="clear"></div> 
	      </nav>
	  </div>
      <section id="pagina-total">
			<div id="box-slide">
				<section id="slide">
					<section id="slide-centro">
						<div class="box_skitter box_skitter_large">
							<ul>
								<li>
									<a href="#"><img src="img/galeria-01.jpg" class="cut" /></a>
									<div class="label_text"><p>Deliciosas pizzas</p></div>
								</li>
								<li>
									<a href="#"><img src="img/galeria-05.jpg" class="swapBlocks" /></a>
									<div class="label_text"><p>Monte a Sua</p></div>
								</li>
								<li>
									<a href="#"><img src="img/galeria-8.jpg" class="swapBarsBack" /></a>
									<div class="label_text"><p>Venha Conhecer</p></div>
								</li>
							</ul>
						</div>
					</section>
				</section>
			</div>

		  <div class="borda">
			  <article id="artigo1">
				  <div class="fundo-linha">
					  <div class="artigos">
							  <h2>CARDAPIO</h2>
							 <form class="form" action="Escolher"> 
							  <p> <table border="1">
<tr>

<%
	
		ArrayList<String> menu = new DBHandler().Menu();
        ArrayList<String> valormenu = new DBHandler().ValorMenu();
		int i=0;
        
		for(String m : menu) {
			String [] test = valormenu.toArray(new String[valormenu.size()]);
			
			
			%> 
	<input type="checkbox" name="escolhecardapio" value='<%=m%>'>
			<%=m%>   ------------------------------------------------------------------------------------------------------  R$ <%=test[i]%>
		
		<br>
					
										
			<%
			i++;
		}
		%>
		</tr>
				<br>
		

</table></p><br/>
 									<p class="submit" >  
								  <input type="submit" value="Escolher" />  
								  </p>  
								  </form>
							  
							  
					  </div>
				  </div>
			  </article>
		  </div>
		  
		  <div class="borda">
		 
			  <article id="artigo2">
				  <div class="fundo-linha">
					  <div class="artigos" >
					
								
								  <h2>MONTE A SUA</h2>
							 <form class="form" action="Montar"> 	
		  							<p class="nomepizza">  
									  <input type="text" name="nomepizza" id="nomepizza" />  
									  <label for="nomepizza">Nome da SUA PIZZA!</label>  
								  </p> 
								<BR><BR>
			

<table border="1" >

<tr>

<%
	
		ArrayList<String> tests = new DBHandler().Cardapio();

		for(String s : tests) {
			%> 
			
		<input type="checkbox" name="checkMonte" value='<%=s%>'>
					<input type='text' name='nome_incr' id='nome_incr' value='<%=s%>'/>
										
			<%
		}
		%>
		</tr>
				<br>
		

</table>

 
 									<p class="submit" >  
								  <input type="submit" value="Montar" />  
								  </p>  
								  </form>
							  </p><br>
							  
						
							</div>  
					  </div>
				  </div>
			  </article>
		  </div>
		  
		  <div class="borda">
			  <article id="artigo3">
				  <div class="fundo-linha">
					  <div class="artigos">
							  <h2>GALERIA</h2>
							    <p>Que beleza de pizzas!!</p>
								<br><br>
							    <p>
									<ul>
										<li><a rel="lightbox" href="img/galeria-02.jpg"><img onload="redimensiona('g2');" id="g2" src="img/galeria-02.jpg" alt=""/></a></li>
										<li><a rel="lightbox" href="img/galeria-01.jpg"><img onload="redimensiona('g1');" id="g1" src="img/galeria-01.jpg" alt=""/></a></li>
										<li><a rel="lightbox" href="img/galeria-03.jpg"><img onload="redimensiona('g3');" id="g3" src="img/galeria-03.jpg" alt=""/></a></li>
										<li><a rel="lightbox" href="img/galeria-07.jpg"><img onload="redimensiona('g7');" id="g7" src="img/galeria-07.jpg" alt=""/></a></li>
									</ul>
										<br>
									<ul>
										<li><a rel="lightbox" href="img/galeria-04.jpg"><img onload="redimensiona('g4');" id="g4" src="img/galeria-04.jpg" alt="" /></a></li>
										<li><a rel="lightbox" href="img/galeria-05.jpg"><img onload="redimensiona('g5');" id="g5" src="img/galeria-05.jpg" alt="" /></a></li>
										<li><a rel="lightbox" href="img/galeria-06.jpg"><img onload="redimensiona('g6');" id="g6" src="img/galeria-06.jpg" alt="" /></a></li>
										<li><a rel="lightbox" href="img/galeria-8.jpg"><img onload="redimensiona('g8');" id="g8" src="img/galeria-8.jpg" alt=""/></a></li>
									</ul>
								
							
								
								
					  </div>
				  </div>
			  </article>
		  </div>
		  
		  <div class="borda">
			  <article id="artigo4">
				  <div class="fundo-linha">
					  <div class="artigos">
							<h2>Login</h2>
							 <div id="contato">
							
							  <p>Faça seu login Aqui do lado!</p>
							  <p>Aproveite o nosso Serviço!</p>
							  </div>
 							<form class="form" action="Logar">  
							 
								  <p class="email">  
									  <input type="text" name="email" id="email" />  
									  <label for="email">E-mail</label>  
								  </p>  
								   <p class="senha">  
									  <input type="password" name="senha" id="senha" />  
									  <label for="senha">Password</label>  
								  </p>  
 
								  <p class="submit">  
								  <input type="submit" value="Logar" />  
								  </p>  
								  
								  <br>
									<br>
							 <center><a href="#artigo6">Cadastrar</a></center>
								
							 </form>  
			 
					  </div>
				  </div>
			  </article>
		  </div>
		  
		  <div class="borda">
			  <article id="artigo5">
				  <div class="fundo-linha">
					  <div class="artigos">
							  <h2>CONTATO</h2>
							  <div id="contato">
								  <ul class="redes"> 
									  <li><a class='titulo' target="_blank" title="Facebook" href="https://www.facebook.com/rybakovas">f</a></li>
									  <li><a class='titulo' target="_blank" title="Google+" rel="publisher" href="https://plus.google.com/u/0/111445115100524918717/posts">g</a></li>
								  </ul>
							  <p>Gostou da novidade? Gostou do site? Então entre em contato! Meu facebook e Google+ estão ai em cima, é só clicar em um dos icones! =)</p>
							  <p> Caso prefira um contato mais formal, me envie um email utilizando o formulário ao lado! -> </p>
							  </div>
							  <form class="form">  
								  <p class="name">  
									  <input type="text" name="name" id="name" />  
									  <label for="name">Nome</label>  
								  </p>  
								  <p class="email">  
									  <input type="text" name="email" id="email" />  
									  <label for="email">E-mail</label>  
								  </p>  
						 
								  <p class="text">  
									 <textarea name="text"></textarea>  
								  </p>  
								  <p class="submit">  
								  <input type="submit" value="Send" />  
								  </p>  
							 </form>  
					  </div>
				  </div>
			  </article>
		  </div>
		  
		  		  <div class="borda">
			  <article id="artigo6">
				  <div class="fundo-linha">
					  <div class="artigos">
							  <h2>CADASTRAR</h2>
							<div id="contato">
							
							  <p>Ainda Não tem o seu Login?</p>
							  <p>Se Cadastre aqui do lado --></p>
							  <p>Aproveite o nosso Serviço!</p>
							  </div>
							  <form class="form" action="Cadastra">  
								<p class="name">   
									  <input type="text" name="name" id="name" />  
									  <label for="name">Nome</label>  
								 </p>  
								 <p class="Sobrenome">   
									  <input type="text" name="sobrenome" id="Sobrenome" />  
									  <label for="sobrenome">Sobrenome</label>  
								 </p> 
								  <p class="email">  
									  <input type="text" name="email" id="email" />  
									  <label for="email">E-mail</label>  
								  </p>  
								   <p class="Endereco">  
									  <input type="text" name="endereco" id="Endereco" />  
									  <label for="endereco">Endereco</label>  
								  </p>  
 
								 <p class="cel">   
									  <input type="text" name="cel" id="cel" />  
									  <label for="cel">Celular</label>  
								 </p> 
								  <p class="senha">  
									  <input type="password" name="senha" id="senha" />  
									  <label for="senha">Password</label>  
								  </p>  
						
 
								  <p class="submit">  
								  <input type="submit" value="Cadastrar" />  
								  </p>  
							 </form>  
				
					  </div>
				  </div>
			  </article>
		  </div>
    
      
      	  		  <div class="borda">
			  <article id="artigo7">
				  <div class="fundo-linha">
					  <div class="artigos">
							  <h2>MEU PEDIDO</h2>
<div id="contato">
								<p>Olá  <%

								//allow access only if session exists
								String user = null;
								if(session.getAttribute("user") == null){
								    response.sendRedirect("home.jsp");
								}else 
									user = (String) session.getAttribute("user");
								
								String userName = null;
								String sessionID = null;
								Cookie[] cookies = request.getCookies();
								if(cookies !=null){
								for(Cookie cookie : cookies){
								    if(cookie.getName().equals("user"))
								    	userName = cookie.getValue();
								    if(cookie.getName().equals("JSESSIONID")) sessionID = cookie.getValue();
								}
								}								
								
								%>
								
								<%

								//allow access only if session exists
								String id = null;
								if(session.getAttribute("id") == null){
								    response.sendRedirect("home.jsp");
								}else 
									user = (String) session.getAttribute("user");
								
								String idCli = null;
								//String sessionID = null;
								Cookie[] cookies2 = request.getCookies();
								if(cookies !=null){
								for(Cookie cookie : cookies2){
								    if(cookie.getName().equals("id")) idCli = cookie.getValue();
								    if(cookie.getName().equals("JSESSIONID")) sessionID = cookie.getValue();
								}
								}								
								
								%>
								<%=userName %>
								
								
								 </p>
								<p>O Seu Pedido Está Listado Ao Lado! --></p>
								<p>Gostaria de Comprar ou Cancelar o seu Pedido?</p>
								<p>
								</p>
								</div>
								
										 <form class="form" action="Comprar">
							  <p> <table border="1">
<tr>

<h2>Seu Pedido Até o Momento:</h2>
			<br>
<%
	
		ArrayList<String> pedido = new DBHandler().IdPedido(idCli);
       
		int j=0;
		
		for(String m : pedido) {
						
			
			%> 
			
			
			<%=m%>
		
		<br>
					
										
			<%
			
		}
		%>
		
	
		</tr>
				<br>
		
<h2>Total:</h2>
			<br>
<%

								//allow access only if session exists
							
								
								String valorTotal = null;
								//String sessionID = null;
								Cookie[] ValorPizza = request.getCookies();
								if(cookies !=null){
								for(Cookie cookie : cookies2){
								    if(cookie.getName().equals("valorTotal")) valorTotal = cookie.getValue();
								    if(cookie.getName().equals("JSESSIONID")) sessionID = cookie.getValue();
								}
								}								
								
								%>
								R$ <%=valorTotal %>
		
	
		</tr>
				<br>

</table></p><br/>
								
								</p>
					 
								  <p class="submit">  
								  <input type="submit" value="Comprar" name="action" />  
								  <input type="submit" value="Cancelar" name="action" />  
								  </p>  
						    </form>
						
				
					  </div>
				  </div>
			  </article>
		  </div>
      </section>
      
	  <div id="rodape-total">
		  <footer>
			 <!--script src="js/jquery.scrollTo.js"></script-->
			 <script src="js/ScrollScript.js"></script>
			 <small class="copy">Copyright© 2014 Site feito por Victor Rybakovas RA: 08091134</small>
			 <a href="#" class="up"><img src="img/up.png"/></a>
		  </footer>
      </div>

</body>
</html>