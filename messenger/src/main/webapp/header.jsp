<%@page contentType="text/html" pageEncoding="UTF-8" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Mail Messenger</title>
<link rel="stylesheet" type="text/css" href="style.css" />
<script>

function doZebra( table_id )
{

 var table = document.getElementById( table_id );
 
 f = 0;
 
 for( var i=0; i < table.rows.length; i++ )
 {
 table.rows[i].className = ( f ? 'bg1' : 'bg2' );
 
 f = ( f ? 0 : 1 );
 }

}


</script>
</head>
<body>
<% request.setCharacterEncoding("CP1251"); %>


<div align="center" style="overflow-y: no">
  <table border="0" cellspacing="0" cellpadding="0" width=100% height="80%">
	  <tr><td colspan=3>
	  <table width="100%" border="0" cellspacing="5" cellpadding="3">
                <tr> 
                  <td bgcolor="#758393" width="85%">
				  <h2>
				  <b>Здравствуйте, Username!</b>
				  </h2>
				  </td>
				  <td bgcolor="#758393" width=15% align=right>
				  <b>usermail@ourmail.com</b><br>
				  <button type="button">�����</button>
				  </td>
                </tr>
     </table></td></tr>
	 <tr height="100%">