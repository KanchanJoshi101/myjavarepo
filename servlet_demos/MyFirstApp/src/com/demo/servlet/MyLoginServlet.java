package com.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class MyLoginServlet extends HttpServlet {
	private String msg;
	private int percent;
	
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		System.out.println("in init method");
		 msg=config.getInitParameter("msg");
		 percent=Integer.parseInt(config.getInitParameter("percent"));
		
	}
	public void destroy() {
		System.out.println("in destroy");
	}
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException{
		
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		String uname=request.getParameter("uname");
		String pass=request.getParameter("pass");
		if(uname.equals("admin") && pass.equals("admin")){
			HttpSession session=request.getSession();
		    if(session.isNew()) {
		    	session.setAttribute("uname", uname);
		    }			
			out.println("welcome to our site");
			out.println("you are autherized user");
			RequestDispatcher rd1=request.getRequestDispatcher("data.html");
			rd1.include(request, response);
		}
		else {
			out.println("you are not authrized user");
			RequestDispatcher rd=request.getRequestDispatcher("index.html");
			rd.include(request, response);
			
		}
		
		
		
	}

}
