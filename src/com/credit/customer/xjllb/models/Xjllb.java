package com.credit.customer.xjllb.models;


import java.sql.*;
import java.util.*;

public class Xjllb{
	static{
			try{
				Class.forName("oracle.jdbc.driver.OracleDriver");
			}catch(ClassNotFoundException e){
				e.printStackTrace();
			}
		}
	private String firstinput = null;
	private double jlr = 0.0;
	private double jtlj = 0.0;
	private double wxzc = 0.0;
	private double gdzc = 0.0;
	private double cscq = 0.0; 
	private double jrsy = 0.0;
	private double ysxm = 0.0;
	private double chdjs = 0.0;
	private double yfxm = 0.0;
	private double hscq = 0.0;
	private double yjhd = 0.0;
	private double csgd = 0.0;
	private double gmgd = 0.0;
	private double gmgp = 0.0;
	private double tzcs = 0.0;
	private double gmzq = 0.0;
	private double fxgp = 0.0;
	private double xqtqy = 0.0;
	private double zfgl = 0.0;
	private double fxzq = 0.0;
	private double chzw = 0.0;
	private double czhdfy = 0.0;
	private double rzzl = 0.0;
	private double czhdje = 0.0;
	private double hlzs = 0.0;
	private double xjll = 0.0;

	
		


