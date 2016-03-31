/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mappers;

import Model.Connector;
import Objects.Customer;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Mads
 */
public class CustomerMapper
{
    public ArrayList<Customer> customers = new ArrayList<>(); 
    
    public ArrayList<Customer> getCustomers()
    {
        int customerID;
        String customerName;
        String customerEmail;
        int phoneNum;

        try
        {
            Connector c = new Connector();

            String query = "SELECT * FROM customer";

            ResultSet res = c.stmt.executeQuery(query);

            while (res.next())
            {

                customerID = Integer.parseInt(res.getString(1));
                customerName = res.getString(2);
                customerEmail = res.getString(3);
                phoneNum = Integer.parseInt(res.getString(4));

                customers.add(new Customer(customerID, customerName, customerEmail, phoneNum));
            }

        } catch (SQLException ex)
        {
            ex.printStackTrace();
        }

        return customers;
    }
}
