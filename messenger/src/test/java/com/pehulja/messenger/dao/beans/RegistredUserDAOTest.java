/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pehulja.messenger.dao.beans;

import com.pehulja.messenger.pojo.RegistredUser;
import java.util.Date;
import java.util.Random;
import org.apache.log4j.Logger;
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
    private static final Logger log = Logger.getLogger(DAOTest.class);
     
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
     * Test of loginUser method, of class RegistredUserDAO.
     */
    @Test
    public void testLoginUser() throws Exception{
        log.info("test Add ");
        DAO instance = new DAOImpl();
        RegistredUserDAO userInstance = new RegistredUserDAO();
        RegistredUser temp = getNewOne();
        instance.add(temp);
        RegistredUser result = userInstance.loginUser(temp.getLogin(), temp.getPassword_hash());
        assertEquals(temp.getId(), result.getId());
        instance.delete(temp);
		
	assertNull(userInstance.loginUser(null, null));
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
