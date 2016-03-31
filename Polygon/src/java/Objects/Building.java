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

    private int BuildingID;
    private int CustomerID;
    private String Address;
    private int ParcelNo;
    private int SizeOfBuilding;
    private String AdditionalInformation;

    public Building(int BuildingID, int CustomerID, String Address, int ParcelNo, int SizeOfBuilding, String AdditionalInformation)
    {
        this.BuildingID = BuildingID;
        this.CustomerID = CustomerID;
        this.Address = Address;
        this.ParcelNo = ParcelNo;
        this.SizeOfBuilding = SizeOfBuilding;
        this.AdditionalInformation = AdditionalInformation;
    }

    public int getBuildingID()
    {
        return BuildingID;
    }

    public void setBuildingID(int BuildingID)
    {
        this.BuildingID = BuildingID;
    }

    public int getCustomerID()
    {
        return CustomerID;
    }

    public void setCustomerID(int CustomerID)
    {
        this.CustomerID = CustomerID;
    }

    public String getAddress()
    {
        return Address;
    }

    public void setAddress(String Address)
    {
        this.Address = Address;
    }

    public int getParcelNo()
    {
        return ParcelNo;
    }

    public void setParcelNo(int ParcelNo)
    {
        this.ParcelNo = ParcelNo;
    }

    public int getSizeOfBuilding()
    {
        return SizeOfBuilding;
    }

    public void setSizeOfBuilding(int SizeOfBuilding)
    {
        this.SizeOfBuilding = SizeOfBuilding;
    }

    public String getAdditionalInformation()
    {
        return AdditionalInformation;
    }

    public void setAdditionalInformation(String AdditionalInformation)
    {
        this.AdditionalInformation = AdditionalInformation;
    }
    
}
