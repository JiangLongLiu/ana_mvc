<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'add_user.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  <table>
  	<thead>
  		<tr>
  			<td>用户名</td><td>地址</td>
  		</tr>
  	</thead>
  	<tbody id="my_tbody">
  	</tbody>
  </table>
  <body>
    This is user add page. <br>
    
    <input type="button" id="sendAjaxBtn" value="ajax请求传json字符串">
  </body>                                                         
  <script type="text/javascript" src="${pageContext.request.contextPath}/include/jquery/jquery-2.1.1.js"></script>
  <script type="text/javascript" src="${pageContext.request.contextPath}/include/js/add_users.js"></script>
</html>
