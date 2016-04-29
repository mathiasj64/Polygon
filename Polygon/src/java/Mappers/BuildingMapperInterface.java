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
import java.util.ArrayList;

/**
 *
 * @author madsr
 */
public interface BuildingMapperInterface
{
    
  public ArrayList<Building> getBuildings();

  public void addBuilding(int CID, int Zipcode, String Address, int PC, int SOB, String AI) throws SQLException;
  
  public ArrayList<Building> sortAfterCondition();
  
}
