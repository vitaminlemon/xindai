<%@ page language="java" pageEncoding="UTF-8" import="java.util.ArrayList" contentType="text/html;charset=gb2312" %>
<%@ page import="com.credit.customer.ziranren.models.*" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.1//EN"
	"http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd">
<html>
	<head>
		
		<title>信贷-客户</title>
		<meta http-equiv="Content-type" content="text/html; charset=gb2312">
		 <link href="css/link1.css" media="screen" rel="Stylesheet" type="text/css">

	</head>
	
	<body id="" onload="">
		
		<form action="servlet/RegisterServlet" method="post" accept-charset="utf-8">
			
		
		
		<div id="frame">
			<div id="header">
				<div id="signoutlink">
				
					<span>Welcome!</span>|<a href="http://192.168.1.20:8085/logout">退出登录!</a>	
				
			</div>
			<h1>信贷管理信息系统  <span id="module">- 客户信息</span></h1>

			</div>
			<div id="workspaces">
				<h2 id="lrfpb">自然人基本信息表</h2>
				<table>
					<tr>
						<td>客户姓名</td>
						<td><input type="Text" name="name"></td>
						<td>性别</td>
						<td>
							<fieldset id="" class="" name= "sex">
								<legend></legend>
								<input type="radio" checked name="sex" value="0">男
								<input type="radio"  name="sex" value="1">女
								<input type="radio"  name="sex" value="2">?
							</fieldset>
							
						</td>
					</tr>
					<tr>
						<td>身份证号</td>
						<td><input type="Text" name="id"></td>
						<td>证件类型</td>
						<td>
							
								
							
							<select name="documentTypes" id="some_name" >
								<%ArrayList<Account> allLeixings = (ArrayList<Account>)session.getAttribute("allLeixingInfo");
									
								for(Account z:allLeixings){
									
									out.println("<option value=\""+z.getdm()+"\">" +z.gethy()+ "</option>");
								}%>
							</select>	
							
					
						</td>
					</tr>
					<tr>
						<td>工作单位</td>
						<td><input type="Text" name="workUnit"></td>
						<td>客户种类</td>
						<td>静态文本</td>
					</tr>
					<tr>
						<td>户口所在地</td>
						<td><input type="Text" name="accLoc"></td>
						<td>邮编</td>
						<td><input type="Text" name="zipCode"></td>
					</tr>
					<tr>
						<td>家庭住址</td>
						<td><input type="Text" name="homeAddress"></td>
						<td>家庭电话</td>
						<td><input type="Text" name="homePhone"></td>
					</tr>
					<tr>
						<td>单位地址</td>
						<td><input type="Text" name="unitAddress"></td>
						<td>单位电话</td>
						<td><input type="Text" name="unitPhone"></td>
					</tr>
				</table>
				<table>
					<tr>
						<td><h3>职业</h3></td>
					</tr>
					<tr>
						<td>
							<fieldset id="" class="" name="occupation">
								<table>
									<%ArrayList<Account> zyInfo = (ArrayList<Account>)session.getAttribute("allZyInfo");
										
								for(Account x:zyInfo){		
									out.println("<tr><td><input type=\"radio\" name =\"occupation\" value=\""+x.getzydm()+"\">"+x.getzymc()+"</td></tr>");		
									
								}%>					
								</table>
							</fieldset>
						</td>
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