package com.anna.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;

/**
 * Servlet implementation class ClientInfo
 */
@WebServlet("/ClientFile")
public class ClientFile extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClientFile() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 response.setContentType("text/html");  
	    PrintWriter out = response.getWriter();  
		String contextPath = request.getContextPath(); 
		out.println("<h1><i>CLIENT INFORMATION</i></h1>");
		out.println("<b>context path</b> : " + contextPath+ "<br>");
		long l = request.getDateHeader("Modified-Since");
		out.println("<b>Modified Since : </b>" + l+ "<br>");
		String methodName = request.getMethod();
		out.println("<b>request method :</b> " + methodName+ "<br>");
		String pathTranslated = request.getPathTranslated();
		out.println("<b>pathTranslated :</b> " + pathTranslated+ "<br>"); 
		String qs = request.getQueryString();
		out.println("<b>query String :</b> " + qs+ "<br>");
		String ru = request.getRemoteUser();
		out.println("<b>Remote User : </b>" + ru+ "<br>");
		String sessId = request.getRequestedSessionId();
		out.println("<b>SessionId :</b> " + sessId+ "<br>");
		String uri = request.getRequestURI();
		out.println("<b>URI : </b>" + uri+ "<br>");
		String sp = request.getServletPath();
		out.println("<b>Servlet Path :</b> " + sp+ "<br>");
		String ce = request.getCharacterEncoding();
		out.println("<b>Character Encoding :</b> " + ce+ "<br>");
		String ct = request.getContentType();
		out.println("<b>content type :</b> " + ct+ "<br>");
		Locale locale = request.getLocale();
		out.println("<b>Locale : </b>" + locale.toString()+ "<br>"); 
		String protocol = request.getProtocol();
		out.println("<b>Protocol :</b> " + protocol+ "<br>");
		@SuppressWarnings("deprecation")
		String rp = request.getRealPath("/ourApps/servlet/EnvServ");
		out.println("<b>real path :</b> " + rp+ "<br>");
		String raddr = request.getRemoteAddr();
		out.println("<b>Remote Address :</b> " + raddr+ "<br>");
		String rh = request.getRemoteHost();
		out.println("<b>Remote Host : </b>" + rh+ "<br>");
		String sn = request.getServerName();
		out.println("<b>Server Name:</b> " + sn+ "<br>");
		int sport = request.getServerPort();
		out.println("<b>Server Port :</b> " + sport+ "<br>");

		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
