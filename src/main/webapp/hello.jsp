<%--
  Created by IntelliJ IDEA.
  User: eberk
  Date: 23.09.2020
  Time: 18:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello page</title>
</head>
<body>
    <jsp:useBean id="person" type="beans.Person" scope="request"/>
    <h1>Hello, ${person.name}!</h1>
</body>
</html>
