<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="style.css" />
<title>Регистрация</title>
</head>
<body>
<center>
<%request.setCharacterEncoding("CP1251");  %>
	<h1>Персональные данные</h1>
	<form action="registration" method="post">
		<table border=0 height="100%">
				  <tr><td>Логин:</td><td><input name="login"/></td></tr>
					<tr><td>Пароль:</td><td><input name="password" type="password"/></td></tr>
					<tr><td>Повторите пароль:</td><td><input name="password_check" type="password"/></td></tr>
					<tr><td>ФИО:</td><td><input name="fio"/></td></tr>
					<tr><td>Дата рождения:</td><td><input name="dateOfBirth"/></td></tr>
					<tr><td>Телефон:</td><td><input name="telephone"/></td></tr>
					<tr><td>Контрольный электронный адрес:</td><td><input name="controlEmail"/></td></tr>
					</table>
		<input type="submit" value="Зарегистрироваться"/>
	</form>
</center>
</body>
</html>