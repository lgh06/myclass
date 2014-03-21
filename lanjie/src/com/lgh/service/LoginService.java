package com.lgh.service;
import com.lgh.bean.User;


public class LoginService {
	public String name="lgh";
	public String password="lgh";
	public User userLogin(String userName,String userPwd){
		if(name.equals(userName)&&password.equals(userPwd)){
		User user = new User();
		user.setUserName(userName);
		user.setUserPassword(userPwd);
		return user;
		}else{
			return null;
		}
		
		
		
	}

}
