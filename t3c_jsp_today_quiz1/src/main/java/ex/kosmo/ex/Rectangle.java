package ex.kosmo.ex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Rectangle
 */
@WebServlet("/rectangle")
public class Rectangle extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Rectangle() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());

		//sj - add
		response.getWriter().append("<br>");
		Integer wid = Integer.valueOf(request.getParameter("var_rec_w"));
		Integer hig = Integer.valueOf(request.getParameter("var_rec_h"));
		
		
		response.setContentType("text/html; charset=euc-kr");
		PrintWriter wr = response.getWriter();
		wr.println("<!DOCTYPE html>");
		wr.println("<html>");
		wr.println("<head>");
		wr.println("</head>");
		wr.println("<body>");
		
		wr.println("<p1> rectangle space :" + wid*hig  +" .</p1>");
		
		wr.println("</body>");
		wr.println("</html>");
		
		
		System.out.println("get 호출~~" );	
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
