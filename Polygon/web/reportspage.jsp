<%-- 
    Document   : reportspage
    Created on : 31-03-2016, 10:27:43
    Author     : Mathias
--%>

<%@page import="Mappers.ReportMapper"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Reports</title>
    </head>
    <body>
        
        <table border="1" style="width: 100%">
            
            <tr >
                <td colspan ="4" style="font-family: Arial"> <center> <b> Reports </b> </center> </td>
            </tr>
            
            <tr>
                <td> Building ID</td>
                <td> Condition Level </td>
                <td> Building Description </td>
                <td> Building Function </td>
            </tr>
            
            <%
                ReportMapper r = new ReportMapper();
                r.getReports();
                
                if (r.reports.size() != 0)
                {
                    for (int i = 0; i < r.reports.size(); i++)
                    {
            %>
            
            <tr> 
                <td> <%= r.reports.get(i).getBuildingID()%> </td>
                <td> <%= r.reports.get(i).getConditionLevel()%> </td>
                <td> <%= r.reports.get(i).getDescriptionOfBuilding()%> </td>
                <td> <%= r.reports.get(i).getFunctionOfBuilding()%> </td>
            </tr>  
            
            <%
                    }
                }
            %> 
        </table>
        
    </body>
</html>
