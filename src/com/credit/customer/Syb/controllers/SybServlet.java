package com.credit.customer.Syb.controllers;
import java.util.*;
import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

import com.credit.customer.Syb.models.*;

public class SybServlet extends HttpServlet{
	public void doPost (HttpServletRequest request, HttpServletResponse response)throws IOException,ServletException{
		//1.receive data from browser
		double xssr = Double.parseDouble(request.getParameter("xssr"));
		double xscb = Double.parseDouble(request.getParameter("xscb"));
		double xsfy = Double.parseDouble(request.getParameter("xsfy"));
		double xssj = Double.parseDouble(request.getParameter("xssj"));
		double xslr = Double.parseDouble(request.getParameter("xslr"));
		double tzly = Double.parseDouble(request.getParameter("tzly"));
		double btsr = Double.parseDouble(request.getParameter("btsr"));
		double sytz = Double.parseDouble(request.getParameter("sytz"));
		double lrze = Double.parseDouble(request.getParameter("lrze"));
		double sds = Double.parseDouble(request.getParameter("sds"));
		double jlr = Double.parseDouble(request.getParameter("jlr"));
		double qtywlr = Double.parseDouble(request.getParameter("qtywlr"));
		double glfy = Double.parseDouble(request.getParameter("glfy"));
		double cwfy = Double.parseDouble(request.getParameter("cwfy"));
		double yelr = Double.parseDouble(request.getParameter("yelr"));
		double yewsr = Double.parseDouble(request.getParameter("yewsr"));
		double yewzc = Double.parseDouble(request.getParameter("yewzc"));
		//2.send data to 

		Syb_data acc = new Syb_data(xssr,xscb,xsfy,xssj,xslr,tzly,btsr,sytz,lrze,sds,jlr,qtywlr,glfy,cwfy,yelr,yewsr,yewzc);
		boolean isSybSuccess = acc.input();
		//3.find a view
		if(isSybSuccess){
			response.sendRedirect("../ok.html");
				}else{
			response.sendRedirect("../nook.html");
				}
	} 
	
	
}