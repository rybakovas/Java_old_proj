package Pizzaria;

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
 * Servlet implementation class Logar
 */
@WebServlet("/Logar")
public class Logar extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public String nomeuser;
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Logar() {
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
		
		String email = request.getParameter("email");
		String senha = request.getParameter("senha");

		session.setAttribute(email,senha); 
		 
		if (new DBHandler().Logar(email, senha)) {
			System.out.println("Entrou logar");
			
			DBHandler db = new DBHandler();
			
			String nome = db.nomeCliente(email, senha);
			
			 
            session.setAttribute("user", nome);
            
            session.setMaxInactiveInterval(30*60);
            Cookie userName = new Cookie("user", nome);
            userName.setMaxAge(30*60);
            response.addCookie(userName);
            
            String id = db.IdCliente(email, senha);
			
			 
            session.setAttribute("id", id);
            
            session.setMaxInactiveInterval(30*60);
            Cookie idCli = new Cookie("id", id);
            userName.setMaxAge(30*60);
            response.addCookie(idCli);
            
            
			PrintWriter out = response.getWriter();

			out.println("<html>");

			out.println("<head>");

			out.println("<title>Redirecionamento</title>");

			out.println("</head>");

			out.println("<body>");

			out.println("<script language= 'JavaScript'>");
			out.println("location.href='http://localhost:8080/Pizzaria/index.jsp'");
			out.println("</script>");

			out.println("</body>");

			out.println("</html>");

		}

		else {
			PrintWriter out = response.getWriter();

			out.println("<html>");

			out.println("<head>");

			out.println("<title>ERRO</title>");

			out.println("</head>");

			out.println("<body>");

			out.println("<script language= 'JavaScript'>");
			out.println("location.href='http://localhost:8080/Pizzaria/Index3.html'");
			out.println("</script>");

			out.println("</body>");

			out.println("</html>");
		}
	}

}
