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

  public Room(int RoomID, int ReportID, int RoomNo, String When, String Where, String What, String Repairs, String Walls, String Ceiling, String Floor, String Windows, int ScanningMade, String MoistureScanning, String MeasuringPoint, int Moist, int Rot, int Mold, int Fire, int Other, String OtherDescription, String Recommendation)
  {
    this.RoomID = RoomID;
    this.ReportID = ReportID;
    this.RoomNo = RoomNo;
    this.Whens = When;
    this.Wheres = Where;
    this.What = What;
    this.Repairs = Repairs;
    this.Walls = Walls;
    this.Ceiling = Ceiling;
    this.Floor = Floor;
    this.Windows = Windows;
    this.ScanningMade = ScanningMade;
    this.MoistureScanning = MoistureScanning;
    this.MeasuringPoint = MeasuringPoint;
    this.Moist = Moist;
    this.Rot = Rot;
    this.Mold = Mold;
    this.Fire = Fire;
    this.Other = Other;
    this.OtherDescription = OtherDescription;
    this.Recommendation = Recommendation;
  }

  public String getRecommendation()
  {
    return Recommendation;
  }

  public void setRecommendation(String Recommendation)
  {
    this.Recommendation = Recommendation;
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
    return Whens;
  }

  public void setWhen(String When)
  {
    this.Whens = When;
  }

  public String getWhere()
  {
    return Wheres;
  }

  public void setWhere(String Where)
  {
    this.Wheres = Where;
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

  public String getWhens()
  {
    return Whens;
  }

  public void setWhens(String Whens)
  {
    this.Whens = Whens;
  }

  public String getWheres()
  {
    return Wheres;
  }

  public void setWheres(String Wheres)
  {
    this.Wheres = Wheres;
  }

  public int getScanningMade()
  {
    return ScanningMade;
  }

  public void setScanningMade(int ScanningMade)
  {
    this.ScanningMade = ScanningMade;
  }

  public int getMoist()
  {
    return Moist;
  }

  public void setMoist(int Moist)
  {
    this.Moist = Moist;
  }

  public int getRot()
  {
    return Rot;
  }

  public void setRot(int Rot)
  {
    this.Rot = Rot;
  }

  public int getMold()
  {
    return Mold;
  }

  public void setMold(int Mold)
  {
    this.Mold = Mold;
  }

  public int getFire()
  {
    return Fire;
  }

  public void setFire(int Fire)
  {
    this.Fire = Fire;
  }

  public int getOther()
  {
    return Other;
  }

  public void setOther(int Other)
  {
    this.Other = Other;
  }

  public String getOtherDescription()
  {
    return OtherDescription;
  }

  public void setOtherDescription(String OtherDescription)
  {
    this.OtherDescription = OtherDescription;
  }

}
