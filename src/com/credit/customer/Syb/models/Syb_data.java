package com.credit.customer.Syb.models;

import java.sql.*;
import java.util.ArrayList;

public class Syb_data{
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
			ps = conn.prepareStatement("INSERT INTO d06sy VALUES(TRAccID_seq.nextval, ?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
			ps.setDouble(1, xssr);
			ps.setDouble(2, xscb);
			ps.setDouble(3, xsfy);
			ps.setDouble(4, xssj);
			ps.setDouble(5, xslr);
			ps.setDouble(6, tzly);
			ps.setDouble(7, btsr);
			ps.setDouble(8, sytz);
			ps.setDouble(9, lrze);
			ps.setDouble(10, sds);
			ps.setDouble(11, jlr);
			ps.setDouble(12, qtywlr);
			ps.setDouble(13, glfy);
			ps.setDouble(14, cwfy);
			ps.setDouble(15, yelr);
			ps.setDouble(16, yewsr);
			ps.setDouble(17, yewzc);
			result = ps.executeUpdate(); // INSERT DELETE UPDATE
			ps.close();
			conn.close();
			
					
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		return result==1;
	
		
		
		
	}
	
	public Syb_data(){}
	public Syb_data(double xssr, double xscb,double xsfy,double xssj,double xslr,double tzly,double btsr,double sytz,double lrze,double sds,double jlr,double qtywlr,double glfy,double cwfy,double yelr,double yewsr,double yewzc){
		this.xssr = xssr;
		this.xscb = xscb;
		this.xsfy = xsfy;
		this.xssj = xssj;   
		this.xslr = xslr;
		this.tzly = tzly;
		this.btsr = btsr;
		this.sytz = sytz;
		this.lrze = lrze;
		this.sds = sds;
		this.jlr = jlr;
		this.qtywlr = qtywlr;
		this.glfy = glfy;
		this.cwfy = cwfy;
		this.yelr = yelr;
		this.yewsr = yewsr;
		this.yewzc = yewzc;
				
	}
	
	public void setXssr(double xssr){
		this.xssr = xssr;
	}
	
	public double getXssr(){
		return xssr;
	}
	
	public void setXscb(double xscb){
		this.xscb = xscb;
	}
	
	public double getXscb(){
		return xscb;
	}
	
	public void setXsfy(double xsfy){
		this.xsfy = xsfy;
	}
	
	public double getXsfy(){
		return xsfy;
	}
	
	public void setXssj(double xssj){
		this.xssj = xssj;
	}
	
	public double getXssj(){
		return xssj;
	}
	
	public void setXslr(double xslr){
		this.xslr = xslr;
	}
	public double getXslr(){
		return xslr;
	}
	public void setTzly(double tzly){
		this.tzly = tzly;
	}
	
	public double getTzly(){
		return tzly;
	}
	
	public void setBtsr(double btsr){
		this.btsr = btsr;
	}
	
	public double getBtsr(){
		return btsr;
	}
	public void setSytz(double sytz){
		this.sytz = sytz;
	}
	
	public double getSytz(){
		return sytz;
	}
	
	public void setLrze(double lrze){
		this.lrze = lrze;
	}
	
	public double getLrze(){
		return lrze;
	}
	public void setSds(double sds){
		this.sds = sds;
	}
	
	public double getSds(){
		return sds;
	}
	
	public void setJlr(double jlr){
		this.jlr = jlr;
	}
	
	public double getJlr(){
		return jlr;
	}
	public void setQtywlr(double qtywlr){
		this.qtywlr = qtywlr;
	}
	
	public double getQtywlr(){
		return qtywlr;
	}
	
	public void setGlfy(double glfy){
		this.glfy = glfy;
	}
	
	public double getGlfy(){
		return glfy;
	}
	public void setCwfy(double cwfy){
		this.cwfy = cwfy;
	}
	
	public double getCwfy(){
		return cwfy;
	}
	
	public void setYelr(double yelr){
		this.yelr = yelr;
	}
	
	public double getYelr(){
		return yelr;
	}
	public void setYewsr(double yewsr){
		this.yewsr = yewsr;
	}
	
	public double getYewsr(){
		return yewsr;
	}
	
	public void setYewzc(double yewzc){
		this.yewzc = yewzc;
	}
	
	public double getYewzc(){
		return yewzc;
	}
	
	
	
	private double xssr = 0.0;
	private double xscb = 0.0;
	private double xsfy = 0.0;
	private double xssj = 0.0;
	private double xslr = 0.0;
	private double tzly = 0.0;
	private double btsr = 0.0;
	private double sytz = 0.0;
	private double lrze = 0.0;
	private double sds = 0.0;
	private double jlr = 0.0;
	private double qtywlr = 0.0;
	private double glfy = 0.0;
	private double cwfy = 0.0;
	private double yelr = 0.0;
	private double yewsr = 0.0;
	private double yewzc = 0.0;
	
}
