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
public class AdministratorTest {
    
    public AdministratorTest() {
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
     * Test of getId method, of class Administrator.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Administrator instance = new Administrator();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Administrator.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Administrator instance = new Administrator();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get_User method, of class Administrator.
     */
    @Test
    public void testGet_User() {
        System.out.println("get_User");
        Administrator instance = new Administrator();
        RegistredUser expResult = null;
        RegistredUser result = instance.get_User();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of set_User method, of class Administrator.
     */
    @Test
    public void testSet_User() {
        System.out.println("set_User");
        RegistredUser user = null;
        Administrator instance = new Administrator();
        instance.set_User(user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
