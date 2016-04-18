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

  public ArrayList<Room> getRoomsFromReport(int reportID)
  {
    int RoomID;
    int ReportID;
    int RoomNo;
    String Whens;
    String Wheres;
    String What;
    String Repairs;
    String Walls;
    String Ceiling;
    String Floor;
    String Windows;
    int ScanningMade;
    String MoistureScanning;
    String MeasuringPoint;
    int Moist;
    int Rot;
    int Mold;
    int Fire;
    int Other;
    String OtherDescription;
    String Recommendation;
    
    try
    {
      Connector.getInstance().connect();

      String query = "SELECT * FROM RoomDamage natural join Report WHERE reportID =" + reportID + ";";
      rooms.clear();
      ResultSet res = Connector.getInstance().stmt.executeQuery(query);

      while (res.next())
      {
        RoomID = Integer.parseInt(res.getString(1));
        ReportID = Integer.parseInt(res.getString(2));
        RoomNo = Integer.parseInt(res.getString(3));
        Whens = res.getString(4);
        Wheres = res.getString(5);
        What = res.getString(6);
        Repairs = res.getString(7);
        Walls = res.getString(8);
        Ceiling = res.getString(9);
        Floor = res.getString(10);
        Windows = res.getString(11);
        ScanningMade = Integer.parseInt(res.getString(12));
        MoistureScanning = res.getString(13);
        MeasuringPoint = res.getString(14);
        Moist = Integer.parseInt(res.getString(15));
        Rot = Integer.parseInt(res.getString(16));
        Mold = Integer.parseInt(res.getString(17));
        Fire = Integer.parseInt(res.getString(18));
        Other = Integer.parseInt(res.getString(19));
        OtherDescription = res.getString(20);
        Recommendation = res.getString(21);
        
        
        rooms.add(new Room(RoomID, ReportID, RoomNo, Whens, Wheres, What, Repairs, Walls,
                Ceiling, Floor, Windows, ScanningMade, MoistureScanning, MeasuringPoint,
                Moist, Rot, Mold, Fire, Other, OtherDescription, Recommendation));
      }
    } catch (SQLException ex)
    {
      ex.printStackTrace();
    }

    return rooms;
  }

  public void addRooms(int ReportID, int RoomNo, String Whens, String Wheres, String What, String Repairs,
          String Walls, String Ceiling, String Floor, String Windows, String ScanningMade, String MoistureScanning, 
          String MeasuringPoint, int Moist, int Rot, int Mold, int Fire, int Other, String OtherDescription, String Recommendation)
  {
    try
    {
      Connector.getInstance().connect();

      String query = "INSERT INTO polygondatabase.roomdamage(RoomID, ReportID, RoomNo, Whens, Wheres, What, Repairs, Walls, Ceiling, Floor, Windows, Scanningmade, MoistureScanning, MoisturingPoint, Moist, Rot, Mold, Fire, Other, OtherDescription, Recommendation) VALUES ('"
              + ReportID + "', '" + RoomNo + "', '" + Whens + "', '" + Wheres + "', '" + What + "', '" + Repairs + "', '" + Walls + "', '" + Ceiling + "', '" + Floor + "', '"
              + Windows + "', '" + ScanningMade + "', '" + MoistureScanning + "', '" + MeasuringPoint + "', '" + Moist + "', '"
              + Rot + "', '" + Mold + "', '" + Fire + "', '" + Other + "', '" + OtherDescription + "','" + Recommendation + "');";

      Connector.getInstance().stmt.executeUpdate(query);
    } catch (SQLException ex)
    {
      ex.printStackTrace();
    }
  }
}