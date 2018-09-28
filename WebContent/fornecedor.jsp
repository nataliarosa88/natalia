<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>Fornecedores</title>
    <link rel="stylesheet" href="css/bootstrap.css">
    <link rel="stylesheet" href="css/bootstrap-theme.css">
</head>
<body class="container">
    
    <h4 class="text-center text-primary">Cadastro de Fornecedores</h4>
    
    <div id="mensagemView"></div>
    
	<form class="form" method="POST" action="FornecedorController"s>

		<div class="form-group">
			<label class="text-primary" for="text">Codigo:</label>
			<input type="text" name="codigo" class="form-control" readonly="readonly" value="<c:out value="${fornecedor.codigo}" />" />
		</div>    
		<div class="form-group">
			<label class="text-primary" for="text">Nome:</label>
			<input type="text" name="nome" class="form-control" required autofocus value="<c:out value="${fornecedor.nome}" />" />
		</div>   
		<div class="form-group">
			<label class="text-primary" for="text">Email:</label>
			<input type="text" name="email" class="form-control" value="<c:out value="${fornecedor.email}" />" />
		</div>   
		<div class="form-group">
			<label class="text-primary" for="text">Telefone:</label>
			<input type="text" name="telefone" class="form-control" value="<c:out value="${fornecedor.telefone}" />" />
		</div>   

		<button class="btn btn-primary" type="submit"><span class="glyphicon glyphicon-ok" /></button><button class="btn btn-primary" formnovalidate onclick="javascript:window.history.go(-1); return false;" type="button"><span class="glyphicon glyphicon-remove" aria-hidden="true"></span></button>

	</form>
	
</body>
</html>