<%--
  Created by IntelliJ IDEA.
  User: DarthVader
  Date: 06.01.2017
  Time: 16:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Main Page</title>
    <link href="bootstrap/css/bootstrap.css" rel=stylesheet type="text/css">
    <link href="css/Style-1.css" rel=stylesheet type="text/css">
</head>

<body>
<div id="homepage_header" class="home_header">
    <div id="home_header">
        <img src="/images/background_header.png" width="253", height="80"
             alt="Адрес размещения изображения относительно корня сайта">
    </div>
    <div id="IGRailways_logo">
        <img src="/images/logo_header.png" alt="IGRailways">
    </div>
</div>

<h2 align="right"><a href="addStation" class="btn btn-default btn-lg">Обычная ссылка</a></h2>

<h2 align="right"><a href="addStation">Station menu</a></h2>

<h2 align="right"><a href="addRoute">Route menu</a></h2>

<h2 align="right"><a href="addTrain">Train menu</a></h2>

<h2 align="right"><a href="addTimetable">Timetable menu</a></h2>
</body>
</html>
