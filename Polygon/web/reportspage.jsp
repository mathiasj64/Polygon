<%-- 
    Document   : reportspage
    Created on : 31-03-2016, 10:27:43
    Author     : Mathias
--%>

<%@page import="Objects.CompleteReport"%>
<%@page import="controller.Facade"%>
<%@page import="Mappers.ReportMapper"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
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
        <form action="newReportAdd.jsp">
            <input type="submit" value="Add a report"/>       
        </form>
    </body>
    </center>
    <!MENU END>

    <table border="1" style="width: 100%">

        <tr >
            <td colspan ="8" style="font-family: Arial"> <center> <b> Reports </b> </center> </td>
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
</tr>

<%
  Facade.getInstance().getReports();

  if (Facade.getInstance().rm.reports.size() != 0)
  {
    for (int i = 0; i < Facade.getInstance().rm.reports.size(); i++)
    {
%>

<tr>
    <td> <%= Facade.getInstance().rm.reports.get(i).getReportID()%> </td>
    <td> <%= Facade.getInstance().rm.reports.get(i).getBuildingID()%> </td>
    <td> <%= Facade.getInstance().rm.reports.get(i).getBuildingName()%> </td>
    <td> <%= Facade.getInstance().rm.reports.get(i).getSizeOfBuilding()%> </td>
    <td> <%= Facade.getInstance().rm.reports.get(i).getDate()%> </td>
    <td> <%= Facade.getInstance().rm.reports.get(i).getTechnicianName()%> </td>
    <td> <%= Facade.getInstance().rm.reports.get(i).getConditionLevel()%> </td>
    <td> <form action="newReportView.jsp" method="GET">
            <input tpye="hidden" name="hiddenID" value="<%= Facade.getInstance().rm.reports.get(i).getReportID()%>" >
            <input type="submit" name="viewReport<%= Facade.getInstance().rm.reports.get(i).getReportID()%>" value="View report <%= Facade.getInstance().rm.reports.get(i).getReportID()%>">
        </form></td>
</tr>  

<%
    }
  }
%> 
</table>
<br>
<form action="AddRepport.jsp">
    <input type="submit" value="Add a report"/>       
</form>
</body>
</html>
