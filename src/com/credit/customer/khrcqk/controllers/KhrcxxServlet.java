package com.credit.customer.khrcqk.controllers;
import java.util.*;
import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

import com.credit.customer.khrcqk.models.*;

public class KhrcxxServlet extends HttpServlet{
	public void doPost (HttpServletRequest request, HttpServletResponse response)throws IOException,ServletException{
		//1.receive data from browser
		double f11jhck = Double.parseDouble(request.getParameter("f11jhck"));
		double f11dbje = Double.parseDouble(request.getParameter("f11dbje"));
		//2.send data to 

		Khrcxx_data acc = new Khrcxx_data(f11jhck, f11dbje);
		boolean isKhrcxxSuccess = acc.input();
		//3.find a view
		if(isKhrcxxSuccess){
			response.sendRedirect("../ok.html");
				}else{
			response.sendRedirect("../nook.html");
				}
	} 
	
	
}