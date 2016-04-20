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

        <%                  
          if (request.getParameter("Name") != null && request.getParameter("Email") != null && request.getParameter("PN") != null && request.getParameter("UN") != null && request.getParameter("PW") != null)
          {
            getServletContext().getRequestDispatcher("/CompleteReportServlet").forward(request, response);
          }          
        %>

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


    <center>

        <h1>Insert Customer Information:</h1>
        <form action="AddCustomerPage.jsp">
            <table border="2" cellpadding="5">
                <tr>
                    <td> Name:</td> 
                    <td> <input type="text" name="Name" value="" required/> <%= request.getParameter("firstTime") != null ? "*" : ""%> </td>
                </tr>

                <tr>
                    <td> Email:</td>
                    <td> <input type="text" name="Email" value="" required/> </td> 
                </tr>

                <tr>
                    <td> Phonenumber:</td>
                    <td> <input type="number" name="PN" value="" required/> </td>
                </tr>

                <tr>
                    <td> Username:</td>
                    <td> <input type="text" name="UN" value="" required/> </td>
                </tr>

                <tr>
                    <td> Password:</td>
                    <td> <input type="text" name="PW" value="" required/> </td>
                </tr>
            </table>

            <td> <input type="submit" name="addCustomer" value="Add Customer" /> </td>
            <input type="hidden" name="firstTime" value="p">
            

        </form> 
    </center>
</body>
</html>
