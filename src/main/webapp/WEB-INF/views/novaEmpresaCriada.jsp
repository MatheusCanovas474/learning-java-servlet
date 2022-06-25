<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
    <c:if test="${ not empty empresa }">
        Empresa ${ empresa } cadastrada com sucesso!
    </c:if>

    <c:if test="${ empty empresa }">
        Nenhuma empresa cadastrada até o momento!
    </c:if>
</body>
</html>