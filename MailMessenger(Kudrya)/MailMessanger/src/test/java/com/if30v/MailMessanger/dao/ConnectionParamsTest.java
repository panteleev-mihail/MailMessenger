/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.if30v.MailMessanger.dao;

import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author Victor
 */
public class ConnectionParamsTest {
    
    public ConnectionParamsTest() {
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
     * Test of setServerPath method, of class ConnectionParams.
     */
    @Test
    public void testSetServerPath() {
        System.out.println("setServerPath");
        String serverPath = "";
        ConnectionParams instance = null;
        instance.setServerPath(serverPath);
    }

    /**
     * Test of getServerPath method, of class ConnectionParams.
     */
    @Test
    public void testGetServerPath() {
        System.out.println("getServerPath");
        ConnectionParams instance = null;
        String expResult = "";
        String result = instance.getServerPath();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of setDbName method, of class ConnectionParams.
     */
    @Test
    public void testSetDbName() {
        System.out.println("setDbName");
        String dbName = "";
        ConnectionParams instance = null;
        instance.setDbName(dbName);
    }

    /**
     * Test of getDbName method, of class ConnectionParams.
     */
    @Test
    public void testGetDbName() {
        System.out.println("getDbName");
        ConnectionParams instance = null;
        String expResult = "";
        String result = instance.getDbName();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of setUserName method, of class ConnectionParams.
     */
    @Test
    public void testSetUserName() {
        System.out.println("setUserName");
        String userName = "";
        ConnectionParams instance = null;
        instance.setUserName(userName);
    }

    /**
     * Test of getUserName method, of class ConnectionParams.
     */
    @Test
    public void testGetUserName() {
        System.out.println("getUserName");
        ConnectionParams instance = null;
        String expResult = "";
        String result = instance.getUserName();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of setPass method, of class ConnectionParams.
     */
    @Test
    public void testSetPass() {
        System.out.println("setPass");
        String pass = "";
        ConnectionParams instance = null;
        instance.setPass(pass);
    }

    /**
     * Test of getPass method, of class ConnectionParams.
     */
    @Test
    public void testGetPass() {
        System.out.println("getPass");
        ConnectionParams instance = null;
        String expResult = "";
        String result = instance.getPass();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of getConnectionParamsList method, of class ConnectionParams.
     */
    @Test
    public void testGetConnectionParamsList() {
        System.out.println("getConnectionParamsList");
        List expResult = null;
        List result = ConnectionParams.getConnectionParamsList();
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class ConnectionParams.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        ConnectionParams instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
}
