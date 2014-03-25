<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'RegisterEmployee.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  
  <h2>员工入职注册</h2>
	<form id="regEmpForm" action="<%=path %>/registerEmployee.action" method="post">
	<table>
		<tr>
			<td>员工姓名：</td>
			<td><input type="text" name="emp.employeeName"/></td>
		</tr>
		<tr>
			<td>登录密码：</td>
			<td><input type="password" id="emp.employeePassword" name="emp.employeePassword"/></td>
		</tr>
		<tr>
			<td>确认密码：</td>
			<td><input type="password" id="reemployeePassword" name="reemployeePassword"/></td>
		</tr>
		<tr>
			<td>员工年龄：</td>
			<td><input type="text" name="emp.employeeAge"/></td>
		</tr>
		<tr>
			<td>员工住址：</td>
			<td><input type="text" name="emp.employeeAddress"/></td>
		</tr>
		<tr>
			<td>所在部门：</td>
			<td>
				<select name="emp.department.departmentId">
					<c:forEach items="${applicationScope.departmentData}" var="obj">
						<option value="${obj.departmentId }">${obj.departmentName }</option>
					</c:forEach>
				</select>
			</td>
		</tr>
	</table>
	</form>  
	<button type="button" onclick="registerEmployee()">确认注册</button>
<script type="text/javascript">
	function registerEmployee(){
		var pwd = document.getElementById('emp.employeePassword').value,
		repwd =document.getElementById('reemployeePassword').value,
		form = document.getElementById('regEmpForm');
		if(pwd!=repwd){
			alert('两次密码输入不一致！');
			return;
		}else{
			form.submit();
		}
	}
</script>
  </body>
</html>
