<%-- 
    Document   : CustomerPage
    Created on : 31-03-2016, 10:56:32
    Author     : madsr
--%>


<%@page import="Mappers.CustomerMapper"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CustomerPage</title>
    </head>
    <body>

        <table border="1" style="width: 100%">
            
            <tr >
                <td colspan ="4" style="font-family: Arial"> <center> <b> Customers </b> </center> </td>
            </tr>
            
            <tr>
                <td> Customer ID</td>
                <td> Name </td>
                <td> Email </td>
                <td> Phone Number </td>
            </tr>
            
            <%
                CustomerMapper c = new CustomerMapper();
                c.getCustomers();
                
                if (c.customers.size() != 0)
                {
                    for (int i = 0; i < c.customers.size(); i++)
                    {
            %>
            
            <tr> 
                <td> <%= c.customers.get(i).getCustomerID()%> </td>
                <td> <%= c.customers.get(i).getCustomerName()%> </td>
                <td> <%= c.customers.get(i).getCustomerEmail()%> </td>
                <td> <%= c.customers.get(i).getPhoneNumber()%> </td>
            </tr>  
            
            <%
                    }
                }
            %> 
        </table>
        
        <input type="text" name="Search" value="Insert Name" /> <input type="submit" value="Search" />
               
    </body>
</html>
