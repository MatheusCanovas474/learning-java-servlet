<%@ page import="br.com.alura.gerenciador.models.Empresa" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: mathe
  Date: 6/24/2022
  Time: 2:46 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>

    <h1>Lista de empresas:</h1>

    <ul>
        <%
            List<Empresa> lista = (List<Empresa>)request.getAttribute("empresas");
            for (Empresa empresa : lista) {
        %>

        <li><%= empresa.getNome() %></</li>

        <%
            }
        %>
    </ul>

</body>
</html>
