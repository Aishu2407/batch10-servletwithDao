package com.te.Daoimplementation;


	

	import java.io.IOException;
	import java.io.PrintWriter;

	import javax.servlet.ServletException;
	import javax.servlet.annotation.WebServlet;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;

	public class WelcomServlet extends HttpServlet {
		
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			 response.setContentType("text/html");  
			    PrintWriter out = response.getWriter();           
			    String n=request.getParameter("username");  
			    out.print("Welcome "+n);        
			    out.close();  
		}

	}

