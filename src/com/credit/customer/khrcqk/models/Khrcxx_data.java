package com.credit.customer.khrcqk.models;

import java.sql.*;
import java.util.ArrayList;

public class Khrcxx_data{
	static{
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
		
		// 3. Connection
		try{
			
			conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XINDAI","user","netcop");
			ps = conn.prepareStatement("INSERT INTO d11rc VALUES(TRAccID_seq.nextval, ?, ?)");
			ps.setDouble(1, f11jhck);
			ps.setDouble(2, f11dbje);
			result = ps.executeUpdate(); // INSERT DELETE UPDATE
			ps.close();
			conn.close();
			
					
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		return result==1;
	
		
		
		
	}
	
	public Khrcxx_data(){}
	public Khrcxx_data(double f11jhck, double f11dbje){
		this.f11jhck = f11jhck;
		this.f11dbje = f11dbje;		
	}
	
	public void setF11jhck(double f11jhck){
		this.f11jhck = f11jhck;
	}
	
	public double getF11jhck(){
		return f11jhck;
	}
	
	public void setF11dbje(double f11dbje){
		this.f11dbje = f11dbje;
	}
	
	public double getF11dbje(){
		return f11dbje;
	}
	
	
	private double f11jhck = 0.0;
	private double f11dbje = 0.0;
}


	
