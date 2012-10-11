<<<<<<< HEAD
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title> Введите персональные данные</title>
</head>
<body>
<%request.setCharacterEncoding("CP1251");  %>
	<h1>Персональные данные</h1>
	<form action="registration" method="post">
		Логин:<input name="login"/><br/>
		Пароль:<input name="password" type="password"/><br/>
		Повторите пароль: <input name="password_check" type="password"/><br/>
		ФИО: <input name="fio"/><br/>
		Дата рождения: <input name="dateOfBirth"/><br/>
		Телефон: <input name="telephone"/><br/>
		Контрольный электронный адрес: <input name="controlEmail"/><br/>
		<input type="submit" value="Зарегистрироваться"/>
	</form>
</body>
=======
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title> Введите персональные данные</title>
</head>
<body>
<%request.setCharacterEncoding("CP1251");  %>
	<h1>Персональные данные</h1>
	<form action="registration" method="post">
		Логин:<input name="login"/><br/>
		Пароль:<input name="password" type="password"/><br/>
		Повторите пароль: <input name="password_check" type="password"/><br/>
		ФИО: <input name="fio"/><br/>
		Дата рождения: <input name="dateOfBirth"/><br/>
		Телефон: <input name="telephone"/><br/>
		Контрольный электронный адрес: <input name="controlEmail"/><br/>
		<input type="submit" value="Зарегистрироваться"/>
	</form>
</body>
>>>>>>> 88ee96f3171f0e834cee54182d8099140ad3c75d
</html>