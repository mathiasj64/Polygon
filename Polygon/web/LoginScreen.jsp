<%-- 
    Document   : LoginScreen
    Created on : 08-04-2016, 00:06:57
    Author     : madsr
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="http://www.w3schools.com/lib/w3.css">
        <title>Polygon - Login</title>
    </head>
    <body>

        <img src="Pictures\Polygon.png" alt="Polygon" style="width:157px;height:33px;" align="left">
        <img src="Pictures\Sundebygninger.png" alt="Sunde Bygninger" style="width:156px;height:66px;" align="right">


        <br>
        <br>

        <form action="AdminLoginPage.jsp">
            <input type="submit" name="adminLogin" value="Admin Login">
        </form>
        <form action="LoginServlet" method="post">
            <table align="center"  FRAME=BOX>
                <thead>
                    <tr>
                        <td colspan="2"> Login to Polygon </td>
                    </tr>
                </thead>
                <tbody>
                    <tr>    
                        <td> Login: </td> 
                        <td> <input type="text" name="username" value="" /> </td> 
                        <td>  </td> 
                    </tr>

                    <tr>
                        <td> Password: </td> 
                        <td> <input type="password" name="password" value="" /> </td> 
                    </tr>
                </tbody>
                <tfoot>
                    <tr>

                        <td colspan="2" align="right"> <input type="submit" name="login" value="Login"> </td>
                    </tr>
                </tfoot>
            </table>
        </form>

    </body>
</html>
