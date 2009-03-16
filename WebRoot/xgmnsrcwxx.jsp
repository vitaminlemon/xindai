<%@ page language="java" pageEncoding="UTF-8" import="java.util.ArrayList" contentType="text/html;charset=utf-8" %>
<%@ page import="com.credit.customer.xiaoguimonashuiren.models.*" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.1//EN"
	"http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd">
<html>
	<head>
		<meta http-equiv="Content-type" content="text/html; charset=UTF-8">
		<title>信贷-客户</title>
		<link href="css/link1.css" media="screen" rel="Stylesheet" type="text/css">
		<script language="javascript" src="js/cal2.js"></script>
		<script language="javascript" src="js/cal_conf2.js"></script>
		<script language="javascript" src="js/sanweiyifen.js" type="text/javascript"></script>

  
  
		<script type="text/javascript">

			function startCalc(){
  				interval = setInterval("calc()",1);
			}
			function calc(){
				  srr = document.sampleform.sr.value;
				  zcc = document.sampleform.zc.value; 
				  //profits = document.sampleform.profit.value;
				  
				  sr1 = untran(srr);
				  zc1 = untran(zcc);
				  //profit1 = untran(profits);
				  
				  document.sampleform.lr.value = (sr1  * 1) - (zc1 * 1) ;
				  tran(document.sampleform.lr);
				  
  
  
   
			}
			function stopCalc(){
  				clearInterval(interval);
			}



		</script>


	</head>
	<body >
		<form action="servlet/InputFinancialInfoServlet" method="post" accept-charset="utf-8" name="sampleform">
			
		
	
		<div id="frame">

			<div id="header">
				<div id="signoutlink">
				
					<span>Welcome!</span>|<a href="http://192.168.1.20:8085/logout">退出登录!</a>	
				
				</div>
			<h1>信贷管理信息系统  <span id="module">- 客户信息</span></h1>

			</div>

			<div id="workspaces">
				<h2 id="lrfpb">财务信息</h2>
				<h3 align="center">不报送财政部会计报表的的客户</h3>
				<table>
					<tr>
						<td>客户名称</td>
						<td>静态文本</td>
					</tr>
					
					<tr>
							
					<td>
			    		<a href="javascript:showCal('Calendar1')">填报日期</a>
			    	</td>
			    	<td>
			    		<input type="text" name="firstinput" size=20 id="zuoduiqi"> 
			    	</td>
					</tr>
					<tr>
						<td>收入</td>
						<td><input type="text" name="sr" onkeyup="calc();tran(this);if(this.value.length>19){this.value=this.value.slice(0,19)}">元</td>
					</tr>
					<tr>
						<td>支出</td>
						<td><input type="text" name ="zc" onkeyup="calc();tran(this);if(this.value.length>19){this.value=this.value.slice(0,19)}">元</td>
					</tr>
					<tr>
						<td>利润</td>
						<td><input type="text" name="lr" onkeyup="calc();tran(this);if(this.value.length>19){this.value=this.value.slice(0,19)}">元</td>
					</tr>
				</table>
				<center><table>
    				<tr>
    					<td align="middle" >
    						<input type="submit" name="Confirm" value="确定">    			
    					</td>
    					<td align="middle" >

    						<input type="reset" name="Save" value="暂存">    			
    					</td>

    					<td align="middle" >
    						<input type="submit" name="Cancel" value="退出">    			
    					</td>
    		
    				</tr>
				
				
				
   	 			
				</table>
			</div>
				<div id="footer">
					<p>&copy; 2009 CrossCloud </p>
				</div>
		</div>
		
		</form>
	</body>
</html>