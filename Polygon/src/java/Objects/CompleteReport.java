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
public class CompleteReport
{

  int reportID;
  int conditionLevel;
  int buildingID;
  String buildingName;
  int zipcode;
  String address;
  int yearBuilt;
  int sizeOfBuilding;
  String purposeOfBuilding;
  String date;
  String technicianName;
  String customerName;
  String roofDesc;
  String outerWallsDesc;

  public CompleteReport(int reportID, int conditionLevel, int buildingID, String buildingName, int zipcode, String address, int yearBuilt, int sizeOfBuilding, String purposeOfBuilding, String date, String technicianName, String customerName, String roofDesc, String outerWallsDesc)
  {
    this.reportID = reportID;
    this.conditionLevel = conditionLevel;
    this.buildingID = buildingID;
    this.buildingName = buildingName;
    this.zipcode = zipcode;
    this.address = address;
    this.yearBuilt = yearBuilt;
    this.sizeOfBuilding = sizeOfBuilding;
    this.purposeOfBuilding = purposeOfBuilding;
    this.date = date;
    this.technicianName = technicianName;
    this.customerName = customerName;
    this.roofDesc = roofDesc;
    this.outerWallsDesc = outerWallsDesc;
  }
  
  public int getReportID()
  {
    return reportID;
  }

  public void setReportID(int reportID)
  {
    this.reportID = reportID;
  }

  public int getConditionLevel()
  {
    return conditionLevel;
  }

  public void setConditionLevel(int conditionLevel)
  {
    this.conditionLevel = conditionLevel;
  }

  public int getBuildingID()
  {
    return buildingID;
  }

  public void setBuildingID(int buildingID)
  {
    this.buildingID = buildingID;
  }

  public String getBuildingName()
  {
    return buildingName;
  }

  public void setBuildingName(String buildingName)
  {
    this.buildingName = buildingName;
  }

  public int getZipcode()
  {
    return zipcode;
  }

  public void setZipcode(int zipcode)
  {
    this.zipcode = zipcode;
  }

  public String getAddress()
  {
    return address;
  }

  public void setAddress(String address)
  {
    this.address = address;
  }

  public int getYearBuilt()
  {
    return yearBuilt;
  }

  public void setYearBuilt(int yearBuilt)
  {
    this.yearBuilt = yearBuilt;
  }

  public int getSizeOfBuilding()
  {
    return sizeOfBuilding;
  }

  public void setSizeOfBuilding(int sizeOfBuilding)
  {
    this.sizeOfBuilding = sizeOfBuilding;
  }

  public String getPurposeOfBuilding()
  {
    return purposeOfBuilding;
  }

  public void setPurposeOfBuilding(String purposeOfBuilding)
  {
    this.purposeOfBuilding = purposeOfBuilding;
  }

  public String getDate()
  {
    return date;
  }

  public void setDate(String date)
  {
    this.date = date;
  }

  public String getTechnicianName()
  {
    return technicianName;
  }

  public void setTechnicianName(String technicianName)
  {
    this.technicianName = technicianName;
  }

  public String getCustomerName()
  {
    return customerName;
  }

  public void setCustomerName(String customerName)
  {
    this.customerName = customerName;
  }

  public String getRoofDesc()
  {
    return roofDesc;
  }

  public void setRoofDesc(String roofDesc)
  {
    this.roofDesc = roofDesc;
  }

  public String getOuterWallsDesc()
  {
    return outerWallsDesc;
  }

  public void setOuterWallsDesc(String outerWallsDesc)
  {
    this.outerWallsDesc = outerWallsDesc;
  }

}
