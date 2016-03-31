<%-- 
    Document   : frontpage
    Created on : 31-03-2016, 10:24:46
    Author     : madsr
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Front page</title>
    </head>
    <body>
        <h1>Click a button!</h1>
        
        <form action="buildingspage.jsp">
        <input type="submit" value="Buildings" name="building" />
        </form>
        
        <form action="CustomerPage.jsp">
        <input type="submit" value="Customers" name="customer" />
        </form> 
        
        <form>
        <input type="submit" value="reports" name="report" />
        </form>
        
    </body> 
</html>
