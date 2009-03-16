package com.credit.customer.ziranren.models;

import java.sql.*;
import java.util.ArrayList; 
//import java.util.*;


public class Account{
	static {
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	}
	
	public ArrayList<Account> returnLeixing(){
		ArrayList<Account> allLeixings = null;
		Connection conn = null;
		PreparedStatement ps = null;
		
		ResultSet rs = null;
		
		
		try{
			conn=DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xindai","user","netcop");
			ps = conn.prepareStatement("SELECT * FROM c32zjlx");
			
			
			
			rs = ps.executeQuery();
			
			allLeixings = new ArrayList();
			
			while(rs.next()){
			
				allLeixings.add(new Account(rs.getString("B32DM"),rs.getString("B32HY")));
			}
			
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			try{
				if(rs!=null) {rs.close();rs = null;}
				
			}catch(SQLException e){
				e.printStackTrace();
			}finally{
				try{
					if(ps!=null) {ps.close();ps = null;}
				}catch(SQLException e){
					e.printStackTrace();
				}finally{
					try{
						if(conn!=null){conn.close();conn = null;}
					}catch(SQLException e){
						e.printStackTrace();
				}
			}
			
		}
		
		
		return allLeixings;
	}
}	

public ArrayList<Account> returnZyInfo(){
		ArrayList<Account> zyInfo = null;
		Connection conn = null;
		PreparedStatement ps = null;
		
		ResultSet rs = null;
		
		
		try{
			conn=DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xindai","user","netcop");
			ps = conn.prepareStatement("SELECT * FROM c07zy");
			
			
			
			rs = ps.executeQuery();
			
			zyInfo = new ArrayList();
			
			while(rs.next()){
			
				zyInfo.add(new Account(rs.getInt("B07ZYDM"),rs.getString("B07ZYMC")));
			}
			
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			try{
				if(rs!=null) {rs.close();rs = null;}
				
			}catch(SQLException e){
				e.printStackTrace();
			}finally{
				try{
					if(ps!=null) {ps.close();ps = null;}
				}catch(SQLException e){
					e.printStackTrace();
				}finally{
					try{
						if(conn!=null){conn.close();conn = null;}
					}catch(SQLException e){
						e.printStackTrace();
				}
			}
			
		}
		
		
		return zyInfo;
	}
}	

	public boolean signUp(){
	
		Connection conn = null;
		PreparedStatement ps = null;
		int rs = 0;
		
		// 3. Connection
		try{
			System.out.println("documentTypes"+documentTypes);
			conn=DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xindai","user","netcop");
			ps = conn.prepareStatement("INSERT INTO d02zrr VALUES(?,?,?,?,?,?,?,?,?,?,?,?)");
			ps.setString(1, name);
			
			ps.setString(2, id);
			ps.setString(3, workUnit);
			ps.setString(4, accLoc);
			ps.setString(5,homeAddress);
			ps.setString(6,unitAddress);
			ps.setString(7, sex);
			ps.setString(8, documentTypes);
			ps.setString(9, zipCode);
			ps.setString(10, homePhone);
			ps.setString(11, unitPhone);
			ps.setInt(12, occupation);
			
			rs = ps.executeUpdate(); // INSERT DELETE UPDATE
			
					
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			try{
				if(ps!=null) {ps.close();ps = null;}
				
			}catch(SQLException e){
				e.printStackTrace();
			}finally{
				try{
					if(conn!=null) {conn.close();conn = null;}
				}catch(SQLException e){
					e.printStackTrace();
				}
			}
			
		}
		
		
		return rs == 1;
		
		
		
		
	}
	
	
	
	public Account(){}
	
	/*public Account(String name){
		this.name = name;
	}*/
	
	
	public Account(String name, String id, String workUnit, String accLoc, String homeAddress, String unitAddress,String sex, String documentTypes,String zipCode, String homePhone, String unitPhone,int occupation){
		this.name = name;
		this.id = id;
		this.workUnit = workUnit;
		this.accLoc = accLoc;
		this.homeAddress = homeAddress;
		this.unitAddress = unitAddress;
		this.sex = sex;
		this.documentTypes = documentTypes;
		this.zipCode = zipCode;
		this.homePhone = homePhone;
		this.unitPhone = unitPhone;
		this.occupation = occupation;
		
		
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setId(String id){
		this.id = id;
	}
	
	public String getId(){
		return id;
	}
	
	public void setWorkUnit(String workUnit){
		this.workUnit = workUnit;
	}
	
	public String getWorkUnit(){
		return workUnit;
	}
	
	public void setAccLoc(String accLoc){
		this.accLoc = accLoc;
	}
	
	public String getAccLoc(){
		return accLoc;
	}
	
	public void setHomeAddress(String homeAddress){
		this.homeAddress = homeAddress;
	}
	
	public String getHomeAddress(){
		return homeAddress;
	}
	
	public void setUnitAddress(String unitAddress){
		this.unitAddress = unitAddress;
	}
	
	public String getUnitAddress(){
		return unitAddress;
	}
	
	public void setSex(String sex){
		this.sex = sex;
	}
	
	public String getSex(){
		return sex;
	}
	
	public void setDocumentTypes(String documentTypes){
		this.documentTypes = documentTypes;
	}
	
	public String getDocumentTypes(){
		return documentTypes;
	}
	
	public void setZipCode(String zipCode){
		this.zipCode = zipCode;
	}
	
	public String getZipCode(){
		return zipCode;
	}
	
	public void setHomePhone(String homePhone){
		this.homePhone = homePhone;
	}
	
	public String getHomePhone(){
		return homePhone;
	}
	
	public void setUnitPhone(String unitPhone){
		this.unitPhone = unitPhone;
	}
	
	public String getUnitPhone(){
		return unitPhone;
	}
	
	public void setOccupation(int occupation){
		this.occupation = occupation;
	}
	
	public int getOccupation(){
		return occupation;
	}
	
	
	
	
	private String name = "";
	
	private String id = "";
	private String workUnit = "";
	private String accLoc = "";
	private String homeAddress = "";
	private String unitAddress = "";
	private String sex = "";
	private String documentTypes = "";
	private String zipCode = "";
	private String homePhone = "";
	private String unitPhone = "";
	private int occupation = 0;
	
	
	
	public Account (String dm,String hy){
		this.dm = dm;
		this.hy = hy;
		
	}
	public void setdm(String dm){
		this.dm = dm;
	}
	
	public String getdm(){
		return dm;
	}
	
	public void sethy(String hy){
		this.hy = hy;
	}
	
	public String gethy(){
		return hy;
	}
	
	private String dm = "";
	private String hy = "";
	
	
	
	public Account (int zydm,String zymc){
		this.zydm = zydm;
		this.zymc = zymc;
		
	}
	public void setzydm(int zydm){
		this.zydm = zydm;
	}
	
	public int getzydm(){
		return zydm;
	}
	
	public void setzymc(String zymc){
		this.zymc = zymc;
	}
	
	public String getzymc(){
		return zymc;
	}
	
	private int zydm = 0;
	private String zymc = "";
}

