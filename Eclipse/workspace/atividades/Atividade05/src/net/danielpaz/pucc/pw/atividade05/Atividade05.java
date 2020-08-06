package net.danielpaz.pucc.pw.atividade05;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Atividade05
 */
@WebServlet("/Atividade05")
public class Atividade05 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	public static int cont;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Atividade05() {
        super();
        
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		
		System.out.println("Contador init: "+ cont);

	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		System.out.println("Contador destroy: "+ cont);
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		cont++;
		
		PrintWriter out = response.getWriter();

		 out.println("<html>");

		 out.println("<body>");

		out.println("Instancias: " + cont);

		 out.println("</body>");

		 out.println("</html>");
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
