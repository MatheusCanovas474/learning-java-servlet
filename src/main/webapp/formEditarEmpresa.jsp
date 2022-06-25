<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<c:url value="/entrada" var="linkEntradaServlet"/>

<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>



<form action="${linkEntradaServlet}" method="post">

    Nome:
    <input type="text" name="nome" value="${empresa.nome}"/>

    Data Abertura:
    <input type="text" name="data" value="<fmt:formatDate value="${empresa.dataAbertura}" pattern="dd/MM/yyyy"/>"/>

    Id da empresa:
    <input type="text" name="id" value="${empresa.id}" readonly>

    <input type="hidden" name="acao" value="AlteraEmpresa" />

    <input type="submit"/>

</form>


</body>
</html>