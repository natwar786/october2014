package com.helloWorld;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloWorld
 */
@WebServlet("/HelloWorld")
public class HelloWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloWorld() {
    	super();
    	System.out.println("constructor");
        
        // TODO Auto-generated constructor stub
    }
   /* public void init() {
        System.out.println("\n\n Servlet Init() Method");
        System.out.println("Servlet Initialised by init() method");
}*/

  //http://www.devmanuals.com/tutorials/java/servlet/servletlifecycleexample.html
    
    
 /*   public void init(ServletConfig config) throws ServletException  {
    	 super.init(config);
    	System.out.println("inside init"+config);
    	
    	init();
    }*/
    
  /*  public void httpService(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
    	//doGet(request,response);
    }
    public void service(ServletRequest request, ServletResponse response)  throws ServletException, IOException  {
    	System.out.println("inside service");
    	httpService(request,response);
    	
    }*/
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		/*ServletContext context=getServletContext();
		String data=context.getInitParameter("data");
		System.out.println(data);
		*/

		String message="Hello World";
		 response.setContentType("text/html");

	      // Actual logic goes here.
	      PrintWriter out = response.getWriter();
	      out.println("<h1>" + message + "</h1>");
		ServletContext context=getServletContext();
		out.println("<h1>"+context.getAttribute("data")+"<h1>");
		
		
		/*String message="Hello World";
		 response.setContentType("text/html");

	      // Actual logic goes here.
	      PrintWriter out = response.getWriter();
	      out.println("<h1>" + message + "</h1>");*/
	      
	    /*  try {
			Class.forName("oracle.jdbc.OracleDriver");
			
			System.out.println("-----------------driver loadedd-----------------------------------------------");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	      out.close();
	    //  service(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	public void destroy()
	{
		System.out.println("Am from Destroy methods");
	}
//request response config context.
//service call genericService to httpService
//	config and context are created beofore init method.
//servletContextListner 	
}
