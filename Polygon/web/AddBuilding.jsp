<%-- 
    Document   : AddBuilding
    Created on : 01-04-2016, 09:49:14
    Author     : Thygesen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%
        Integer accessLevel = (Integer) session.getAttribute("accessLevel");
    %> 
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add building</title>
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
                    if (accessLevel > 1)
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
        <h1>Add a building!</h1>

        <form method="POST" action="BuildingServlet">

            <table border="2" cellpadding="5">
                <tr> 
                    <td> CustomerID </td><td> <input type="number" name="cid" value="3" required /> </td>
                </tr>
                <tr> 
                    <td> Zipcode </td><td> <input type="number" name="zipcode" value="4540" required /></td>
                </tr>

                <tr>
                    <td> Address </td><td> <input type="text" name="Address" value="lol" required /> </td>
                </tr>

                <tr> 
                    <td> ParcelNo </td><td> <input type="number" name="PC" value="123" required/> </td>
                </tr>

                <tr>
                    <td> Bygnings Size </td><td> <input type="number" name="SOB" value="41" required /> </td>
                </tr>

                <tr> 
                    <td> Ekstra Information </td><td> <input type="text" name="AI" value="sdf" required /></td>
                </tr>
            </table>
            <input type="submit" value="Add building" name="add building" />
        </form>

    </center></body>
</html>
