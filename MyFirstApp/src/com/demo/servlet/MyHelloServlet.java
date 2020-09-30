package com.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyHelloServlet extends HttpServlet {
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException {
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		out.println("<html><head></head><body>");
		out.println("<h1>Hello world from servlet!</h1>");
		out.println("</body></html>");
		
	}

}
