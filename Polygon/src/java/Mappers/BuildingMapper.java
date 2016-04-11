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
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Mathias
 */
public class BuildingMapper
{

    public ArrayList<Building> building = new ArrayList<>();

    public ArrayList<Building> getBuildings()
    {
        int BuildingID;
        int CustomerID;
        String Address;
        int ParcelNo;
        int SizeOfBuilding;
        String AdditionalInformation;

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
                Address = res.getString(3);
                ParcelNo = Integer.parseInt(res.getString(4));
                SizeOfBuilding = Integer.parseInt(res.getString(5));
                AdditionalInformation = res.getString(6);

                building.add(new Building(BuildingID, CustomerID, Address, ParcelNo, SizeOfBuilding, AdditionalInformation));
            }

        } catch (SQLException ex)
        {
            ex.printStackTrace();
        }

        return building;
    }

    public void addBuilding(int CID, String Address, int PC, int SOB, String AI)
    {
        try
        {
            Connector.getInstance().connect();

            String query = "INSERT INTO polygondatabase.building(CustomerID, Address, ParcelNo, SizeOfBuilding, AdditionalInformation) VALUES ('" + CID + "', '" + Address + "', '" + PC + "', '" + SOB + "', '" + AI + "');";

            Connector.getInstance().stmt.executeUpdate(query);

        } catch (SQLException ex)
        {
            ex.printStackTrace();
            System.out.println(ex);
        }
    }
}
