<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
	<fieldset>
	<legend>登陆系统</legend>
	<form action="UserAction">
	<input type="hidden" name="methon" value="login">
	<table>
	
	<tr>
		<td>登陆ID</td>
		<td><input type="text" name='userid'> <label style="color: red">${error}</label> </td>
	</tr>
	<tr>
		<td>用户密码</td>
		<td><input type="password" name='password'>  </td>
	</tr>
		<td><input type="submit" value="登陆"> </td>
		<td> <input type="submit" value="注册"> </td>
	</table>
	
	</form>
	
	</fieldset>
</body>
</html>