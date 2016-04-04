<%-- 
    Document   : frontpage
    Created on : 31-03-2016, 10:24:46
    Author     : madsr
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Front page</title>
    </head>
    <body>

    <!MENU>
    
    <table>

        <tr>

            <td>
                <form action="buildingspage.jsp">
                    <input type="submit" value="Buildings" name="building" />
                </form>
            </td>

            <td>
                <form action="CustomerPage.jsp">
                    <input type="submit" value="Customers" name="customer" />
                </form>        
            </td>

            <td>
                <form action="reportspage.jsp">
                    <input type="submit" value="Reports" name="report" />
                </form>
            </td>

        </tr>
    </table>

    <br>
    <!MENU END>

    <h1>Click a button!</h1>
    <h2>Hello</h2>

</body> 
</html>
