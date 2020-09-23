<%--
  Created by IntelliJ IDEA.
  User: eberk
  Date: 23.09.2020
  Time: 18:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Start Page</title>
    <link rel="stylesheet" type="text/css" href="resources/style.css">
</head>
<body>
   <h1>Hello</h1>
   <form action="hello.html" method="post">
       <input type="text" name="personname">
       <input type="submit" value="Say Hi!">
   </form>
   <form action="calc.html" method="post">
       <input type="number" name="a">
       <input type="number" name="b">
       <input type="submit" value="Calculate">
   </form>
</body>
</html>
