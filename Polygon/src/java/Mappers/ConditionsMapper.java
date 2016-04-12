/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mappers;

import Model.Connector;
import Objects.Conditions;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Thygesen
 */
public class ConditionsMapper
{

    public ArrayList<Conditions> conditions = new ArrayList<>();

    public ArrayList<Conditions> getConditions()
    {
        int conditionLevel;
        String descriptionOfBuilding;
        String functionOfBuilding;

        try
        {
            Connector.getInstance().connect();

            String query = "SELECT * FROM Conditions";

            ResultSet res = Connector.getInstance().stmt.executeQuery(query);
            conditions.clear();

            while (res.next())

            {
                conditionLevel = Integer.parseInt(res.getString(1));
                descriptionOfBuilding = res.getString(2);
                functionOfBuilding = res.getString(3);
                conditions.add(new Conditions(conditionLevel, descriptionOfBuilding, functionOfBuilding));
            }
        } catch (SQLException | NullPointerException ex)
        {
            ex.printStackTrace();
            System.out.println(ex);
        }
        return conditions;
    }
}
