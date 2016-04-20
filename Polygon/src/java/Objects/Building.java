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
public class Building
{

    private int buildingID;
    private int customerID;
    private int zipcodes;
    private String address;
    private int parcelNo;
    private int sizeOfBuilding;
    private String additionalInformation;
    private String conditionLevel; 
    

    public Building(int BuildingID, int CustomerID, int Zipcodes, String Address, int ParcelNo, int SizeOfBuilding, String AdditionalInformation)
    {
        this.buildingID = BuildingID;
        this.customerID = CustomerID;
        this.zipcodes = Zipcodes;
        this.address = Address;
        this.parcelNo = ParcelNo;
        this.sizeOfBuilding = SizeOfBuilding;
        this.additionalInformation = AdditionalInformation;
    }
    
    public Building(int BuildingID, int CustomerID, int Zipcodes, String Address, int ParcelNo, int SizeOfBuilding, String AdditionalInformation, String conditionLevel)
    {
        this.buildingID = BuildingID;
        this.customerID = CustomerID;
        this.zipcodes = Zipcodes;
        this.address = Address;
        this.parcelNo = ParcelNo;
        this.sizeOfBuilding = SizeOfBuilding;
        this.additionalInformation = AdditionalInformation;
        this.conditionLevel = conditionLevel; 
    }

    public int getBuildingID()
    {
        return buildingID;
    }

    public void setBuildingID(int BuildingID)
    {
        this.buildingID = BuildingID;
    }

    public int getCustomerID()
    {
        return customerID;
    }

    public void setCustomerID(int CustomerID)
    {
        this.customerID = CustomerID;
    }

    public int getZipcodes()
    {
        return zipcodes;
    }

    public void setZipcodes(int Zipcodes)
    {
        this.zipcodes = Zipcodes;
    }
    
    public String getAddress()
    {
        return address;
    }

    public void setAddress(String Address)
    {
        this.address = Address;
    }

    public int getParcelNo()
    {
        return parcelNo;
    }

    public void setParcelNo(int ParcelNo)
    {
        this.parcelNo = ParcelNo;
    }

    public int getSizeOfBuilding()
    {
        return sizeOfBuilding;
    }

    public void setSizeOfBuilding(int SizeOfBuilding)
    {
        this.sizeOfBuilding = SizeOfBuilding;
    }

    public String getAdditionalInformation()
    {
        return additionalInformation;
    }

    public void setAdditionalInformation(String AdditionalInformation)
    {
        this.additionalInformation = AdditionalInformation;
    }

    public String getConditionLevel()
    {
        return conditionLevel;
    }

    public void setConditionLevel(String conditionLevel)
    {
        this.conditionLevel = conditionLevel;
    }
    
    
}
