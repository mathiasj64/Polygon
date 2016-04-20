/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mappers;

import Model.Connector;
import Objects.Administrator;
import Objects.Building;
import Objects.CompleteReport;
import Objects.User;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author madsr
 */
public class UserMapper
{

    public ArrayList<Building> userBuildings = new ArrayList();
    public ArrayList<Integer> bID = new ArrayList();
    public ArrayList<CompleteReport> userReports = new ArrayList();

    int BuildingID;
    int CustomerID;
    int Zipcodes;
    String Address;
    int ParcelNo;
    int SizeOfBuilding;
    String AdditionalInformation;
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

    public User ReturnUser(String uName)
    {
        try
        {

            Connector.getInstance().connect();

            String query = "SELECT * FROM Customer WHERE username = '" + uName + "';";

            ResultSet res = Connector.getInstance().stmt.executeQuery(query);

            if (res.next())
            {
                int CustomerID = Integer.parseInt(res.getString(1));
                String loginU = res.getString(5);
                String pWord = res.getString(6);
                int aLevel = Integer.parseInt(res.getString(7));

                return new User(CustomerID, loginU, pWord, aLevel);
            }

        } catch (SQLException ex)
        {
            ex.printStackTrace();
        }

        return null;
    }

    public ArrayList<Building> getUserBuildings(int CID)
    {
        try
        {
            Connector.getInstance().connect();

            String query = "SELECT * FROM building WHERE customerID = '" + CID + "';";

            ResultSet res = Connector.getInstance().stmt.executeQuery(query);
            userBuildings.clear();
            while (res.next())
            {
                BuildingID = Integer.parseInt(res.getString(1));
                CustomerID = Integer.parseInt(res.getString(2));
                Zipcodes = Integer.parseInt(res.getString(3));
                Address = res.getString(4);
                ParcelNo = Integer.parseInt(res.getString(5));
                SizeOfBuilding = Integer.parseInt(res.getString(6));
                AdditionalInformation = res.getString(7);

                userBuildings.add(new Building(BuildingID, CustomerID, Zipcodes, Address, ParcelNo, SizeOfBuilding, AdditionalInformation));
            }

        } catch (SQLException ex)
        {
            ex.printStackTrace();
        }

        return null;
    }

    public ArrayList<Integer> getBuildingID(int customerID)
    {
        try
        {
            Connector.getInstance().connect();

            String query = "SELECT buildingID FROM building where CustomerID = '" + customerID + "';";

            ResultSet res = Connector.getInstance().stmt.executeQuery(query);

            while (res.next())
            {
                if(!bID.contains(res.getInt(1)))
                {
                bID.add(res.getInt(1));
                }
            }
        } catch (SQLException ex)
        {
            ex.printStackTrace();
        }

        return bID;
    }

    public ArrayList<CompleteReport> getUserReports(int CID)
    {

        try
        {
            getBuildingID(CID);

            Connector.getInstance().connect();
            userReports.clear();
            for (int i = 0; i < bID.size(); i++)
            {
                String query = "SELECT * FROM report WHERE buildingID = '" + bID.get(i) + "';";
                ResultSet res = Connector.getInstance().stmt.executeQuery(query);
                
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
                    
                   
                        userReports.add(new CompleteReport(reportID, conditionLevel, buildingID, buildingName, zipcode, address, yearBuilt, sizeOfBuilding,
                                purposeOfBuilding, date, technicianName, customerName, roofDesc, outerWallsDesc));
                    

                }
            }

        } catch (SQLException ex)
        {

        }
        return userReports;
    }
    
    public Administrator GetAdmin(String uName)
    {
        try
        {

            Connector.getInstance().connect();

            String query = "SELECT * FROM Administrator WHERE username = '" + uName + "';";

            ResultSet res = Connector.getInstance().stmt.executeQuery(query);

            if (res.next())
            {
          
                String loginU = res.getString(1);
                String pWord = res.getString(2);
                int aLevel = Integer.parseInt(res.getString(3));

                return new Administrator(loginU, pWord, aLevel);
            }

        } catch (SQLException ex)
        {
            ex.printStackTrace();
        }

        return null;
    }
}
