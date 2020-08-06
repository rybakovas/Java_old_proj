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
 * Servlet implementation class Deletar
 */
@WebServlet("/FDeletar")
public class FDeletar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FDeletar() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession(); 
		String id = null;
		id = (String) session.getAttribute("id");
		String sessionID = null;
		String idFunc = null;
		//String sessionID = null;
		Cookie[] cookies2 = request.getCookies();
		if(cookies2 !=null){
		for(Cookie cookie : cookies2){
		    if(cookie.getName().equals("id")) idFunc = cookie.getValue();
		    if(cookie.getName().equals("JSESSIONID")) sessionID = cookie.getValue();
		}
		}
	String action = request.getParameter("action");

	String returnTo = "location.href='http://localhost:8080/Pizzaria/indexf.jsp'";
	if ("Deletar".equals(action)) {
		new DBHandler().FDeletar(idFunc);
		returnTo = "location.href='http://localhost:8080/Pizzaria/home.jsp'";
	}
	// else nada a fazer
	
	
	PrintWriter out = response.getWriter();
	

	out.println("<html>");

	out.println("<head>");

	out.println("<title>Redirecionamento</title>");

	out.println("</head>");

	out.println("<body>");

	out.println("<script language= 'JavaScript'>");
	out.println(returnTo);
	out.println("</script>");

	out.println("</body>");

	out.println("</html>");
}
}
