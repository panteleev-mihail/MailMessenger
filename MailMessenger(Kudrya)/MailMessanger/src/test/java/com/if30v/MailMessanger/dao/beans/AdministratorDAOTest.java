/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.if30v.MailMessanger.dao.beans;

import com.if30v.MailMessanger.beans.Administrator;
import com.if30v.MailMessanger.beans.RegistredUser;
import com.if30v.MailMessanger.dao.HibernateUtil;
import java.util.Collection;
import org.junit.*;

/**
 *
 * @author Victor
 */
public class AdministratorDAOTest {
    private static Administrator admin = null;
    
    static{
        HibernateUtil.configurate("127.0.0.1", "mydb", "root", "pass");	
        {
            admin = new Administrator();
        }
    }
    
    public AdministratorDAOTest() {
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
     * Test of addAdmin method, of class AdministratorDAO.
     */
    @Test
    public void testAddAdmin() throws Exception {
        System.out.println("addAdmin");
        AdministratorDAO instance = new AdministratorDAO();
        RegistredUserDAO userInstance = new RegistredUserDAO();
        RegistredUser user = userInstance.getUserById(2);
        admin.set_User(user);
        instance.addAdmin(admin);
    }

    /**
     * Test of updateAdmin method, of class AdministratorDAO.
     */
    @Test
    public void testUpdateAdmin() throws Exception {
        System.out.println("updateAdmin");
        AdministratorDAO instance = new AdministratorDAO();
        instance.updateAdmin(admin);
    }

    /**
     * Test of getAdminById method, of class AdministratorDAO.
     */
    @Test
    public void testGetAdminById() throws Exception {
        System.out.println("getAdminById");
        int id = 1;
        AdministratorDAO instance = new AdministratorDAO();
        Administrator result = instance.getAdminById(id);
    }

    /**
     * Test of getAllAdmins method, of class AdministratorDAO.
     */
    @Test
    public void testGetAllAdmins() throws Exception {
        System.out.println("getAllAdmins");
        AdministratorDAO instance = new AdministratorDAO();
        Collection result = instance.getAllAdmins();
    }

    /**
     * Test of deleteAdmin method, of class AdministratorDAO.
     */
    @Test
    public void testDeleteAdmin() throws Exception {
        System.out.println("deleteAdmin");
        AdministratorDAO instance = new AdministratorDAO();
        instance.deleteAdmin(admin);
    }
}
