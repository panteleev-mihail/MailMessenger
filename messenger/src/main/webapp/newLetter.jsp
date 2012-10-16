<jsp:include page="header.jsp" />
<jsp:include page="navigation.jsp" />

<td valign="top" width=85%> 
        <table border="0" cellspacing="5" cellpadding="2" width="100%" height="100%">
          <tr> 
            <td width="340" bgcolor="#000000"> 
              <table width="100%" border="0" cellspacing="1" cellpadding="3" bgcolor="#FFFFFF">
                <tr> 
                  <td bgcolor="#758393"><!--Title Begins Here -->
					<h2>Новое письмо</h2>
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
              <table width="100%" height=100% border="0" cellspacing="1" cellpadding="3" bgcolor="#FFFFFF">
                <tr> 
                  <td bgcolor="#758393" height=100%>
				  
				  <!--Main Content Editable Beyond This Point -->
				 <table width=100%>
				 <tr>
				 <td>
					<form method="post" action=""><!--ПРИКРУТИТЬ К ЭКШЕН-КЛАССУ И НЕ ЗАБЫТЬ ПРО СООТВЕТСТВИЕ ИМЁН АТРИБУТОВ -->
					<table>
						<tr>
						<td>Кому:</td>
						<td><input type="text" size="30" name="receiver"></td>
						</tr>
						<tr>
						<td>Тема:</td>
						<td><input type="text" size="30" name="subject"></td>
						</tr>
						<tr>
						<td colspan=3>Текст письма:
						<br><textarea name="content" cols="70" rows="15"></textarea></td>
						</tr>
					</table>
					<br/>
					<input type="submit" value="  Отправить  ">
					</form>
				</td>
				<td valign=top>
				<jsp:include page="contactsIntegrated.jsp" />
				</td>
				</tr>
				  
					<!--Main Content Editable Above This Point -->
					
                          </td>
                </tr>
              </table>
            </td>
          </tr>
        </table>
      </td>
	  <jsp:include page="footer.jsp" />
    