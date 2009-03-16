package com.credit.customer.lrfpb.controllers;

import java.util.*;
import java.io.*;


import javax.servlet.*;
import javax.servlet.http.*;

import com.credit.customer.lrfpb.models.*;

public class InputLrfpbServlet extends HttpServlet{
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		
		
		
		String firstinputt = request.getParameter("firstinput");
		String jlrr = request.getParameter("jlr");
        String yjtzjjj = request.getParameter("yjtzjj");
		String ncwfplrr = request.getParameter("ncwfplr");
		String dxlylrr = request.getParameter("dxlylr");
		String kgfplrr = request.getParameter("kgfplr");
		String yygjbkk = request.getParameter("yygjbk");
		String tqyygjj = request.getParameter("tqyygj");
		String yflrr = request.getParameter("yflr");
		String wfplrr = request.getParameter("wfplr");
		
		if(firstinputt == null || firstinputt.equals("") || jlrr == null  || jlrr.equals("")  || yjtzjjj == null  || yjtzjjj.equals("")  || ncwfplrr == null  || ncwfplrr.equals("")  || dxlylrr == null  || dxlylrr.equals("")  || kgfplrr == null  || kgfplrr.equals("")  || yygjbkk == null  || yygjbkk.equals("")  || tqyygjj == null  || tqyygjj.equals("")  || yflrr == null  || yflrr.equals("")  || wfplrr == null  || wfplrr.equals("") ){
			response.sendRedirect("../inputErro.html");
		}else{
			
			String jlrd = jlrr.replace(",", "");
			String yjtzjjd = yjtzjjj.replace(",", "");
			String ncwfplrd = ncwfplrr.replace(",", "");
			String dxlylrd = dxlylrr.replace(",", "");
			String kgfplrd = kgfplrr.replace(",", "");
			String yygjbkd = yygjbkk.replace(",", "");
			String tqyygjd = tqyygjj.replace(",", "");
			String  yflrd = yflrr.replace(",", "");
			String wfplrd = wfplrr.replace(",", "");
			
			String firstinput = request.getParameter("firstinput");	
			double jlr = Double.parseDouble(jlrd);
			double yjtzjj = Double.parseDouble(yjtzjjd);
			double ncwfplr = Double.parseDouble(ncwfplrd);
			double dxlylr = Double.parseDouble(dxlylrd);
			double kgfplr = Double.parseDouble(kgfplrd);
			double yygjbk = Double.parseDouble(yygjbkd);
			double tqyygj = Double.parseDouble(tqyygjd);
			double yflr = Double.parseDouble(yflrd);
			double wfplr = Double.parseDouble(wfplrd);
			
			if((jlr-yjtzjj+ncwfplr-dxlylr) != kgfplr ||  (kgfplr+yygjbk-tqyygj-yflr)!=wfplr){
				response.sendRedirect("../computeErro.html");
			}else{
				
				Lrfpb lrfp = new Lrfpb(firstinput,jlr,yjtzjj,ncwfplr,dxlylr,kgfplr,yygjbk,tqyygj,yflr,wfplr);
				
				boolean isInpSuccess = lrfp.luru();
			
				if (isInpSuccess){
					response.sendRedirect("../ok.html");
				}else{
					response.sendRedirect("../nook.html");
				}
			}	
		}
	}
}









