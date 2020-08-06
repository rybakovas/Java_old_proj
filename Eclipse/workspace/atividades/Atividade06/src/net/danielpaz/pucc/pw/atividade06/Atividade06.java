package net.danielpaz.pucc.pw.atividade06;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Atividade06
 */
@WebServlet("/Atividade06")
public class Atividade06 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Atividade06() {
        super();
        
       
        }
 

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		PrintWriter out = response.getWriter();

		String nome = request.getParameter("nome");

		String email= request.getParameter("email");
		
		 String Cuuke = request.getParameter("cookie");
		
		 

         if(Cuuke!=null) {
                  Cookie cookie;
           
              cookie = new Cookie("Nome",nome);
              cookie.setMaxAge(60*60*24); 
              response.addCookie(cookie);
              cookie = new Cookie("Email",email);
              cookie.setMaxAge(60*60*24); 
              response.addCookie(cookie);
              
         } else {
                 HttpSession session = request.getSession();
                 session.setAttribute("nome", nome);
                 session.setAttribute("email", email);
                 out.println("Gravei na sessão<br/>");
		
	}

	}
}

