/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mappers;

import Model.Connector;
import Objects.CompleteReport;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Mathias
 */
public class ReportMapper
{

  public ArrayList<CompleteReport> reports = new ArrayList<>();

  public ArrayList<CompleteReport> getReports()
  {
    int reportID;
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

      String query = "SELECT * FROM Report";

      ResultSet res = Connector.getInstance().stmt.executeQuery(query);
      reports.clear();

      while (res.next())
      {
        reportID = Integer.parseInt(res.getString(1));
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
        reports.add(new CompleteReport(reportID, conditionLevel, buildingID, buildingName, zipcode, address, yearBuilt, sizeOfBuilding,
                purposeOfBuilding, date, technicianName, customerName, roofDesc, outerWallsDesc));
      }
    } catch (SQLException | NullPointerException ex)
    {
      ex.printStackTrace();
      System.out.println(ex);
    }
    return reports;
  }

  public void addCompleteReport(int conditionLevel, int buildingID, String buildingName, int zipcode, String address, int yearBuilt, int sizeOfBuilding, String purposeOfBuilding, String date, String technicianName, String customerName, String roofDesc, String outerWallsDesc)
  {
    try
    {
      Connector.getInstance().connect();

      String query = "INSERT INTO polygondatabase.report(conditionLevel, buildingID, buildingName, zipcode, address, yearBuilt, sizeOfBuilding, purposeOfBuilding, DateWritten, technicianName, customerName, roofDesc, outerWallsDesc) VALUES ('" + conditionLevel
              + "', '" + buildingID + "', '" + buildingName + "', '" + zipcode + "', '" + address + "', '" + yearBuilt + "', '" + sizeOfBuilding
              + "', '" + purposeOfBuilding + "', '" + date + "', '" + technicianName + "', '" + customerName + "', '" + roofDesc + "', '" + outerWallsDesc + "');";

      Connector.getInstance().stmt.executeUpdate(query);

    } catch (SQLException ex)
    {
      ex.printStackTrace();
    }
  }

  public void addReport(int buildingID, int conditionLevel, String conditionOfBuilding, String functionOfBuilding)
  {
    try
    {
      Connector.getInstance().connect();

      String query = "INSERT INTO polygondatabase.checkupreport(BuildingID, ConditionLevel, DescriptionOfBuilding, FunctionOfBuilding) VALUES ('" + buildingID + "', '" + conditionLevel + "', '" + conditionOfBuilding + "', '" + functionOfBuilding + "');";

      Connector.getInstance().stmt.executeUpdate(query);

    } catch (SQLException | NullPointerException ex)
    {
      ex.printStackTrace();
      System.out.println(ex);
    }
  }

  public CompleteReport getReport(int reportID)
  {
    CompleteReport report = null;
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

      String query = "SELECT * FROM Report WHERE reportID = '" + reportID + "';";

      ResultSet res = Connector.getInstance().stmt.executeQuery(query);

      if (res.next())
      {
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

  public int getHighestReportID()
  {
    int highestID = 0;
    try
    {
      Connector.getInstance().connect();

      String query = "SELECT reportID FROM Report;";

      ResultSet res = Connector.getInstance().stmt.executeQuery(query);

      while (res.next())
      {
        int current = Integer.parseInt(res.getString(1));
        if(current > highestID)
        {
          highestID = current;
        }
      }
    }
    catch(SQLException ex)
    {
      ex.printStackTrace();
    }
    return highestID;
  }
}
