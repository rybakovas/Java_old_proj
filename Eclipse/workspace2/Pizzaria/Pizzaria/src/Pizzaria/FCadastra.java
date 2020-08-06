package Pizzaria;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Cadastra
 */
@WebServlet("/FCadastra")
public class FCadastra extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public FCadastra() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String usuario = request.getParameter("usuario");
		String sobrenome = request.getParameter("sobrenome");
		String senha = request.getParameter("senha");
		
		new DBHandler().FCadastrar(name, usuario, sobrenome, senha);

		PrintWriter out = response.getWriter();

		out.println("<html>");

		out.println("<head>");

		out.println("<title>Redirecionamento</title>");

		out.println("</head>");

		out.println("<body>");

		out.println("<script language= 'JavaScript'>");
		out.println("location.href='http://localhost:8080/Pizzaria/home.jsp'");
		out.println("</script>");

		out.println("</body>");

		out.println("</html>");

	}

}
