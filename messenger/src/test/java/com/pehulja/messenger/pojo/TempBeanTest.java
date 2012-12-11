/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pehulja.messenger.pojo;

import com.messenger.pojo.TempBean;
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
public class TempBeanTest {
    private TempBean instance = new TempBean();
    
    public TempBeanTest() {
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
     * Test of setName method, of class TempBean.
     */
    @Test
    public void testSetName() {
        String name = "name";
        instance.setName(name);
    }

    /**
     * Test of getName method, of class TempBean.
     */
    @Test
    public void testGetName() {
        String expResult = "name";
        String result = instance.getName();
    }

    /**
     * Test of check method, of class TempBean.
     */
    @Test
    public void testCheck() {
        String expResult = "next1";
        String result = instance.check();
        assertEquals(expResult, result);
    }
}
