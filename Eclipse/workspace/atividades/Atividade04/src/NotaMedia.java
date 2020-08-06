

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NotaMedia
 */
@WebServlet("/NotaMedia")
public class NotaMedia extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NotaMedia() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();

		try {
			
		String nome = request.getParameter("nome");

		String n1= request.getParameter("n1");
		String n2= request.getParameter("n2");
		String n3= request.getParameter("n3");
		String n4= request.getParameter("n4");
		
	
		float fn1,fn2,fn3,fn4;

		fn1=Float.parseFloat(n1);
		fn2=Float.parseFloat(n2);
		fn3=Float.parseFloat(n3);
		fn4=Float.parseFloat(n4);
		

		out.println("<html>");

		out.println("<body>");

		out.println("Nome: " + nome + "<br>Média Nota 1 e 2: " + ((fn1 + fn2) /2)+ "<br>Média Nota 3 e 4: " + ((fn3 + fn4) /2));

		out.println("</body>");

		out.println("</html>");
		
		

			
			} catch (Exception e) {

			 throw new ServletException(e);

			}
	}
	
	
		
	}


