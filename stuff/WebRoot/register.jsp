<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
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
    欢迎进入员工管理平台<br>
    <form action="register" method="post">
    <table>
   <tr><td>姓名</td><td><input type="text" name="employeeName" /></td></tr>
   <tr><td>密码</td><td><input type="text" name="employeePassword" /></td></tr>
   <tr><td>年龄</td><td><input type="text" name="employeeAge" /></td></tr>
   <tr><td>住址</td><td><input type="text" name="employeeAddress" /></td></tr>
   <tr><td>部门编号</td><td><select>
   
   <option value="">XX</option>
   <option value="">XX</option>
   
   </select></td></tr>
   <tr><td><input type="submit" value="注册" /></td><td><input type="reset" value="重置" /></td></tr>
    
    </table>
    </form>
    
  </body>
</html>
