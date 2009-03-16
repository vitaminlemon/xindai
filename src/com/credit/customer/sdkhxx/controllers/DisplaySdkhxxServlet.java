package com.credit.customer.sdkhxx.controllers;

import java.util.*;
import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

import com.credit.customer.sdkhxx.models.*;

public class DisplaySdkhxxServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws IOException, ServletException{
		
		Sdkhxx sdkh = new Sdkhxx();
		
		
		ArrayList<Sdkhxx> allSdkhxx = sdkh.returnAllInfo();
		
		// Session Space
		HttpSession session = request.getSession();
		
		session.setAttribute("allSdkhxxInfo", allSdkhxx);
		
		
		
		
		// 3. find a view		
		if(allSdkhxx == null){
			response.sendRedirect("../nook.html");
		}else{
			response.sendRedirect("../displaySdkhxx.jsp");
		}
							
							
	}
	
	
}
		