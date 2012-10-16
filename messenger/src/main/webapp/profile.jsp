<jsp:include page="header.jsp" />
<jsp:include page="navigation.jsp" />

<td valign="top" width=85%> 
        <table border="0" cellspacing="5" cellpadding="2" width="100%" height="100%">
          <tr> 
            <td width="340" bgcolor="#000000"> 
              <table width="100%" border="0" cellspacing="1" cellpadding="3" bgcolor="#FFFFFF">
                <tr> 
                  <td bgcolor="#758393"><!--Title Begins Here -->
					<h2>Редактирование профиля</2>
					</td>
                </tr>
              </table>
            </td>
            <td width="100" bgcolor="#000000"> 
              <table width="100%" border="0" cellspacing="1" cellpadding="3" bgcolor="#FFFFFF">
                <tr> 
                  <td bgcolor="#758393">&nbsp;</td>
                  <td bgcolor="#969FAB">&nbsp;</td>
                  <td bgcolor="#B8BEC7">&nbsp;</td>
                  <td bgcolor="#D8DCE0">&nbsp;</td>
                  <td bgcolor="#FFFFFF">&nbsp;</td>
                </tr>
              </table>
            </td>
          </tr>
          <tr> 
            <td colspan="2" bgcolor="#000000" height=100%> 
              <table  height=100% width="100%" border="0" cellspacing="1" cellpadding="3" bgcolor="#FFFFFF">
                <tr> 
                  <td bgcolor="#758393" valign=top><!--Main Content Editable Beyond This Point -->
				  
				  <form action="" method="post"> <!-- Экшн, детка -->
				  <table border=0 height="100%">
				  <tr><td>Логин:</td><td><input name="login" disabled="true"/></td></tr>
					<tr><td>Пароль:</td><td><input name="password" type="password"/></td></tr>
					<tr><td>Повторите пароль:</td><td><input name="password_check" type="password"/></td></tr>
					<tr><td>ФИО:</td><td><input name="fio"/></td></tr>
					<tr><td>Дата рождения:</td><td><input name="dateOfBirth"/></td></tr>
					<tr><td>Телефон:</td><td><input name="telephone"/></td></tr>
					<tr><td>Контрольный электронный адрес:</td><td><input name="controlEmail"/></td></tr>
					</table>
					<input type="submit" value="Сохранить"/>
					</form>
					
                          </td>
                </tr>
              </table>
            </td>
          </tr>
        </table>
      </td>
	  <jsp:include page="footer.jsp" />
    