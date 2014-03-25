package com.lgh.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Conn {
	public static final String DB_URL="jdbc:mysql://localhost:3306/lgh";
	public static final String DB_USERNAME="root";
	public static final String DB_PASSWORD="";
	
	static Connection conn = null;
	
	public static Connection getConnection(){
		try{Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection(DB_URL,DB_USERNAME,DB_PASSWORD);
		return conn;
		}catch (Exception e){
			e.getMessage();
		}
		return null;
	}
	public static void closeConnection(Connection conn){
		if(conn!=null){
			conn.close();
		}
	}
	
	
		
	}
	
	

}
