<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Cadastro de Livros</h1>
	<form action="ServletFuncionarios" method="post">
		<input type="text" name="cpf" placeholder="cpf"/>
		<br/><br/>
		<input type="text" name="nome" placeholder="nome"/>
		<br/><br/>
		<input type="text" name="cargo" placeholder="cargo"/>
		<br/><br/>
		<input type="text" name="salario" placeholder="salario"/>
		<br/><br/>
		<br/><br/>
		<input type="submit" value="Cadastrar"> 
		<input type="button" onclick="window.location.href='index'" value="Lista">
	</form>
</body>
</html>