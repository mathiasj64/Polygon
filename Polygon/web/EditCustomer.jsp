<%-- 
    Document   : EditBuilding
    Created on : 18-04-2016, 10:11:55
    Author     : Thygesen
--%>

<%@page import="controller.Controller"%>
<%@page import="Objects.Customer"%>
<%@page import="controller.Facade"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <title>EditCustomer</title>
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
            <%
            Customer customer = Controller.getInstance().cm.getCustomer(Integer.parseInt(request.getParameter("hiddenID")));
            %>
            Selected CustomerID: <input type="value" name="CID" readonly="readonly" value="<%= customer.getCustomerID() %>">
                                        
            <br>
            <br>
            
            <table class="w3-table w3-bordered">
                <thead>
                    <tr class="w3-light-grey">
                        <td> Customer Name </td><td> <input type="text" name="cName" value="<%= customer.getCustomerName()%>"</td>
                    </tr>

                    <tr>
                        <td> Email </td><td> <input type="text" name="cEmail" value="<%= customer.getCustomerEmail()%>" /> </td>
                    </tr>

                    <tr class="w3-light-grey">
                        <td> PhoneNumber </td><td> <input type="number" name="pNum" value="<%= customer.getPhoneNumber()%>"</td>
                    </tr>

                    <tr>
                        <td> Username </td><td> <input type="text" name="uName" value="<%= customer.getUsername()%>" /> </td>
                    </tr>

                    <tr class="w3-light-grey">
                        <td> Password </td><td> <input type="text" name="pWord" value="<%= customer.getPassword() %>"</td>
                    </tr>
            </table>
            <input type="submit" value="Submit Changes" class="w3-btn w3-blue" >
        </form>
        <br>
        <div class="w3-border-bottom w3-border-orange">
        </div>

    </body>
</html> 
