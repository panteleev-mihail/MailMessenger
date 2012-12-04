/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pehulja.messenger.dao;

import com.pehulja.messenger.dao.beans.AdministratorDAO;
import com.pehulja.messenger.dao.beans.ContactDAO;
import com.pehulja.messenger.dao.beans.LetterDAO;
import com.pehulja.messenger.dao.beans.LetterSenderReceiverDAO;
import com.pehulja.messenger.dao.beans.RegistredUserDAO;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.log4j.Logger;

/**
 *
 * @author Victor
 */
public class FactoryTest {
    private static final Logger log = Logger.getLogger(FactoryTest.class);
    
    public FactoryTest() {
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
     * Test of getInstance method, of class Factory.
     */
    @Test
    public void testGetInstance() {
        log.info("Test of getInstance method, of class Factory");
        Factory expResult = Factory.getInstance();
        Factory result = Factory.getInstance();
        assertEquals(expResult, result);
    }

    /**
     * Test of getRegistredUserDAO method, of class Factory.
     */
    @Test
    public void testGetRegistredUserDAO() {
        log.info("Test of getRegistredUserDAO method, of class Factory");
        Factory instance = new Factory();
        RegistredUserDAO expResult = instance.getRegistredUserDAO();
        RegistredUserDAO result = instance.getRegistredUserDAO();
        assertEquals(expResult, result);
    }

    /**
     * Test of getAdministratorDAO method, of class Factory.
     */
    @Test
    public void testGetAdministratorDAO() {
        log.info("Test of getAdministratorDAO method, of class Factory");
        Factory instance = new Factory();
        AdministratorDAO expResult = instance.getAdministratorDAO();
        AdministratorDAO result = instance.getAdministratorDAO();
        assertEquals(expResult, result);
    }

    /**
     * Test of getLetterDAO method, of class Factory.
     */
    @Test
    public void testGetLetterDAO() {
        log.info("Test of getLetterDAO method, of class Factory");
        Factory instance = new Factory();
        LetterDAO expResult = instance.getLetterDAO();
        LetterDAO result = instance.getLetterDAO();
        assertEquals(expResult, result);
    }

    /**
     * Test of getContactDAO method, of class Factory.
     */
    @Test
    public void testGetContactDAO() {
        log.info("Test of getContactDAO method, of class Factory");
        Factory instance = new Factory();
        ContactDAO expResult = instance.getContactDAO();
        ContactDAO result = instance.getContactDAO();
        assertEquals(expResult, result);
    }

    /**
     * Test of getLetter_Sender_ReceiverDAO method, of class Factory.
     */
    @Test
    public void testGetLetter_Sender_ReceiverDAO() {
        log.info("Test of getLetter_Sender_ReceiverDAO method, of class Factory");
        Factory instance = new Factory();
        LetterSenderReceiverDAO expResult = instance.getLetterSenderReceiverDAO();
        LetterSenderReceiverDAO result = instance.getLetterSenderReceiverDAO();
        assertEquals(expResult, result);
    }
}