		public boolean luru(){
			
			Connection conn = null;
			PreparedStatement ps = null;
			int result = 0;
			
			try{
				conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XINDAI","user","netcop");
				
				ps = conn.prepareStatement("INSERT INTO d08xj VALUES(LrfpbID_seq.nextval,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
				
				ps.setDate(1,java.sql.Date.valueOf(firstinput.replace('/','-'))); 
				ps.setDouble(2, jlr);
				ps.setDouble(3,jtlj);
				ps.setDouble(4,wxzc);
				ps.setDouble(5,gdzc);
				ps.setDouble(6, cscq);
				ps.setDouble(7,jrsy);
				ps.setDouble(8,ysxm);
				ps.setDouble(9,chdjs);
				ps.setDouble(10,yfxm);
				ps.setDouble(11, yjhd);
				ps.setDouble(12,hscq);
				ps.setDouble(13,csgd);
				ps.setDouble(14,gmgd);
				ps.setDouble(15, gmgp);
				ps.setDouble(16,gmzq);
				ps.setDouble(17,tzcs);
				ps.setDouble(18,fxgp);
				ps.setDouble(19,fxzq);
				ps.setDouble(20,xqtqy);
				ps.setDouble(21,zfgl);
				ps.setDouble(22,chzw);
				ps.setDouble(23, czhdfy);
				ps.setDouble(24,rzzl);
				ps.setDouble(25,czhdje);
				ps.setDouble(26,hlzs);
				ps.setDouble(27,xjll);
				
				
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
		
		
			
		public ArrayList<Xjllb> returnAllInfo(){
		
		ArrayList <Xjllb> list = null;
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet result = null; 
		
		try{
			conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XINDAI","user","netcop");
			ps = conn.prepareStatement("SELECT * FROM d08xj WHERE ID=317");
			result = ps.executeQuery();// SELECT
			
			list = new ArrayList();
			
			while(result.next()){

				
					list.add(new Xjllb(result.getString("f08tbrq"),result.getDouble("f08jlr"), result.getDouble("f08jtzj"), result.getDouble("f08wxtx"), result.getDouble("f08gzbf"), result.getDouble("f08czsy"), result.getDouble("f08sylx"), result.getDouble("f08jejs"), result.getDouble("f08chjs"), result.getDouble("f08yfzj"), result.getDouble("f08jyje"), result.getDouble("f08czxj"), result.getDouble("f08gzsj"), result.getDouble("f08gzfj"), result.getDouble("f08gpfj"), result.getDouble("f08zqfj"), result.getDouble("f08tzje"), result.getDouble("f08gpsx"), result.getDouble("f08zqsx"), result.getDouble("f08jk"), result.getDouble("f08zfgl"), result.getDouble("f08chzw"), result.getDouble("f08czfy"), result.getDouble("f08zlf"), result.getDouble("f08czje"), result.getDouble("f08hlce"), result.getDouble("f08xjzj")));
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
			
			ps = conn.prepareStatement("UPDATE d08xj SET id=LrfpbID_seq.nextval,f08tbrq=?,f08jlr=?,f08jtzj=?,f08wxtx=?,f08gzbf=?,f08czsy=?,f08sylx=?,f08jejs=?,f08chjs=?,f08yfzj=?,f08jyje=?,f08czxj=?,f08gzsj=?,f08gzfj=?,f08gpfj=?,f08zqfj=?,f08tzje=?,f08gpsx=?,f08zqsx=?,f08jk=?,f08zfgl=?,f08chzw=?,f08czfy=?,f08zlf=?,f08czje=?,f08hlce=?,f08xjzj=? WHERE id=317");
			
			
			ps.setDate(1,java.sql.Date.valueOf(firstinput.replace('/','-'))); 
			ps.setDouble(2, jlr);
			ps.setDouble(3,jtlj);
			ps.setDouble(4,wxzc);
			ps.setDouble(5,gdzc);
			ps.setDouble(6, cscq);
			ps.setDouble(7,jrsy);
			ps.setDouble(8,ysxm);
			ps.setDouble(9,chdjs);
			ps.setDouble(10,yfxm);
			ps.setDouble(11, yjhd);
			ps.setDouble(12,hscq);
			ps.setDouble(13,csgd);
			ps.setDouble(14,gmgd);
			ps.setDouble(15, gmgp);
			ps.setDouble(16,gmzq);
			ps.setDouble(17,tzcs);
			ps.setDouble(18,fxgp);
			ps.setDouble(19,fxzq);
			ps.setDouble(20,xqtqy);
			ps.setDouble(21,zfgl);
			ps.setDouble(22,chzw);
			ps.setDouble(23, czhdfy);
			ps.setDouble(24,rzzl);
			ps.setDouble(25,czhdje);
			ps.setDouble(26,hlzs);
			ps.setDouble(27,xjll);
			

		    
			result = ps.executeUpdate();
			ps.close();
			conn.close();
			
			
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		return result==1;
		
	}
		
		
		
		public Xjllb(){}
		public Xjllb(String firstinput, double jlr, double jtlj, double wxzc, double gdzc,double cscq, double jrsy, double ysxm, double chdjs, double yfxm, double yjhd, double hscq, double csgd, double gmgd,double gmgp, double gmzq, double tzcs, double fxgp, double fxzq, double xqtqy, double zfgl, double chzw, double czhdfy,double rzzl, double czhdje, double hlzs, double xjll){
			
			this.firstinput = firstinput;
			this.jlr = jlr;
			this.jtlj = jtlj;
			this.wxzc = wxzc;
			this.gdzc = gdzc;
			this.cscq = cscq;
			this.jrsy = jrsy;
			this.ysxm = ysxm;
			this.chdjs = chdjs;
			this.yfxm = yfxm;
			this.yjhd = yjhd;
			this.hscq = hscq;
			this.csgd = csgd;
			this.gmgd = gmgd;
			this.gmgp = gmgp;
			this.gmzq = gmzq;
			this.tzcs = tzcs;
			this.fxgp = fxgp;
			this.fxzq = fxzq;
			this.xqtqy = xqtqy;
			this.zfgl = zfgl;
			this.chzw = chzw;
			this.czhdfy = czhdfy;
			this.rzzl = rzzl;
			this.czhdje = czhdje;
			this.hlzs = hlzs;
			this.xjll = xjll;
			
			
			
			
			

		}
		
		
	


	public String getFirstinput() {
		return firstinput;
	}

	public void setFirstinput(String firstinput) {
		this.firstinput = firstinput;
	}

	public double getJlr() {
		return jlr;
	}

	public void setJlr(double jlr) {
		this.jlr = jlr;
	}

	public double getJtlj() {
		return jtlj;
	}

	public void setJtlj(double jtlj) {
		this.jtlj = jtlj;
	}

	public double getWxzc() {
		return wxzc;
	}

	public void setWxzc(double wxzc) {
		this.wxzc = wxzc;
	}

	public double getGdzc() {
		return gdzc;
	}

	public void setGdzc(double gdzc) {
		this.gdzc = gdzc;
	}

	public double getCscq() {
		return cscq;
	}

	public void setCscq(double cscq) {
		this.cscq = cscq;
	}

	public double getJrsy() {
		return jrsy;
	}

	public void setJrsy(double jrsy) {
		this.jrsy = jrsy;
	}

	public double getYsxm() {
		return ysxm;
	}

	public void setYsxm(double ysxm) {
		this.ysxm = ysxm;
	}

	public double getChdjs() {
		return chdjs;
	}

	public void setChdjs(double chdjs) {
		this.chdjs = chdjs;
	}

	public double getYfxm() {
		return yfxm;
	}

	public void setYfxm(double yfxm) {
		this.yfxm = yfxm;
	}

	public double getHscq() {
		return hscq;
	}

	public void setHscq(double hscq) {
		this.hscq = hscq;
	}

	public double getYjhd() {
		return yjhd;
	}

	public void setYjhd(double yjhd) {
		this.yjhd = yjhd;
	}

	public double getCsgd() {
		return csgd;
	}

	public void setCsgd(double csgd) {
		this.csgd = csgd;
	}

	public double getGmgd() {
		return gmgd;
	}

	public void setGmgd(double gmgd) {
		this.gmgd = gmgd;
	}

	public double getGmgp() {
		return gmgp;
	}

	public void setGmgp(double gmgp) {
		this.gmgp = gmgp;
	}

	public double getTzcs() {
		return tzcs;
	}

	public void setTzcs(double tzcs) {
		this.tzcs = tzcs;
	}

	public double getGmzq() {
		return gmzq;
	}

	public void setGmzq(double gmzq) {
		this.gmzq = gmzq;
	}

	public double getFxgp() {
		return fxgp;
	}

	public void setFxgp(double fxgp) {
		this.fxgp = fxgp;
	}

	public double getXqtqy() {
		return xqtqy;
	}

	public void setXqtqy(double xqtqy) {
		this.xqtqy = xqtqy;
	}

	public double getZfgl() {
		return zfgl;
	}

	public void setZfgl(double zfgl) {
		this.zfgl = zfgl;
	}

	public double getFxzq() {
		return fxzq;
	}

	public void setFxzq(double fxzq) {
		this.fxzq = fxzq;
	}

	public double getChzw() {
		return chzw;
	}

	public void setChzw(double chzw) {
		this.chzw = chzw;
	}

	public double getCzhdfy() {
		return czhdfy;
	}

	public void setCzhdfy(double czhdfy) {
		this.czhdfy = czhdfy;
	}

	public double getRzzl() {
		return rzzl;
	}

	public void setRzzl(double rzzl) {
		this.rzzl = rzzl;
	}

	public double getCzhdje() {
		return czhdje;
	}

	public void setCzhdje(double czhdje) {
		this.czhdje = czhdje;
	}

	public double getHlzs() {
		return hlzs;
	}

	public void setHlzs(double hlzs) {
		this.hlzs = hlzs;
	}

	public double getXjll() {
		return xjll;
	}

	public void setXjll(double xjll) {
		this.xjll = xjll;
	}
		
	
}
	