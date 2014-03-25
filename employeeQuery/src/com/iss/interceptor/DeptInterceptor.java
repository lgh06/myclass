package com.iss.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class DeptInterceptor extends AbstractInterceptor{

	
	@Override
	public String intercept(ActionInvocation actionInvocation) throws Exception {
		//从session中取到当前登录用户的部门ID
		String dept = "3";
		
		//开发部，查自己
		//actionInvocation.invoke();// 返回值 success
		
		if(dept.equals("1")){
			return "myself";
		}else if(dept.equals("2")||dept.equals("3")){
		//销售、财务，查本部门
			return "mydept";
		}else {
		//人事 ，查全部
			return "all";
		}
	}

}
