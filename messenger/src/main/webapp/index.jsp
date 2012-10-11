<<<<<<< HEAD
<%@page contentType="text/html" pageEncoding="UTF-8" import = "com.if30v.MailMessanger.dao.HibernateUtil"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <% HibernateUtil.configurate("127.10.203.129", "messenger", "admin", "b6SCCIyt_dLa"); %>
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
=======
<%@page contentType="text/html" pageEncoding="UTF-8" import = "com.if30v.MailMessanger.dao.HibernateUtil"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <% HibernateUtil.configurate("127.10.203.129", "messenger", "admin", "b6SCCIyt_dLa"); %>
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
>>>>>>> 88ee96f3171f0e834cee54182d8099140ad3c75d
