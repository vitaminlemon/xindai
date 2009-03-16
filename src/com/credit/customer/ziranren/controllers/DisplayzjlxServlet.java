package com.credit.customer.ziranren.controllers;

import java.util.*;
import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

import com.credit.customer.ziranren.models.*;

public class DisplayzjlxServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,
						HttpServletResponse response )
							throws IOException, ServletException{
							
								
							/*String dm = request.getParameter("dm");
							String hy = request.getParameter("hy");
							
							
							/*Integer zydm = 0;
							zydm.parseInt(request.getParameter("zydm"));
							
							String zymc = request.getParameter("zymc");*/
							
							
							
									
								
							Account acc2 = new Account();
							ArrayList<Account> allLeixings= acc2.returnLeixing();
							System.out.println("all->"+allLeixings.toString());
							
							Account acc3 = new Account();
							ArrayList<Account> zyInfo = acc3.returnZyInfo();
							
		
							// Session Space
							HttpSession session = request.getSession();
		
							session.setAttribute("allLeixingInfo", allLeixings);
							
							session.setAttribute("allZyInfo", zyInfo);
							
							if(allLeixings == null || zyInfo == null){
								response.sendRedirect("../nook.html");
							}else{
								response.sendRedirect("../zrrjbxx.jsp");
							}
							
					
							
							

							
							}
		
}