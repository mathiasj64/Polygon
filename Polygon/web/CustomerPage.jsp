<%-- 
    Document   : CustomerPage
    Created on : 31-03-2016, 10:56:32
    Author     : madsr
--%>


<%@page import="controller.Controller"%>
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

         <img src="Pictures\Polygon.png" alt="Polygon" style="width:157px;height:33px;" align="left">
    <img src="Pictures\Sundebygninger.png" alt="Sunde Bygninger" style="width:156px;height:66px;" align="right">

        
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
    <br>
    
    <center>
        <form action="AddCustomerPage.jsp">
            <input type="submit" name ="addcustomer" value="Add Customer" />
        </form>
    </center>

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

  Controller.getInstance().getCustomers();
  if (Controller.getInstance().cm.customers.size() != 0)
  {
    for (int i = 0; i < Controller.getInstance().cm.customers.size(); i++)
    {
%>

<tr> 
    <td> <%= Controller.getInstance().cm.customers.get(i).getCustomerID()%> </td>
    <td> <%= Controller.getInstance().cm.customers.get(i).getCustomerName()%> </td>
    <td> <%= Controller.getInstance().cm.customers.get(i).getCustomerEmail()%> </td>
    <td> <%= Controller.getInstance().cm.customers.get(i).getPhoneNumber()%> </td>
    <td> <form action="EditCustomer.jsp" method="GET">
            <input type="hidden" name="hiddenID" value="<%= Controller.getInstance().cm.customers.get(i).getCustomerID()%>" >
            <input type="submit" name="hiddenID<%= Controller.getInstance().cm.customers.get(i).getCustomerID()%>" value="Edit this customer!">
        </form></td>
</tr>  


<%
    }
  }
%> 

</table>

</body>
</html>
