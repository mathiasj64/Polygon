<%-- 
    Document   : buildingspage
    Created on : 31-03-2016, 10:09:23
    Author     : Thygesen
--%>

<%@page import="Mappers.BuildingMapper"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>BuildingPage</title>
    </head>
    <body>

        <table border="1" style="width: 100%">
            
            <tr >
                <td colspan ="4" style="font-family: Arial"> <center> <b> Buildings </b> </center> </td>
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
                BuildingMapper b = new BuildingMapper();
                b.getBuildings();
                
                if (b.building.size() != 0)
                {
                    for (int i = 0; i < b.building.size(); i++)
                    {
            %>
            test123lolkappa
            
            <tr> 
                <td> <%= b.building.get(i).getBuildingID()%> </td>
                <td> <%= b.building.get(i).getCustomerID()%> </td>
                <td> <%= b.building.get(i).getAddress()%> </td>
                <td> <%= b.building.get(i).getParcelNo()%> </td>
                <td> <%= b.building.get(i).getSizeOfBuilding()%> </td>
                <td> <%= b.building.get(i).getAdditionalInformation()%> </td>
            </tr>  
            
            <%
                    }
                }
            %> 
        </table>
        
        <input type="text" name="Search" value="Insert Name" /> <input type="submit" value="Search" />
               
    </body>
</html>
