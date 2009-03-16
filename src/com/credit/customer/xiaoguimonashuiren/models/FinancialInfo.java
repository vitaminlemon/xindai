package com.credit.customer.xiaoguimonashuiren.models;

import java.sql.*;
import java.util.ArrayList; 

public class FinancialInfo{
	static {
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	}
	
	public boolean input(){
		
		Connection conn = null;
		PreparedStatement ps = null;
		int result = 0;
		
		try{
			conn=DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XINDAI","user","netcop");
			
			ps = conn.prepareStatement("INSERT INTO d09xc VALUES(?,?,?,?)");
			
			ps.setDate(1,java.sql.Date.valueOf(firstinput.replace('/','-'))); 
			ps.setDouble(2,sr);
			ps.setDouble(3,zc);
			ps.setDouble(4,lr);
			
			
		    
			result = ps.executeUpdate();
			ps.close();
			conn.close();
			
			
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		return result==1;
		
	}
	
	public FinancialInfo(){}
	public FinancialInfo(String firstinput,Double sr,Double zc,Double lr){
		this.firstinput = firstinput;
		this.sr = sr;
		this.zc = zc;
		this. lr = lr;
	} 
	
	public void setfirstinput(String firstinput){
		this.firstinput = firstinput;
	}
	
	public String getfirstinput(){
		return firstinput;
	}
	
	public void setsr(Double sr){
		this.sr= sr;
	}
	
	public Double getsr(){
		return sr;
	}
	
	public void setzc(Double zc){
		this.zc = zc;
	}
	
	public Double getzc(){
		return zc;
	}
	
	public void setlr(Double lr){
		this.lr= lr;
	}
	
	public Double getlr(){
		return lr;
	}
	
	private String firstinput = "";
	private Double sr = 0.0;
	private Double zc = 0.0;
	private Double lr = 0.0;
}