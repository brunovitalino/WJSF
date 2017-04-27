<%@ page import="model.VisitanteBean" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String saudacao = "Ola mundo!";
		VisitanteBean visitante = new VisitanteBean();
	%>
	<%= (saudacao + " " + visitante.getNome() + " 2") %>
</body>
</html>