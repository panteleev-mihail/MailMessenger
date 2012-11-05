/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.if30v.MailMessanger.dao;

import com.if30v.MailMessanger.dao.beans.*;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author Victor
 */
public class FactoryTest {
    
    public FactoryTest() {
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
     * Test of getInstance method, of class Factory.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        Factory expResult = Factory.getInstance();
        Factory result = Factory.getInstance();
        assertEquals(expResult, result);
    }

    /**
     * Test of getRegistredUserDAO method, of class Factory.
     */
    @Test
    public void testGetRegistredUserDAO() {
        System.out.println("getRegistredUserDAO");
        Factory instance = new Factory();
        RegistredUserDAO expResult = new RegistredUserDAO();
        RegistredUserDAO result = instance.getRegistredUserDAO();
        assertEquals(expResult, result);
    }

    /**
     * Test of getAdministratorDAO method, of class Factory.
     */
    @Test
    public void testGetAdministratorDAO() {
        System.out.println("getAdministratorDAO");
        Factory instance = new Factory();
        AdministratorDAO expResult = new AdministratorDAO();
        AdministratorDAO result = instance.getAdministratorDAO();
        assertEquals(expResult, result);
    }

    /**
     * Test of getLetterDAO method, of class Factory.
     */
    @Test
    public void testGetLetterDAO() {
        System.out.println("getLetterDAO");
        Factory instance = new Factory();
        LetterDAO expResult = new LetterDAO();
        LetterDAO result = instance.getLetterDAO();
        assertEquals(expResult, result);
    }

    /**
     * Test of getContactDAO method, of class Factory.
     */
    @Test
    public void testGetContactDAO() {
        System.out.println("getContactDAO");
        Factory instance = new Factory();
        ContactDAO expResult = new ContactDAO();
        ContactDAO result = instance.getContactDAO();
        assertEquals(expResult, result);
    }

    /**
     * Test of getLetter_Sender_ReceiverDAO method, of class Factory.
     */
    @Test
    public void testGetLetter_Sender_ReceiverDAO() {
        System.out.println("getLetter_Sender_ReceiverDAO");
        Factory instance = new Factory();
        Letter_Sender_ReceiverDAO expResult = new Letter_Sender_ReceiverDAO();
        Letter_Sender_ReceiverDAO result = instance.getLetter_Sender_ReceiverDAO();
        assertEquals(expResult, result);
    }
}
