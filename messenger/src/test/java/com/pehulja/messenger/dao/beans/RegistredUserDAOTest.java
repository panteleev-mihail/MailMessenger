/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pehulja.messenger.dao.beans;

import com.pehulja.messenger.pojo.RegistredUser;
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
public class RegistredUserDAOTest {
    
    public RegistredUserDAOTest() {
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
     * Test of addUser method, of class RegistredUserDAO.
     */
    //@Test
   /* public void testAddUser() throws Exception {
        System.out.println("addUser");
        RegistredUser user = null;
        RegistredUserDAO instance = new RegistredUserDAO();
        instance.addUser(user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of getUserById method, of class RegistredUserDAO.
     */
    //@Test
    /*public void testGetUserById() throws Exception {
        System.out.println("getUserById");
        int id = 0;
        RegistredUserDAO instance = new RegistredUserDAO();
        RegistredUser expResult = null;
        RegistredUser result = instance.getUserById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of deleteUser method, of class RegistredUserDAO.
     */
    //@Test
    /*public void testDeleteUser() throws Exception {
        System.out.println("deleteUser");
        RegistredUser user = null;
        RegistredUserDAO instance = new RegistredUserDAO();
        instance.deleteUser(user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of loginUser method, of class RegistredUserDAO.
     */
    //@Test
    public void testLoginUser() {
        System.out.println("loginUser");
        String login = "";
        String password = "";
        RegistredUserDAO instance = new RegistredUserDAO();
        RegistredUser expResult = null;
        RegistredUser result = instance.loginUser(login, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
