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
import Mappers.ZipcodesMapper;
import Objects.Administrator;
import Objects.Building;
import Objects.CompleteReport;
import Objects.Customer;
import Objects.User;
import java.util.ArrayList;

/**
 *
 * @author Mathias
 */
public class Controller
{

  public BuildingMapper bm = new BuildingMapper();
  public CustomerMapper cm = new CustomerMapper();
  public ReportMapper rm = new ReportMapper();
  public UserMapper um = new UserMapper();
  public RoomMapper rom = new RoomMapper();
  public ZipcodesMapper zm = new ZipcodesMapper();

  private static Facade instance = null;

  protected Controller()
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
  
  public void addBuilding(int CID,int Zipcode, String Address, int PC, int SOB, String AI)
    {
        Facade.getInstance().addBuilding(CID, Zipcode, Address, PC, SOB, AI);
    }

    public void addCustomer(String cName, String cEmail, String pNum, String username, String password)
    {
        Facade.getInstance().addCustomer(cName, cEmail, pNum, username, password);
    }

    public void addReport(int buildingID, int conditionlevel, String conditionofbuilding, String functionOfBuilding)
    {
        Facade.getInstance().addReport(buildingID, conditionlevel, conditionofbuilding, functionOfBuilding);
    }

    public void addCompleteReport(int conditionLevel, int buildingID, String buildingName, int zipcode, String address, int yearBuilt, int sizeOfBuilding, String purposeOfBuilding, String date, String technicianName, String customerName, String roofDesc, String outerWallsDesc)
    {
        Facade.getInstance().addCompleteReport(conditionLevel, buildingID, buildingName, zipcode, address, yearBuilt, sizeOfBuilding, purposeOfBuilding, date, technicianName, customerName, roofDesc, outerWallsDesc);
    }

    public void editCustomer(String cName, String cEmail, String pNum, String username, String password, int CID)
    {
        Facade.getInstance().editCustomer(cName, cEmail, pNum, username, password, CID);
    }

    public void deleteReport(int reportID)
    {
        Facade.getInstance().deleteReport(reportID);
    }

    public ArrayList<Building> getUserBuildings(int CID)
    {
        return Facade.getInstance().getUserBuildings(CID);
    }

    public ArrayList<CompleteReport> getReports()
    {
        return Facade.getInstance().getReports();
    }

    public ArrayList<Customer> getCustomers()
    {
        return Facade.getInstance().getCustomers();
    }

    public ArrayList<Building> getBuildings()
    {
        return Facade.getInstance().getBuildings();
    }

    public User returnUser(String uname)
    {
        return Facade.getInstance().returnUser(uname);
    }

    public ArrayList<CompleteReport> getUserReports(int cID)
    {
        return Facade.getInstance().getUserReports(cID);
    }

    public void addRooms(int ReportID, String Whens, String Wheres, String What, String Repairs, String Walls, String Ceiling, String Floor, String Windows, int ScanningMade, String MoistureScanning, String MeasuringPoint, int Moist, int Rot, int Mold, int Fire, int Other, String OtherDescription, String Recommendation)
    {
        Facade.getInstance().addRooms(ReportID, Whens, Wheres, What, Repairs, Walls, Ceiling, Floor, Windows, ScanningMade, MoistureScanning, MeasuringPoint, Moist, Rot, Mold, Fire, Other, OtherDescription, Recommendation);
    }

    public Administrator GetAdmin(String uName)
    {
        return Facade.getInstance().GetAdmin(uName);
    }
    
    public String getCityFromZipcode(int zipcode)
    {
      return Facade.getInstance().getCityFromZipcode(zipcode);
    }

}
