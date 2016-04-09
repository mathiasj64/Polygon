/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Mappers.BuildingMapper;
import Mappers.CustomerMapper;
import Mappers.ReportMapper;
import Mappers.UserMapper;
import Objects.Building;
import Objects.Customer;
import Objects.Report;
import Objects.User;
import java.util.ArrayList;

/**
 *
 * @author madsr
 */
public class Facade
{

    public BuildingMapper bm = new BuildingMapper();
    public CustomerMapper cm = new CustomerMapper();
    public ReportMapper rm = new ReportMapper();
    public UserMapper um = new UserMapper(); 
    
    private static Facade instance = null;

    protected Facade()
    {
        // Exists only to defeat instantiation.
    }

    public static Facade getInstance()
    {
        if (instance == null)
        {
            instance = new Facade();
        }
        return instance;
    }

    public void addBuilding(int CID, String Address, int PC, int SOB, String AI)
    {
        bm.addBuilding(CID, Address, PC, SOB, AI);
    }

    public void addCustomer(String name, String email, String phonenumber)
    {
        cm.addCustomer(name, email, phonenumber);
    }

    public void addReport(int buildingID, int conditionlevel, String conditionofbuilding, String functionOfBuilding)
    {
        rm.addReport(buildingID, conditionlevel, conditionofbuilding, functionOfBuilding);
    }

    public ArrayList<Report> getReports()
    {
        return rm.getReports();
    }

    public ArrayList<Customer> getCustomers()
    {
        return cm.getCustomers();
    }

    public ArrayList<Building> getBuildings()
    {
        return bm.getBuildings();
    }
    
    public User getUser(String uname)
    {
        return um.ReturnUser(uname); 
    }

}
