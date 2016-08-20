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
	<form action="livros" method="post">
		<input type="text" name="titulo" placeholder="Titulo"/>
		<br/><br/>
		<input type="text" name="autor" placeholder="Autor"/>
		<br/><br/>
		<input type="number" name="valor" step="0.1" placeholder="Valor"/>
		<br/><br/>
		<input type="submit" value="Salvar"> 
		<input type="button" onclick="window.location.href='livros'" value="Lista">
	</form>
</body>
</html>