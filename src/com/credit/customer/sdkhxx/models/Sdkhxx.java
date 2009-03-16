package com.credit.customer.sdkhxx.models;

import java.sql.*;
import java.util.*;

public class Sdkhxx{
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
		
			ps = conn.prepareStatement("INSERT INTO d45sdkh VALUES(SdkhxxID_seq.nextval,?,?,?,?,?,?,?,?,?,?,?,?,?)");
		
				ps.setDate(1,java.sql.Date.valueOf(firstinput.replace('/','-'))); 
				ps.setDouble(2, cxl);
				ps.setDouble(3,gdzcdk);
				ps.setDouble(4,whdkye);
				ps.setDouble(5,dqwhdkye);
				ps.setDouble(6, whckye);
				ps.setDouble(7,jhwhckye);
				ps.setDouble(8,bhye);
				ps.setDouble(9,yhcdhpje);
				ps.setDouble(10,wfxyzye);
				ps.setDouble(11,jhwfxyzye);
				ps.setString(12,jykh);
				ps.setString(13,ssgs);
			
				result = ps.executeUpdate();
				ps.close();
				conn.close();
				
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		return result==1;
	}
	
	
		public ArrayList<Sdkhxx> returnAllInfo(){
		
		ArrayList <Sdkhxx> list = null;
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet result = null; 
		
		try{
			conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XINDAI","user","netcop");
			ps = conn.prepareStatement("SELECT * FROM d45sdkh WHERE ID=61");
			result = ps.executeQuery();// SELECT
			
			list = new ArrayList();
			
			while(result.next()){

				
				list.add(new Sdkhxx(result.getString("f45rq"),result.getDouble("f45cxl"), result.getDouble("f45gdzc"), result.getDouble("f45whdk"), result.getDouble("f45dqwh"), result.getDouble("f45whck"), result.getDouble("f45jhwh"), result.getDouble("f45jrbz"), result.getDouble("f45cdhp"), result.getDouble("f45yhxy"), result.getDouble("f45jhxy"),result.getString("f45zjjy"), result.getString("f45ssgs")));
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
			
			ps = conn.prepareStatement("UPDATE d45sdkh SET id=LrfpbID_seq.nextval,f45rq=?,f45cxl=?,f45gdzc=?,f45whdk=?,f45dqwh=?,f45whck=?,f45jhwh=?,f45jrbz=?,f45cdhp=?,f45yhxy=?,f45jhxy=?,f45zjjy=?,f45ssgs=? WHERE id=61");
			
				ps.setDate(1,java.sql.Date.valueOf(firstinput.replace('/','-'))); 
				ps.setDouble(2, cxl);
				ps.setDouble(3,gdzcdk);
				ps.setDouble(4,whdkye);
				ps.setDouble(5,dqwhdkye);
				ps.setDouble(6, whckye);
				ps.setDouble(7,jhwhckye);
				ps.setDouble(8,bhye);
				ps.setDouble(9,yhcdhpje);
				ps.setDouble(10,wfxyzye);
				ps.setDouble(11,jhwfxyzye);
				ps.setString(12,jykh);
				ps.setString(13,ssgs);
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
	
	
	public Sdkhxx(){}
	public Sdkhxx(String firstinput, double cxl, double gdzcdk, double whdkye, double dqwhdkye, double whckye, double jhwhckye,  double bhye, double yhcdhpje, double wfxyzye, double jhwfxyzye, String jykh, String ssgs){
		this.firstinput = firstinput;
		this.cxl = cxl;
		this.gdzcdk = gdzcdk;
		this.whdkye = whdkye;
		this.dqwhdkye = dqwhdkye;
		this.whckye = whckye;
		this.jhwhckye = jhwhckye;
		this.bhye = bhye;
		this.yhcdhpje = yhcdhpje;
		this.wfxyzye = wfxyzye;
		this.jhwfxyzye = jhwfxyzye;
		this.jykh = jykh;
		this.ssgs = ssgs;
	}	
	
	public void setFirstinput(String firstinput){
		this.firstinput = firstinput;
	}
	
	public String getFirstinput(){
		return firstinput;
	}
	
	public void setCxl(double cxl){
		this.cxl = cxl;
	}
	
	public double getCxl(){
		return cxl;
	}
	
	public void setGdzcdk(double gdzcdk){
		this.gdzcdk = gdzcdk;
	}
	
	public double getGdzcdk(){
		return gdzcdk;
	}
	
	public void setWhdkye(double whdkye){
		this.whdkye = whdkye;
	}
	
	public double getWhdkye(){
		return whdkye;
	}
	
	public void setDqwhdkye(double dqwhdkye){
		this.dqwhdkye = dqwhdkye;
	}
	
	public double getDqwhdkye(){
		return dqwhdkye;
	}
	
	public void setWhckye(double whckye){
		this.whckye = whckye;
	}
	
	public double getWhckye(){
		return whckye;
	}
	
	public void setJhwhckye(double jhwhckye){
		this.jhwhckye = jhwhckye;
	}
	
	public double getJhwhckye(){
		return jhwhckye;
	}
	
	public void setBhye(double bhye){
		this.bhye = bhye;
	}
	
	public double getBhye(){
		return bhye;
	}
	
	public void setYhcdhpje(double yhcdhpje){
		this.yhcdhpje = yhcdhpje;
	}
	
	public double getYhcdhpje(){
		return yhcdhpje;
	}
	
	public void setWfxyzye(double wfxyzye){
		this.wfxyzye = wfxyzye;
	}
	
	public double getWfxyzye(){
		return wfxyzye;
	}
	
	public void setJhwfxyzye(double jhwfxyzye){
		this.jhwfxyzye = jhwfxyzye;
	}
	
	public double getJhwfxyzye(){
		return jhwfxyzye;
	}

	public void setJykh(String jykh){
		this.jykh = jykh;
	}
	
	public String getJykh(){
		return jykh;
	}
	
	public void setSsgs(String ssgs){
		this.ssgs = ssgs;
	}
	
	public String getSsgs(){
		return ssgs;
	}
	
	private String firstinput = null;
	private double cxl = 0.0;
	private double gdzcdk = 0.0;
	private double whdkye = 0.0;
	private double dqwhdkye = 0.0;
	private double whckye = 0.0;
	private double jhwhckye = 0.0;
	private double bhye = 0.0;
	private double yhcdhpje = 0.0;
	private double wfxyzye = 0.0;
	private double jhwfxyzye = 0.0;
	private String jykh = null;
	private String ssgs = null;
	
}





