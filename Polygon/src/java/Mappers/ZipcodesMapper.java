/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mappers;

import Model.Connector;
import Objects.Zipcodes;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Thygesen
 */
public class ZipcodesMapper
{

    public ArrayList<Zipcodes> zipcodes = new ArrayList<>();

    public ArrayList<Zipcodes> getZipcodes()
    {
        int zipcode;
        String city;

        try
        {
            Connector.getInstance().connect();

            String query = "SELECT * FROM Zipcode";

            ResultSet res = Connector.getInstance().stmt.executeQuery(query);
            zipcodes.clear();

            while (res.next())

            {
                zipcode = Integer.parseInt(res.getString(1));
                city = res.getString(2);
                zipcodes.add(new Zipcodes(zipcode, city));
            }
        } catch (SQLException | NullPointerException ex)
        {
            ex.printStackTrace();
            System.out.println(ex);
        }
        return zipcodes;
    }
}