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

    <body>
        <img src="Pictures\Polygon.png" alt="Polygon" style="width:157px;height:33px;" align="left">
        <img src="Pictures\Sundebygninger.png" alt="Sunde Bygninger" style="width:156px;height:66px;" align="right">



    <center>
        <h1 style="font-size:300%">Bygingsgennemgang</h1>
    </center>

    <form action="newReportAdd.jsp">
        <p>Antal lokaler med skader:</p><input type="number" name="roomAmount">
        <input type="submit" value="Opret lokaler">
    </form>

    <form method="POST" action="CompleteReportServlet">
        <table align="center" style="width:100%">
            <tr>
                <td align="left"><p style="font-size:150%"><b>Navn på bygning</b></p>
                    <input style="width:90%" type="text" name="BN" value="lollebygge"></td>
                <td align="right"><p style="font-size:150%"><b>Dato</b></p>
                    <input style="width:90%" type="text" name="D" value="12-13"></td>
            </tr>

            <tr>
                <td align="left"><p style="font-size:150%"><b>Adresse</b></p>
                    <input style="width:90%" type="text" name="A" value="lollevej"></td>
                <td align="right"><p style="font-size:80%">Polygon</p>
                    <p style="font-size:80%">Rypevang 5</p>
                    <p style="font-size:80%">3450 Allerød</p>
                    <p style="font-size:80%">Tlf. 4814 0555</p>
                    <p style="font-size:80%">sundebygninger@polygon.dk</p>

                </td>
            </tr>

            <tr>
                <td><p align="left" style="font-size:150%"><b>Postnummer</b></p>
                    <input style="width:90%" type="text" name="Z" value="1234"></td>
                <td align="right"><p style="font-size:150%"><b>BygningsID</b></p>
                    <input style="width:90%" type="text" name="BI" value="1"></td>
            </tr>
        </table>

        <p>Indæst billede af bygning udefra</p>

        <p style="font-size:150%"><b>General information om bygningen</b></p>

        <p>Byggeår</p>
        <input style="width:90%" type="text" name="Y" value="975">

        <p>Bygningsareal i m2</p>
        <input style="width:90%"  type="text" name="S" value="234">

        <p>Hvad bruges bygningen til/ Hvad har bygningen været brugt til?</p>
        <input style="width:90%" type="text" name="BU" value="ingenting">

        <p style="font-size:150%"><b>Gennemgang af bygningen udvendig</b></p>

        <p>Tag</p>
        <input style="width:90%" type="text" name="R" value="hejsa">

        <p>Ydervægge</p>
        <input style="width:90%"  type="text" name="OW" value="hejsa">

        <!ROOM START>

        <%
            if (request.getParameter("roomAmount") != null)
            {
                int amount = 0;
                amount += Integer.parseInt(request.getParameter("roomAmount"));
                for (int i = 1; i <= amount; i++)
                {
        %>

        <p style="font-size:150%"><b>Lokale <%=i%></b></p>


        <p style="font-size:150%"><b>Skade og reperation</b></p>

        <p><b>Har der været skade i lokalet? Ja/Nej</b></p>

        <table align="center" style="width:100%">
            <tr>
                <td align="left"><p>Hvornår</p>
                    <input style="width:90%" type="text" name="dmgWhen" value=""></td>

                <td align="right"><p>Hvor</p>
                    <input style="width:90%" type="text" name="dmgWhere" value=""></td>
            </tr>

            <tr>
                <td align="left"><p>Hvad er der sket</p>
                    <input style="width:90%" type="text" name="dmgWhatHappened" value=""></td>


                <td align="right"><p>Hvad er repareret</p>
                    <input style="width:90%" type="text" name="dmgWhatRepaired" value=""></td>
            </tr>

        </table>

        <p><b>Skade</b></p>

        <p>Fugt/Råd og svamp/ Skimmel/ Brand/ Anden skade</p>

        <p style="font-size:150%"><b>Gennemgang af:</b></p>

        <p style="font-size:120%"><b>Vægge</b></p>

        <p>Bemærkninger</p>

        <input align="right" style="width:90%" type="text" name="commentsWalls" value="">

        <p>Billede</p>

        <p style="font-size:120%"><b>Loft</b></p>

        <p>Bemærkninger</p>

        <input style="width:90%" type="text" name="commentsCeiling" value="">

        <p>Billede</p>

        <p style="font-size:120%"><b>Gulv</b></p>

        <p>Bemærkninger</p>

        <input style="width:90%" type="text" name="commentsFloor" value="">

        <p>Billede</p>

        <p style="font-size:120%"><b>Vindue/døre</b></p>

        <p>Bemærkninger</p>

        <input style="width:90%" type="text" name="commentsWindowDoor" value="">

        <p>Billede</p>

        <p style="font-size:150%"><b>Fugtscanning</b></p>

        <p>Foretaget fugtscanning? Ja/nej</p>

        <table align="center" style="width:100%">
            <tr>
                <td align="center"><p>Fugtscanning</p>
                    <input style="width:90%" type="text" name="moistScanning" value=""></td>

                <td align="center"><p>Målepunkt</p>
                    <input style="width:90%" type="text" name="measurePoint" value=""></td>
            </tr>
        </table>

        <%
                }
            }
        %>

        <p style="font-size:150%"><b>Konklusion</b></p>

        <table align="center" style="width:100%">
            <tr>
                <td align="center"><p>Lokale</p>
                    <input style="width:90%" type="text" name="room" value=""></td>
                <td align="center"><p>Anbefalinger</p>
                    <input style="width:90%" type="text" name="recommendation" value=""></td>

            </tr>
        </table>

        <br>
        <br>


        <p align="center">Bygningsgennemgang foretaget af <input style="width:20%" tpye="text" name="TN" value="ole"> , Polygon</p>
        <p align="center">i samarbejde med <input style="width:25%" tpye="text" name="BO" value="hans"> (bygningsansvarlig)</p>

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

        <p>Bygningens tilstandsgrad</p>

        <input style="width:10%" type="text" name="CL" value="2">

        <br>
        <br>

        <input align="center" type="submit" name="uploadReport" value="Upload report">
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
