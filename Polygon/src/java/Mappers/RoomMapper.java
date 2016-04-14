/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mappers;

import Model.Connector;
import Objects.Room;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Thygesen
 */
public class RoomMapper
{

    public ArrayList<Room> rooms = new ArrayList<>();

    public ArrayList<Room> getRooms()
    {
        int RoomID;
        int ReportID;
        int RoomNo;
        String When;
        String Where;
        String What;
        String Repairs;
        String Moist;
        String Rot;
        String Mold;
        String Fire;
        String Other;
        String Walls;
        String Ceiling;
        String Floor;
        String Windows;
        String ScanningMade;
        String MoistureScanning;
        String MeasuringPoint;

        try
        {
            Connector.getInstance().connect();

            String query = "SELECT * FROM RoomDamage";
            rooms.clear();
            ResultSet res = Connector.getInstance().stmt.executeQuery(query);

            while (res.next())
            {
                RoomID = Integer.parseInt(res.getString(1));
                ReportID = Integer.parseInt(res.getString(2));
                RoomNo = Integer.parseInt(res.getString(3));
                When = res.getString(4);
                Where = res.getString(5);
                What = res.getString(6);
                Repairs = res.getString(7);
                Moist = res.getString(8);
                Rot = res.getString(9);
                Mold = res.getString(10);
                Fire = res.getString(11);
                Other = res.getString(12);
                Walls = res.getString(13);
                Ceiling = res.getString(14);
                Floor = res.getString(15);
                Windows = res.getString(16);
                ScanningMade = res.getString(17);
                MoistureScanning = res.getString(18);
                MeasuringPoint = res.getString(19);
                rooms.add(new Room(RoomID, ReportID, RoomNo, When, Where, What, Repairs, Moist, Rot, Mold, Fire,
                        Other, Walls, Ceiling, Floor, Windows, ScanningMade, MoistureScanning, MeasuringPoint));
            }
        } catch (SQLException ex)
        {
            ex.printStackTrace();
        }

        return rooms;
    }
    
    
    public Room getRoom(int roomID)
  {
    Room room = null;
    int conditionLevel;
    int buildingID;
    String buildingName;
    int zipcode;
    String address;
    int yearBuilt;
    int sizeOfBuilding;
    String purposeOfBuilding;
    String date;
    String technicianName;
    String customerName;
    String roofDesc;
    String outerWallsDesc;

    try
    {
      Connector.getInstance().connect();

      String query = "SELECT * FROM RoomDamage WHERE roomID = '" + roomID + "';";

      ResultSet res = Connector.getInstance().stmt.executeQuery(query);

      if (res.next())
      {
        report_ID = Integer.parseInt(res.getString(1));
        conditionLevel = Integer.parseInt(res.getString(2));
        buildingID = Integer.parseInt(res.getString(3));
        buildingName = res.getString(4);
        zipcode = Integer.parseInt(res.getString(5));
        address = res.getString(6);
        yearBuilt = Integer.parseInt(res.getString(7));
        sizeOfBuilding = Integer.parseInt(res.getString(8));
        purposeOfBuilding = res.getString(9);
        date = res.getString(10);
        technicianName = res.getString(11);
        customerName = res.getString(12);
        roofDesc = res.getString(13);
        outerWallsDesc = res.getString(14);
        report = new CompleteReport(reportID, conditionLevel, buildingID, buildingName, zipcode, address, yearBuilt, sizeOfBuilding,
        purposeOfBuilding, date, technicianName, customerName, roofDesc, outerWallsDesc);
      }
    } catch (SQLException | NullPointerException ex)
    {
      ex.printStackTrace();
      System.out.println(ex);
    }
    return report;
  }
}
