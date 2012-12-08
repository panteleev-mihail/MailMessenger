/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.messenger.dao.beans;

import com.messenger.dao.HibernateUtil;
import com.messenger.dao.beans.DAO;
import com.messenger.pojo.Pojo;
import com.messenger.pojo.RegistredUser;

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
 * @author pehulja
 */
public class DAOTest {
    private static final Logger log = Logger.getLogger(DAOTest.class);
    
        
    public DAOTest() {
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
     * Test of add method, of class DAO.
     */
    @Test
    public void testAdd() throws Exception {
        log.info("test Add ");
        DAO instance = new DAOImpl();
        RegistredUser temp = getNewOne();
        instance.add(temp);
        assertNotNull(instance.getById(temp.getId(), temp.getClass()));
        instance.delete(temp);
    }

    /**
     * Test of getById method, of class DAO.
     */
    @Test
    public void testGetById() throws Exception {
        log.info("test getById ");
        Class<?> cl = RegistredUser.class;
        DAO instance = new DAOImpl();
        RegistredUser temp = getNewOne();
        instance.add(temp);
        RegistredUser result = (RegistredUser) instance.getById(temp.getId(), cl);
        assertEquals(temp.getId(), result.getId());
        instance.delete(temp);
    }
    
    
    /**
     * Test of update method, of class DAO.
     */
    @Test
    public void testUpdate() throws Exception {
        log.info("test upd ");
        DAO instance = new DAOImpl();
        RegistredUser temp = getNewOne();
        instance.add(temp);
        String pass = "9135435432484";
        temp.setPassword_hash(pass);
        instance.update(temp);
        RegistredUser user = (RegistredUser) instance.getById(temp.getId(), temp.getClass());
        assertEquals(pass, user.getPassword_hash());
        instance.delete(temp);
		
    }

    /**
     * Test of delete method, of class DAO.
     */
    @Test
    public void testDelete() throws Exception {
        log.info("test del ");
        DAO instance = new DAOImpl();
        RegistredUser temp = getNewOne();
        instance.add(temp);
        instance.delete(temp);
        assertNull(instance.getById(temp.getId(), temp.getClass()));
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
