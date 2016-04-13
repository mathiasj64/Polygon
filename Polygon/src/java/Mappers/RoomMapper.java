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
        String Whens;
        String Wheres;
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

            String query = "SELECT * FROM Building";
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
                rooms.add(new Room(RoomID, ReportID, RoomNo, Whens, Wheres, What, Repairs, Moist, Rot, Mold, Fire,
                        Other, Walls, Ceiling, Floor, Windows, ScanningMade, MoistureScanning, MeasuringPoint));
            }
        } catch (SQLException ex)
        {
            ex.printStackTrace();
        }

        return rooms;
    }
    
}
