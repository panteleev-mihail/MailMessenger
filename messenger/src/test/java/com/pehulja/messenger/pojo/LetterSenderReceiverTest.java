/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pehulja.messenger.pojo;

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
public class LetterSenderReceiverTest {
    
    public LetterSenderReceiverTest() {
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
     * Test of set_id method, of class Letter_Sender_Receiver.
     */
    @Test
    public void testSet_id() {
        int _id = 0;
        LetterSenderReceiver instance = new LetterSenderReceiver();
        instance.setId(_id);
    }

    /**
     * Test of get_id method, of class Letter_Sender_Receiver.
     */
    @Test
    public void testGet_id() {
        LetterSenderReceiver instance = new LetterSenderReceiver();
        int expResult = 0;
        instance.setId(0);
        int result = instance.getId();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of set_Sender method, of class Letter_Sender_Receiver.
     */
    @Test
    public void testSet_Sender() {
        RegistredUser _Sender = new RegistredUser();
        LetterSenderReceiver instance = new LetterSenderReceiver();
        instance.setSender(_Sender);
    }

    /**
     * Test of get_Sender method, of class Letter_Sender_Receiver.
     */
    @Test
    public void testGet_Sender() {
        LetterSenderReceiver instance = new LetterSenderReceiver();
        RegistredUser expResult = new RegistredUser();
        instance.setSender(expResult);
        RegistredUser result = instance.getSender();
        assertEquals(expResult, result);
    }

    /**
     * Test of get_Receiver method, of class Letter_Sender_Receiver.
     */
    @Test
    public void testGet_Receiver() {
        LetterSenderReceiver instance = new LetterSenderReceiver();
        RegistredUser expResult = new RegistredUser();
        instance.setReceiver(expResult);
        RegistredUser result = instance.getReceiver();
        assertEquals(expResult, result);
    }

    /**
     * Test of set_Receiver method, of class Letter_Sender_Receiver.
     */
    @Test
    public void testSet_Receiver() {
        RegistredUser _Receiver = new RegistredUser();
        LetterSenderReceiver instance = new LetterSenderReceiver();
        instance.setReceiver(_Receiver);
    }

    /**
     * Test of get_Letter method, of class Letter_Sender_Receiver.
     */
    @Test
    public void testGet_Letter() {
        LetterSenderReceiver instance = new LetterSenderReceiver();
        Letter expResult = new Letter();
        instance.setLetter(expResult);
        Letter result = instance.getLetter();
        assertEquals(expResult, result);
    }

    /**
     * Test of set_Letter method, of class Letter_Sender_Receiver.
     */
    @Test
    public void testSet_Letter() {
        Letter _Letter = new Letter();
        LetterSenderReceiver instance = new LetterSenderReceiver();
        instance.setLetter(_Letter);
    }

    /**
     * Test of is_isRead method, of class Letter_Sender_Receiver.
     */
    @Test
    public void testIs_isRead() {
        LetterSenderReceiver instance = new LetterSenderReceiver();
        boolean expResult = false;
        instance.setIsRead(expResult);
        boolean result = instance.isIsRead();
        assertEquals(expResult, result);
    }

    /**
     * Test of set_isRead method, of class Letter_Sender_Receiver.
     */
    @Test
    public void testSet_isRead() {
        boolean _isRead = false;
        LetterSenderReceiver instance = new LetterSenderReceiver();
        instance.setIsRead(_isRead);
    }

    /**
     * Test of is_isSenderTrash method, of class Letter_Sender_Receiver.
     */
    @Test
    public void testIs_isSenderTrash() {
        LetterSenderReceiver instance = new LetterSenderReceiver();
        boolean expResult = false;
        instance.setIsSenderTrash(expResult);
        boolean result = instance.isIsSenderTrash();
        assertEquals(expResult, result);
    }

    /**
     * Test of set_isSenderTrash method, of class Letter_Sender_Receiver.
     */
    @Test
    public void testSet_isSenderTrash() {
        boolean _isSenderTrash = false;
        LetterSenderReceiver instance = new LetterSenderReceiver();
        instance.setIsSenderTrash(_isSenderTrash);
    }

    /**
     * Test of is_isRecTrash method, of class Letter_Sender_Receiver.
     */
    @Test
    public void testIs_isRecTrash() {
        LetterSenderReceiver instance = new LetterSenderReceiver();
        boolean expResult = false;
        instance.setIsRecTrash(false);
        boolean result = instance.isIsRecTrash();
        assertEquals(expResult, result);
    }

    /**
     * Test of set_isRecTrash method, of class Letter_Sender_Receiver.
     */
    @Test
    public void testSet_isRecTrash() {
        boolean _isRecTrash = false;
        LetterSenderReceiver instance = new LetterSenderReceiver();
        instance.setIsRecTrash(_isRecTrash);
    }
}
