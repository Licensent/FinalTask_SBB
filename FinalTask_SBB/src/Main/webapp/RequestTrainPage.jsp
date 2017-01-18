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
    <link href="bootstrap/css/bootstrap.css" rel=stylesheet type="text/css">
    <link href="css/MyStyle.css" rel=stylesheet type="text/css">

    <h1>Welcome to the train menu</h1>


    <form action="/pushTrain" id="train" method="GET">
        <div class="form-group">
            <div class="row">
                <div class="col-xs-12">
                    <h3><label for="trainNumber">Train Number:</label></h3>
                    <input type="number" class="form-control input-lg"
                           id="trainNumber" name="trainNumber" placeholder="Enter new train number">
                </div>
            </div>
        </div>
        <div class="form-group">
            <div class="row">
                <div class="col-xs-12">
                    <h3><label for="trainPlaces">Total Places:</label></h3>
                    <input type="number" class="form-control input-lg"
                           id="trainPlaces" name="trainPlaces" placeholder="Enter total number places">
                </div>
            </div>
        </div>
        <button type="submit" class="btn btn-default btn-lg">add</button>
    </form>


</head>
<body>

</body>
</html>
