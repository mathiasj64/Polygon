<%-- 
    Document   : reportspage
    Created on : 31-03-2016, 10:27:43
    Author     : Mathias
--%>

<%@page import="controller.Controller"%>
<%@page import="Objects.CompleteReport"%>
<%@page import="controller.Facade"%>
<%@page import="Mappers.ReportMapper"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%
        Integer accessLevel = (Integer) session.getAttribute("accessLevel");
        Integer customerID = (Integer) session.getAttribute("customerid");
    %> 
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Reports</title>
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

                <%
                    if (accessLevel > 1)
                    {
                %>
                <td>
                    <form action="CustomerPage.jsp">
                        <input type="submit" value="Customers" name="customer" />
                    </form>        
                </td>
                <%
                    }
                %> 

                <td>
                    <form action="reportspage.jsp">
                        <input type="submit" value="Reports" name="report" />
                    </form>
                </td>

            </tr>
        </table>
        <br>
         <%
                    if (accessLevel > 1)
                    {
                %>
        <form action="ReportAdd.jsp">
            <input type="submit" value="Add a report"/>       
        </form>
        <%
                    }
                %> 
    </body>
</center>
<!MENU END>

<table border="1" style="width: 100%">

    <tr >
        <% 
                    if(accessLevel > 1)
                    {
                    %> 
        <td colspan ="9" style="font-family: Arial"> <center> <b> Reports </b> </center> </td>
<%                  } 
                    else
                    { %> 
        <td colspan ="8" style="font-family: Arial"> <center> <b> Reports </b> </center> </td>                
                  <%  }
                        %> 
</tr>

<tr>
    <td> <b>Report ID</b> </td>
    <td> <b>Building ID</b></td>
    <td> <b>Building Name</b></td>
    <td> <b>Size of Building</b></td>
    <td> <b>Date</b></td>
    <td> <b>Technician Name</b></td>
    <td> <b>Condition Level</b> </td>
    <td> <b>View Report</b></td>
    <% 
                    if (accessLevel > 1)
                    {
                    %> 
    <td> <b>Delete Report</b></td>
    <% 
                    }
    %> 
                        
</tr>
<%
    switch (accessLevel)
    {
        case 1:
            Controller.getInstance().getUserReports(customerID);

            if (Controller.getInstance().um.userReports.size() != 0)
            {
                for (int i = 0; i < Controller.getInstance().um.userReports.size(); i++)
                {

%> 
<tr>
    <td> <%= Controller.getInstance().um.userReports.get(i).getReportID()%> </td>
    <td> <%= Controller.getInstance().um.userReports.get(i).getBuildingID()%> </td>
    <td> <%= Controller.getInstance().um.userReports.get(i).getBuildingName()%> </td>
    <td> <%= Controller.getInstance().um.userReports.get(i).getSizeOfBuilding()%> </td>
    <td> <%= Controller.getInstance().um.userReports.get(i).getDate()%> </td>
    <td> <%= Controller.getInstance().um.userReports.get(i).getTechnicianName()%> </td>
    <td> <%= Controller.getInstance().um.userReports.get(i).getConditionLevel()%> </td>
    <td> <form action="ReportView.jsp" method="GET">
            <input type="hidden" name="hiddenID" value="<%= Controller.getInstance().um.userReports.get(i).getReportID()%>" >
            <input type="submit" name="viewReport<%= Controller.getInstance().um.userReports.get(i).getReportID()%>" value="View report <%= Controller.getInstance().um.userReports.get(i).getReportID()%>">
        </form></td>
</tr>


<%
            }
        }
        break;

    case 2:
        //adminlogin: 
        Controller.getInstance().getReports();

        if (Controller.getInstance().rm.reports.size() != 0)
        {
            for (int i = 0; i < Controller.getInstance().rm.reports.size(); i++)
            {
%> 

<tr>
    <td> <%= Controller.getInstance().rm.reports.get(i).getReportID()%> </td>
    <td> <%= Controller.getInstance().rm.reports.get(i).getBuildingID()%> </td>
    <td> <%= Controller.getInstance().rm.reports.get(i).getBuildingName()%> </td>
    <td> <%= Controller.getInstance().rm.reports.get(i).getSizeOfBuilding()%> </td>
    <td> <%= Controller.getInstance().rm.reports.get(i).getDate()%> </td>
    <td> <%= Controller.getInstance().rm.reports.get(i).getTechnicianName()%> </td>
    <td> <%= Controller.getInstance().rm.reports.get(i).getConditionLevel()%> </td>
    <td> <form action="ReportView.jsp" method="GET">
            <input type="hidden" name="hiddenID" value="<%= Controller.getInstance().rm.reports.get(i).getReportID()%>" >
            <input type="submit" name="viewReport<%= Controller.getInstance().rm.reports.get(i).getReportID()%>" value="View report <%= Controller.getInstance().rm.reports.get(i).getReportID()%>">
        </form></td>
    <td> <form action="dReportServlet" method="GET">
            <input type="hidden" name="DeleteReport" value="<%= Controller.getInstance().rm.reports.get(i).getReportID()%>" >
            <input type="submit" name="DelReport<%= Controller.getInstance().rm.reports.get(i).getReportID()%>" value="Delete report <%= Controller.getInstance().rm.reports.get(i).getReportID()%>">
        </form></td>
</tr> 
<% }
            }
            break;

    }
%> 





</table>
<br>

</body>
</html>
