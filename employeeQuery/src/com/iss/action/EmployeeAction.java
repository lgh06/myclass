package com.iss.action;

import java.util.List;

import com.iss.pojo.Employee;
import com.iss.service.EmployeeService;
import com.opensymphony.xwork2.ActionSupport;

public class EmployeeAction extends ActionSupport{
	public EmployeeService employeeService = new EmployeeService();
	
	//千万不要忘了new
	public Employee emp = new Employee();
	
	public Employee getEmployee() {
		return emp;
	}

	public void setEmployee(Employee employee) {
		this.emp = employee;
	}

	public String registerEmployee(){
		boolean registerEmployee = employeeService.registerEmployee(emp);
		if(registerEmployee){
			return SUCCESS;
		}else{
			return ERROR;
		}
	}
	
	/**
	 * 查询全部员工
	 * @return
	 */
	public String getAllEmp(){
		System.out.println("查询全部员工!");
		return SUCCESS;
	}
	
	/**
	 * 查询本部门员工
	 * @return
	 */
	public String getMyDeptEmp(){
		System.out.println("查询本部门员工!");
		return SUCCESS;
	}
	
	
	/**
	 * 查询自己的信息
	 * @return
	 */
	public String getMyselfInfo(){
		System.out.println("查询自己信息!");
		return SUCCESS;
	}
	
	
	/**
	 * 查询员工
	 * @return
	 */
	public String queryEmp(){
		return SUCCESS;
	}
}
