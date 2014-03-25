package com.iss.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 对JDBC连接对象的读取和关闭，工具类
 * @author Administrator
 *
 */
public class JdbcOperate {
		public static final String DBUSERNAME = "root";
		
		public static final String DBUSERPASSWORD_STRING = "";
		
		public static final String DBURL = "jdbc:mysql://localhost/employee?characterEncoding=utf-8";
		
		/**
		 * 获取数据库连接
		 * @return
		 */
		public static Connection getConnection(){
			try {
				Class.forName("com.mysql.jdbc.Driver");
				return DriverManager.getConnection(DBURL, DBUSERNAME, DBUSERPASSWORD_STRING);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
		}
		
		public static void closeConnection(Connection connection,Statement preparedStatement,ResultSet resultSet){
			if(connection!=null){
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(preparedStatement!=null){
				try {
					preparedStatement.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(resultSet!=null){
				try {
					resultSet.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
}
