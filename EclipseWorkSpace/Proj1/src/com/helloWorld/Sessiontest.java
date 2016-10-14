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
 * Servlet implementation class Sessiontest
 */
@WebServlet("/Sessiontest")
public class Sessiontest extends HttpServlet {
	//http://www.journaldev.com/1907/java-session-management-servlet-httpsession-url-rewriting
	//Since HTTP and Web Server both are stateless,
	//preference can be saved. 
	//session is server side.
	//cookie is client side.
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Sessiontest() {
        super();
        // TODO Auto-generated constructor stub
    }
   
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	 /*  PrintWriter out=response.getWriter();
	   HttpSession session=request.getSession();
	   session.setAttribute("name", "IRP");
	   out.println(session.getAttribute("name"));
	   out.println(session.getId());
	   out.println(session.isNew());*/
	   
	}
	public static final String HTML_START="<html><body>";
	public static final String HTML_END="</body></html>";
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
	   String name=request.getParameter("firstName");
	   System.out.println("name is"+name);
	  
	   HttpSession session=request.getSession();
	   session.setAttribute("firstName", name);
	   
	   PrintWriter out=response.getWriter();
	   out.println(HTML_START);
	   out.println("Welcome firstName: "+ name);
	   out.println("<form action=secondServlet method=post >");
			   //"<"+"form action= "+"secondServlet" + "method="+"post"+">"+
	   out.println("<input type=text name=lastName />");
	   out.println("<input type=submit value=Submit />");
	   out.println(HTML_END);
			   //"<" + "input type= " + "submit" + "value="+ "Submit"+ ">" 
			   // +"</form>"
			  // +HTML_END);
	   
	
	}
	
	

}
