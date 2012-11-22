/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pehulja.messenger.pojo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Victor
 */
public class AdministratorTest {
    
    public AdministratorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
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
        Administrator instance = new Administrator();
        instance.setId(0);
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setId method, of class Administrator.
     */
    @Test
    public void testSetId() {
        int id = 0;
        Administrator instance = new Administrator();
        instance.setId(id);
    }

    /**
     * Test of get_User method, of class Administrator.
     */
    @Test
    public void testGet_User() {
        Administrator instance = new Administrator();
        RegistredUser expResult = new RegistredUser();
        instance.set_User(expResult);
        RegistredUser result = instance.get_User();
        assertEquals(expResult, result);
    }

    /**
     * Test of set_User method, of class Administrator.
     */
    @Test
    public void testSet_User() {
        RegistredUser user = null;
        Administrator instance = new Administrator();
        instance.set_User(user);
    }
}
