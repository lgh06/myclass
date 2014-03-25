package com.iss.application;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.iss.jdbc.JdbcOperate;
import com.iss.pojo.Department;

public class InitialzeDepartmentData implements ServletContextListener{

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		
	}

	
	/**
	 * web 服务器启动时调用该方法
	 */
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("tomcat启动时执行了该方法");
		/**
		 * 初始化部门数据
		 */
		Connection connection = JdbcOperate.getConnection();
		String queryDeptSql = "select * from department";
		try {
			Statement createStatement = connection.createStatement();
			ResultSet executeQuery = createStatement.executeQuery(queryDeptSql);
			List<Department> resultList = new ArrayList<Department>();
			while(executeQuery.next()){
				Department department = new Department();
				//数据库的字段名（不区分大小写）
				department.setDepartmentId(executeQuery.getInt("departmentId"));
				department.setDepartmentName(executeQuery.getString("departmentName"));
				resultList.add(department);
			}
			sce.getServletContext().setAttribute("departmentData", resultList);
			JdbcOperate.closeConnection(connection, createStatement, executeQuery);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
