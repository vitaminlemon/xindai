package com.credit.customer.sdkhxx.controllers;

import java.util.*;
import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

import com.credit.customer.sdkhxx.models.*;

public class InputSdkhxxServlet extends HttpServlet{
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		
		String firstinputt = request.getParameter("firstinput");
		String cxll = request.getParameter("cxl");
		String gdzcdkk = request.getParameter("gdzcdk");
		String whdkyee = request.getParameter("whdkye");
		String dqwhdkyee = request.getParameter("dqwhdkye");
		String whckyee = request.getParameter("whckye");
		String jhwhckyee = request.getParameter("jhwhckye");
		String bhyee = request.getParameter("bhye");
		String yhcdhpjee = request.getParameter("yhcdhpje");
		String wfxyzyee = request.getParameter("wfxyzye");
		String jhwfxyzyee = request.getParameter("jhwfxyzye");
		String jykhh = request.getParameter("jykh");
		String ssgss = request.getParameter("ssgs");
		
		if(firstinputt == null || firstinputt.equals("")|| cxll == null  || cxll.equals("") || gdzcdkk == null  || gdzcdkk.equals("") || whdkyee == null  || whdkyee.equals("")  || dqwhdkyee == null  || dqwhdkyee.equals("")  ||whckyee == null  || whckyee.equals("")  || jhwhckyee == null  || jhwhckyee.equals("")  || bhyee == null  || bhyee.equals("")  || yhcdhpjee == null  || yhcdhpjee.equals("")  ||  wfxyzyee == null  ||  wfxyzyee.equals("")  || jhwfxyzyee == null  || jhwfxyzyee.equals("") ||  jykhh == null  ||  jykhh.equals("")  || ssgss == null  || ssgss.equals("")  ){
			response.sendRedirect("../inputErro.html");
		}else{
		
			String cxld = cxll.replace(",", "");
			String gdzcdkd = gdzcdkk.replace(",", "");
			String whdkyed = whdkyee.replace(",", "");
			String dqwhdkyed = dqwhdkyee.replace(",", "");
			String whckyed = whckyee.replace(",", "");
			String jhwhckyed = jhwhckyee.replace(",", "");
			String bhyed = bhyee.replace(",", "");
			String yhcdhpjed = yhcdhpjee.replace(",", "");
			String  wfxyzyed = wfxyzyee.replace(",", "");
			String jhwfxyzyed = jhwfxyzyee.replace(",", "");
			
			
			
			String firstinput = request.getParameter("firstinput");
			double cxl = Double.parseDouble(cxld);
			double gdzcdk = Double.parseDouble(gdzcdkd);
			double whdkye = Double.parseDouble(whdkyed);
			double dqwhdkye = Double.parseDouble(dqwhdkyed);
			double whckye = Double.parseDouble(whckyed);
			double jhwhckye = Double.parseDouble(jhwhckyed);
			double bhye = Double.parseDouble(bhyed);
			double yhcdhpje = Double.parseDouble(yhcdhpjed);
			double wfxyzye = Double.parseDouble(wfxyzyed);
			double jhwfxyzye = Double.parseDouble(jhwfxyzyed);
			String jykh = request.getParameter("jykh");
			String ssgs = request.getParameter("ssgs");
		
		Sdkhxx sdkh = new Sdkhxx(firstinput, cxl, gdzcdk, whdkye, dqwhdkye, whckye, jhwhckye, bhye, yhcdhpje, wfxyzye, jhwfxyzye,jykh, ssgs);
		
		boolean isInputSuccess = sdkh.luru();
		
		if (isInputSuccess){
			response.sendRedirect("../ok.html");
		}else{
			response.sendRedirect("../nook.html");
		}
		
		
	}
}
}