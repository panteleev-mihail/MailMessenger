<html>
<head>
<title>Administrating</title>
<meta http-equiv="content-type" content="text/html; charset=windows-1251" />
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
<h2>�����������������</h2>
<h4>�������� ������������, ��� �������� �� ������ ����������� �����������������</h4>

<table width="300" style="border:1px solid black;" cellspacing="1" cellpadding="3" 
	<tr><td colspan=2 valign=center><input value="������� ���" /><button>�����</button></td></tr>
	<tr>
		<td height=200>
			<div style="overflow-y:auto; height:400">
			<table id=contentTable border=0 width=100%>
			<tr><td><a href="incoming.jsp">�������</a></td><td><b>Name</b></td><td><i>email@ofthisuser.cc</i></td></tr>
			<tr><td><a href="incoming.jsp">�������</a></td><td><b>Name</b></td><td><i>email@ofthisuser.cc</i></td></tr>
			<tr><td><a href="incoming.jsp">�������</a></td><td><b>Name</b></td><td><i>email@ofthisuser.cc</i></td></tr>
			<tr><td><a href="incoming.jsp">�������</a></td><td><b>Name</b></td><td><i>email@ofthisuser.cc</i></td></tr>
			<tr><td><a href="incoming.jsp">�������</a></td><td><b>Name</b></td><td><i>email@ofthisuser.cc</i></td></tr>
			<tr><td><a href="incoming.jsp">�������</a></td><td><b>Name</b></td><td><i>email@ofthisuser.cc</i></td></tr>
			<tr><td><a href="incoming.jsp">�������</a></td><td><b>Name</b></td><td><i>email@ofthisuser.cc</i></td></tr>
			<tr><td><a href="incoming.jsp">�������</a></td><td><b>Name</b></td><td><i>email@ofthisuser.cc</i></td></tr>
			<tr><td><a href="incoming.jsp">�������</a></td><td><b>Name</b></td><td><i>email@ofthisuser.cc</i></td></tr>
			<tr><td><a href="incoming.jsp">�������</a></td><td><b>Name</b></td><td><i>email@ofthisuser.cc</i></td></tr>
			<tr><td><a href="incoming.jsp">�������</a></td><td><b>Name</b></td><td><i>email@ofthisuser.cc</i></td></tr>
			<tr><td><a href="incoming.jsp">�������</a></td><td><b>Name</b></td><td><i>email@ofthisuser.cc</i></td></tr>
			<tr><td><a href="incoming.jsp">�������</a></td><td><b>Name</b></td><td><i>email@ofthisuser.cc</i></td></tr>
			<tr><td><a href="incoming.jsp">�������</a></td><td><b>Name</b></td><td><i>email@ofthisuser.cc</i></td></tr>
			<tr><td><a href="incoming.jsp">�������</a></td><td><b>Name</b></td><td><i>email@ofthisuser.cc</i></td></tr>
			<tr><td><a href="incoming.jsp">�������</a></td><td><b>Name</b></td><td><i>email@ofthisuser.cc</i></td></tr>
			<tr><td><a href="incoming.jsp">�������</a></td><td><b>Name</b></td><td><i>email@ofthisuser.cc</i></td></tr>
			<tr><td><a href="incoming.jsp">�������</a></td><td><b>Name</b></td><td><i>email@ofthisuser.cc</i></td></tr>
			<tr><td><a href="incoming.jsp">�������</a></td><td><b>Name</b></td><td><i>email@ofthisuser.cc</i></td></tr>
			</table>
			</div>
		</td>
	</tr>
</table>
<script>
doZebra('contentTable');
</script>
</body>
</html>