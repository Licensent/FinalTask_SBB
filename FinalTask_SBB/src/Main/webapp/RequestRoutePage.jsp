<%--
  Created by IntelliJ IDEA.
  User: DarthVader
  Date: 03.01.2017
  Time: 14:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Request route page</title>
    <h1>Welcome to the route menu</h1>
    <form action="/pushRoute" method="GET">
        <p>Enter new number route:
            <input type="number" name="routeNumber"></p>
        <input type="submit" value="add"/>
    </form>
</head>
<body>

</body>
</html>
