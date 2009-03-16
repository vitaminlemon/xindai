<%@ page language="java" pageEncoding="UTF-8" import="java.util.ArrayList"  %>
<%@ page import="com.credit.customer.xjllb.models.Xjllb"  %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xml:lang="en" xmlns="http://www.w3.org/1999/xhtml" lang="en"><head>

  <meta http-equiv="content-type" content="text/html; charset=UTF-8">
  <title>信贷-客户</title>
  <link href="css/link1.css" media="screen" rel="Stylesheet" type="text/css">
  <script language="javascript" src="js/cal2.js"></script>
  <script language="javascript" src="js/cal_conf2.js"></script>
  <script language="javascript" src="js/sanweiyifen.js"></script>

</head><body>
		

	<form action="servlet/DisplayXjllbServlet" method="get" name="sampleform">
	<div id="frame">
		<div id="header">
			<div id="signoutlink">
				
					<span>Welcome!</span>|<a href="http://192.168.1.20:8085/logout">退出登录!</a>	
				
			</div>
			<h1>信贷管理信息系统  <span id="module">- 客户信息</span></h1>
			
				<div id="navibar">
					<ul>
						<li><a href="lrfpb.html">利润分配表</a></li>				
						<li class="current_tab"><a href="http://192.168.1.20:8085/projects">现金流量表</a></li>
						<li><a href="http://192.168.1.20:8085/customers">信用等级评定</a></li>
						<li><a href="sdkhxx.html">双大客户信息</a></li>
					</ul>
				</div>
			
		</div>
		<div id="workspace">
			<h2 id="lrfpb">现金流量表</h2>
			
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
							ArrayList<Xjllb> list = (ArrayList<Xjllb>)session.getAttribute("allXjllbInfo");
							for(Xjllb a : list){
								out.println("<tr><td>"+"净利润"+"</td><td>"
								+"<input type='text' name='jlr' value="+a.getJlr()+">"+"</td><td>"
								+"计提累计折旧"+"</td><td>"+"<input type='text' name='jtlj' value="+a.getJtlj()+">"+"</td></tr>"
								+"<tr><td>"+"无形资产摊销"+"</td><td>"
								+"<input type='text' name='wxzc' value="+a.getWxzc()+">"+"</td><td>"
								+"固定资产报废损失"+"</td><td>"
								+"<input type='text' name='gdzc' value="+a.getGdzc()+">"+"</td></tr>"
								+"<tr><td>"+"出售长期资产的损失"+"</td><td>"
								+"<input type='text' name='cscq' value="+a.getCscq()+">"+"</td><td>"
								+"计入损益的长期借款利息"+"</td><td>"
								+"<input type='text' name='jrsy' value="+a.getJrsy()+">"+"</td></tr>"
								+"<tr><td>"+"应收项目净额的减少"+"</td><td>"
								+"<input type='text' name='ysxm' value="+a.getYsxm()+">"+"</td><td>"
								+"存货的减少"+"</td><td>"
								+"<input type='text' name='chdjs' value="+a.getChdjs()+">"+"</td></tr>"
								+"<tr><td>"+"应付项目的增加"+"</td><td>"
								+"<input type='text' name='yfxm' value="+a.getYfxm()+">"+"</td></tr>"
								+"<tr><td>"+"经营活动产生现金净额"+"</td><td>"
								+"<input type='text' name='jyhd' value="+a.getYjhd()+">"+"</td></tr>"
								+"<tr><td>&nbsp</td></tr>"	
								+"<tr><td>"+"回收长期资产取得的现金"+"</td><td>"
								+"<input type='text' name='hscq' value="+a.getHscq()+">"+"</td><td>"
								+"出售固定资产回收的现金"+"</td><td>"
								+"<input type='text' name='csgd' value="+a.getCsgd()+">"+"</td></tr>"
								+"<tr><td>"+"购买固定资产支付的现金"+"</td><td>"
								+"<input type='text' name='gmgd' value="+a.getGmgd()+">"+"</td><td>"
								+"购买股票支付的现金"+"</td><td>"
								+"<input type='text' name='gmgp' value="+a.getGmgp()+">"+"</td></tr>"
								+"<tr><td>"+"购买债券支付的现金"+"</td><td>"
								+"<input type='text' name='gmzq' value="+a.getGmzq()+">"+"</td></tr>"
								+"<tr><td>"+"投资产生的现金流动净额"+"</td><td>"
								+"<input type='text' name='tzcs' value="+a.getTzcs()+">"+"</td></tr>"
								+"<tr><td>&nbsp</td></tr>"
								+"<tr><td>"+"发行股票收到的现金"+"</td><td>"
								+"<input type='text' name='fxgp' value="+a.getFxgp()+">"+"</td><td>"
								+"发行债券收到的现金"+"</td><td>"
								+"<input type='text' name='fxzq' value="+a.getFxzq()+">"+"</td></tr>"
								+"<tr><td>"+"向其他企业借款收到的现金"+"</td><td>"
								+"<input type='text' name='xqtqy' value="+a.getXqtqy()+">"+"</td><td>"
								+"支付股利收到的现金"+"</td><td>"
								+"<input type='text' name='zfgl' value="+a.getZfgl()+">"+"</td></tr>"
								+"<tr><td>"+"偿还债务付出的现金"+"</td><td>"
								+"<input type='text' name='chzw' value="+a.getChzw()+">"+"</td></tr>"
								+"<tr><td>"+"筹资活动所使用的费用"+"</td><td>"
								+"<input type='text' name='czhdfy' value="+a.getCzhdfy()+">"+"</td></tr>"
								+"<tr><td>"+"融资租赁固定资产支付费用"+"</td><td>"
								+"<input type='text' name='rzzl' value="+a.getRzzl()+">"+"</td></tr>"
								+"<tr><td>"+"筹资活动产生的现金净额"+"</td><td>"
								+"<input type='text' name='czhdje' value="+a.getCzhdje()+">"+"</td></tr>"
								+"<tr><td>&nbsp</td></tr>"
								+"<tr><td>"+"汇率折算差额"+"</td><td>"
								+"<input type='text' name='hlzs' value="+a.getHlzs()+">"+"</td></tr>"
								+"<tr><td>"+"现金流量净增加额"+"</td><td>"
								+"<input type='text' name='xjll' value="+a.getXjll()+">"+"</td></tr>"	);
							}		
					%>
			
   	 			
			</table>
			
			<center><table>
    	
    	<tr>
			<td align="middle" >	
   	 		<a href="updateXjllb.jsp">修改</a>	
   	 		</td>
   	 	</tr>
   	 		
			</table>
			
			
	
		</div>
		
		<div id="footer"><p>&copy; 2009 CrossCloud </p></div>
		
	</div>
	
	
	
</form>


		


</body></html>