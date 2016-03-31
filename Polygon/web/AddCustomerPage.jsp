<%-- 
    Document   : AddCustomerPage
    Created on : 31-03-2016, 12:25:57
    Author     : madsr
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Customer</title>
    </head>
    <body>
        <h1>Insert Customer Information:</h1>

        <table style="width: 50%">
            <tr>
                <td> <input type="text" name="Name" value="Insert Name" /> </td>
            </tr>

            <tr>
                <td> <input type="text" name="Email" value="Insert Email" /> </td> 
            </tr>

            <tr>
                <td> <input type="text" name="Phone Number" value="Insert PhoneNumber" /> </td>
            </tr>

            <tr>
                <td> <input type="submit" name="addCustomer" value="Add Customer" /> </td>
            <form action="CustomerPage.jsp">
                <td> <input type="submit" value="Go back to customer page" />
            </form> 
        </tr>
    </table>
</body>
</html>
