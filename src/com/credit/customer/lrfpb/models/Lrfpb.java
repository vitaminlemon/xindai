package com.credit.customer.lrfpb.models;

import java.sql.*;
import java.util.*;

public class Lrfpb{
	static{
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	}
	
	public boolean luru(){
		
		Connection conn = null;
		PreparedStatement ps = null;
		int result = 0;
		
		try{
			conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XINDAI","user","netcop");
			
			ps = conn.prepareStatement("INSERT INTO d07lr VALUES(LrfpbID_seq.nextval,?,?,?,?,?,?,?,?,?,?)");
			
			ps.setDate(1,java.sql.Date.valueOf(firstinput.replace('/','-'))); 
			ps.setDouble(2, jlr);
			ps.setDouble(3,yjtzjj);
			ps.setDouble(4,ncwfplr);
			ps.setDouble(5,dxlylr);
			ps.setDouble(6, kgfplr);
			ps.setDouble(7,yygjbk);
			ps.setDouble(8,tqyygj);
			ps.setDouble(9,yflr);
			ps.setDouble(10,wfplr);
			//System.out.println("signIn()->username:"+jlr+"<-----");
		   // System.out.println("signIn()->password:"+kgfplr+"<-----");
		    
			result = ps.executeUpdate();
			ps.close();
			conn.close();
			
			
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		return result==1;
		
	}
	
	
		public ArrayList<Lrfpb> returnAllInfo(){
		
		ArrayList <Lrfpb> list = null;
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet result = null; 
		
		try{
			conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XINDAI","user","netcop");
			ps = conn.prepareStatement("SELECT * FROM d07lr WHERE ID=233");
			result = ps.executeQuery();// SELECT
			
			list = new ArrayList();
			
			while(result.next()){
			/*
				String username = rs.getString("username");
				String password = rs.getString("password");
				Account acc = new Account(username, password);*/
				
							list.add(new Lrfpb(result.getString("f07tbrq"),result.getDouble("f07jlr"), result.getDouble("f07tzjj"), result.getDouble("f07cwfl"), result.getDouble("f07lylr"), result.getDouble("f07fplr"), result.getDouble("f07gjbk"), result.getDouble("f07tqgj"), result.getDouble("f07yflr"), result.getDouble("f07wflr")));
			}
			
			result.close();
			ps.close();
			conn.close();
			
		}catch(SQLException e){
			e.printStackTrace();
		}
				
		return list;
		
	}
	
	public boolean xiugai(){
		
		Connection conn = null;
		PreparedStatement ps = null;
		int result = 0;
		
		try{
			conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XINDAI","user","netcop");
			
			ps = conn.prepareStatement("UPDATE d07lr SET id=LrfpbID_seq.nextval,f07tbrq=?,f07jlr=?,f07tzjj=?,f07cwfl=?,f07lylr=?,f07fplr=?,f07gjbk=?,f07tqgj=?,f07yflr=?,f07wflr=? WHERE id=233");
			
			ps.setDate(1,java.sql.Date.valueOf(firstinput.replace('/','-'))); 
			ps.setDouble(2, jlr);
			ps.setDouble(3,yjtzjj);
			ps.setDouble(4,ncwfplr);
			ps.setDouble(5,dxlylr);
			ps.setDouble(6, kgfplr);
			ps.setDouble(7,yygjbk);
			ps.setDouble(8,tqyygj);
			ps.setDouble(9,yflr);
			ps.setDouble(10,wfplr);
			//System.out.println("signIn()->username:"+jlr+"<-----");
		   // System.out.println("signIn()->password:"+kgfplr+"<-----");
		    
			result = ps.executeUpdate();
			ps.close();
			conn.close();
			
			
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		return result==1;
		
	}
	
	
	public Lrfpb(){}
	public Lrfpb(String firstinput, double jlr, double yjtzjj, double ncwfplr, double dxlylr,double kgfplr, double yygjbk, double tqyygj, double yflr, double wfplr){
		
		this.firstinput = firstinput;
		this.jlr = jlr;
		this.yjtzjj = yjtzjj;
		this.ncwfplr = ncwfplr;
		this.dxlylr = dxlylr;
		this.kgfplr = kgfplr;
		this.yygjbk = yygjbk;
		this.tqyygj = tqyygj;
		this.yflr = yflr;
		this.wfplr = wfplr;
	}
	
	public void setFirstinput(String firstinput){
		this.firstinput = firstinput;
	}
	
	public String getFirstinput(){
		return firstinput;
	}
	
	public void setJlr(double jlr){
		this.jlr = jlr;
	}
	
	public double getJlr(){
		return jlr;
	}
	
	public void setYjtzjj(double yjtzjj){
		this.yjtzjj = yjtzjj;
	}
	
	public double getYjtzjj(){
		return yjtzjj;
	}
	
	public void setNcwfplr(double ncwfplr){
		this.ncwfplr = ncwfplr;
	}
	
	public double getNcwfplr(){
		return ncwfplr;
	}
	
	public void setDxlylr(double dxlylr){
		this.dxlylr = dxlylr;
	}
	
	public double getDxlylr(){
		return dxlylr;
	}
	
	public void setKgfplr(double kgfplr){
		this.kgfplr = kgfplr;
	}
	
	public double getKgfplr(){
		return kgfplr;
	}
	
	public void setYygjbk(double yygjbk){
		this.yygjbk = yygjbk;
	}
	
	public double getYygjbk(){
		return yygjbk;
	}
	
	public void setTqyygj(double tqyygj){
		this.tqyygj = tqyygj;
	}
	
	public double getTqyygj(){
		return tqyygj;
	}
	
	public void setYflr(double yflr){
		this.yflr = yflr;
	}
	
	public double getYflr(){
		return yflr;
	}
	
	public void setWfplr(double wfplr){
		this.wfplr = wfplr;
	}
	
	public double getWfplr(){
		return wfplr;
	}
	
	private String firstinput = null;
	private double jlr = 0.0;
	private double yjtzjj = 0.0;
	private double ncwfplr = 0.0;
	private double dxlylr = 0.0;
	private double kgfplr = 0.0;
	private double yygjbk = 0.0;
	private double tqyygj = 0.0;
	private double yflr = 0.0;
	private double wfplr = 0.0;
	
}







