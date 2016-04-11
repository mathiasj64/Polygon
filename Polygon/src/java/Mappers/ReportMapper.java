/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mappers;

import Model.Connector;
import Objects.Report;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Mathias
 */
public class ReportMapper
{
  
  public ArrayList<Report> reports = new ArrayList<>(); 
  
  public ArrayList<Report> getReports()
  {
    int buildingID;
    int conditionLevel;
    String descriptionOfBuilding;
    String functionOfBuilding;
    
    try
    {
      Connector.getInstance().connect();
      
      String query = "SELECT * FROM CheckupReport";

      ResultSet res = Connector.getInstance().stmt.executeQuery(query);
      reports.clear();
      
      while (res.next())
      {
        buildingID = Integer.parseInt(res.getString(1));
        conditionLevel = Integer.parseInt(res.getString(2));
        descriptionOfBuilding = res.getString(3);
        functionOfBuilding = res.getString(4);
        reports.add(new Report(buildingID, conditionLevel, descriptionOfBuilding, functionOfBuilding));
      }
                  
    } catch (SQLException | NullPointerException ex)
    {
      ex.printStackTrace();
      System.out.println(ex);
    }
    return reports;
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
  
}
