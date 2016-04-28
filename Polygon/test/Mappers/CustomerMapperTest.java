/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mappers;

import Objects.Customer;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import controller.Controller;

/**
 *
 * @author Thygesen
 */
public class CustomerMapperTest
{
    
    public CustomerMapperTest()
    {
    }
    
    @BeforeClass
    public static void setUpClass()
    {           
    }
    
    @AfterClass
    public static void tearDownClass()
    {
    }
    
    @Before
    public void setUp()
    {
    }
    
    @After
    public void tearDown()
    {
    }

    /**
     * Test of getCustomers method, of class CustomerMapper.
     */
    @Test
    public void testGetCustomers()
    {
        System.out.println("getCustomers");
        String expResult = "John Smith";
        String result = Controller.getInstance().getCustomers().get(0).getCustomerName();
        assertEquals(expResult, result);
    }

    /**
     * Test of addCustomer method, of class CustomerMapper.
     */
    @Test
    public void testAddCustomer()
    {
        System.out.println("addCustomer");
        String cName = "Frank";
        String cEmail = "Franksemail@gmail.com";
        String pNum = "13371337";
        String username = "Frank123";
        String password = "123";
        
        Controller.getInstance().addCustomer(cName, cEmail, pNum, username, password);
        String Result = Controller.getInstance().getCustomers().get(4).getCustomerName();
        String expResult = "Frank";
        
        assertEquals(expResult, Result);
    }

    /**
     * Test of editCustomer method, of class CustomerMapper.
     */
    @Test
    public void testEditCustomer()
    {
        System.out.println("editCustomer");
        String cName = "Harry Potter";
        String cEmail = "Pottersmail@yahoo.com";
        String pNum = "123458765";
        String username = "Philip";
        String password = "11111";
        int CID = 3;
        
        String PreviousName = Controller.getInstance().cm.getCustomers().get(2).getCustomerName();
        String PreviousEmail = Controller.getInstance().cm.getCustomers().get(2).getCustomerName();
        
        Controller.getInstance().editCustomer(cName, cEmail, pNum, username, password, CID);
        
        String ChangedName = Controller.getInstance().getCustomers().get(2).getCustomerName();
        String ChangedEmail = Controller.getInstance().getCustomers().get(2).getCustomerEmail();
        
        assertTrue(!PreviousName.equals(ChangedName) && (!PreviousEmail.equals(ChangedEmail)));
    }

    /**
     * Test of getCustomer method, of class CustomerMapper.
     */
    @Test
    public void testGetCustomer()
    {
        System.out.println("getCustomer");
        int CustomerID = 1;
        String expResult = Controller.getInstance().getCustomers().get(0).getCustomerName();
        String result = Controller.getInstance().cm.getCustomer(CustomerID).getCustomerName();
        assertEquals(expResult, result);
    }
    
}
