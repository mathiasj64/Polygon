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
    <center><body>
        <h1>Add a building!</h1>
        <table border="2" cellpadding="5">
            <tr>
                <td> Building ID </td><td> <input type="text" name="BID" value="" /> </td>
            </tr>
            
            <tr> 
                <td> Customer ID </td><td> <input type="text" name="CID" value=""</td>
            </tr>
            
            <tr>
                <td> Address </td><td> <input type="text" name="Address" value="" /> </td>
            </tr>
            
            <tr> 
                <td> ParcelNo </td><td> <input type="text" name="PC" value=""</td>
            </tr>
            
            <tr>
                <td> Bygnings Størrelse </td><td> <input type="text" name="BS" value="" /> </td>
            </tr>
            
            <tr> 
                <td> Ekstra Information </td><td> <input type="text" name="AI" value=""</td>
            </tr>
        </table>
        <br>
        <input type="submit" value="Add building" name="AB" />
        <input type="submit" value="Go back" />
    </body></center>
</html>
