<%-- 
    Document   : AddRepport
    Created on : 01-04-2016, 10:34:08
    Author     : Mathias
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%
         Integer accessLevel = (Integer) session.getAttribute("accessLevel");
    %> 
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add report</title>
    </head>

    <center>    
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

        <h1>Add a report!</h1>

        <form method="POST" action="ReportServlet"> 

            <table border="2" cellpadding="5">
                <tr>
                    <td> Building ID </td><td> <input type="number" name="BID" value="3" /> </td>
                </tr>

                <tr> 
                    <td> Condition Level </td><td> <input type="number" name="CL" value="2"</td>
                </tr>

                <tr>
                    <td> Description of the building </td><td> <input type="text" name="DOB" value="description" /> </td>
                </tr>

                <tr> 
                    <td> Function of the building </td><td> <input type="text" name="FOB" value="function"</td>
                </tr>

            </table>
            <input type="submit" name="AddReportServlet" value="Add Report">
        </form>


    </body>
</center>
</html>
