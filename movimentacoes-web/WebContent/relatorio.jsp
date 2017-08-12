<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="gastos" method="POST">
		<input type="submit" value="Gera PDF"> Data Inicial: <input
			type="text" name="data_ini"> <br /> Data Final: <input
			type="text" name="data_fim"> Pesquisa movimentações de: <input
			type="radio" name="tipo" value="ENTRADA" checked="checked">Entrada
		<input type="radio" name="tipo" value="SAIDA">Saida<br> <br>

		<input type="submit" value="Gera relatório" /> <br />
	</form>
</body>
</html>