<%-- 
    Document   : CustomerPage
    Created on : 31-03-2016, 10:56:32
    Author     : madsr
--%>


<%@page import="controller.Facade"%>
<%@page import="Mappers.CustomerMapper"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CustomerPage</title>
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


    <table border="1" style="width: 100%">

        <tr >
            <td colspan ="5" style="font-family: Arial"> <center> <b> Customers </b> </center> </td>
</tr>

<tr>
    <td> Customer ID</td>
    <td> Name </td>
    <td> Email </td>
    <td> Phone Number </td>
    <td> Edit Customer </td>
</tr>

<%

    Facade.getInstance().getCustomers();
    if (Facade.getInstance().cm.customers.size() != 0)
    {
        for (int i = 0; i < Facade.getInstance().cm.customers.size(); i++)
        {
%>

<tr> 
    <td> <%= Facade.getInstance().cm.customers.get(i).getCustomerID()%> </td>
    <td> <%= Facade.getInstance().cm.customers.get(i).getCustomerName()%> </td>
    <td> <%= Facade.getInstance().cm.customers.get(i).getCustomerEmail()%> </td>
    <td> <%= Facade.getInstance().cm.customers.get(i).getPhoneNumber()%> </td>
    <td> <form action="EditCustomer.jsp" method="GET">
            <input type="hidden" name="hiddenID" value="<%= Facade.getInstance().cm.customers.get(i).getCustomerID()%>" >
            <input type="submit" name="hiddenID<%= Facade.getInstance().cm.customers.get(i).getCustomerID()%>" value="Edit this customer!">
        </form></td>
</tr>  


<%
        }
    }
%> 

</table>
<form action="AddCustomerPage.jsp">
    <input type="submit" name ="addcustomer" value="Add Customer" />
</form>
</body>
</html>
