package Pizzaria;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Monte
 */
@WebServlet("/Montar")
public class Montar extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Montar() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String nomepizza = request.getParameter("nomepizza");
		String[] checkMonte = request.getParameterValues("checkMonte");
		
		PrintWriter out = response.getWriter();

			new DBHandler().Montar(nomepizza,checkMonte);


			

			out.println("<html>");

			out.println("<head>");

			out.println("<title>Redirecionamento</title>");

			out.println("</head>");

			out.println("<body>");

			out.println("<script language= 'JavaScript'>");
			out.println("location.href='http://localhost:8080/Pizzaria/index.jsp#artigo1'");
			out.println("</script>");

			out.println("</body>");

			out.println("</html>");

		}

	}


