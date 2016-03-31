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

/**
 *
 * @author Mathias
 */
public class BuildingMapper
{

    public Building getBuildings()
    {
        int BuildingID;
        int CustomerID;
        String Address;
        int ParcelNo;
        int SizeOfBuilding;
        String AdditionalInformation;

        try
        {
            Connector c = new Connector();

            String query = "SELECT * FROM Building";

            ResultSet res = c.stmt.executeQuery(query);

            while (res.next())
            {

                BuildingID = Integer.parseInt(res.getString(1));
                CustomerID = Integer.parseInt(res.getString(2));
                Address = res.getString(3);
                ParcelNo = Integer.parseInt(res.getString(4));
                SizeOfBuilding = Integer.parseInt(res.getString(5));
                AdditionalInformation = res.getString(6);

                return new Building(BuildingID, CustomerID, Address, ParcelNo, SizeOfBuilding, AdditionalInformation);
            }

        } catch (SQLException ex)
        {
            ex.printStackTrace();
        }

        return null;
    }
}


