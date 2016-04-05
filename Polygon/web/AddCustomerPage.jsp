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

    <h1>Insert Customer Information:</h1>
    <form action="CustomerServlet">
        <table style="width: 50%">
            <tr>
                <td> <input type="text" name="Name" value="Insert Name" /> </td>
            </tr>

            <tr>
                <td> <input type="text" name="Email" value="Insert Email" /> </td> 
            </tr>

            <tr>
                <td> <input type="text" name="PN" value="Insert Phonenumber" /> </td>
            </tr>
        </table>

        <td> <input type="submit" name="addCustomer" value="Add Customer" /> </td>
    </form>

    <form action="CustomerPage.jsp">
        <td> <input type="submit" value="Go back to customer page" />
    </form> 
</body>
</html>
