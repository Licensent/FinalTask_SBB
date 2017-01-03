<%--
  Created by IntelliJ IDEA.
  User: DarthVader
  Date: 02.01.2017
  Time: 20:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Request train page</title>
    <h1>Welcome to the train menu</h1>
    <form action="/pushTrain" method="GET">
        <p>Enter new train number:
            <input type="number" name="trainNumber"></p>
        <input type="submit" value="add"/>
    </form>
</head>
<body>

</body>
</html>
