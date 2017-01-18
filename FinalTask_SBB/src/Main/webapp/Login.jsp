<%--
  Created by IntelliJ IDEA.
  User: DarthVader
  Date: 15.01.2017
  Time: 14:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>22 лучших формы входа и регистрации | Vladmaxi.net</title>
    <link rel="stylesheet" href="bootstrap/css/bootstrap.css" media="screen" type="text/css"/>
    <link href="css/MyStyle.css" rel=stylesheet type="text/css">
</head>
<body class="body">
<div class="home_header">
    <div id="home_header">
        <img src="/images/background_header.png" width="253" , height="80"
             alt="Адрес размещения изображения относительно корня сайта">
    </div>
    <div id="IGRailways_logo">
        <img src="/images/logo_header.png" alt="IGRailways">
    </div>
</div>

<div class="loginBox">
    <div id="buttons" class="btn-group">
        <a href="Login.jsp" class="btn btn-link">Login</a>
        <a href="Login.jsp" class="btn btn-link">Join</a>
    </div>
</div>

<div id="login">
    <form action="javascript:void(0);" method="get">
        <fieldset class="clearfix">
            <p><span class="fontawesome-user"></span><input type="text" value="Login"
                                                            onBlur="if(this.value == '') this.value = 'Login'"
                                                            onFocus="if(this.value == 'Логин') this.value = ''"
                                                            required></p>
            <!-- JS because of IE support; better: placeholder="Username" -->
            <p><span class="fontawesome-lock"></span><input type="password" value="Password"
                                                            onBlur="if(this.value == '') this.value = 'Password'"
                                                            onFocus="if(this.value == 'Password') this.value = ''"
                                                            required></p>
            <!-- JS because of IE support; better: placeholder="Password" -->
            <p><input type="submit" class="btn-success" value="Login"></p>
        </fieldset>
    </form>
    <div id="belowBottomText">
        <p id="p">Not yet registred?<a href="" id="btn-link" class="btn btn-link btn-lg">Join now</a></p></div>
</div>
</body>
</html>