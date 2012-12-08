/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.messenger.dao.beans;

import com.messenger.dao.HibernateUtil;
import com.messenger.pojo.Contact;
import com.messenger.pojo.RegistredUser;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
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
public class ContactDAOTest {
    private Contact contact = new Contact();

    private static EntityManager em = null;
    public ContactDAOTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        em = HibernateUtil.getEm();
    }
    
    @AfterClass
    public static void tearDownClass() {
        em.close();
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
        
    }

    /**
     * Test of addContact method, of class ContactDAO.
     */

}