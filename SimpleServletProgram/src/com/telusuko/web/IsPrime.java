package com.telusuko.web;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/isPrime")
public class IsPrime extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException{
		int isPrime = Integer.parseInt(req.getParameter("isprime"));
		
		if(isPrime>0){
			int cnt=0;
			for(int i=1;i<=isPrime;i++)
			{
				if(isPrime%i==0)
					cnt++;
			}
				
			if(cnt==2)
				res.getWriter().println(true);
			else
				res.getWriter().println(false);
		}
		
	}

}
