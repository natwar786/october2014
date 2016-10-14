package com.helloWorld;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class fouthServlet
 */
@WebServlet("/fouthServlet")
public class fouthServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public fouthServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	public static final String HTML_START="<html><body>";
	public static final String HTML_END="</body></html>";
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		String subjectName=request.getParameter("subjectName");
		   System.out.println("name is"+subjectName);
		 
		   HttpSession session=request.getSession();
		  // session.setAttribute("qualification", qualification);
		   String fName=(String) session.getAttribute("firstName");
		   String lName=(String) session.getAttribute("lastName");
		   String qual= (String) session.getAttribute("qualification"); 
		   
		   PrintWriter out=response.getWriter();
		   out.println(HTML_START);
		   out.println("Welcome firstName: "+ fName);
		   out.println("Welcome lastName: "+ lName);
		   out.println("your qualification: "+ qual);
		   out.println("yor subject is"+subjectName);
				   
		 /*  out.println("<form action=thirdServlet method=post >");
				   //"<"+"form action= "+"secondServlet" + "method="+"post"+">"+
		   out.println("<input type=text name=qualification />");
		   out.println("<input type=submit value=Submit />");*/
		   out.println(HTML_END); 
	}

}
