<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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

    Login:
    <input type="text" name="login"/>

    Senha:
    <input type="password" name="senha"/>

    <input type="hidden" name="acao" value="Login" />
    <input type="submit"/>

</form>


</body>
</html>