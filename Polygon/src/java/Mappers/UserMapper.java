/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mappers;

import Model.Connector;
import Objects.User;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author madsr
 */
public class UserMapper
{

    

    public User ReturnUser(String uName)
    {
        try
        {

            Connector.getInstance().connect();

            String query = "SELECT * FROM Users WHERE username = '" + uName + "';";
            System.out.println(query);

            ResultSet res = Connector.getInstance().stmt.executeQuery(query);

            if (res.next())
            {
                String loginU = res.getString(1);
                String pWord = res.getString(2);
                int aLevel = Integer.parseInt(res.getString(3));
                return new User(loginU, pWord, aLevel);
            }

        } catch (SQLException ex)
        {
            ex.printStackTrace();
        }

        return null;
    }
}
