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
        instance.setId(_id);
    }

    /**
     * Test of get_id method, of class Letter.
     */
    @Test
    public void testGet_id() {
        int expResult = 0;
        instance.setId(expResult);
        int result = instance.getId();
        assertEquals(expResult, result);
    }
        
    /**
     * Test of set_content method, of class Letter.
     */
    @Test
    public void testSet_content() {
        String _content = "";
        instance.setContent(_content);
    }

    /**
     * Test of get_content method, of class Letter.
     */
    @Test
    public void testGet_content() {
        String expResult = "";
        instance.setContent("");
        String result = instance.getContent();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of set_theme method, of class Letter.
     */
    @Test
    public void testSet_theme() {
        String _theme = "";
        instance.setTheme(_theme);
    }

    /**
     * Test of get_theme method, of class Letter.
     */
    @Test
    public void testGet_theme() {
        String expResult = "";
        instance.setTheme("");
        String result = instance.getTheme();
        assertEquals(expResult, result);
    }
        
    /**
     * Test of setLetter_Sender_Receivers method, of class Letter.
     */
    @Test
    public void testSetLetter_Sender_Receivers() {
        Collection<LetterSenderReceiver> letter_Sender_Receivers = null;
        instance.setLetterSenderReceivers(letter_Sender_Receivers);
    }

    /**
     * Test of getLetter_Sender_Receivers method, of class Letter.
     */
    @Test
    public void testGetLetter_Sender_Receivers() {
        Collection expResult = null;
        Collection result = instance.getLetterSenderReceivers();
    }
}
