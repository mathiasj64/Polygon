<%-- 
    Document   : ReportView
    Created on : 05-04-2016, 13:47:32
    Author     : Mathias
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add report</title>
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

    <img src="Pictures\Polygon.png" alt="Polygon" style="width:157px;height:33px;" align="left">
    <img src="Pictures\Sundebygninger.png" alt="Sunde Bygninger" style="width:156px;height:66px;" align="right">

        
    
    <center>
        <h1 style="font-size:300%">Bygingsgennemgang</h1>
    </center>

    <form method="POST" action="ReportAdd.jsp">
        <table align="center" style="width:100%">
            <tr>
                <td align="left"><p style="font-size:150%"><b>Navn på bygning</b></p>
                    <input style="width:90%" type="text" name="BN" value="<%=request.getParameter("BN") == null ? "" : request.getParameter("BN")%>" required> </td>
                <td align="right"><p style="font-size:150%"><b>Dato</b></p>
                    <input style="width:90%" type="date" name="D" value="<%=request.getParameter("D") == null ? "" : request.getParameter("D")%>" required> </td>
            </tr>
            <tr>
                <td align="left"><p style="font-size:150%"><b>Adresse</b></p>
                    <input style="width:90%" type="text" name="A" value="<%=request.getParameter("A") == null ? "" : request.getParameter("A")%>" required></td>
                <td align="right"><p style="font-size:80%">Polygon</p>
                    <p style="font-size:80%">Rypevang 5</p>
                    <p style="font-size:80%">3450 Allerød</p>
                    <p style="font-size:80%">Tlf. 4814 0555</p>
                    <p style="font-size:80%">sundebygninger@polygon.dk</p>

                </td>
            </tr>

            <tr>
                <td><p align="left" style="font-size:150%"><b>Postnummer</b></p>
                    <input style="width:90%" type="text" name="Z" value="<%=request.getParameter("Z") == null ? "" : request.getParameter("Z")%>" required></td>
                <td align="right"><p style="font-size:150%"><b>BygningsID</b></p>
                    <input style="width:90%" type="text" name="BI" value="<%=request.getParameter("BI") == null ? "" : request.getParameter("BI")%>" required></td>
            </tr>
        </table>

        <p>Indæst billede af bygning udefra</p>

        <p style="font-size:150%"><b>General information om bygningen</b></p>

        <p>Byggeår</p>
        <input style="width:90%" type="text" name="Y" value="<%=request.getParameter("Y") == null ? "" : request.getParameter("Y")%>" required >

        <p>Bygningsareal i m²</p>
        <input style="width:90%"  type="text" name="S" value="<%=request.getParameter("S") == null ? "" : request.getParameter("S")%>" required >

        <p>Hvad bruges bygningen til/ Hvad har bygningen været brugt til?</p>
        <input style="width:90%" type="text" name="BU" value="<%=request.getParameter("BU") == null ? "" : request.getParameter("BU")%>" required >

        <p style="font-size:150%"><b>Gennemgang af bygningen udvendig</b></p>

        <p>Tag</p>
        <input style="width:90%" type="text" name="R" value="<%=request.getParameter("R") == null ? "" : request.getParameter("R")%>" required >

        <p>Ydervægge</p>
        <input style="width:90%"  type="text" name="OW" value="<%=request.getParameter("OW") == null ? "" : request.getParameter("OW")%>" required >

        <!ROOM START>

        
        <%
          int pages = request.getParameter("addRoom") == null ? 1 : Integer.parseInt(request.getParameter("addRoom"));
          
          if (request.getParameter("do_this") != null && request.getParameter("do_this").equals("Upload_report"))
          {
            getServletContext().getRequestDispatcher("/CompleteReportServlet").forward(request, response);
          }
        
          for (int i = 1; i <= pages; i++)
          {
        %>

        <p align="center" style="font-size:150% "><b>Lokale <%=i%> </b></p>


        <p style="font-size:150%"><b>Skade og reperation</b></p>

        <table align="center" style="width:100%">
            <tr>
                <td align="left"><p>Hvornår</p>
                    <input style="width:90%" type="text" name="dmgWhen<%=i%>" value="<%=request.getParameter("dmgWhen" + i) == null ? "" : request.getParameter("dmgWhen" + i)%>" required></td>

                <td align="right"><p>Hvor</p>
                    <input style="width:90%" type="text" name="dmgWhere<%=i%>" value="<%=request.getParameter("dmgWhere" + i) == null ? "" : request.getParameter("dmgWhere" + i)%>" required></td>
            </tr>

            <tr>
                <td align="left"><p>Hvad er der sket</p>
                    <input style="width:90%" type="text" name="dmgWhatHappened<%=i%>" value="<%=request.getParameter("dmgWhatHappened" + i) == null ? "" : request.getParameter("dmgWhatHappened" + i)%>" required></td>


                <td align="right"><p>Hvad er repareret</p>
                    <input style="width:90%" type="text" name="dmgWhatRepaired<%=i%>" value="<%=request.getParameter("dmgWhatRepaired" + i) == null ? "" : request.getParameter("dmgWhatRepaired" + i)%>" required></td>
            </tr>

        </table>

        <p><b>Skade</b></p>

        <input type="checkbox" name="dmgMoist<%=i%>" value="Fugt" <%= request.getParameter("dmgMoist"+i) == null ? "unchecked" : "checked" %>>Fugt <br>
        <input type="checkbox" name="dmgRot<%=i%>" value="Råd og svamp" <%= request.getParameter("dmgRot"+i) == null ? "unchecked" : "checked" %>>Råd og svamp <br>
        <input type="checkbox" name="dmgMold<%=i%>" value="Skimmel" <%= request.getParameter("dmgMold"+i) == null ? "unchecked" : "checked" %>>Skimmel <br>
        <input type="checkbox" name="dmgFire<%=i%>" value="Brand" <%= request.getParameter("dmgFire"+i) == null ? "unchecked" : "checked" %>>Brand <br>
        <input type="checkbox" name="dmgOther<%=i%>" value="Anden skade" <%= request.getParameter("dmgOther"+i) == null ? "unchecked" : "checked" %>>Anden skade <br>

        <input type="text" name="OtherDescription<%=i%>" value="<%=request.getParameter("OtherDescription" + i) == null ? "" : request.getParameter("OtherDescription" + i)%>" required>

        <p style="font-size:150%"><b>Gennemgang af:</b></p>

        <p style="font-size:120%"><b>Vægge</b></p>

        <input align="right" style="width:90%" type="text" name="commentsWalls<%=i%>" value="<%=request.getParameter("commentsWalls" + i) == null ? "" : request.getParameter("commentsWalls" + i)%>" required>

        <p>Billede</p>

        <p style="font-size:120%"><b>Loft</b></p>

        <input style="width:90%" type="text" name="commentsCeiling<%=i%>" value="<%=request.getParameter("commentsCeiling" + i) == null ? "" : request.getParameter("commentsCeiling" + i)%>" required>

        <p>Billede</p>

        <p style="font-size:120%"><b>Gulv</b></p>

        <input style="width:90%" type="text" name="commentsFloor<%=i%>" value="<%=request.getParameter("commentsFloor" + i) == null ? "" : request.getParameter("commentsFloor" + i)%>" required >

        <p>Billede</p>

        <p style="font-size:120%"><b>Vindue/døre</b></p>

        <input style="width:90%" type="text" name="commentsWindowDoor<%=i%>" value="<%=request.getParameter("commentsWindowDoor" + i) == null ? "" : request.getParameter("commentsWindowDoor" + i)%>" required >

        <p>Billede</p>

        <p style="font-size:150%"><b>Fugtscanning</b></p>

        <p>Foretaget fugtscanning i lokalet?</p>

        <input type="radio" name="ScanningMade<%= i %>" value="1" <%=request.getParameter("ScanningMade" + i)!=null && request.getParameter("ScanningMade" + i).equals("1") ? "checked" : ""%>> Ja<br>
        <input type="radio" name="ScanningMade<%= i %>" value="0" <%=request.getParameter("ScanningMade" + i)==null || request.getParameter("ScanningMade" + i).equals("0") ? "checked" : ""%>> Nej
        
        
       

        <table align="center" style="width:100%">
            <tr>
                <td align="center"><p>Fugtscanning</p>
                    <input style="width:90%" type="text" name="moistScanning<%=i%>" value="<%=request.getParameter("moistScanning" + i) == null ? "" : request.getParameter("moistScanning" + i)%>" required></td>

                <td align="center"><p>Målepunkt</p>
                    <input style="width:90%" type="text" name="measurePoint<%=i%>" value="<%=request.getParameter("measurePoint" + i) == null ? "" : request.getParameter("measurePoint" + i)%>" required></td>
            </tr>
        </table>

        <p style="font-size:120%"><b>Anbefalet løsning på skade</b></p>

        <input style="width:90%" type="text" name="Recommendation<%=i%>" value="<%=request.getParameter("Recommendation" + i) == null ? "" : request.getParameter("Recommendation" + i)%>" required>

        <%
          }
        %>

        <br>
        <br>
        <input name="addRoom" type="hidden" value="<%= pages + 1 %>" required>
        <input name="addRoom2" type="submit" value="Tilføj ekstra lokale" required>
        <br>
        <p style="font-size:150%"><b>Konklusion</b></p>

        <br>
        <br>


        <p align="center">Bygningsgennemgang foretaget af <input style="width:20%" tpye="text" name="TN" value="<%=request.getParameter("TN") == null ? "" : request.getParameter("TN")%>" required> , Polygon</p>
        <p align="center">i samarbejde med <input style="width:25%" tpye="text" name="BO" value="<%=request.getParameter("BO") == null ? "" : request.getParameter("BO")%>" required> (bygningsansvarlig)</p>

        <p style="font-size:200%"><b>Bygningen er kategoriseret som</b></p>

        <table align="center" border="2" cellpadding="5">
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

        <p>Bygningens tilstandsgrad</p>

        <input style="width:10%" type="text" name="CL" value="<%=request.getParameter("CL") == null ? "" : request.getParameter("CL")%>" required>

        <br>
        <br>

        <input align="center" type="submit" name="do_this" value="Upload_report">
    </form>

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
