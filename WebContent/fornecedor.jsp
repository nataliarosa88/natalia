<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title></title>
</head>
<body>

	<form method="POST" action="FornecedorController" name="frmAddUser">

		<table>
			<tr>
				<td>Nome:</td>
				<td><input type="text" name="nome" /></td>
			</tr>
			<tr>
				<td>Email:</td>
				<td><input type="text" name="email" /></td>
			</tr>
			<tr>
				<td>Telefone:</td>
				<td><input type="text" name="telefone" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="incluir" /></td>
			</tr>
		</table>

	</form>
	<a href="index.jsp"><img src="back.png"/></a>
</body>
</html>