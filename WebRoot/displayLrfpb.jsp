<%@ page language="java" pageEncoding="UTF-8" import="java.util.ArrayList"  %>
<%@ page import="com.credit.customer.lrfpb.models.Lrfpb"  %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xml:lang="en" xmlns="http://www.w3.org/1999/xhtml" lang="en"><head>

  <meta http-equiv="content-type" content="text/html; charset=UTF-8">
  <title>信贷-客户</title>
  <link href="css/link1.css" media="screen" rel="Stylesheet" type="text/css">
  <script language="javascript" src="js/cal2.js"></script>
  <script language="javascript" src="js/cal_conf2.js"></script>
  <script language="javascript" src="js/sanweiyifen.js"></script>

</head><body>
		

	<form action="servlet/DisplayLrfpbServlet" method="get" name="sampleform">
	<div id="frame">
		<div id="header">
			<div id="signoutlink">
				
					<span>Welcome!</span>|<a href="http://192.168.1.20:8085/logout">退出登录!</a>	
				
			</div>
			<h1>信贷管理信息系统  <span id="module">- 客户信息</span></h1>
			
				<div id="navibar">
					<ul>
						<li class="current_tab"><a href="lrfpb.html">利润分配表</a></li>				
						<li><a href="http://192.168.1.20:8085/projects">现金流量表</a></li>
						<li><a href="http://192.168.1.20:8085/customers">信用等级评定</a></li>
						<li><a href="sdkhxx.html">双大客户信息</a></li>
					</ul>
				</div>
			
		</div>
		<div id="workspace">
			<h2 id="lrfpb">利润分配表</h2>
			
			<table>
				
				<tr>
    				<td>
    				客户编号
    				</td>
    				<td>
    				静态文本
			    	</td>
			    	<td>
			    		<a href="javascript:showCal('Calendar1')">填报日期</a>
			    	</td>
			    	<td>
			    		<input type="text" name="firstinput" size=20 id="zuoduiqi"> 
			    	</td>
   				</tr>	
    
   				<tr>
    				<td>
    				客户名称
			    	</td>
			    	<td>静态文本</td>
    			</tr>

			    		<%  
							ArrayList<Lrfpb> list = (ArrayList<Lrfpb>)session.getAttribute("allLrfpbInfo");
							for(Lrfpb a : list){
								out.println("<tr><td>"+"净利润"+"</td><td>"
								+"<input type='text' name='jlr' value="+a.getJlr()+">"+"</td><td>"
								+"可供分配利润"+"</td><td>"+"<input type='text' name='kgfplr' value="+a.getKgfplr()+">"+"</td></tr>"
								+"<tr><td>"+"减：应交特种基金"+"</td><td>"
								+"<input type='text' name='yjtzjj' value="+a.getYjtzjj()+">"+"</td><td>"
								+"加：盈余公积补亏"+"</td><td>"
								+"<input type='text' name='yygjbk' value="+a.getYygjbk()+">"+"</td></tr>"
								+"<tr><td>"+"加：年初未分配利润"+"</td><td>"
								+"<input type='text' name='ncwfplr' value="+a.getNcwfplr()+">"+"</td><td>"
								+"减：提取盈余公积"+"</td><td>"
								+"<input type='text' name='tqyygj' value="+a.getTqyygj()+">"+"</td></tr>"
								+"<tr><td>"+"减：单项留用利润"+"</td><td>"
								+"<input type='text' name='dxlylr' value="+a.getDxlylr()+">"+"</td><td>"
								+"减：应付利润"+"</td><td>"
								+"<input type='text' name='yflr' value="+a.getYflr()+">"+"</td></tr>"
								+"<tr><td>&nbsp</td><td>&nbsp</td><td>"+"未分配利润"+"</td><td>"
								+"<input type='text' name='wfplr' value="+a.getWfplr()+">"+"</td></tr>");	
							}		
					%>
			
   	 			
			</table>
			
			<center><table>
    	
    	<tr>
			<td align="middle" >	
   	 		<a href="updateLrfpb.jsp">修改</a>	
   	 		</td>
   	 	</tr>
   	 		
			</table>
			
			
	
		</div>
		
		<div id="footer"><p>&copy; 2009 CrossCloud </p></div>
		
	</div>
	
	
	
</form>


		


</body></html>
		
	