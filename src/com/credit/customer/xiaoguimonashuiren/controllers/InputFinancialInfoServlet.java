package com.credit.customer.xiaoguimonashuiren.controllers;

import java.util.*;
import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

import com.credit.customer.xiaoguimonashuiren.models.FinancialInfo;

public class InputFinancialInfoServlet extends HttpServlet{
	public void doPost(HttpServletRequest request,HttpServletResponse response)
						throws IOException, ServletException{
		
							String firstinputt = request.getParameter("firstinput");
							String srr = request.getParameter("sr");
							String zcc = request.getParameter("zc");
							String lrr = request.getParameter("lr");
							
							if(firstinputt == null || firstinputt.equals("") || srr == null || srr.equals("") || zcc == null || zcc.equals("") || lrr == null || lrr.equals("") ){
								response.sendRedirect("../nook.html");
							}else{
								String srd = srr.replace(",", "");
								String zcd = zcc.replace(",", "");
								String lrd = lrr.replace(",", "");
								
								String firstinput = request.getParameter("firstinput");	
								double sr = Double.parseDouble(srd);
								double zc = Double.parseDouble(zcd);
								double lr = Double.parseDouble(lrd);
								
								if(lr != (sr-zc)){
									response.sendRedirect("../nook.html");
								}else{
									FinancialInfo fi = new FinancialInfo(firstinput,sr,zc,lr);
							
							boolean isInputSuccess = fi.input();
							
							if(isInputSuccess){
									response.sendRedirect("../ok.html");
								}else{
									response.sendRedirect("../nook.html");
								}
								}
							}
							
					


	}
	
}