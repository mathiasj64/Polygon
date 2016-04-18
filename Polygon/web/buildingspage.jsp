<%-- 
    Document   : buildingspage
    Created on : 31-03-2016, 10:09:23
    Author     : Thygesen
--%>

<%@page import="controller.Facade"%>
<%@page import="Mappers.BuildingMapper"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%
         Integer accessLevel = (Integer) session.getAttribute("accessLevel"); 
         Integer customerid = (Integer) session.getAttribute("customerid");
    %> 
    
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>BuildingPage</title>
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
                    if(accessLevel > 1)
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
    </center>
        <!MENU END>

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
       
        
        switch(accessLevel)
        {
            case 1: 
            //Usercase, vil vise userens egne bygninger.
       
            Facade.getInstance().getUserBuildings(customerid); 
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
                break; 
                
            case 2: 
               //adminlogin
                Facade.getInstance().getBuildings();
                
                if (Facade.getInstance().bm.building.size() != 0)
                {
                    for (int i = 0; i < Facade.getInstance().bm.building.size(); i++)
                    {
               %> 
               
               <tr> 
                <td> <%= Facade.getInstance().bm.building.get(i).getBuildingID()%> </td>
                <td> <%= Facade.getInstance().bm.building.get(i).getCustomerID()%> </td>
                <td> <%= Facade.getInstance().bm.building.get(i).getAddress()%> </td>
                <td> <%= Facade.getInstance().bm.building.get(i).getParcelNo()%> </td>
                <td> <%= Facade.getInstance().bm.building.get(i).getSizeOfBuilding()%> </td>
                <td> <%= Facade.getInstance().bm.building.get(i).getAdditionalInformation()%> </td>
            </tr>  
               
               
               <%
                   
                   }
                }
                break; 
                
            case 3: 
                //til eventuelt tekniker login.
                break; 
        }
        
               
               %> 
  
        </table>
        <br>
        <form action="AddBuilding.jsp">
     <input type="submit" name ="addbuilding" value="Add a building" />
     </form>
        
            
    </body>
</html>
