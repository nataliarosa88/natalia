<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title></title>
</head>
<body>

<form method = "POST" action = "FornecedorController" name="frmAddUser">

Nome: <input type = "text" name = "nome"/>
E-mail: <input type = "text" name = "email"/>
Telefone: <input type = "text" name = "telefone"/>
<input type = "submit"/>
 

</form>

</body>
</html>