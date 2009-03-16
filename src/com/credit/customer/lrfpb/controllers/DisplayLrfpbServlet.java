package com.credit.customer.lrfpb.controllers;

import java.util.*;
import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

import com.credit.customer.lrfpb.models.*;

public class DisplayLrfpbServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws IOException, ServletException{
		
		Lrfpb lrfp = new Lrfpb();
		
		
		ArrayList<Lrfpb> allLrfpb = lrfp.returnAllInfo();
		
		// Session Space
		HttpSession session = request.getSession();
		
		session.setAttribute("allLrfpbInfo", allLrfpb);
		
		
		
		
		// 3. find a view		
		if(allLrfpb == null){
			response.sendRedirect("../nook.html");
		}else{
			response.sendRedirect("../displayLrfpb.jsp");
		}
							
							
	}
	
	
}
		

