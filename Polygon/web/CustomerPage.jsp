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
                <td colspan ="3" style="font-family: Arial"> <center> <b> Customers </b> </center> </td>
        <td align="right" > <input type="text" name="Search" value="Insert Name" /> <input type="submit" value="Search" /> </td> 
    </tr>

    <tr>
        <td> Customer ID</td>
        <td> Name </td>
        <td> Email </td>
        <td> Phone Number </td>
    </tr>

    <%
        Facade f = new Facade(); 
        f.getCustomers();

        if (f.cm.customers.size() != 0)
        {
            for (int i = 0; i < f.cm.customers.size(); i++)
            {
    %>

    <tr> 
        <td> <%= f.cm.customers.get(i).getCustomerID()%> </td>
        <td> <%= f.cm.customers.get(i).getCustomerName()%> </td>
        <td> <%= f.cm.customers.get(i).getCustomerEmail()%> </td>
        <td> <%= f.cm.customers.get(i).getPhoneNumber()%> </td>
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
