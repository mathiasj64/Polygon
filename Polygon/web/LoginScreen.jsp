<%-- 
    Document   : LoginScreen
    Created on : 08-04-2016, 00:06:57
    Author     : madsr
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <style>
    </style>    
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="http://www.w3schools.com/lib/w3.css">
        <title>Polygon - Login</title>
    </head>

    <body>
        <img src="Pictures/Polygon.png" align="left" /> 
        <br>
        <br>
        <div class="w3-card-4 w3-margin w3-round-xlarge" style="width:50%;">
            <form class="w3-container w3-card-4 w3-round-xlarge w3-container w3-pale-blue w3-leftbar w3-border-blue" action="LoginServlet" method="post">
                <h2 class="w3-text-blue">Login</h2>
                <p>
                    <label class="w3-text-blue"><b>Username</b></label>
                    <input class="w3-input w3-border" type="text" name="username" value="" > </p>
                <p>
                    <label class="w3-text-blue"><b>Passwords</b></label>
                    <input class="w3-input w3-border" type="password" name="password" value=""> </p>
                <p>
                    <input class="w3-btn w3-blue" type="submit" name="login" value="Login"> </p>
            </form>
        </div>
</body>
</html>
