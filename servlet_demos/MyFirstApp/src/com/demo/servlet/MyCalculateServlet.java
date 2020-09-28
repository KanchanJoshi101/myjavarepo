package com.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class MyCalculateServlet extends HttpServlet{
	public int factorial(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		return fact;
	}
	
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
		
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		HttpSession session=request.getSession();
		String uname=(String) session.getAttribute("uname");
		if(uname!=null) {
		out.println("Welcome" +uname);	
		int num1=Integer.parseInt(request.getParameter("num1"));
		String btn=request.getParameter("btn");
		if(btn.equals("add")) {
			int num2=Integer.parseInt(request.getParameter("num2"));
			out.println("<h3>Addition : </h3>"+(num1+num2));
		}
		else {
			int f=factorial(num1);
			out.println("<h3>Factorial : </h3>"+f);
		}
		}
		else {
			out.println("pls enter credential");
			RequestDispatcher rd=request.getRequestDispatcher("index.html");
			rd.include(request, response);
		}
		
		
	}

}
