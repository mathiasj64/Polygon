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
public class Zipcodes
{

    int zipcode;
    String city;

    public Zipcodes(int zipcode, String city)
    {
        this.zipcode = zipcode;
        this.city = city;
    }

    public int getZipcode()
    {
        return zipcode;
    }

    public void setZipcode(int zipcode)
    {
        this.zipcode = zipcode;
    }

    public String getCity()
    {
        return city;
    }

    public void setCity(String city)
    {
        this.city = city;
    }
    
}
