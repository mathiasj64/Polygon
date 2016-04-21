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
        
         <img src="Pictures\Polygon.png" alt="Polygon" style="width:157px;height:33px;" align="left">
    <img src="Pictures\Sundebygninger.png" alt="Sunde Bygninger" style="width:156px;height:66px;" align="right">


        <div class="w3-container w3-section w3-blue">
            <h1>Polygon</h1>
        </div>
        <h1>Edit building</h1>

        <form method="POST" action="BuildingServlet">

            <table class="w3-table w3-bordered">
                <thead>
                    <tr class="w3-light-grey">
                        <td> Customer ID </td><td> <input type="number" name="CID" value="2"</td>
                    </tr>

                    <tr>
                        <td> Address </td><td> <input type="text" name="Address" value="lol" /> </td>
                    </tr>

                    <tr class="w3-light-grey">
                        <td> ParcelNo </td><td> <input type="number" name="PC" value="123"</td>
                    </tr>

                    <tr>
                        <td> Bygnings Size </td><td> <input type="number" name="SOB" value="41" /> </td>
                    </tr>

                    <tr class="w3-light-grey">
                        <td> Ekstra Information </td><td> <input type="text" name="AI" value="sdf"</td>
                    </tr>
            </table>
            <input type="submit" value="Submit Changes" class="w3-btn w3-blue" >
        </form>
        <br>
        <div class="w3-border-bottom w3-border-orange">
        </div>

    </body>
</html> 
