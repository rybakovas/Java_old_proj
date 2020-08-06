package Pizzaria;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Escolher
 */
@WebServlet("/Escolher")
public class Escolher extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Escolher() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
	
			HttpSession session = request.getSession();  
			
		String[] escolhecardapio = request.getParameterValues("escolhecardapio");
		String sessionID = null;
		String id = null;
		if(session.getAttribute("id") == null){
		    response.sendRedirect("home.jsp");
		}else 
			id = (String) session.getAttribute("id");
		
		String idCli = null;
		//String sessionID = null;
		Cookie[] cookies2 = request.getCookies();
		if(cookies2 !=null){
		for(Cookie cookie : cookies2){
		    if(cookie.getName().equals("id")) idCli = cookie.getValue();
		    if(cookie.getName().equals("JSESSIONID")) sessionID = cookie.getValue();
		}
		}
		PrintWriter out = response.getWriter();

			Float Valor = new DBHandler().Escolher(escolhecardapio,idCli);
			
			String strValor=String.valueOf(Valor);
			
			session.setAttribute("valorTotal",strValor); 
			
			session.setMaxInactiveInterval(30*60);
            Cookie ValorPizza = new Cookie("valorTotal",strValor);
            ValorPizza.setMaxAge(30*60);
            response.addCookie(ValorPizza);
            
			new DBHandler().IdPedido(idCli);

			
			

			out.println("<html>");

			out.println("<head>");

			out.println("<title>Redirecionamento</title>");

			out.println("</head>");

			out.println("<body>");

			out.println("<script language= 'JavaScript'>");
			out.println("location.href='http://localhost:8080/Pizzaria/index.jsp#artigo7'");
			out.println("</script>");

			out.println("</body>");

			out.println("</html>");

		}

	}


