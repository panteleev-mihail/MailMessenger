/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.if30v.MailMessanger.beans;

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author Victor
 */
public class Letter_Sender_ReceiverTest {
    
    public Letter_Sender_ReceiverTest() {
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
     * Test of get_id method, of class Letter_Sender_Receiver.
     */
    @Test
    public void testGet_id() {
        System.out.println("get_id");
        Letter_Sender_Receiver instance = new Letter_Sender_Receiver();
        int expResult = 0;
        int result = instance.get_id();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of set_id method, of class Letter_Sender_Receiver.
     */
    @Test
    public void testSet_id() {
        System.out.println("set_id");
        int _id = 0;
        Letter_Sender_Receiver instance = new Letter_Sender_Receiver();
        instance.set_id(_id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get_Sender method, of class Letter_Sender_Receiver.
     */
    @Test
    public void testGet_Sender() {
        System.out.println("get_Sender");
        Letter_Sender_Receiver instance = new Letter_Sender_Receiver();
        RegistredUser expResult = null;
        RegistredUser result = instance.get_Sender();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of set_Sender method, of class Letter_Sender_Receiver.
     */
    @Test
    public void testSet_Sender() {
        System.out.println("set_Sender");
        RegistredUser _Sender = null;
        Letter_Sender_Receiver instance = new Letter_Sender_Receiver();
        instance.set_Sender(_Sender);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get_Receiver method, of class Letter_Sender_Receiver.
     */
    @Test
    public void testGet_Receiver() {
        System.out.println("get_Receiver");
        Letter_Sender_Receiver instance = new Letter_Sender_Receiver();
        RegistredUser expResult = null;
        RegistredUser result = instance.get_Receiver();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of set_Receiver method, of class Letter_Sender_Receiver.
     */
    @Test
    public void testSet_Receiver() {
        System.out.println("set_Receiver");
        RegistredUser _Receiver = null;
        Letter_Sender_Receiver instance = new Letter_Sender_Receiver();
        instance.set_Receiver(_Receiver);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get_Letter method, of class Letter_Sender_Receiver.
     */
    @Test
    public void testGet_Letter() {
        System.out.println("get_Letter");
        Letter_Sender_Receiver instance = new Letter_Sender_Receiver();
        Letter expResult = null;
        Letter result = instance.get_Letter();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of set_Letter method, of class Letter_Sender_Receiver.
     */
    @Test
    public void testSet_Letter() {
        System.out.println("set_Letter");
        Letter _Letter = null;
        Letter_Sender_Receiver instance = new Letter_Sender_Receiver();
        instance.set_Letter(_Letter);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of is_isRead method, of class Letter_Sender_Receiver.
     */
    @Test
    public void testIs_isRead() {
        System.out.println("is_isRead");
        Letter_Sender_Receiver instance = new Letter_Sender_Receiver();
        boolean expResult = false;
        boolean result = instance.is_isRead();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of set_isRead method, of class Letter_Sender_Receiver.
     */
    @Test
    public void testSet_isRead() {
        System.out.println("set_isRead");
        boolean _isRead = false;
        Letter_Sender_Receiver instance = new Letter_Sender_Receiver();
        instance.set_isRead(_isRead);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of is_isSenderTrash method, of class Letter_Sender_Receiver.
     */
    @Test
    public void testIs_isSenderTrash() {
        System.out.println("is_isSenderTrash");
        Letter_Sender_Receiver instance = new Letter_Sender_Receiver();
        boolean expResult = false;
        boolean result = instance.is_isSenderTrash();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of set_isSenderTrash method, of class Letter_Sender_Receiver.
     */
    @Test
    public void testSet_isSenderTrash() {
        System.out.println("set_isSenderTrash");
        boolean _isSenderTrash = false;
        Letter_Sender_Receiver instance = new Letter_Sender_Receiver();
        instance.set_isSenderTrash(_isSenderTrash);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of is_isRecTrash method, of class Letter_Sender_Receiver.
     */
    @Test
    public void testIs_isRecTrash() {
        System.out.println("is_isRecTrash");
        Letter_Sender_Receiver instance = new Letter_Sender_Receiver();
        boolean expResult = false;
        boolean result = instance.is_isRecTrash();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of set_isRecTrash method, of class Letter_Sender_Receiver.
     */
    @Test
    public void testSet_isRecTrash() {
        System.out.println("set_isRecTrash");
        boolean _isRecTrash = false;
        Letter_Sender_Receiver instance = new Letter_Sender_Receiver();
        instance.set_isRecTrash(_isRecTrash);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
