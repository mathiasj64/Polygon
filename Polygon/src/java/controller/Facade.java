/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Mappers.BuildingMapper;
import Mappers.CustomerMapper;
import Mappers.ReportMapper;
import Mappers.RoomMapper;
import Mappers.UserMapper;
import Objects.Building;
import Objects.CompleteReport;
import Objects.Customer;
import Objects.Report;
import Objects.User;
import java.util.ArrayList;

/**
 *
 * @author madsr
 */
public class Facade
{

  public BuildingMapper bm = new BuildingMapper();
  public CustomerMapper cm = new CustomerMapper();
  public ReportMapper rm = new ReportMapper();
  public UserMapper um = new UserMapper();
  public RoomMapper rom = new RoomMapper();

  private static Facade instance = null;

  protected Facade()
  {
    // Exists only to defeat instantiation.
  }

  public static Facade getInstance()
  {
    if (instance == null)
    {
      instance = new Facade();
    }
    return instance;
  }

  public void addBuilding(int CID, String Address, int PC, int SOB, String AI)
  {
    bm.addBuilding(CID, Address, PC, SOB, AI);
  }

  public void addCustomer(String cName, String cEmail, String pNum, String username, String password)
  {
    cm.addCustomer(cName, cEmail, pNum, username, password);
  }

  public void addReport(int buildingID, int conditionlevel, String conditionofbuilding, String functionOfBuilding)
  {
    rm.addReport(buildingID, conditionlevel, conditionofbuilding, functionOfBuilding);
  }

  public void addCompleteReport(int conditionLevel, int buildingID, String buildingName, int zipcode, String address, int yearBuilt, int sizeOfBuilding, String purposeOfBuilding, String date, String technicianName, String customerName, String roofDesc, String outerWallsDesc)
  {
    rm.addCompleteReport(conditionLevel, buildingID, buildingName, zipcode, address, yearBuilt, sizeOfBuilding, purposeOfBuilding, date, technicianName, customerName, roofDesc, outerWallsDesc);
  }

  public ArrayList<Building> getUserBuildings(int CID)
  {
    return um.getUserBuildings(CID);
  }

  public ArrayList<CompleteReport> getReports()
  {
    return rm.getReports();
  }

  public ArrayList<Customer> getCustomers()
  {
    return cm.getCustomers();
  }

  public ArrayList<Building> getBuildings()
  {
    return bm.getBuildings();
  }

  public User getUser(String uname)
  {
    return um.ReturnUser(uname);
  }

  public void addRooms(int ReportID, String Whens, String Wheres, String What, String Repairs, String Walls, String Ceiling, String Floor, String Windows, String ScanningMade, String MoistureScanning, String MeasuringPoint, int Moist, int Rot, int Mold, int Fire, int Other, String OtherDescription, String Recommendation)
  {
    rom.addRooms(ReportID, Whens, Wheres, What, Repairs, Walls, Ceiling, Floor, Windows, ScanningMade, MoistureScanning, MeasuringPoint, Moist, Rot, Mold, Fire, Other, OtherDescription, Recommendation);
  }
    
}
