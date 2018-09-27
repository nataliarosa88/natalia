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

	<form method="POST" action="FornecedorController" name="frmAddFornecedor">

		<table>
		
			<tr>
				<td>Codigo:</td>
				<td><input type="text" name="codigo" readonly="readonly" value="<c:out value="${fornecedor.codigo}"/>"/></td>
			</tr>
			<tr>
				<td>Nome:</td>
				<td><input type="text" name="nome"  value="<c:out value="${fornecedor.nome}"/>"/></td>
			</tr>
			<tr>
				<td>Email:</td>
				<td><input type="text" name="email"  value="<c:out value="${fornecedor.email}"/>"/></td>
			</tr>
			<tr>
				<td>Telefone:</td>
				<td><input type="text" name="telefone"  value="<c:out value="${fornecedor.telefone}"/>"/></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Confirmar" /></td>
			</tr>
		</table>

	</form>
	<a href="index.jsp"><img src="back.png"/></a>
</body>
</html>