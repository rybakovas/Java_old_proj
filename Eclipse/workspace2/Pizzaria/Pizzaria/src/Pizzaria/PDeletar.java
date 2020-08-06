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
@WebServlet("/PDeletar")
public class PDeletar extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public PDeletar() {
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

			new DBHandler().PDeletar(escolhecardapio);
			

			out.println("<html>");

			out.println("<head>");

			out.println("<title>Redirecionamento</title>");

			out.println("</head>");

			out.println("<body>");

			out.println("<script language= 'JavaScript'>");
			out.println("location.href='http://localhost:8080/Pizzaria/indexf.jsp'");
			out.println("</script>");

			out.println("</body>");

			out.println("</html>");

		}

	}


