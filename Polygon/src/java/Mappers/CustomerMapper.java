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
        String phoneNum;
        String username;
        String password;

        try
        {
            Connector.getInstance().connect();
            
            String query = "SELECT * FROM customer";

            ResultSet res = Connector.getInstance().stmt.executeQuery(query);
            customers.clear(); 
            
            while (res.next())
            {
                customerID = Integer.parseInt(res.getString(1));
                customerName = res.getString(2);
                customerEmail = res.getString(3);
                phoneNum = res.getString(4);
                username = res.getString(5);
                password = res.getString(6);

                customers.add(new Customer(customerID, customerName, customerEmail, phoneNum, username, password));
            }

        } catch (SQLException ex)
        {
            ex.printStackTrace();
        }

        return customers;
    }
    
    public void addCustomer(String cName, String cEmail, String pNum, String username, String password)
    {
        try
        {
        Connector.getInstance().connect(); 
        
        String query =  "INSERT INTO `polygondatabase`.`customer` (`CustomerName`, `Email`, `PhoneNumber`, `username`, `password`, `accesslevel`) VALUES ('" + cName + "', '" + cEmail + "', '" + pNum + "', '" + username +  "', '" + password + "', 1');";
        Connector.getInstance().stmt.executeUpdate(query); 
        
        }
        catch(SQLException ex)
        {
            ex.printStackTrace(); 
        }
    }
}
