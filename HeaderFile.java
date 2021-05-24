package com.anna.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Enumeration;

/**
 * Servlet implementation class ShowHeader
 */
@WebServlet("/HeaderFile")
public class HeaderFile extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HeaderFile() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		      response.setContentType("text/html");  
		      PrintWriter out = response.getWriter();  
		        
		      out.println("<h2><i>HTTP headers sent by your client:</i></h2><br>");  
		        
		      	Enumeration<String> enumeration = request.getHeaderNames();  
		        while (enumeration.hasMoreElements()) {  
		        String headerName = (String) enumeration.nextElement();  
		        String headerValue = request.getHeader(headerName);  
		        out.print("<b>"+headerName + "</b>: ");  
		        out.println(headerValue + "<br>");  
		      }  
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
