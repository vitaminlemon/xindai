package com.credit.customer.xjllb.controllers;

import java.util.*;
import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

import com.credit.customer.xjllb.models.*;

public class DisplayXjllbServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws IOException, ServletException{
		
		Xjllb xj = new Xjllb();
		
		
		ArrayList<Xjllb> allXjllb = xj.returnAllInfo();
		
		// Session Space
		HttpSession session = request.getSession();
		
		session.setAttribute("allXjllbInfo", allXjllb);
		
		
		
		
		// 3. find a view		
		if(allXjllb == null){
			response.sendRedirect("../nook.html");
		}else{
			response.sendRedirect("../displayXjllb.jsp");
		}
							
							
	}
	
	
}