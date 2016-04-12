/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;

/**
 *
 * @author Thygesen
 */
public class Conditions
{

    int conditionLevel;
    String descriptionOfBuilding;
    String functionOfBuilding;

    public Conditions(int conditionLevel, String descriptionOfBuilding, String functionOfBuilding)
    {
        this.conditionLevel = conditionLevel;
        this.descriptionOfBuilding = descriptionOfBuilding;
        this.functionOfBuilding = functionOfBuilding;
    }

    public int getConditionLevel()
    {
        return conditionLevel;
    }

    public void setConditionLevel(int conditionLevel)
    {
        this.conditionLevel = conditionLevel;
    }

    public String getDescriptionOfBuilding()
    {
        return descriptionOfBuilding;
    }

    public void setDescriptionOfBuilding(String descriptionOfBuilding)
    {
        this.descriptionOfBuilding = descriptionOfBuilding;
    }

    public String getFunctionOfBuilding()
    {
        return functionOfBuilding;
    }

    public void setFunctionOfBuilding(String functionOfBuilding)
    {
        this.functionOfBuilding = functionOfBuilding;
    }
    
}
