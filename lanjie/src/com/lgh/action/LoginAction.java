package com.lgh.action;

import org.apache.struts2.ServletActionContext;

import com.lgh.bean.User;
import com.lgh.service.LoginService;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	public static final String CURRENT_USER="currUser";
	//private String userName;
	//private String userPassword;
	public LoginService loginService = new LoginService();
	public User user = new User();
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	
	public String login(){
		
		User user222 = loginService.userLogin(user.getUserName(), user.getUserPassword());
		System.out.println(user222);
		if(user !=null){
			ServletActionContext.getRequest().getSession().setAttribute(CURRENT_USER, user222.getUserName());
			return SUCCESS;
		}else{
		return ERROR;
		}
	}

}
