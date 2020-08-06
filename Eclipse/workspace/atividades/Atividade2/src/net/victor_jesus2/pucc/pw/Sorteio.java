package net.victor_jesus2.pucc.pw;

import java.io.IOException;
import java.io.PrintWriter;

import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Sistema
 */
@WebServlet(description = "Sistema de Sorteio", urlPatterns = { "/Sorteio" })
public class Sorteio extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Sorteio() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 PrintWriter out = response.getWriter();
		 out.println("<html>");
		 out.println("<head>");
		 out.println("<title>Atividade2-B</title>");
		 out.println("</head>");
		 out.println("<body>");
		 out.println("<UL>");
		 for(int x = 0 ; x<5 ; x++)
			 out.println("<LI><b>Numero Sorteado:</b>"+(new Random().nextInt(10)+1)+"</br></LI>");
		 out.println("</UL>");
		 out.println("</body>");
		 out.println("</html>");
	}

}
