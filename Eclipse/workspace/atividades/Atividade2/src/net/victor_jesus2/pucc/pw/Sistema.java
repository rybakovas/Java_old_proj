package net.victor_jesus2.pucc.pw;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Sistema
 */
@WebServlet(description = "Sistema de horário", urlPatterns = { "/Sistema" })
public class Sistema extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Sistema() {
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
		 out.println("<title>Atividade2-A</title>");
		 out.println("</head>");
		 out.println("<body>");
		 out.println("<b>(A)</b> Horário do SERVIDOR: " + new Date(System.currentTimeMillis()));
		 out.println("<br>"); 
		 out.println("<b>(B)</b> OS do SERVIDOR: " + System.getProperty("os.name"));
		
		 out.println("</body>");
		 out.println("</html>");
	}

}
