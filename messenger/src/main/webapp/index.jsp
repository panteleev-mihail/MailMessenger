﻿<%@page contentType="text/html" pageEncoding="UTF-8" import = "com.if30v.MailMessanger.dao.HibernateUtil"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="stylesheet" type="text/css" href="style.css" />
        <title>Авторизация</title>
    </head>
    <body>
	<center>
    <% HibernateUtil.configurate("127.10.203.129", "messenger", "admin", "b6SCCIyt_dLa"); %>
    <% request.setCharacterEncoding("CP1251"); %>
        <h1>Авторизируйтесь!</h1>
        <form action="authentification" method = "post">
			<table border=0>
       		 <tr><td>Введите Ваш логин:</td><td><input name="login"/></tr></td>
       		 <tr><td>Введите Ваш пароль:</td><td><input name="password" type="password"></tr></td>
			 </table>
        <input type="submit" value="Войти"/><br/>
        
        </form>
 		<form action="registration.jsp">
 			<input type="submit" value="Зарегистрироватся"/>
 		</form>
	</center>
    </body>
</html>

