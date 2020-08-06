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
			      <li><a href="http://localhost:8080/Pizzaria/home.jsp">Home</a></li>
			      <li><a href="#artigo7">Status dos Pedidos</a></li>
			      <li><a href="#artigo8">Deletar Produto</a></li>
			      <li><a href="#artigo9">Deletar Funcionario</a></li>
			  </ul>
			  <div class="clear"></div> 
	      </nav>
	  </div>h
      <section id="pagina-total">
		  
		  <div class="borda">
			  <article id="artigo7">
				  <div class="fundo-linha">
					  <div class="artigos">
							  <h2>STATUS DOS PEDIDOS</h2>
							  <p> <table border="1">
<tr>

<%
	
		ArrayList<String[]> pedidos = new DBHandler().Pedidos();
		int j=0;
        

		for(String[] p : pedidos) {
			String cliente = p[0];
			String produto = p[1];
			String status = p[2];
			
			%> 
        
					<br>
		
    <h2>Cliente: <%=cliente %>   </h2> 
    Produto: <%=produto %>
    ------------------> <%=status%>
			<br>
					
										
			<%
			j++;
		}
		%>
		</tr>
				<br>
		

</table></p><br/>
						  
							  
					  </div>
				  </div>
			  </article>
		  </div>
		  
		  <div class="borda">
			  <article id="artigo8">
				  <div class="fundo-linha">
					  <div class="artigos">
							  <h2>DELETAR PRODUTO</h2>
							 <form class="form" action="PDeletar"> 
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
							  				 
								  <p class="submit">  
								  
								  <input type="submit" value="Deletar" name="action" />  
								  <input type="submit" value="Cancelar" name="action" />  
								  </p>  
						    </form>
							  
							  
					  </div>
				  </div>
			  </article>
		  </div>
		  
		  <div class="borda">
			  <article id="artigo9">
				  <div class="fundo-linha">
					  <div class="artigos">
							  <h2>DELETAR FUNCIONARIO</h2>
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
								    if(cookie.getName().equals("user")) userName = cookie.getValue();
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
								
								String ifFunc = null;
								//String sessionID = null;
								Cookie[] cookies2 = request.getCookies();
								if(cookies !=null){
								for(Cookie cookie : cookies2){
								    if(cookie.getName().equals("id")) ifFunc = cookie.getValue();
								    if(cookie.getName().equals("JSESSIONID")) sessionID = cookie.getValue();
								}
								}								
								
								%>
								<%=userName %>
								<%=ifFunc %>
								
								 </p>
								<p>Voce deseja deletar seu cadastro? --></p>
								<p>
								</p>
								</div>
								
							    <form class="form" action="FDeletar">
							  				 
								  <p class="submit">  
								  
								  <input type="submit" value="Deletar" name="action" />  
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