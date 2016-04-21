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
        CustomerMapper instance = new CustomerMapper();
        ArrayList<Customer> expResult = null;
        ArrayList<Customer> result = instance.getCustomers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
        String pNum = "42042000";
        String username = "Frank123";
        String password = "123";
        CustomerMapper instance = new CustomerMapper();
        instance.addCustomer(cName, cEmail, pNum, username, password);
        String expResult = "Frank";
        String Result = instance.getCustomers().get(4).getCustomerName();
        assertEquals(expResult, Result);
    }

    /**
     * Test of editCustomer method, of class CustomerMapper.
     */
    @Test
    public void testEditCustomer()
    {
        System.out.println("editCustomer");
        String cName = "Johnny Smithy";
        String cEmail = "JohnSmith@gmail.com";
        String pNum = "12345678";
        String username = "Mibsen";
        String password = "12345";
        int CID = 1;
        CustomerMapper instance = new CustomerMapper();
        instance.editCustomer(cName, cEmail, pNum, username, password, CID);
        String PreviousName = "Johnny Smithy";
        String ChangedName = instance.getCustomers().get(1).getCustomerName();
        assertTrue(!PreviousName.equals(ChangedName));
    }

    /**
     * Test of getCustomer method, of class CustomerMapper.
     */
    @Test
    public void testGetCustomer()
    {
        System.out.println("getCustomer");
        int CustomerID = 0;
        CustomerMapper instance = new CustomerMapper();
        Customer expResult = null;
        Customer result = instance.getCustomer(CustomerID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
