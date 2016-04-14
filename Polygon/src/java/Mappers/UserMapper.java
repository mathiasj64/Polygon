/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mappers;

import Model.Connector;
import Objects.Building;
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

    int BuildingID;
    int CustomerID;
    int Zipcodes;
    String Address;
    int ParcelNo;
    int SizeOfBuilding;
    String AdditionalInformation;

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
}
