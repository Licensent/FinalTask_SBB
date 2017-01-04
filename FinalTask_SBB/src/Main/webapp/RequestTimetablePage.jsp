<%--
  Created by IntelliJ IDEA.
  User: DarthVader
  Date: 03.01.2017
  Time: 17:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Requst Timetable Page</title>
    <h1>Welcome to the timetable menu</h1>
    <form action="/pushTimetable" method="GET">
        <p>Enter Station name, which you assign Timetable:
            <input type="text" name="stationName"></p>
        <input type="submit" value="add"/>
    </form>
</head>
<body>

</body>
</html>
