<%-- 
    Document   : frontpage
    Created on : 31-03-2016, 10:24:46
    Author     : madsr
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%
        Integer accessLevel = (Integer) session.getAttribute("accessLevel");
        %> 
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Front page</title>
    </head>
    <body>

    <!MENU>
    <center>
       
        
    <table>

        <tr>

            <td>
                <form action="buildingspage.jsp">
                    <input type="submit" value="Buildings" name="building" />
                </form>
            </td>

                 <%  
                    if(accessLevel > 1)
                    {
                     %>  
                <td>
                    <form action="CustomerPage.jsp">
                        <input type="submit" value="Customers" name="customer" />
                    </form>        
                </td>
                <%
                    }
                    %> 

            <td>
                <form action="reportspage.jsp">
                    <input type="submit" value="Reports" name="report" />
                </form>
            </td>

        </tr>
    </table>

    <br>
    </center>
    <!MENU END>

    <center>
    <h1>Welcome to the Polygon System</h1>
    </center>

</body> 
</html>
