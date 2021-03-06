<%@ page import="br.com.alura.gerenciador.models.Empresa" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: mathe
  Date: 6/24/2022
  Time: 2:46 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Java Standard Taglib</title>
</head>
<body>

<c:if test="${ not empty empresa }">
    Nova empresa ${ empresa } cadastrada com sucesso!
</c:if>

<h1>Lista de empresas:</h1>
<a href="/gerenciador_war_exploded/entrada?acao=NovaEmpresaForm"> Nova Empresa </a>

<ul>
    <c:forEach items="${empresas}" var="empresa">
        <li>
                ${empresa.nome} - <fmt:formatDate value="${empresa.dataAbertura}" pattern="dd/MM/yyyy"/>
                    <a href="/gerenciador_war_exploded/entrada?acao=RemoveEmpresa&id=${empresa.id}"> Remover </a>
                    <a href="/gerenciador_war_exploded/entrada?acao=MostraEmpresa&id=${empresa.id}"> Editar </a>
        </li>
    </c:forEach>
</ul>

</body>
</html>
