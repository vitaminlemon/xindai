<%@ page language="java" pageEncoding="UTF-8" import="java.util.ArrayList"  %>
<%--@ page import="com.credit.customer.main.models.*" --%>


<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.1//EN"
	"http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd">
<html>
	<head>
		<meta http-equiv="Content-type" content="text/html; charset=utf-8">
		<title>信贷-客户</title>
		 <link href="css/link1.css" media="screen" rel="Stylesheet" type="text/css">
		<script src="js/prototype-1.6.0.3.js" type="text/javascript" charset="utf-8">
		</script> 
		<script src="js/effects.js" type="text/javascript"></script>	
		<script src="js/scriptaculous.js" type="text/javascript"></script>
  		<script src="js/unittest.js" type="text/javascript"></script>

		
  		<script type="text/javascript" charset="utf-8">
	//	window.document.register_or_signin.focus();
			function register(){
				//new Effect.Appear('khxx_1'); 
				 new Effect.Appear('khxx_1'); 
				 new Effect.Fade('khxx_2'); 
				 new Effect.Fade('xuanze')
				//new Effect.DropOut('khxx_2');  
				//new Effect.DropOut('xuanze'); 
			}
			function signin(){
				//new Effect.Appear('khxx_2');  
				//new Effect.Appear('xuanze');  
				 new Effect.Appear('khxx_2');  
				 new Effect.Appear('xuanze');  
				 new Effect.Fade('khxx_1'); 
				//new Effect.DropOut('khxx_1'); 
				
			}
		
			function check(){   
  				if(document.form1.customer_types.item(2).checked){   
        			document.form1.action='ok.html';   
  				}   
 				 else{   
        			document.form1.action='nook.html';   
  				}   
        			document.form1.submit();   
  				}   
   
  
		
   
		</script>

	</head>
	<body id="" onload="">
		
		
		
			
		<form action="servlet/CustomerTypesServlet" method="get" accept-charset="utf-8">
			
		
	
		
	

		
		<div id="frame">
			<div id="header">
				<div id="signoutlink">
				
					<span>Welcome!</span>|<a href="http://192.168.1.20:8085/logout">退出登录!</a>	
				
				</div>
					<h1>信贷管理信息系统  <span id="module">- 客户信息</span></h1>

			</div>
			<div id="workspaces">
				<h2 id="lrfpb">客户信息</h2>
				<table>
					<tr>
						<td>
							<fieldset id="" class="">
																															
								<input type="radio" name="register_or_signin" value="0" onclick="register() " />登记新客户
								<input type="radio" name="register_or_signin" value="1"  onclick="signin()" />客户信息录入修改
							</fieldset>
						</td>
					</tr>
				</table>
				<table  id="khxx_1">	
					<tr>
						<td><h3>客户类型选择</h3></td>
						
					</tr>
					<tr>
						<td><fieldset id="" class="">
							
								<table>																							
									<tr>
										<td>
											<input type="radio" name="customer_types" value="0"   />报送财政部规定会计报表的客户
											<input type="radio" name="customer_types" value="2"  />自然人
										</td>
									</tr>
									<tr>
										<td>	
											<input type="radio" name="customer_types" value="1"  />不报送财政部规定会计报表的客户
										</td>
									</tr>
								</table>
							</fieldset></td>
						
					</tr>
					<tr>
						<td><input  type="submit" name="dengji" value="登记客户" id="dengji"  ></td>
					</tr>
				</table>
				</form>
				
					<h3 id="xuanze">客户选择（/）</h3>			
				<table border="2"  id="khxx_2">
					<tr>
						<td>查询条件</td>
						<td colspan="2"><input type="text/submit/hidden/button" name="some_name" value="" id="some_name" /></td>

						<td></td>
				
						
					</tr>
					<tr>
						<td>客户编号<input type="submit" value="" /></td>
						<td width="30%"> </td>
						<td>客户类型</td>
						<td></td>

					</tr>
					<tr>
						<td>客户名称</td>
						<td></td>
						<td>证件号码</td>
						<td></td>
					</tr>
					<tr>

						<td colspan="2">
							<input type="button" name="some_name" value="第一个" id="some_name" />
							<input type="button" name="some_name" value="前一个" id="some_name" />
							<input type="button" name="some_name" value="后一个" id="some_name" />
							<input type="button" name="some_name" value="最后一个" id="some_name" />
						</td>
					
						<td><input type="button" name="some_name" value="客户信息查询" id="some_name"></td>
						<td width="30%"></td>
					</tr>

						<td colspan="3"><fieldset id="" class="">
							<legend></legend>
							<input type="radio" name="some_name" value="" id="some_name" />
							
						</fieldset></td>
						
						<td>
							<input type="button" name="some_name" value="录入" id="some_name" />
							<br /><input type="submit" value="修改" />
						</td>
				</table>
			</div>
			<div id="footer">
				<p>&copy; 2009 CrossCloud </p>
			</div>
		</div>
		
		

		


			
			
	
		
	</body>
</html>