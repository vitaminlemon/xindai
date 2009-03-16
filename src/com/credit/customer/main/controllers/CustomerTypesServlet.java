package com.credit.customer.main.controllers;

import java.util.*;
import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

public class CustomerTypesServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest request,HttpServletResponse response)
						throws IOException, ServletException{
		String leixingstr = request.getParameter("customer_types");
		int leixing = Integer.parseInt(leixingstr);
		
		
		
		if (leixing == 2){
			response.sendRedirect("../servlet/DisplayzjlxServlet");
		}
		
		else{
			response.sendRedirect("../ok.html");
		}
	}
}