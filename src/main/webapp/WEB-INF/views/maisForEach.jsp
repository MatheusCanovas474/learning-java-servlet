<%--
  Created by IntelliJ IDEA.
  User: mathe
  Date: 6/24/2022
  Time: 6:16 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

  <c:forEach var="i" begin="1" end="10" step="2">
    ${i} <br />
  </c:forEach>

</body>
</html>
