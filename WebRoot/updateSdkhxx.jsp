<%@ page language="java" pageEncoding="UTF-8" import="java.util.ArrayList"  %>
<%@ page import="com.credit.customer.sdkhxx.models.Sdkhxx"  %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xml:lang="en" xmlns="http://www.w3.org/1999/xhtml" lang="en"><head>

  <meta http-equiv="content-type" content="text/html; charset=UTF-8">
  <title>信贷-客户</title>
  <link href="css/link1.css" media="screen" rel="Stylesheet" type="text/css">
  <script language="javascript" src="js/cal2.js"></script>
  <script language="javascript" src="js/cal_conf2.js"></script>
  <script language="javascript" src="js/sanweiyifen.js"></script>

</head><body>
		

	<form action="servlet/UpdateSdkhxxServlet" method="get" name="sampleform">
	<div id="frame">
		<div id="header">
			<div id="signoutlink">
				
					<span>Welcome!</span>|<a href="http://192.168.1.20:8085/logout">退出登录!</a>	
				
			</div>
			<h1>信贷管理信息系统  <span id="module">- 客户信息</span></h1>
			
				<div id="navibar">
					<ul>
						<li><a href="lrfpb.html">利润分配表</a></li>				
						<li><a href="xjllb.html">现金流量表</a></li>
						<li><a href="http://192.168.1.20:8085/customers">信用等级评定</a></li>
						<li class="current_tab"><a href="sdkhxx.html">双大客户信息</a></li>
					</ul>
				</div>
			
		</div>
		<div id="workspace">
			<h2 id="lrfpb">双大客户信息</h2>
			
			<table>
				
				<tr>
    				<td>
    				客户名称
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


			    		<%  
							ArrayList<Sdkhxx> list = (ArrayList<Sdkhxx>)session.getAttribute("allSdkhxxInfo");
							for(Sdkhxx a : list){
								out.println("<tr><td>"+"产销率"+"</td><td>"
								+"<input type='text' name='cxl' value="+a.getCxl()+">"+"</td><td>"
								+"固定资产贷款"+"</td><td>"+"<input type='text' name='gdzcdk' value="+a.getGdzcdk()+">"+"</td></tr>"
								+"<tr><td>"+"外汇贷款余额"+"</td><td>"
								+"<input type='text' name='whdkye' value="+a.getWhdkye()+">"+"</td><td>"
								+"短期外汇贷款余额"+"</td><td>"
								+"<input type='text' name='dqwhdkye' value="+a.getDqwhdkye()+">"+"</td></tr>"
								+"<tr><td>"+"外汇存款余额"+"</td><td>"+"<input type='text' name='whckye' value="+a.getWhckye()+">"+"</td><td>"
								+"建行外汇存款余额"+"</td><td>"
								+"<input type='text' name='jhwhckye' value="+a.getJhwhckye()+">"+"</td></tr>"
								+"<tr><td>"+"保函余额"+"</td><td>"
								+"<input type='text' name='bhye' value="+a.getBhye()+">"+"</td><td>"
								+"银行承兑汇票金额"+"</td><td>"
								+"<input type='text' name='yhcdhpje' value="+a.getYhcdhpje()+">"+"</td></tr>"
								+"<tr><td>"+"未付信用证余额"+"</td><td>"
								+"<input type='text' name='wfxyzye' value="+a.getWfxyzye()+">"+"</td><td>"
								+"建行未付信用证余额"+"</td><td>"
								+"<input type='text' name='jhwfxyzye' value="+a.getJhwfxyzye()+">"+"</td></tr>");	
							}		
					%>
					
				<tr>
 					<td>属总行直接经营客户：</td>
   					<td><input type="radio" name="jykh"  value="1">是
       					<input type="radio" name="jykh"  value="0">否</td>
   					<td>是否为上市公司：</td>
   					<td><input type="radio" name="ssgs"  value="1">是
       					<input type="radio" name="ssgs"  value="0">否</td>
 				</tr>	
					
			    	
   	 			
			</table>
			
			<center><table>
    	<tr>
    		
    	
    		<td align="middle" >
    			<input type="submit" name="Confirm" value="确定">    			
    		</td> 

    		
    	</tr>
				
   	 			
			</table>
			
			
	
		</div>
		
		<div id="footer"><p>&copy; 2009 CrossCloud </p></div>
		
	</div>
	
	
	
</form>


		


</body></html>