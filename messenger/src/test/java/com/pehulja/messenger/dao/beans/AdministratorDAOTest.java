/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pehulja.messenger.dao.beans;

import com.pehulja.messenger.pojo.Administrator;
import com.pehulja.messenger.pojo.RegistredUser;
import java.util.Random;
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
public class AdministratorDAOTest {
    private static Administrator admin = new Administrator();
    
    public AdministratorDAOTest() {
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
     * Test of isCurrentUserIsAdmin method, of class AdministratorDAO.
     */
    @Test
    public void testIsCurrentUserIsAdmin() throws Exception{
        RegistredUserDAO userInstance = new RegistredUserDAO();
        AdministratorDAO adminInstance = new AdministratorDAO();
        RegistredUser user = new RegistredUser();
        user = getNewOne();
        Administrator admin = new Administrator();
        admin.set_User(user);
        userInstance.add(user);
        adminInstance.add(admin);
        assertTrue(adminInstance.isCurrentUserIsAdmin(user));
        userInstance.delete(user);
        adminInstance.delete(admin);
    }

    private RegistredUser getNewOne(){
        RegistredUser obj = new  RegistredUser();
        Random r = new Random();
        obj.setLogin( (new Integer(r.nextInt())).toString() );
        obj.setPassword_hash("98979897");
        return obj;
    }

    public class DAOImpl extends DAO {
    }
    
}
