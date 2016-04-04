<%-- 
    Document   : AddBuilding
    Created on : 01-04-2016, 09:49:14
    Author     : Thygesen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
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
       
        <center>
        <h1>Add a motherfuck building!</h1>
        <form method="POST" action="BuildingServlet">
        <table border="2" cellpadding="5">
            <tr>
                <td> Building ID </td><td> <input type="text" name="BID" value="1" /> </td>
            </tr>
            
            <tr> 
                <td> Customer ID </td><td> <input type="text" name="CID" value="2"</td>
            </tr>
            
            <tr>
                <td> Address </td><td> <input type="text" name="Address" value="lol" /> </td>
            </tr>
            
            <tr> 
                <td> ParcelNo </td><td> <input type="text" name="PC" value="3"</td>
            </tr>
            
            <tr>
                <td> Bygnings Størrelse </td><td> <input type="text" name="BS" value="123" /> </td>
            </tr>
            
            <tr> 
                <td> Ekstra Information </td><td> <input type="text" name="AI" value="sdf"</td>
            </tr>
        </table>
        <input type="submit" value="Add building" name="AB" />
        </form>
      
        <form action="buildingspage.jsp">
     <input type="submit" name ="goback" value="Go back" />
     </form>
        
    </center></body>
</html>
