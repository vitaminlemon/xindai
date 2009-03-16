package com.credit.customer.xjllb.controllers;

import java.util.*;
import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

import com.credit.customer.lrfpb.models.Lrfpb;
import com.credit.customer.xjllb.models.*;

public class InputXjllbServlet extends HttpServlet{
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		
		
		String firstinputt = request.getParameter("firstinput");
		String jlrr = request.getParameter("jlr");
        String jtljj = request.getParameter("jtlj");
		String wxzcc = request.getParameter("wxzc");
		String gdzcc = request.getParameter("gdzc");
		String cscqq = request.getParameter("cscq");
		String jrsyy = request.getParameter("jrsy");
		String ysxmm = request.getParameter("ysxm");
		String chdjss = request.getParameter("chdjs");
		String yfxmm = request.getParameter("yfxm");
		String jyhdd = request.getParameter("jyhd");
		String hscqq = request.getParameter("hscq");
        String csgdd = request.getParameter("csgd");
		String gmgdd = request.getParameter("gmgd");
		String gmgpp = request.getParameter("gmgp");
		String gmzqq = request.getParameter("gmzq");
		String tzcss = request.getParameter("tzcs");
		String fxgpp = request.getParameter("fxgp");
		String fxzqq = request.getParameter("fxzq");
		String xqtqyy = request.getParameter("xqtqy");
		String zfgll = request.getParameter("zfgl");
		String chzww = request.getParameter("chzw");
        String czhdfyy = request.getParameter("czhdfy");
		String rzzll = request.getParameter("rzzl");
		String czhdjee = request.getParameter("czhdje");
		String hlzss = request.getParameter("hlzs");
		String xjlll = request.getParameter("xjll");
	/*	
		if(firstinputt == null || firstinputt.equals("") || jlrr == null  || jlrr.equals("")  || jtljj == null  || jtljj.equals("")  || wxzcc == null  || wxzcc.equals("")  || gdzcc == null  || gdzcc.equals("")  || cscqq == null  || cscqq.equals("")  || jrsyy == null  || jrsyy.equals("")  || ysxmm == null  || ysxmm.equals("") || chdjss == null  || chdjss.equals("")  || yfxmm == null  || yfxmm.equals("") || jyhdd == null  || jyhdd.equals("")  || hscqq == null  || hscqq.equals("") || csgdd == null  || csgdd.equals("")  || gmgdd == null  || gmgdd.equals("")  || gmgpp == null  || gmgpp.equals("")  || gmzqq == null  || gmzqq.equals("") || tzcss == null  || tzcss.equals("")  || fxgpp == null  || fxgpp.equals("")  || fxzqq == null  || fxzqq.equals("")  || xqtqyy == null  || xqtqyy.equals("")  || zfgll == null  || zfgll.equals("")  || chzww == null  || chzww.equals("")  || czhdfyy == null  || czhdfyy.equals("")  || rzzll == null  || rzzll.equals("")  || czhdjee == null  || czhdjee.equals("") || hlzss == null  || hlzss.equals("")  || xjlll == null  || xjlll.equals("")){
			response.sendRedirect("../inputErro.html");
		}else{*/
			
			String jlrd = jlrr.replace(",", "");
			String jtljd = jtljj.replace(",", "");
			String wxzcd = wxzcc.replace(",", "");
			String gdzcd = gdzcc.replace(",", "");
			String cscqd = cscqq.replace(",", "");
			String jrsyd = jrsyy.replace(",", "");
			String ysxmd = ysxmm.replace(",", "");
			String chdjsd = chdjss.replace(",", "");
			String yfxmd = yfxmm.replace(",", "");
			String jyhd1 = jyhdd.replace(",", "");
			String hscqd = hscqq.replace(",", "");
			String csgd1 = csgdd.replace(",", "");
			String gmgd1 = gmgdd.replace(",", "");
			String gmgpd = gmgpp.replace(",", "");
			String gmzqd = gmzqq.replace(",", "");
			String tzcsd = tzcss.replace(",", "");
			String fxgpd = fxgpp.replace(",", "");
			String fxzqd = fxzqq.replace(",", "");
			String xqtqyd = xqtqyy.replace(",", "");
			String zfgld = zfgll.replace(",", "");
			String chzwd = chzww.replace(",", "");
			String czhdfyd = czhdfyy.replace(",", "");
			String rzzld = rzzll.replace(",", "");
			String czhdjed = czhdjee.replace(",", "");
			String hlzsd = hlzss.replace(",", "");
			String xjlld = xjlll.replace(",", "");
			
			
			String firstinput = request.getParameter("firstinput");	
			double jlr = Double.parseDouble(jlrd);
			double jtlj = Double.parseDouble(jtljd);
			double wxzc = Double.parseDouble(wxzcd);
			double gdzc = Double.parseDouble(gdzcd);
			double cscq = Double.parseDouble(cscqd);
			double jrsy = Double.parseDouble(jrsyd);
			double ysxm = Double.parseDouble(ysxmd);
			double chdjs = Double.parseDouble(chdjsd);
			double yfxm = Double.parseDouble(yfxmd);
			double jyhd = Double.parseDouble(jyhd1);
			double hscq = Double.parseDouble(hscqd);
			double csgd = Double.parseDouble(csgd1);
			double gmgd = Double.parseDouble(gmgd1);
			double gmgp = Double.parseDouble(gmgpd);
			double gmzq = Double.parseDouble(gmzqd);
			double tzcs = Double.parseDouble(tzcsd);
			double fxgp = Double.parseDouble(fxgpd);
			double fxzq = Double.parseDouble(fxzqd);
			double xqtqy = Double.parseDouble(xqtqyd);
			double zfgl = Double.parseDouble(zfgld);
			double chzw = Double.parseDouble(chzwd);
			double czhdfy = Double.parseDouble(czhdfyd);
			double rzzl = Double.parseDouble(rzzld);
			double czhdje = Double.parseDouble(czhdjed);
			double hlzs = Double.parseDouble(hlzsd);
			double xjll = Double.parseDouble(xjlld);
			
			
			/*if((jlr-yjtzjj+ncwfplr-dxlylr) != kgfplr ||  (kgfplr+yygjbk-tqyygj-yflr)!=wfplr){
				response.sendRedirect("../computeErro.html");
			}else{*/
				
				Xjllb xj = new Xjllb(firstinput,jlr,jtlj,wxzc,gdzc,cscq,jrsy,ysxm,chdjs,yfxm,jyhd,hscq,csgd,gmgd,gmgp,gmzq,tzcs,fxgp,fxzq,xqtqy,zfgl,chzw,czhdfy,rzzl,czhdje,hlzs,xjll);
				
				boolean isInpSuccess = xj.luru();
			
				if (isInpSuccess){
					response.sendRedirect("../ok.html");
				}else{
					response.sendRedirect("../nook.html");
				}
				
	}
}

