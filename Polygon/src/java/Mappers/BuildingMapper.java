/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mappers;

import Model.Connector;
import Objects.Building;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Mathias
 */
public class BuildingMapper implements BuildingMapperInterface
{

  public ArrayList<Building> building = new ArrayList<>();
  int BuildingID;
  int CustomerID;
  int Zipcodes;
  String Address;
  int ParcelNo;
  int SizeOfBuilding;
  String AdditionalInformation;
  String conditionLevel;

  public ArrayList<Building> getBuildings()
  {

    try
    {
      Connector.getInstance().connect();

      String query = "SELECT * FROM Building";
      building.clear();
      ResultSet res = Connector.getInstance().stmt.executeQuery(query);

      while (res.next())
      {

        BuildingID = Integer.parseInt(res.getString(1));
        CustomerID = Integer.parseInt(res.getString(2));
        Zipcodes = Integer.parseInt(res.getString(3));
        Address = res.getString(4);
        ParcelNo = Integer.parseInt(res.getString(5));
        SizeOfBuilding = Integer.parseInt(res.getString(6));
        AdditionalInformation = res.getString(7);

        building.add(new Building(BuildingID, CustomerID, Zipcodes, Address, ParcelNo, SizeOfBuilding, AdditionalInformation));
      }

    } catch (SQLException ex)
    {
      ex.printStackTrace();
    }

    return building;
  }

  public void addBuilding(int CID, int Zipcode, String Address, int PC, int SOB, String AI) throws SQLException
  {

    Connector.getInstance().connect();

    String query = "INSERT INTO polygondatabase.building(CustomerID, Zipcode, Address, ParcelNo, SizeOfBuilding, AdditionalInformation) VALUES ('" + CID + "', '" + Zipcode + "', '" + Address + "', '" + PC + "', '" + SOB + "', '" + AI + "');";

    Connector.getInstance().stmt.executeUpdate(query);
  }

  public ArrayList<Building> sortAfterCondition()
  {

    try
    {
      Connector.getInstance().connect();
      String query = "SELECT BuildingID, CustomerID, Zipcode, Address, ParcelNo, SizeOfBuilding, AdditionalInformation, \n"
              + "(SELECT ConditionLevel FROM REPORT\n"
              + "WHERE DateWritten = (select max(DateWritten) FROM REPORT WHERE buildingid = b.BuildingID) \n"
              + "AND BuildingID = b.BuildingID) AS ConditionLevel FROM Building b order by ConditionLevel DESC;";

      ResultSet res = Connector.getInstance().stmt.executeQuery(query);
      building.clear();
      while (res.next())
      {

        BuildingID = Integer.parseInt(res.getString(1));
        CustomerID = Integer.parseInt(res.getString(2));
        Zipcodes = Integer.parseInt(res.getString(3));
        Address = res.getString(4);
        ParcelNo = Integer.parseInt(res.getString(5));
        SizeOfBuilding = Integer.parseInt(res.getString(6));
        AdditionalInformation = res.getString(7);
        conditionLevel = res.getString(8);

        building.add(new Building(BuildingID, CustomerID, Zipcodes, Address, ParcelNo, SizeOfBuilding, AdditionalInformation, conditionLevel));
      }
    } catch (SQLException ex)
    {
      ex.printStackTrace();
    }
    return building;
  }
}
