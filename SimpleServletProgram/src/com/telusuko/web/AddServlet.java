package com.telusuko.web;

import java.io.IOException;


import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(description="Addition of numbers", urlPatterns="/add")
public class AddServlet extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException{
		int t1 = Integer.parseInt(req.getParameter("t1"));
		int t2 = Integer.parseInt(req.getParameter("t2"));
		res.getWriter().println(t1+t2);
		
	}

}
