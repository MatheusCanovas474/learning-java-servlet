<!DOCTYPE html>

<%
    String nomeEmpresa = (String)request.getAttribute("empresa");
    System.out.println(nomeEmpresa);

%>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
    Empresa <%= nomeEmpresa %> cadastrada com sucesso!
</body>
</html>