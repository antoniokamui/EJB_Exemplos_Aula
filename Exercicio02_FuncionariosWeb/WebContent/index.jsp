<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Calculo de IRPF</title>
</head>
<body>

	<form action="calculo" method="get">
		<input type="text" name="nome" placeholder="NOME">
		<br/><br/>
		<input type="text" name="cpf" placeholder="CPF">
		<br/><br/>
		<select name="cargo">
			<option value="MESTRE DO UNIVERSO" label="MESTRE DO UNIVERSO"></option>
			<option value="CAPITAO DA FROTA INTER ESTELAR" label="CAPITÃO DA FROTA INTER ESTELAR"></option>
			<option value="3° TENENTE CAPITAO DO COMBOIO INTERGALATICO" label="3° TENENTE CAPITÃO DO COMBOIO INTERGALATICO"></option>
		</select>
		<br/><br/>
		<input type="number" step="0.1" name="salario" placeholder="Salario">
		<br/><br/>
		<input type="submit" value="Calcular">
	</form>

	
	${resultado}
</body>
</html>