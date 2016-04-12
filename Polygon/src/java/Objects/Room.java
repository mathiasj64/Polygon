/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;

/**
 *
 * @author Thygesen
 */
public class Room
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

    public Room(int RoomID, int ReportID, int RoomNo, String When, String Where, String What, String Repairs, String Moist, String Rot, String Mold, String Fire, String Other, String Walls, String Ceiling, String Floor, String Windows, String ScanningMade, String MoistureScanning, String MeasuringPoint)
    {
        this.RoomID = RoomID;
        this.ReportID = ReportID;
        this.RoomNo = RoomNo;
        this.When = When;
        this.Where = Where;
        this.What = What;
        this.Repairs = Repairs;
        this.Moist = Moist;
        this.Rot = Rot;
        this.Mold = Mold;
        this.Fire = Fire;
        this.Other = Other;
        this.Walls = Walls;
        this.Ceiling = Ceiling;
        this.Floor = Floor;
        this.Windows = Windows;
        this.ScanningMade = ScanningMade;
        this.MoistureScanning = MoistureScanning;
        this.MeasuringPoint = MeasuringPoint;
    }

    public int getRoomID()
    {
        return RoomID;
    }

    public void setRoomID(int RoomID)
    {
        this.RoomID = RoomID;
    }

    public int getReportID()
    {
        return ReportID;
    }

    public void setReportID(int ReportID)
    {
        this.ReportID = ReportID;
    }

    public int getRoomNo()
    {
        return RoomNo;
    }

    public void setRoomNo(int RoomNo)
    {
        this.RoomNo = RoomNo;
    }

    public String getWhen()
    {
        return When;
    }

    public void setWhen(String When)
    {
        this.When = When;
    }

    public String getWhere()
    {
        return Where;
    }

    public void setWhere(String Where)
    {
        this.Where = Where;
    }

    public String getWhat()
    {
        return What;
    }

    public void setWhat(String What)
    {
        this.What = What;
    }

    public String getRepairs()
    {
        return Repairs;
    }

    public void setRepairs(String Repairs)
    {
        this.Repairs = Repairs;
    }

    public String getMoist()
    {
        return Moist;
    }

    public void setMoist(String Moist)
    {
        this.Moist = Moist;
    }

    public String getRot()
    {
        return Rot;
    }

    public void setRot(String Rot)
    {
        this.Rot = Rot;
    }

    public String getMold()
    {
        return Mold;
    }

    public void setMold(String Mold)
    {
        this.Mold = Mold;
    }

    public String getFire()
    {
        return Fire;
    }

    public void setFire(String Fire)
    {
        this.Fire = Fire;
    }

    public String getOther()
    {
        return Other;
    }

    public void setOther(String Other)
    {
        this.Other = Other;
    }

    public String getWalls()
    {
        return Walls;
    }

    public void setWalls(String Walls)
    {
        this.Walls = Walls;
    }

    public String getCeiling()
    {
        return Ceiling;
    }

    public void setCeiling(String Ceiling)
    {
        this.Ceiling = Ceiling;
    }

    public String getFloor()
    {
        return Floor;
    }

    public void setFloor(String Floor)
    {
        this.Floor = Floor;
    }

    public String getWindows()
    {
        return Windows;
    }

    public void setWindows(String Windows)
    {
        this.Windows = Windows;
    }

    public String getScanningMade()
    {
        return ScanningMade;
    }

    public void setScanningMade(String ScanningMade)
    {
        this.ScanningMade = ScanningMade;
    }

    public String getMoistureScanning()
    {
        return MoistureScanning;
    }

    public void setMoistureScanning(String MoistureScanning)
    {
        this.MoistureScanning = MoistureScanning;
    }

    public String getMeasuringPoint()
    {
        return MeasuringPoint;
    }

    public void setMeasuringPoint(String MeasuringPoint)
    {
        this.MeasuringPoint = MeasuringPoint;
    }
}
