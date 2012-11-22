/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pehulja.messenger.pojo;

import java.util.Collection;
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
public class LetterTest {private Letter instance;
    
    public LetterTest() {
        instance = new Letter();
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
     * Test of set_id method, of class Letter.
     */
    @Test
    public void testSet_id() {
        int _id = 0;
        instance.set_id(_id);
    }

    /**
     * Test of get_id method, of class Letter.
     */
    @Test
    public void testGet_id() {
        int expResult = 0;
        instance.set_id(expResult);
        int result = instance.get_id();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of set_senderEmail method, of class Letter.
     */
    @Test
    public void testSet_senderEmail() {
        String _senderEmail = "";
        instance.set_senderEmail(_senderEmail);
    }

    /**
     * Test of get_senderEmail method, of class Letter.
     */
    @Test
    public void testGet_senderEmail() {
        instance.set_senderEmail("");
        String expResult = "";
        String result = instance.get_senderEmail();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of set_content method, of class Letter.
     */
    @Test
    public void testSet_content() {
        String _content = "";
        instance.set_content(_content);
    }

    /**
     * Test of get_content method, of class Letter.
     */
    @Test
    public void testGet_content() {
        String expResult = "";
        instance.set_content("");
        String result = instance.get_content();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of set_theme method, of class Letter.
     */
    @Test
    public void testSet_theme() {
        String _theme = "";
        instance.set_theme(_theme);
    }

    /**
     * Test of get_theme method, of class Letter.
     */
    @Test
    public void testGet_theme() {
        String expResult = "";
        instance.set_theme("");
        String result = instance.get_theme();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of set_receiverEmail method, of class Letter.
     */
    @Test
    public void testSet_receiverEmail() {
        String _receiverEmail = "";
        instance.set_receiverEmail(_receiverEmail);
    }

    /**
     * Test of get_receiverEmail method, of class Letter.
     */
    @Test
    public void testGet_receiverEmail() {
        String expResult = "";
        instance.set_receiverEmail("");
        String result = instance.get_receiverEmail();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of setLetter_Sender_Receivers method, of class Letter.
     */
    @Test
    public void testSetLetter_Sender_Receivers() {
        Collection<LetterSenderReceiver> letter_Sender_Receivers = null;
        instance.setLetter_Sender_Receivers(letter_Sender_Receivers);
    }

    /**
     * Test of getLetter_Sender_Receivers method, of class Letter.
     */
    @Test
    public void testGetLetter_Sender_Receivers() {
        Collection expResult = null;
        Collection result = instance.getLetter_Sender_Receivers();
    }
}
