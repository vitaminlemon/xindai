<%@ page language="java" pageEncoding="UTF-8" import="java.util.ArrayList"  %>
<%--@ page import="com.credit.customer.xydjpd.models.Xydjpd"  --%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xml:lang="en" xmlns="http://www.w3.org/1999/xhtml" lang="en"><head>



  <meta http-equiv="content-type" content="text/html; charset=UTF-8">
  <title>信贷-客户</title>
  <link href="link1.css" media="screen" rel="Stylesheet" type="text/css">
</head><body>
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
						<li class="current_tab"><a href="http://192.168.1.20:8085/customers">信用等级评定</a></li>
						<li><a href="sdkhxx.html">双大客户信息</a></li>
					</ul>
				</div>
			
		</div>
		
		<div id="workspace">
			<h2 id="lrfpb">信用等级评定</h2>
			<table>
				<form action="customer_index.html" method="POST">
   				客户名称： （静态文本）
   				<br />营业执照号:（静态文本）
   				
  				<form  action="khxx2.html" method="POST"> 
    				<p>评定机构：
      					<input type="Text" name="phone" value="" size="10" maxlength="8"> 


				<form action=" " method="POST"> 评定结果：
				<select name="pingding"> 
					<option value="zero"selected>0|未评定|0|0|</option> 
					<option value="one" >1|AAA级|100|90|</option> 
					<option value="two">2|AA级|90|80|</option> 
					<option value="three">3|A级|80|70|</option> 
					<option value="four">4|BBB级|70|60|</option> 
					<option value="five">5|BB级及BB级以下|60|0|</option>
				</select> 
				
				</form>

   	 			<form  action="khxx2.html" method="POST"> 
    				<p>评定日期：
      					<input type="Text" name="phone" value="" size="10" maxlength="8"> 
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




</body></html>