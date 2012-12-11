/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pehulja.messenger.dao.beans;

import com.messenger.dao.beans.DAO;
import com.messenger.dao.HibernateUtil;
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
        log.error("test Add ");
        DAO instance = new DAOImpl();
        RegistredUser temp = getNewOne();
        instance.add(temp);
        instance.delete(temp);
    }

    /**
     * Test of getById method, of class DAO.
     */
    @Test
    public void testGetById() throws Exception {
        log.error("test getById ");
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
        log.error("test upd ");
        DAO instance = new DAOImpl();
        RegistredUser temp = getNewOne();
        instance.add(temp);
        temp.setPassword_hash("9135435432484");
        instance.update(temp);
        instance.delete(temp);
    }

    /**
     * Test of delete method, of class DAO.
     */
    @Test
    public void testDelete() throws Exception {
        log.error("test del ");
        
        DAO instance = new DAOImpl();
        RegistredUser temp = getNewOne();
        instance.add(temp);
        instance.delete(temp);
        
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
