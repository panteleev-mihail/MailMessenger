/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.if30v.MailMessanger.beans;

import java.util.Collection;
import java.util.Date;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author Victor
 */
public class RegistredUserTest {
    private RegistredUser instance;
    
    public RegistredUserTest() {
        instance = new RegistredUser();
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
     * Test of set_id method, of class RegistredUser.
     */
    @Test
    public void testSet_id() {
        System.out.println("set_id");
        int _id = 0;
        RegistredUser instance = new RegistredUser();
        instance.set_id(_id);
    }

    /**
     * Test of get_id method, of class RegistredUser.
     */
    @Test
    public void testGet_id() {
        System.out.println("get_id");
        int expResult = 0;
        int result = instance.get_id();
        assertEquals(expResult, result);
    }

    /**
     * Test of get_fIO method, of class RegistredUser.
     */
    @Test
    public void testGet_fIO() {
        System.out.println("get_fIO");
        RegistredUser instance = new RegistredUser();
        String expResult = "";
        String result = instance.get_fIO();
        assertEquals(expResult, result);
    }

    /**
     * Test of set_fIO method, of class RegistredUser.
     */
    @Test
    public void testSet_fIO() {
        System.out.println("set_fIO");
        String _fIO = "";
        RegistredUser instance = new RegistredUser();
        instance.set_fIO(_fIO);
    }

    /**
     * Test of get_telephone method, of class RegistredUser.
     */
    @Test
    public void testGet_telephone() {
        System.out.println("get_telephone");
        RegistredUser instance = new RegistredUser();
        String expResult = "";
        String result = instance.get_telephone();
        assertEquals(expResult, result);
    }

    /**
     * Test of set_telephone method, of class RegistredUser.
     */
    @Test
    public void testSet_telephone() {
        System.out.println("set_telephone");
        String _telephone = "";
        RegistredUser instance = new RegistredUser();
        instance.set_telephone(_telephone);
    }

    /**
     * Test of get_dateOfBirth method, of class RegistredUser.
     */
    @Test
    public void testGet_dateOfBirth() {
        System.out.println("get_dateOfBirth");
        RegistredUser instance = new RegistredUser();
        Date expResult = null;
        Date result = instance.get_dateOfBirth();
        assertEquals(expResult, result);
    }

    /**
     * Test of set_dateOfBirth method, of class RegistredUser.
     */
    @Test
    public void testSet_dateOfBirth() {
        System.out.println("set_dateOfBirth");
        Date _dateOfBirth = null;
        RegistredUser instance = new RegistredUser();
        instance.set_dateOfBirth(_dateOfBirth);
    }

    /**
     * Test of get_dateOfREgistration method, of class RegistredUser.
     */
    @Test
    public void testGet_dateOfREgistration() {
        System.out.println("get_dateOfREgistration");
        RegistredUser instance = new RegistredUser();
        Date expResult = null;
        Date result = instance.get_dateOfREgistration();
        assertEquals(expResult, result);
    }

    /**
     * Test of set_dateOfREgistration method, of class RegistredUser.
     */
    @Test
    public void testSet_dateOfREgistration() {
        System.out.println("set_dateOfREgistration");
        Date _dateOfREgistration = null;
        RegistredUser instance = new RegistredUser();
        instance.set_dateOfREgistration(_dateOfREgistration);
    }

    /**
     * Test of get_secondMailAdress method, of class RegistredUser.
     */
    @Test
    public void testGet_secondMailAdress() {
        System.out.println("get_secondMailAdress");
        RegistredUser instance = new RegistredUser();
        String expResult = "";
        String result = instance.get_secondMailAdress();
        assertEquals(expResult, result);
    }

    /**
     * Test of set_secondMailAdress method, of class RegistredUser.
     */
    @Test
    public void testSet_secondMailAdress() {
        System.out.println("set_secondMailAdress");
        String _secondMailAdress = "";
        RegistredUser instance = new RegistredUser();
        instance.set_secondMailAdress(_secondMailAdress);
    }

    /**
     * Test of getLogin method, of class RegistredUser.
     */
    @Test
    public void testGetLogin() {
        System.out.println("getLogin");
        RegistredUser instance = new RegistredUser();
        String expResult = "";
        String result = instance.getLogin();
        assertEquals(expResult, result);
    }

    /**
     * Test of setLogin method, of class RegistredUser.
     */
    @Test
    public void testSetLogin() {
        System.out.println("setLogin");
        String login = "";
        RegistredUser instance = new RegistredUser();
        instance.setLogin(login);
    }

    /**
     * Test of getPassword_hash method, of class RegistredUser.
     */
    @Test
    public void testGetPassword_hash() {
        System.out.println("getPassword_hash");
        RegistredUser instance = new RegistredUser();
        String expResult = "";
        String result = instance.getPassword_hash();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPassword_hash method, of class RegistredUser.
     */
    @Test
    public void testSetPassword_hash() {
        System.out.println("setPassword_hash");
        String password_hash = "";
        RegistredUser instance = new RegistredUser();
        instance.setPassword_hash(password_hash);
    }

    /**
     * Test of getPassword_salt method, of class RegistredUser.
     */
    @Test
    public void testGetPassword_salt() {
        System.out.println("getPassword_salt");
        RegistredUser instance = new RegistredUser();
        String expResult = "";
        String result = instance.getPassword_salt();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPassword_salt method, of class RegistredUser.
     */
    @Test
    public void testSetPassword_salt() {
        System.out.println("setPassword_salt");
        String password_salt = "";
        RegistredUser instance = new RegistredUser();
        instance.setPassword_salt(password_salt);
    }

    /**
     * Test of getSendedMails method, of class RegistredUser.
     */
    @Test
    public void testGetSendedMails() {
        System.out.println("getSendedMails");
        RegistredUser instance = new RegistredUser();
        Collection expResult = null;
        Collection result = instance.getSendedMails();
        assertEquals(expResult, result);
    }

    /**
     * Test of setSendedMails method, of class RegistredUser.
     */
    @Test
    public void testSetSendedMails() {
        System.out.println("setSendedMails");
        Collection<Letter_Sender_Receiver> sendedMails = null;
        RegistredUser instance = new RegistredUser();
        instance.setSendedMails(sendedMails);
    }

    /**
     * Test of getReceivedMails method, of class RegistredUser.
     */
    @Test
    public void testGetReceivedMails() {
        System.out.println("getReceivedMails");
        RegistredUser instance = new RegistredUser();
        Collection expResult = null;
        Collection result = instance.getReceivedMails();
        assertEquals(expResult, result);
    }

    /**
     * Test of setReceivedMails method, of class RegistredUser.
     */
    @Test
    public void testSetReceivedMails() {
        System.out.println("setReceivedMails");
        Collection<Letter_Sender_Receiver> receivedMails = null;
        RegistredUser instance = new RegistredUser();
        instance.setReceivedMails(receivedMails);
    }

    /**
     * Test of getHoldedContacts method, of class RegistredUser.
     */
    @Test
    public void testGetHoldedContacts() {
        System.out.println("getHoldedContacts");
        RegistredUser instance = new RegistredUser();
        Collection expResult = null;
        Collection result = instance.getHoldedContacts();
        assertEquals(expResult, result);
    }

    /**
     * Test of setHoldedContacts method, of class RegistredUser.
     */
    @Test
    public void testSetHoldedContacts() {
        System.out.println("setHoldedContacts");
        Collection<Contact> holdedContacts = null;
        RegistredUser instance = new RegistredUser();
        instance.setHoldedContacts(holdedContacts);
    }

    /**
     * Test of getIncludedInContacts method, of class RegistredUser.
     */
    @Test
    public void testGetIncludedInContacts() {
        System.out.println("getIncludedInContacts");
        RegistredUser instance = new RegistredUser();
        Collection expResult = null;
        Collection result = instance.getIncludedInContacts();
        assertEquals(expResult, result);
    }

    /**
     * Test of setIncludedInContacts method, of class RegistredUser.
     */
    @Test
    public void testSetIncludedInContacts() {
        System.out.println("setIncludedInContacts");
        Collection<Contact> includedInContacts = null;
        RegistredUser instance = new RegistredUser();
        instance.setIncludedInContacts(includedInContacts);
    }
}
