<%@page contentType="text/html" pageEncoding="UTF-8" import = "com.if30v.MailMessanger.dao.HibernateUtil"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <% HibernateUtil.configurate("127.0.0.1", "mydb", "root", "98979897"); %>
    <% request.setCharacterEncoding("CP1251"); %>
        <h1>Авторизируйтесь!</h1>
        <form action="authentification" method = "post">
       		 Введите Ваш логин: <input name="login"/><br/> 
       		 Введите Ваш пароль:<input name="password" type="password"><br/>
        <input type="submit" value="Войти"/><br/>
        
        </form>
 		<form action="registration.jsp">
 			<input type="submit" value="Зарегистрироватся"/>
 		</form>
    </body>
</html>
