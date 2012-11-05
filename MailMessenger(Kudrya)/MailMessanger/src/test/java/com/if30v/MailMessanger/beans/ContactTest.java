/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.if30v.MailMessanger.beans;

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author Victor
 */
public class ContactTest {
    
    public ContactTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of get_id method, of class Contact.
     */
    @Test
    public void testGet_id() {
        System.out.println("get_id");
        Contact instance = new Contact();
        int expResult = 0;
        int result = instance.get_id();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of set_id method, of class Contact.
     */
    @Test
    public void testSet_id() {
        System.out.println("set_id");
        int _id = 0;
        Contact instance = new Contact();
        instance.set_id(_id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get_ContactHolder method, of class Contact.
     */
    @Test
    public void testGet_ContactHolder() {
        System.out.println("get_ContactHolder");
        Contact instance = new Contact();
        RegistredUser expResult = null;
        RegistredUser result = instance.get_ContactHolder();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of set_ContactHolder method, of class Contact.
     */
    @Test
    public void testSet_ContactHolder() {
        System.out.println("set_ContactHolder");
        RegistredUser _ContactHolder = null;
        Contact instance = new Contact();
        instance.set_ContactHolder(_ContactHolder);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get_ContactPerson method, of class Contact.
     */
    @Test
    public void testGet_ContactPerson() {
        System.out.println("get_ContactPerson");
        Contact instance = new Contact();
        RegistredUser expResult = null;
        RegistredUser result = instance.get_ContactPerson();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of set_ContactPerson method, of class Contact.
     */
    @Test
    public void testSet_ContactPerson() {
        System.out.println("set_ContactPerson");
        RegistredUser _ContactPerson = null;
        Contact instance = new Contact();
        instance.set_ContactPerson(_ContactPerson);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
