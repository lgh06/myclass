package com.iss.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.iss.jdbc.JdbcOperate;
import com.iss.pojo.Employee;

public class EmployeeService {
	
	
	public boolean registerEmployee(Employee employee){
		Connection connection = JdbcOperate.getConnection();
		String insertEmpSql = "insert into employee (employeeName,employeePassword,employeeAge,employeeAddress,employeeDeptId) values (?,?,?,?,?)";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(insertEmpSql);
			//填充的第几个问号，从1开始
			preparedStatement.setString(1, employee.getEmployeeName());
			preparedStatement.setString(2, employee.getEmployeePassword());
			preparedStatement.setInt(3, employee.getEmployeeAge());
			preparedStatement.setString(4, employee.getEmployeeAddress());
			preparedStatement.setInt(5, employee.getDepartment().getDepartmentId());
			
			int executeUpdate = preparedStatement.executeUpdate();
			if(executeUpdate>=0){
				return true;
			}else{
				return false;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
	
	/**
	 * 员工登录
	 * @param empName
	 * @param empPassword
	 * @return
	 */
	public Employee loginEmployee(String empName,String empPassword){
		return null;
	}
	
	/**
	 * 查询全部员工
	 * @return
	 */
	public List<Employee> getAllEmp(){
		System.out.println("查询全部员工!");
		return null;
	}
	
	/**
	 * 查询本部门员工
	 * @return
	 */
	public List<Employee> getMyDeptEmp(){
		System.out.println("查询本部门员工!");
		return null;
	}
	
	
	/**
	 * 查询自己的信息
	 * @return
	 */
	public List<Employee> getMyselfInfo(){
		System.out.println("查询自己信息!");
		return null;
	}
	
}
