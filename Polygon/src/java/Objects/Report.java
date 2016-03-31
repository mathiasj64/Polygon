/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;

/**
 *
 * @author Mathias
 */
public class Report
{
  
  int conditionLevel;
  int buildingID;
  String descriptionOfBuilding;
  String functionOfBuilding;
  
  public Report(int condition_Level, int building_ID, String description_Of_Building, String function_Of_Building)
  {
    conditionLevel = condition_Level;
    buildingID = building_ID;
    descriptionOfBuilding = description_Of_Building;
    functionOfBuilding = function_Of_Building;
  }

  public void setConditionLevel(int conditionLevel)
  {
    this.conditionLevel = conditionLevel;
  }

  public void setBuildingID(int buildingID)
  {
    this.buildingID = buildingID;
  }

  public void setDescriptionOfBuilding(String descriptionOfBuilding)
  {
    this.descriptionOfBuilding = descriptionOfBuilding;
  }

  public void setFunctionOfBuilding(String functionOfBuilding)
  {
    this.functionOfBuilding = functionOfBuilding;
  }
  
  public int getConditionLevel()
  {
    return conditionLevel;
  }

  public int getBuildingID()
  {
    return buildingID;
  }

  public String getDescriptionOfBuilding()
  {
    return descriptionOfBuilding;
  }

  public String getFunctionOfBuilding()
  {
    return functionOfBuilding;
  }
  
  
  
}
