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
    String username;
    String password;
    int accessLevel; 
    
    public User(String uName, String Pword, int aLevel)
    {
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
}
