/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.55
 * Generated at: 2014-12-01 20:53:22 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Pizzaria.Cadastra;
import java.util.*;
import java.sql.*;
import Pizzaria.DBHandler;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t \r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("\r\n");
      out.write("<html lang=\"pt-br\">\r\n");
      out.write("<head>\r\n");
      out.write("    <title>PIZZARIA DELIVERY</title>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <link rel=\"shortcut icon\" href=\"image/favicon.ico\">\r\n");
      out.write("\t<link href=\"css/styles.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\">\r\n");
      out.write("<!-- Habilitando o HTML5 no IE: -->\r\n");
      out.write("\t<!--[if IE]-->\r\n");
      out.write("\t\t<script src=\"http://html5shiv.googlecode.com/svn/trunk/html5.js\"></script>\r\n");
      out.write("\t\t<style type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t.clear {\r\n");
      out.write("\t\t\t\tzoom: 1;\r\n");
      out.write("\t\t\t\tdisplay: block;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t</style>\r\n");
      out.write("\t<!--[endif]-->\r\n");
      out.write("\r\n");
      out.write("\t<link   rel=\"stylesheet\" href=\"css/skitter.styles.css\" />\r\n");
      out.write("\t<link   rel=\"stylesheet\" href=\"css/jquery.lightbox-0.5.css\" />\r\n");
      out.write("\t<script src=\"js/jquery-1.11.1.min.js\"></script>\r\n");
      out.write("\t<script src=\"js/jquery.skitter.min.js\"></script>\r\n");
      out.write("\t<script src=\"js/jquery.easing.1.3.js\"></script>\r\n");
      out.write("\t<script src=\"js/jquery.animate-colors-min.js\"></script>\r\n");
      out.write("\t<script src=\"js/jquery.lightbox-0.5.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- Init Plugin -->\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("\t$(document).ready(function() {\r\n");
      out.write("\t\t$(\".box_skitter_large\").skitter({\r\n");
      out.write("\t\t\tfocus_position: 'center'\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\tfunction redimensiona(id_alvo){\r\n");
      out.write("\t\tdocument.images[id_alvo].width=60;\r\n");
      out.write("\t\tdocument.images[id_alvo].height=60;\r\n");
      out.write("\t}\t\r\n");
      out.write("\t\r\n");
      out.write("\t$(function() {\r\n");
      out.write("\t\t$('#artigo3 a').lightBox()\r\n");
      out.write("\t});\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("      <header>\r\n");
      out.write("\t       <h1>Pizzaria Do Grupo 15</h1>\r\n");
      out.write("\t  </header>\r\n");
      out.write("\t  <div class=\"nav-total\">\r\n");
      out.write("\t      <nav>\r\n");
      out.write("\t\t      <ul>\r\n");
      out.write("\t\t\t      <li><a href=\"#\">Home</a></li>\r\n");
      out.write("\t\t\t      <li><a href=\"#artigo1\">Cardapio</a></li>\r\n");
      out.write("\t\t\t\t  <li><a href=\"#artigo2\">Monte Sua Pizza</a></li>\r\n");
      out.write("\t\t\t\t  <li><a href=\"#artigo3\">Galeria</a></li>\r\n");
      out.write("\t\t\t\t  <li><a href=\"#artigo4\">Login</a></li>\r\n");
      out.write("\t\t\t\t  <li><a href=\"#artigo5\">Contato</a></li>\r\n");
      out.write("\t\t\t  </ul>\r\n");
      out.write("\t\t\t  <div class=\"clear\"></div> \r\n");
      out.write("\t      </nav>\r\n");
      out.write("\t  </div>\r\n");
      out.write("     <section id=\"pagina-total\">\r\n");
      out.write("\t\t\t<div id=\"box-slide\">\r\n");
      out.write("\t\t\t\t<section id=\"slide\">\r\n");
      out.write("\t\t\t\t\t<section id=\"slide-centro\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"box_skitter box_skitter_large\">\r\n");
      out.write("\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"#\"><img src=\"img/galeria-01.jpg\" class=\"cut\" /></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"label_text\"><p>Deliciosas pizzas</p></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"#\"><img src=\"img/galeria-05.jpg\" class=\"swapBlocks\" /></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"label_text\"><p>Monte a Sua</p></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"#\"><img src=\"img/galeria-8.jpg\" class=\"swapBarsBack\" /></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"label_text\"><p>Venha Conhecer</p></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</section>\r\n");
      out.write("\t\t\t\t</section>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t  <div class=\"borda\">\r\n");
      out.write("\t\t\t  <article id=\"artigo1\">\r\n");
      out.write("\t\t\t\t  <div class=\"fundo-linha\">\r\n");
      out.write("\t\t\t\t\t  <div class=\"artigos\">\r\n");
      out.write("\t\t\t\t\t\t\t  <h2>CARDAPIO</h2>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t  <p> <table border=\"1\">\r\n");
      out.write("<tr>\r\n");
      out.write("\r\n");

	
		ArrayList<String> menu = new DBHandler().Menu();
        ArrayList<String> valormenu = new DBHandler().ValorMenu();
		int i=0;
        
		for(String m : menu) {
			String [] test = valormenu.toArray(new String[valormenu.size()]);
			
			
			
      out.write(" \r\n");
      out.write("\t\r\n");
      out.write("\t\t\t");
      out.print(m);
      out.write("   -------------------------------------------------  R$ ");
      out.print(test[i]);
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<br>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t");

			i++;
		}
		
      out.write("\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t\t\t<br>\r\n");
      out.write("\t\t\r\n");
      out.write("\r\n");
      out.write("</table></p><br/>\r\n");
      out.write("\t\t\t\t\t\t\t  \r\n");
      out.write("\t\t\t\t\t\t\t  \r\n");
      out.write("\t\t\t\t\t  </div>\r\n");
      out.write("\t\t\t\t  </div>\r\n");
      out.write("\t\t\t  </article>\r\n");
      out.write("\t\t  </div>\r\n");
      out.write("\t\t  \r\n");
      out.write("\t\t  <div class=\"borda\">\r\n");
      out.write("\t\t \r\n");
      out.write("\t\t\t  <article id=\"artigo2\">\r\n");
      out.write("\t\t\t\t  <div class=\"fundo-linha\">\r\n");
      out.write("\t\t\t\t\t  <div class=\"artigos\" >\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t  <h2>MONTE A SUA</h2>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write(" \t\t\t\t\t\t\t  <p>Favor Logar Para montar a sua Propria Pizza! </p>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</div>  \r\n");
      out.write("\t\t\t\t\t  </div>\r\n");
      out.write("\t\t\t\t  </div>\r\n");
      out.write("\t\t\t  </article>\r\n");
      out.write("\t\t  </div>\r\n");
      out.write("\t\t  \r\n");
      out.write("\t\t  <div class=\"borda\">\r\n");
      out.write("\t\t\t  <article id=\"artigo3\">\r\n");
      out.write("\t\t\t\t  <div class=\"fundo-linha\">\r\n");
      out.write("\t\t\t\t\t  <div class=\"artigos\">\r\n");
      out.write("\t\t\t\t\t\t\t  <h2>GALERIA</h2>\r\n");
      out.write("\t\t\t\t\t\t\t    <p>Que beleza de pizzas!!</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<br><br>\r\n");
      out.write("\t\t\t\t\t\t\t    <p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a rel=\"lightbox\" href=\"img/galeria-02.jpg\"><img onload=\"redimensiona('g2');\" id=\"g2\" src=\"img/galeria-02.jpg\" alt=\"\"/></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a rel=\"lightbox\" href=\"img/galeria-01.jpg\"><img onload=\"redimensiona('g1');\" id=\"g1\" src=\"img/galeria-01.jpg\" alt=\"\"/></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a rel=\"lightbox\" href=\"img/galeria-03.jpg\"><img onload=\"redimensiona('g3');\" id=\"g3\" src=\"img/galeria-03.jpg\" alt=\"\"/></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a rel=\"lightbox\" href=\"img/galeria-07.jpg\"><img onload=\"redimensiona('g7');\" id=\"g7\" src=\"img/galeria-07.jpg\" alt=\"\"/></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a rel=\"lightbox\" href=\"img/galeria-04.jpg\"><img onload=\"redimensiona('g4');\" id=\"g4\" src=\"img/galeria-04.jpg\" alt=\"\" /></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a rel=\"lightbox\" href=\"img/galeria-05.jpg\"><img onload=\"redimensiona('g5');\" id=\"g5\" src=\"img/galeria-05.jpg\" alt=\"\" /></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a rel=\"lightbox\" href=\"img/galeria-06.jpg\"><img onload=\"redimensiona('g6');\" id=\"g6\" src=\"img/galeria-06.jpg\" alt=\"\" /></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a rel=\"lightbox\" href=\"img/galeria-8.jpg\"><img onload=\"redimensiona('g8');\" id=\"g8\" src=\"img/galeria-8.jpg\" alt=\"\"/></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t  </div>\r\n");
      out.write("\t\t\t\t  </div>\r\n");
      out.write("\t\t\t  </article>\r\n");
      out.write("\t\t  </div>\r\n");
      out.write("\t\t  \r\n");
      out.write("\t\t  <div class=\"borda\">\r\n");
      out.write("\t\t\t  <article id=\"artigo4\">\r\n");
      out.write("\t\t\t\t  <div class=\"fundo-linha\">\r\n");
      out.write("\t\t\t\t\t  <div class=\"artigos\">\r\n");
      out.write("\t\t\t\t\t\t\t<h2>Login</h2>\r\n");
      out.write("\t\t\t\t\t\t\t<div id=\"contato\">\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t  <p>Faça seu login Aqui do lado!</p>\r\n");
      out.write("\t\t\t\t\t\t\t  <p>Aproveite o nosso Serviço!</p>\r\n");
      out.write("\t\t\t\t\t\t\t  </div>\r\n");
      out.write(" \t\t\t\t\t\t\t<form class=\"form\" action=\"Logar\">  \r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t  <p class=\"email\">  \r\n");
      out.write("\t\t\t\t\t\t\t\t\t  <input type=\"text\" name=\"email\" id=\"email\" />  \r\n");
      out.write("\t\t\t\t\t\t\t\t\t  <label for=\"email\">E-mail</label>  \r\n");
      out.write("\t\t\t\t\t\t\t\t  </p>  \r\n");
      out.write("\t\t\t\t\t\t\t\t   <p class=\"senha\">  \r\n");
      out.write("\t\t\t\t\t\t\t\t\t  <input type=\"password\" name=\"senha\" id=\"senha\" />  \r\n");
      out.write("\t\t\t\t\t\t\t\t\t  <label for=\"senha\">Password</label>  \r\n");
      out.write("\t\t\t\t\t\t\t\t  </p>  \r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t  <p class=\"submit\">  \r\n");
      out.write("\t\t\t\t\t\t\t\t  <input type=\"submit\" value=\"Logar\" />  \r\n");
      out.write("\t\t\t\t\t\t\t\t  </p>  \r\n");
      out.write("\t\t\t\t\t\t\t\t  \r\n");
      out.write("\t\t\t\t\t\t\t\t  <br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\t\t <center><a href=\"#artigo6\">Cadastrar</a></center>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t </form>  \r\n");
      out.write("\t\t\t \r\n");
      out.write("\t\t\t\t\t  </div>\r\n");
      out.write("\t\t\t\t  </div>\r\n");
      out.write("\t\t\t  </article>\r\n");
      out.write("\t\t  </div>\r\n");
      out.write("\t\t  \r\n");
      out.write("\t\t  <div class=\"borda\">\r\n");
      out.write("\t\t\t  <article id=\"artigo5\">\r\n");
      out.write("\t\t\t\t  <div class=\"fundo-linha\">\r\n");
      out.write("\t\t\t\t\t  <div class=\"artigos\">\r\n");
      out.write("\t\t\t\t\t\t\t  <h2>CONTATO</h2>\r\n");
      out.write("\t\t\t\t\t\t\t  <div id=\"contato\">\r\n");
      out.write("\t\t\t\t\t\t\t\t  <ul class=\"redes\"> \r\n");
      out.write("\t\t\t\t\t\t\t\t\t  <li><a class='titulo' target=\"_blank\" title=\"Facebook\" href=\"https://www.facebook.com/rybakovas\">f</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t  <li><a class='titulo' target=\"_blank\" title=\"Google+\" rel=\"publisher\" href=\"https://plus.google.com/u/0/111445115100524918717/posts\">g</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t  </ul>\r\n");
      out.write("\t\t\t\t\t\t\t  <p>Gostou da novidade? Gostou do site? Então entre em contato! Meu facebook e Google+ estão ai em cima, é só clicar em um dos icones! =)</p>\r\n");
      out.write("\t\t\t\t\t\t\t  <p> Caso prefira um contato mais formal, me envie um email utilizando o formulário ao lado! -> </p>\r\n");
      out.write("\t\t\t\t\t\t\t  </div>\r\n");
      out.write("\t\t\t\t\t\t\t  <form class=\"form\">  \r\n");
      out.write("\t\t\t\t\t\t\t\t  <p class=\"name\">  \r\n");
      out.write("\t\t\t\t\t\t\t\t\t  <input type=\"text\" name=\"name\" id=\"name\" />  \r\n");
      out.write("\t\t\t\t\t\t\t\t\t  <label for=\"name\">Nome</label>  \r\n");
      out.write("\t\t\t\t\t\t\t\t  </p>  \r\n");
      out.write("\t\t\t\t\t\t\t\t  <p class=\"email\">  \r\n");
      out.write("\t\t\t\t\t\t\t\t\t  <input type=\"text\" name=\"email\" id=\"email\" />  \r\n");
      out.write("\t\t\t\t\t\t\t\t\t  <label for=\"email\">E-mail</label>  \r\n");
      out.write("\t\t\t\t\t\t\t\t  </p>  \r\n");
      out.write("\t\t\t\t\t\t \r\n");
      out.write("\t\t\t\t\t\t\t\t  <p class=\"text\">  \r\n");
      out.write("\t\t\t\t\t\t\t\t\t <textarea name=\"text\"></textarea>  \r\n");
      out.write("\t\t\t\t\t\t\t\t  </p>  \r\n");
      out.write("\t\t\t\t\t\t\t\t  <p class=\"submit\">  \r\n");
      out.write("\t\t\t\t\t\t\t\t  <input type=\"submit\" value=\"Send\" />  \r\n");
      out.write("\t\t\t\t\t\t\t\t  </p>  \r\n");
      out.write("\t\t\t\t\t\t\t </form>  \r\n");
      out.write("\t\t\t\t\t  </div>\r\n");
      out.write("\t\t\t\t  </div>\r\n");
      out.write("\t\t\t  </article>\r\n");
      out.write("\t\t  </div>\r\n");
      out.write("\t\t  \r\n");
      out.write("\t\t  \t\t  <div class=\"borda\">\r\n");
      out.write("\t\t\t  <article id=\"artigo6\">\r\n");
      out.write("\t\t\t\t  <div class=\"fundo-linha\">\r\n");
      out.write("\t\t\t\t\t  <div class=\"artigos\">\r\n");
      out.write("\t\t\t\t\t\t\t  <h2>CADASTRAR</h2>\r\n");
      out.write("\t\t\t\t<div id=\"contato\">\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t  <p>Ainda Não tem o seu Login?</p>\r\n");
      out.write("\t\t\t\t\t\t\t  <p>Se Cadastre aqui do lado --></p>\r\n");
      out.write("\t\t\t\t\t\t\t  <p>Aproveite o nosso Serviço!</p>\r\n");
      out.write("\t\t\t\t\t\t\t  </div>\r\n");
      out.write("\t\t\t\t\t\t\t  <form class=\"form\" action=\"Cadastra\">  \r\n");
      out.write("\t\t\t\t\t\t\t\t<p class=\"name\">   \r\n");
      out.write("\t\t\t\t\t\t\t\t\t  <input type=\"text\" name=\"name\" id=\"name\" />  \r\n");
      out.write("\t\t\t\t\t\t\t\t\t  <label for=\"name\">Nome</label>  \r\n");
      out.write("\t\t\t\t\t\t\t\t </p>  \r\n");
      out.write("\t\t\t\t\t\t\t\t <p class=\"Sobrenome\">   \r\n");
      out.write("\t\t\t\t\t\t\t\t\t  <input type=\"text\" name=\"sobrenome\" id=\"Sobrenome\" />  \r\n");
      out.write("\t\t\t\t\t\t\t\t\t  <label for=\"sobrenome\">Sobrenome</label>  \r\n");
      out.write("\t\t\t\t\t\t\t\t </p> \r\n");
      out.write("\t\t\t\t\t\t\t\t  <p class=\"email\">  \r\n");
      out.write("\t\t\t\t\t\t\t\t\t  <input type=\"text\" name=\"email\" id=\"email\" />  \r\n");
      out.write("\t\t\t\t\t\t\t\t\t  <label for=\"email\">E-mail</label>  \r\n");
      out.write("\t\t\t\t\t\t\t\t  </p>  \r\n");
      out.write("\t\t\t\t\t\t\t\t   <p class=\"Endereco\">  \r\n");
      out.write("\t\t\t\t\t\t\t\t\t  <input type=\"text\" name=\"endereco\" id=\"Endereco\" />  \r\n");
      out.write("\t\t\t\t\t\t\t\t\t  <label for=\"endereco\">Endereco</label>  \r\n");
      out.write("\t\t\t\t\t\t\t\t  </p>  \r\n");
      out.write(" \r\n");
      out.write("\t\t\t\t\t\t\t\t <p class=\"cel\">   \r\n");
      out.write("\t\t\t\t\t\t\t\t\t  <input type=\"text\" name=\"cel\" id=\"cel\" />  \r\n");
      out.write("\t\t\t\t\t\t\t\t\t  <label for=\"cel\">Celular</label>  \r\n");
      out.write("\t\t\t\t\t\t\t\t </p> \r\n");
      out.write("\t\t\t\t\t\t\t\t  <p class=\"senha\">  \r\n");
      out.write("\t\t\t\t\t\t\t\t\t  <input type=\"password\" name=\"senha\" id=\"senha\" />  \r\n");
      out.write("\t\t\t\t\t\t\t\t\t  <label for=\"senha\">Password</label>  \r\n");
      out.write("\t\t\t\t\t\t\t\t  </p>  \r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write(" \r\n");
      out.write("\t\t\t\t\t\t\t\t  <p class=\"submit\">  \r\n");
      out.write("\t\t\t\t\t\t\t\t  <input type=\"submit\" value=\"Cadastrar\" />  \r\n");
      out.write("\t\t\t\t\t\t\t\t  </p>  \r\n");
      out.write("\t\t\t\t\t\t\t </form>  \r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\t  </div>\r\n");
      out.write("\t\t\t\t  </div>\r\n");
      out.write("\t\t\t  </article>\r\n");
      out.write("\t\t  </div>\r\n");
      out.write("      </section>\r\n");
      out.write("\t  <div id=\"rodape-total\">\r\n");
      out.write("\t\t  <footer>\r\n");
      out.write("\t\t\t <!--script src=\"js/jquery.scrollTo.js\"></script-->\r\n");
      out.write("\t\t\t <script src=\"js/ScrollScript.js\"></script>\r\n");
      out.write("\t\t\t <small class=\"copy\">Copyright© 2014 Site feito por Victor Rybakovas RA: 08091134</small>\r\n");
      out.write("\t\t\t <a href=\"#\" class=\"up\"><img src=\"img/up.png\"/></a>\r\n");
      out.write("\t\t  </footer>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}