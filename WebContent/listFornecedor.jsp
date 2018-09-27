<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Fornecedores</title>
</head>
<body>

<a href="fornecedor.jsp"><img src="add.png"/></a>


	<table>
		<thead>
			<tr>
				<th>Nome</th>
				<th>Email</th>
				<th>Telefone</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${fornecedores}" var="fornecedor">
			<tr>
				<td><c:out value="${fornecedor.nome}" /></td>
				<td><c:out value="${fornecedor.email}" /></td>
				<td><c:out value="${fornecedor.telefone}" /></td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
	

	
</body>
</html>