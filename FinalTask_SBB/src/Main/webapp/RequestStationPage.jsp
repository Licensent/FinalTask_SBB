<%--
  Created by IntelliJ IDEA.
  User: DarthVader
  Date: 02.01.2017
  Time: 17:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Request station page</title>
    <h1>Welcome to the station menu</h1>
    <form action="/pushStation" method="GET">
        <p>Enter new Station name:
            <input type="text" name="stationName"></p>
        <input type="submit" value="add"/>
    </form>
</head>
<body>

</body>
</html>
