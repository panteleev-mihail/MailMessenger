/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.if30v.MailMessanger.dao;

import java.util.List;
import org.hibernate.SessionFactory;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author Victor
 */
public class HibernateUtilTest {
    
    public HibernateUtilTest() {
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
     * Test of isConfigurated method, of class HibernateUtil.
     */
    @Test
    public void testIsConfigurated() {
        System.out.println("isConfigurated");
        boolean expResult = false;
        boolean result = HibernateUtil.isConfigurated();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of configurate method, of class HibernateUtil.
     */
    @Test
    public void testConfigurate() {
        System.out.println("configurate");
        String hostName = "";
        String dbName = "";
        String username = "";
        String pass = "";
        boolean expResult = false;
        boolean result = HibernateUtil.configurate(hostName, dbName, username, pass);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSessionfactory method, of class HibernateUtil.
     */
    @Test
    public void testGetSessionfactory() {
        System.out.println("getSessionfactory");
        SessionFactory expResult = null;
        SessionFactory result = HibernateUtil.getSessionfactory();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDefaultConnectionConfigOpt method, of class HibernateUtil.
     */
    @Test
    public void testGetDefaultConnectionConfigOpt() {
        System.out.println("getDefaultConnectionConfigOpt");
        String[] expResult = null;
        String[] result = HibernateUtil.getDefaultConnectionConfigOpt();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListParams method, of class HibernateUtil.
     */
    @Test
    public void testGetListParams() {
        System.out.println("getListParams");
        List expResult = null;
        List result = HibernateUtil.getListParams();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setListParams method, of class HibernateUtil.
     */
    @Test
    public void testSetListParams() {
        System.out.println("setListParams");
        List<ConnectionParams> listParams = null;
        HibernateUtil.setListParams(listParams);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
