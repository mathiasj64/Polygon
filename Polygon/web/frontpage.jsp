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
        Integer customerid = (Integer) session.getAttribute("customerid");
    %>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Front page</title>
    </head>
    <body>

         <img src="Pictures\Polygon.png" alt="Polygon" style="width:157px;height:33px;" align="left">
    <img src="Pictures\Sundebygninger.png" alt="Sunde Bygninger" style="width:156px;height:66px;" align="right">

        
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
        <h1>Welcome to the Polygon System</h1>

        <br>

        <h2><%= accessLevel == 2 ? "Logged in as Administrator" : "Logged in as customer with Customer ID: " + customerid%></h2>
    </center>

</body> 
</html>
