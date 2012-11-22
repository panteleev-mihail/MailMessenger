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
        instance.set_id(_id);
    }

    /**
     * Test of get_id method, of class Letter_Sender_Receiver.
     */
    @Test
    public void testGet_id() {
        LetterSenderReceiver instance = new LetterSenderReceiver();
        int expResult = 0;
        instance.set_id(0);
        int result = instance.get_id();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of set_Sender method, of class Letter_Sender_Receiver.
     */
    @Test
    public void testSet_Sender() {
        RegistredUser _Sender = new RegistredUser();
        LetterSenderReceiver instance = new LetterSenderReceiver();
        instance.set_Sender(_Sender);
    }

    /**
     * Test of get_Sender method, of class Letter_Sender_Receiver.
     */
    @Test
    public void testGet_Sender() {
        LetterSenderReceiver instance = new LetterSenderReceiver();
        RegistredUser expResult = new RegistredUser();
        instance.set_Sender(expResult);
        RegistredUser result = instance.get_Sender();
        assertEquals(expResult, result);
    }

    /**
     * Test of get_Receiver method, of class Letter_Sender_Receiver.
     */
    @Test
    public void testGet_Receiver() {
        LetterSenderReceiver instance = new LetterSenderReceiver();
        RegistredUser expResult = new RegistredUser();
        instance.set_Receiver(expResult);
        RegistredUser result = instance.get_Receiver();
        assertEquals(expResult, result);
    }

    /**
     * Test of set_Receiver method, of class Letter_Sender_Receiver.
     */
    @Test
    public void testSet_Receiver() {
        RegistredUser _Receiver = new RegistredUser();
        LetterSenderReceiver instance = new LetterSenderReceiver();
        instance.set_Receiver(_Receiver);
    }

    /**
     * Test of get_Letter method, of class Letter_Sender_Receiver.
     */
    @Test
    public void testGet_Letter() {
        LetterSenderReceiver instance = new LetterSenderReceiver();
        Letter expResult = new Letter();
        instance.set_Letter(expResult);
        Letter result = instance.get_Letter();
        assertEquals(expResult, result);
    }

    /**
     * Test of set_Letter method, of class Letter_Sender_Receiver.
     */
    @Test
    public void testSet_Letter() {
        Letter _Letter = new Letter();
        LetterSenderReceiver instance = new LetterSenderReceiver();
        instance.set_Letter(_Letter);
    }

    /**
     * Test of is_isRead method, of class Letter_Sender_Receiver.
     */
    @Test
    public void testIs_isRead() {
        LetterSenderReceiver instance = new LetterSenderReceiver();
        boolean expResult = false;
        instance.set_isRead(expResult);
        boolean result = instance.is_isRead();
        assertEquals(expResult, result);
    }

    /**
     * Test of set_isRead method, of class Letter_Sender_Receiver.
     */
    @Test
    public void testSet_isRead() {
        boolean _isRead = false;
        LetterSenderReceiver instance = new LetterSenderReceiver();
        instance.set_isRead(_isRead);
    }

    /**
     * Test of is_isSenderTrash method, of class Letter_Sender_Receiver.
     */
    @Test
    public void testIs_isSenderTrash() {
        LetterSenderReceiver instance = new LetterSenderReceiver();
        boolean expResult = false;
        instance.set_isSenderTrash(expResult);
        boolean result = instance.is_isSenderTrash();
        assertEquals(expResult, result);
    }

    /**
     * Test of set_isSenderTrash method, of class Letter_Sender_Receiver.
     */
    @Test
    public void testSet_isSenderTrash() {
        boolean _isSenderTrash = false;
        LetterSenderReceiver instance = new LetterSenderReceiver();
        instance.set_isSenderTrash(_isSenderTrash);
    }

    /**
     * Test of is_isRecTrash method, of class Letter_Sender_Receiver.
     */
    @Test
    public void testIs_isRecTrash() {
        LetterSenderReceiver instance = new LetterSenderReceiver();
        boolean expResult = false;
        instance.set_isRecTrash(false);
        boolean result = instance.is_isRecTrash();
        assertEquals(expResult, result);
    }

    /**
     * Test of set_isRecTrash method, of class Letter_Sender_Receiver.
     */
    @Test
    public void testSet_isRecTrash() {
        boolean _isRecTrash = false;
        LetterSenderReceiver instance = new LetterSenderReceiver();
        instance.set_isRecTrash(_isRecTrash);
    }
}
