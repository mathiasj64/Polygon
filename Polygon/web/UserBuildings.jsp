<%-- 
    Document   : UserBuildings
    Created on : 13-04-2016, 10:45:35
    Author     : madsr
--%>

<%@page import="controller.Facade"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
        <%  Integer CID = (Integer) session.getAttribute("customerid"); %>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Users buildings</title>
    </head>
    <body>
        <table border="1" style="width: 100%">
            
            <tr >
                <td colspan ="6" style="font-family: Arial"> <center> <b> Buildings </b> </center> </td>
            </tr>
            
            <tr>
                <td> Building ID</td>
                <td> Customer ID </td>
                <td> Address </td>
                <td> Parcel No </td>
                <td> Size of Building </td>
                <td> Additional Information </td>
            </tr>
            
            <%
                 
                
                Facade.getInstance().getUserBuildings(1);
                
                if (Facade.getInstance().um.userBuildings.size() != 0)
                {
                    for (int i = 0; i < Facade.getInstance().um.userBuildings.size(); i++)
                    {
            %>
            
            <tr> 
                <td> <%= Facade.getInstance().um.userBuildings.get(i).getBuildingID()%> </td>
                <td> <%= Facade.getInstance().um.userBuildings.get(i).getCustomerID()%> </td>
                <td> <%= Facade.getInstance().um.userBuildings.get(i).getAddress()%> </td>
                <td> <%= Facade.getInstance().um.userBuildings.get(i).getParcelNo()%> </td>
                <td> <%= Facade.getInstance().um.userBuildings.get(i).getSizeOfBuilding()%> </td>
                <td> <%= Facade.getInstance().um.userBuildings.get(i).getAdditionalInformation()%> </td>
            </tr>  
            
            <%
                    }
                }
            %> 
        </table>
        <br>
        <form action="AddBuilding.jsp">
     <input type="submit" name ="addbuilding" value="Add a building" />
     </form>
        
            
    </body>
</html>
