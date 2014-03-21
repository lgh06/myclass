package com.lgh.action;

import com.opensymphony.xwork2.ActionSupport;

public class RegisterAction extends ActionSupport {
	private String employeeName;
	private String employeePassword;
	private String employeeAge;
	private String employeeAddress;
	private String employeeDeptId;

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeePassword() {
		return employeePassword;
	}

	public void setEmployeePassword(String employeePassword) {
		this.employeePassword = employeePassword;
	}

	public String getEmployeeAge() {
		return employeeAge;
	}

	public void setEmployeeAge(String employeeAge) {
		this.employeeAge = employeeAge;
	}

	public String getEmployeeAddress() {
		return employeeAddress;
	}

	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}

	public String getEmployeeDeptId() {
		return employeeDeptId;
	}

	public void setEmployeeDeptId(String employeeDeptId) {
		this.employeeDeptId = employeeDeptId;
	}

	@Override
	public String execute() throws Exception {

		return SUCCESS;
	}

}
