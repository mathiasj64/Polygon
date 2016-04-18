<%-- 
    Document   : newReportView
    Created on : 07-04-2016, 09:15:48
    Author     : Mathias
--%>

<%@page import="Objects.Room"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Objects.CompleteReport"%>
<%@page import="controller.Facade"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Report</title>
    </head>

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

    <%
      CompleteReport report = Facade.getInstance().rm.getReport(Integer.parseInt(request.getParameter("hiddenID")));
      ArrayList<Room> rooms = Facade.getInstance().rom.getRoomsFromReport(Integer.parseInt(request.getParameter("hiddenID")));
    %>


    <body>
        <img src="Pictures\Polygon.png" alt="Polygon" style="width:157px;height:33px;" align="left">
        <img src="Pictures\Sundebygninger.png" alt="Sunde Bygninger" style="width:156px;height:66px;" align="right">
        <br>
        <br>
        <p align="left"> Rapport nr.:<%= report.getReportID()%></p> 
        <br>


    <center>
        <h1 style="font-size:300%">Bygingsgennemgang</h1>
    </center>

    <table align="center" style="width:100%">
        <tr>
            <td align="left"><p style="font-size:150%"><b>Navn på bygning</b> <%= report.getBuildingName()%></p></td>
            <td align="right"><p style="font-size:150%"><b>Dato</b> <%= report.getDate()%></p>
        </tr>

        <tr>
            <td align="left"><p style="font-size:150%"><b>Adresse</b> <%= report.getAddress()%></p>
            <td align="right"><p style="font-size:80%">Polygon</p>
                <p style="font-size:80%">Rypevang5</p>
                <p style="font-size:80%">3450 Allerød</p>
                <p style="font-size:80%">Tlf. 4814 0555</p>
                <p style="font-size:80%">sundebygninger@polygon.dk</p>

            </td>
        </tr>

        <tr>
            <td><p align="left" style="font-size:150%"><b>Postnummer</b> <%= report.getZipcode()%></p>

        </tr>
    </table>

    <p>Indæst billede af bygning udefra</p>

    <p style="font-size:150%"><b>General information om bygningen</b></p>

    <p><b>Byggeår:</b></p>
    <%= report.getYearBuilt()%>

    <p><b>Bygningsareal i m²:</b></p>
    <%= report.getSizeOfBuilding()%>

    <p><b>Hvad bruges bygningen til/ Hvad har bygningen været brugt til?</b></p>
    <%= report.getPurposeOfBuilding()%>

    <p style="font-size:150%"><b>Gennemgang af bygningen udvendig</b></p>

    <p><b>Bemærkninger til tag</b></p>
    <%= report.getRoofDesc()%>

    <p><b>Bemærkninger til ydervægge</b></p> 
    <%= report.getOuterWallsDesc()%>

    <!ROOM START>

    <%

      for (int i = 0; i < rooms.size(); i++)
      {

    %>

    <p style="font-size:150%"><b>Lokale<%=i + 1%></b></p>

    <p style="font-size:150%"><b>Skade og reperation</b></p>

    <p><b>Hvornår er skaden sket?</b></p>
            <%= rooms.get(i).getWhen()%>

    <p><b>Hvor er skadet sket?</b></p>
            <%= rooms.get(i).getWhere()%>

    <p><b>Hvad er der sket?</b></p>
            <%= rooms.get(i).getWhat()%>

    <p><b>Hvad er repareret?</b></p>
    <%= rooms.get(i).getRepairs()%>

    <p style="font-size:150%"><b>Skade</b></p>

    <p>Fugt/Råd og svamp/ Skimmel/ Brand/ Anden skade</p>

    <p style="font-size:150%"><b>Gennemgang af:</b></p>

    <p><b>Bemærkninger til vægge</b></p>

    <%= rooms.get(i).getWalls()%>

    <p><b>Bemærkninger til loft</b></p>

    <%= rooms.get(i).getCeiling()%>

    <p><b>Bemærkninger til gulv</b></p>

    <%= rooms.get(i).getFloor()%>

    <p><b>Bemærkninger til vindue og døre</b></p>

    <%= rooms.get(i).getWindows()%>

    <p style="font-size:150%"><b>Fugtscanning</b></p>

    <p>Foretaget fugtscanning? </p>
    <br>
    <%= rooms.get(i).getScanningMade()%>

    <p><b>Resultat af fugtscanning</b></p>
    <%= rooms.get(i).getMoistureScanning()%>

    <p><b>Målepunkt for fugtscanning</b></p>
    <%= rooms.get(i).getMeasuringPoint()%>


    <%

      }

    %>


    <p style="font-size:150%"><b>Konklusion</b></p>

    <table border="2" cellpadding="5" align="center" style="width:100%">
        <%          for (int i = 0; i < rooms.size(); i++)
          {
        %>

        <tr>
            <td align="center"><p>Lokale <%=i + 1%> </p>
            <td align="center"><p><%= rooms.get(i).getRecommendation()%> </p>

        </tr>

        <%
          }
        %>
    </table>

    <br>
    <br>


    <p align="center">Bygningsgennemgang foretaget af <%= report.getTechnicianName()%> , Polygon</p>
    <p align="center">i samarbejde med <%= report.getCustomerName()%> (bygningsansvarlig)</p>

    <p style="font-size:200%"><b>Bygningen er kategoriseret som</b></p>

    <table border="2" cellpadding="5">
        <tr>
            <td><b>Tilstand</b></td>
            <td><b>Beskrivelse af bygningen</b></td>
            <td><b>Funktion af bygningen</b></td>
        </tr>

        <tr>
            <td><b>Tilstandsgrad 0</b></td>
            <td>Bygningsdelen er ny og som bygget</td>
            <td>Funktionen er som 
                beskrevet</td>
        </tr>

        <tr>
            <td><b>Tilstandsgrad 1</b></td>
            <td>Bygningsdelen er intakt, men med <br> begyndende slid og synlige skader <br> (kun kosmetiske skader)</td>
            <td>Funktionen er som 
                beskrevet</td>
        </tr>

        <tr>
            <td><b>Tilstandsgrad 2</b></td>
            <td>Bygningsdelen er begyndt at forfalde, <br>
                med enkelte defekte komponenter</td>
            <td>Funktionen er nedsat – <br>
                fare for følgeskader</td>
        </tr>

        <tr>
            <td><b>Tilstandsgrad 3</b></td>
            <td>Bygningsdelen er nedbrudt og skal <br>
                udskiftes</td>
            <td>Funktionen er ophørt – <br>
                fare for følgeskader</td>
        </tr>

    </table>

    <p>Bygningens tilstandsgrad</p> <%= report.getConditionLevel()%>
    <br>
    <br>

    <p>Denne rapport og bygningsgennemgang er lavet for at klarlægge umiddelbare visuelle problemstillinger. Vores formål er at sikre, at
        bygningens anvendelse kan opretholdes. Vi udbedrer ikke skader som en del af bygningsgennemgangen/rapporten. Gennemgangen
        af bygningen indeholder ikke fugtmålinger af hele bygningen, men vi kan foretage fugtscanninger enkelte steder i bygningen, hvis vi
        finder det nødvendigt. Hvis vi finder kritiske områder i bygningen vil vi fremlægge anbefalinger angående yderligere tiltag så som
        yderligere undersøgelser, reparationer eller bygningsopdateringer.
        <br>
        <br>
        Bemærk at vi skal have adgang til hele bygningen for at kunne udføre en fuld gennemgang (dette inkluderer adgang til tag, tagrum,
        kælder, krybekælder eller andre aflukkede områder). Denne bygningsgennemgang er ikke-destruktiv. Hvis der skal laves destruktive
        indgreb, skal dette først godkendes af de bygningsansvarlige. Destruktive indgreb er ikke en del af denne rapport eller
        bygningsgennemgang.
        <br>
        <br>
        Den bygningsansvarlige skal udlevere plantegning over bygningen inden bygningsgennemgangen kan foretages. </p>

</body>
</html>
