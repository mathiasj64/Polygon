<%-- 
    Document   : AddRepport
    Created on : 01-04-2016, 10:34:08
    Author     : Mathias
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
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
    </center>
    
        <!MENU END>
        
        <h1>Add a report!</h1>
        <table border="2" cellpadding="5">
            
            <tr>
                <td> Building ID </td><td> <input type="text" name="BID" value="" /> </td>
            </tr>
            
            <tr> 
                <td> Condition Level </td><td> <input type="text" name="CL" value=""</td>
            </tr>
            
            <tr>
                <td> Description of the building </td><td> <input type="text" name="DOB" value="" /> </td>
            </tr>
            
            <tr> 
                <td> Function of the building </td><td> <input type="text" name="FOB" value=""</td>
            </tr>

        </table>
        
    </body>
    </center>
</html>
