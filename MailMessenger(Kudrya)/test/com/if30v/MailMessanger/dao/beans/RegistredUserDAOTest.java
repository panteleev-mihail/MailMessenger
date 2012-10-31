/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.if30v.MailMessanger.dao.beans;

import com.if30v.MailMessanger.beans.RegistredUser;
import com.if30v.MailMessanger.dao.HibernateUtil;
import java.util.Collection;
import java.util.Date;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author Victor
 */
public class RegistredUserDAOTest {
    private static RegistredUser user = null;
    
    static{
		HibernateUtil.configurate("127.0.0.1", "mydb", "root", "pass");
		
		{
			user = new RegistredUser();
			user.setLogin("test_test_test");
			user.set_dateOfBirth(new Date());
			user.set_dateOfREgistration(new Date());
			user.set_fIO("Ololoev Ololosha");
			user.setPassword_hash("pass");
			user.set_telephone("9379992");
		}
    }
    
    public RegistredUserDAOTest() {
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
     * Test of addUser method, of class RegistredUserDAO.
     */
    @Test
    public void testAddUser() throws Exception {
        System.out.println("addUser");
        RegistredUserDAO instance = new RegistredUserDAO();
        instance.addUser(user);
    }

    /**
     * Test of updateUser method, of class RegistredUserDAO.
     */
    @Test
    public void testUpdateUser() throws Exception {
        System.out.println("updateUser");
        RegistredUserDAO instance = new RegistredUserDAO();
        instance.updateUser(user);
    }

    /**
     * Test of getUserById method, of class RegistredUserDAO.
     */
    @Test
    public void testGetUserById() throws Exception {
        System.out.println("getUserById");
        int id = 0;
        RegistredUserDAO instance = new RegistredUserDAO();
        RegistredUser result = instance.getUserById(id);
    }

    /**
     * Test of getAllUsers method, of class RegistredUserDAO.
     */
    @Test
    public void testGetAllUsers() throws Exception {
        System.out.println("getAllUsers");
        RegistredUserDAO instance = new RegistredUserDAO();
        Collection result = instance.getAllUsers();
    }

    /**
     * Test of deleteUser method, of class RegistredUserDAO.
     */
    @Test
    public void testDeleteUser() throws Exception {
        System.out.println("deleteUser");
        RegistredUserDAO instance = new RegistredUserDAO();
        instance.deleteUser(user);
    }

    /**
     * Test of getUserContactList method, of class RegistredUserDAO.
     */
    @Test
    public void testGetUserContactList() throws Exception {
        System.out.println("getUserContactList");
        String id = "1";
        RegistredUserDAO instance = new RegistredUserDAO();
        Collection result = instance.getUserContactList(id);
    }
}