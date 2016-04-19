<%-- 
    Document   : EditBuilding
    Created on : 18-04-2016, 10:11:55
    Author     : Thygesen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <title>W3.CSS</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="http://www.w3schools.com/lib/w3.css">
    <body>

        <div class="w3-container w3-section w3-blue">
            <h1>Polygon</h1>
        </div>
    <center>
    <h1>Edit customer</h1>
    </center>
        <form method="POST" action="eCustomerServlet">
            Select CustomerID: <input type="number" name="CID" value="">
            
            <table class="w3-table w3-bordered">
                <thead>
                    <tr class="w3-light-grey">
                        <td> Customer Name </td><td> <input type="text" name="cName" value=""</td>
                    </tr>

                    <tr>
                        <td> Email </td><td> <input type="text" name="cEmail" value="" /> </td>
                    </tr>

                    <tr class="w3-light-grey">
                        <td> PhoneNumber </td><td> <input type="number" name="pNum" value=""</td>
                    </tr>

                    <tr>
                        <td> Username </td><td> <input type="text" name="uName" value="" /> </td>
                    </tr>

                    <tr class="w3-light-grey">
                        <td> Password </td><td> <input type="text" name="pWord" value=""</td>
                    </tr>
            </table>
            <input type="submit" value="Submit Changes" class="w3-btn w3-blue" >
        </form>
        <br>
        <div class="w3-border-bottom w3-border-orange">
        </div>

    </body>
</html> 
