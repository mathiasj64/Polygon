
package Objects;

/**
 *
 * @author madsr
 */
public class Customer
{
    private int customerID; 
    private String customerName;
    private String customerEmail; 
    private int phoneNumber; 
    
    public Customer(int cID, String cName, String cEmail, int pNumber)
    {
        customerID = cID; 
        customerName = cName; 
        customerEmail = cEmail; 
        phoneNumber = pNumber; 
        
    }

    public int getCustomerID()
    {
        return customerID;
    }

    public void setCustomerID(int customerID)
    {
        this.customerID = customerID;
    }

    public String getCustomerName()
    {
        return customerName;
    }

    public void setCustomerName(String customerName)
    {
        this.customerName = customerName;
    }

    public String getCustomerEmail()
    {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail)
    {
        this.customerEmail = customerEmail;
    }

    public int getPhoneNumber()
    {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }
    
    
}
