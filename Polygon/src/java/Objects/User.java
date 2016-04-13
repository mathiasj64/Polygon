/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;

/**
 *
 * @author madsr
 */
public class User
{
    
    int customerID; 

    
    String username;
    String password;
    int accessLevel; 
    
    public User(int CID, String uName, String Pword, int aLevel)
    {
        customerID = CID; 
        username = uName; 
        password = Pword; 
        accessLevel = aLevel; 
    }
    
    
    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
    }
    
    public int getAccesLevel()
    {
        return accessLevel; 
    }
    
    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public int getAccessLevel() {
        return accessLevel;
    }

    public void setAccessLevel(int accessLevel) {
        this.accessLevel = accessLevel;
    }
}
