<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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
    欢迎进入员工管理平台<br>请登录 没有账号，请<a href="register.jsp">注册</a>
    <form action="login" method="post">
    <table>
   <tr>
   <td>请输入员工编号</td>
   <td><input type="text" name="employeeId" /></td>
   </tr>   
   
   <tr>
   <td>请输入密码</td>
   <td><input type="password" name="employeeId" /></td>
   </tr> 
   <tr>
   <td><input type="submit" /></td>
   <td><input type="reset" /></td>
   </tr> 
    </table>
    </form>
  </body>
</html>
