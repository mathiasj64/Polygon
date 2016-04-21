<%-- 
    Document   : AdminLoginPage
    Created on : 19-04-2016, 12:07:17
    Author     : madsr
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin Login</title>
    </head>
    <body>

        <img src="Pictures/Polygon.png" align="left" /> 

        <br>
        <br>
        <form action="LoginScreen.jsp">
        <input type="submit" name="backtouserlogin" value="User Login"/>
        </form>
        
        <form action="AdminLoginServlet" method="post">
            <table align="center"  FRAME=BOX>
                <thead>
                    <tr>
                        <td colspan="2"> Administrator Login </td>
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