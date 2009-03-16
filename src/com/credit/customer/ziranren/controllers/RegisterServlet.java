package com.credit.customer.ziranren.controllers;

import java.util.*;
import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

import com.credit.customer.ziranren.models.*;

public class RegisterServlet extends HttpServlet{
	public void doPost(HttpServletRequest request,
						HttpServletResponse response )
							throws IOException, ServletException{
								
								String name = request.getParameter("name");
								String id = request.getParameter("id");
								String workUnit = request.getParameter("workUnit");
								String accLoc = request.getParameter("accLoc");
								String homeAddress = request.getParameter("homeAddress");
								String unitAddress = request.getParameter("unitAddress");
								
								String sex = request.getParameter("sex");
								String documentTypes = request.getParameter("documentTypes");
								String zipCode = request.getParameter("zipCode");
								String homePhone = request.getParameter("homePhone");
								String unitPhone = request.getParameter("unitPhone");
								
								int occupation = Integer.parseInt(request.getParameter("occupation"));
								
								//String occupation = request.getParameter("occupation");
								
								Account acc = new Account(name,id,workUnit,accLoc,homeAddress,unitAddress,sex,documentTypes,zipCode,homePhone,unitPhone,occupation);
								//Account acc = new Account(name);
								
								boolean isRegSuccess = acc.signUp();
								
								if(isRegSuccess){
									response.sendRedirect("../ok.html");
								}else{
									response.sendRedirect("../nook.html");
								}
							}
		
}