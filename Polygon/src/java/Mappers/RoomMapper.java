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
        Whens = res.getString(3);
        Wheres = res.getString(4);
        What = res.getString(5);
        Repairs = res.getString(6);
        Walls = res.getString(7);
        Ceiling = res.getString(8);
        Floor = res.getString(9);
        Windows = res.getString(10);
        ScanningMade = Integer.parseInt(res.getString(11));
        MoistureScanning = res.getString(12);
        MeasuringPoint = res.getString(13);
        Moist = Integer.parseInt(res.getString(14));
        Rot = Integer.parseInt(res.getString(15));
        Mold = Integer.parseInt(res.getString(16));
        Fire = Integer.parseInt(res.getString(17));
        Other = Integer.parseInt(res.getString(18));
        OtherDescription = res.getString(19);
        Recommendation = res.getString(20);
        
        
        rooms.add(new Room(RoomID, ReportID, Whens, Wheres, What, Repairs, Walls,
                Ceiling, Floor, Windows, ScanningMade, MoistureScanning, MeasuringPoint,
                Moist, Rot, Mold, Fire, Other, OtherDescription, Recommendation));
      }
    } catch (SQLException ex)
    {
      ex.printStackTrace();
    }

    return rooms;
  }

  public void addRooms(int ReportID, String Whens, String Wheres, String What, String Repairs,
          String Walls, String Ceiling, String Floor, String Windows, int ScanningMade, String MoistureScanning, 
          String MeasuringPoint, int Moist, int Rot, int Mold, int Fire, int Other, String OtherDescription, String Recommendation)
  {
    try
    {
      Connector.getInstance().connect();

      String query = "INSERT INTO polygondatabase.roomdamage(ReportID, Whens, Wheres, What, Repairs, Walls, Ceiling, Floor, Windows, Scanningmade, MoistureScanning, MeasuringPoint, Moist, Rot, Mold, Fire, Other, OtherDescription, Recommendation) VALUES ('"
              + ReportID + "', '" + Whens + "', '" + Wheres + "', '" + What + "', '" + Repairs + "', '" + Walls + "', '" + Ceiling + "', '" + Floor + "', '"
              + Windows + "', '" + ScanningMade + "', '" + MoistureScanning + "', '" + MeasuringPoint + "', '" + Moist + "', '"
              + Rot + "', '" + Mold + "', '" + Fire + "', '" + Other + "', '" + OtherDescription + "','" + Recommendation + "');";

      Connector.getInstance().stmt.executeUpdate(query);
    } catch (SQLException ex)
    {
      ex.printStackTrace();
    }
  }
}