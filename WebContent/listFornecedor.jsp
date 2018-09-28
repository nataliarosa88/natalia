<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
    <title>Fornecedores</title>
    <link rel="stylesheet" href="css/bootstrap.css">
    <link rel="stylesheet" href="css/bootstrap-theme.css">
</head>
<body>

<h4 class="text-center text-primary">Listagem de Fornecedores</h4>


<a href="fornecedor.jsp"><button class="btn btn-primary" type="submit"><span class="glyphicon glyphicon-plus" aria-hidden="true"></span></button></a>


	<table class="table table-hover table-striped">
		<thead>
			<tr>
				<th><span class="text-primary">Codigo</span></th>
				<th><span class="text-primary">Nome</span></th>
				<th><span class="text-primary">Email</span></th>
				<th colspan="3"><span class="text-primary">Telefone</span></th>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${fornecedores}" var="fornecedor">
			<tr>
				<td><c:out value="${fornecedor.codigo}" /></td>
				<td><c:out value="${fornecedor.nome}" /></td>
				<td><c:out value="${fornecedor.email}" /></td>
				<td><c:out value="${fornecedor.telefone}" /></td>
				<td><a href="FornecedorController?action=edit&fornecedorCodigo=<c:out value="${fornecedor.codigo}"/>"><button class="btn btn-primary" type="submit"><span class="glyphicon glyphicon-pencil" aria-hidden="true"></span></button></a></td>
				<td><a href="FornecedorController?action=delete&fornecedorCodigo=<c:out value="${fornecedor.codigo}"/>"><button class="btn btn-primary" type="submit"><span class="glyphicon glyphicon-trash" aria-hidden="true"></span></button></a></td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
	

	
</body>
</html>