/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pehulja.messenger.pojo;

import com.messenger.pojo.RegistredUser;
import com.messenger.pojo.LetterSenderReceiver;
import com.messenger.pojo.Contact;
import java.util.Collection;
import java.util.Date;
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
        int _id = 0;
        RegistredUser instance = new RegistredUser();
        instance.setId(_id);
    }

    /**
     * Test of get_id method, of class RegistredUser.
     */
    @Test
    public void testGet_id() {
        int expResult = 0;
        instance.setId(expResult);
        int result = instance.getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of get_fIO method, of class RegistredUser.
     */
    @Test
    public void testGet_fIO() {
        RegistredUser instance = new RegistredUser();
        String expResult = "";
        instance.setfIO("");
        String result = instance.getfIO();
        assertEquals(expResult, result);
    }

    /**
     * Test of set_fIO method, of class RegistredUser.
     */
    @Test
    public void testSet_fIO() {
        String _fIO = "";
        RegistredUser instance = new RegistredUser();
        instance.setfIO(_fIO);
    }

    /**
     * Test of get_telephone method, of class RegistredUser.
     */
    @Test
    public void testGet_telephone() {
        RegistredUser instance = new RegistredUser();
        String expResult = "";
        instance.setTelephone("");
        String result = instance.getTelephone();
        assertEquals(expResult, result);
    }

    /**
     * Test of set_telephone method, of class RegistredUser.
     */
    @Test
    public void testSet_telephone() {
        String _telephone = "";
        RegistredUser instance = new RegistredUser();
        instance.setTelephone(_telephone);
    }

    /**
     * Test of get_dateOfBirth method, of class RegistredUser.
     */
    @Test
    public void testGet_dateOfBirth() {
        RegistredUser instance = new RegistredUser();
        Date expResult = new Date();
        instance.setDateOfBirth(expResult);
        Date result = instance.getDateOfBirth();
        assertEquals(expResult, result);
    }

    /**
     * Test of set_dateOfBirth method, of class RegistredUser.
     */
    @Test
    public void testSet_dateOfBirth() {
        Date _dateOfBirth = null;
        RegistredUser instance = new RegistredUser();
        instance.setDateOfBirth(_dateOfBirth);
    }

    /**
     * Test of get_dateOfREgistration method, of class RegistredUser.
     */
    @Test
    public void testGet_dateOfREgistration() {
        RegistredUser instance = new RegistredUser();
        Date expResult = new Date();
        instance.setDateOfREgistration(expResult);
        Date result = instance.getDateOfREgistration();
        assertEquals(expResult, result);
    }

    /**
     * Test of set_dateOfREgistration method, of class RegistredUser.
     */
    @Test
    public void testSet_dateOfREgistration() {
        Date _dateOfREgistration = null;
        RegistredUser instance = new RegistredUser();
        instance.setDateOfREgistration(_dateOfREgistration);
    }

    /**
     * Test of get_secondMailAdress method, of class RegistredUser.
     */
    @Test
    public void testGet_secondMailAdress() {
        RegistredUser instance = new RegistredUser();
        String expResult = "";
        instance.setSecondMailAdress("");
        String result = instance.getSecondMailAdress();
        assertEquals(expResult, result);
    }

    /**
     * Test of set_secondMailAdress method, of class RegistredUser.
     */
    @Test
    public void testSet_secondMailAdress() {
        String _secondMailAdress = "";
        RegistredUser instance = new RegistredUser();
        instance.setSecondMailAdress(_secondMailAdress);
    }

    /**
     * Test of getLogin method, of class RegistredUser.
     */
    @Test
    public void testGetLogin() {
        RegistredUser instance = new RegistredUser();
        String expResult = "";
        instance.setLogin("");
        String result = instance.getLogin();
        assertEquals(expResult, result);
    }

    /**
     * Test of setLogin method, of class RegistredUser.
     */
    @Test
    public void testSetLogin() {
        String login = "";
        RegistredUser instance = new RegistredUser();
        instance.setLogin(login);
    }

    /**
     * Test of getPassword_hash method, of class RegistredUser.
     */
    @Test
    public void testGetPassword_hash() {
        RegistredUser instance = new RegistredUser();
        String expResult = "";
        instance.setPassword_hash("");
        String result = instance.getPassword_hash();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPassword_hash method, of class RegistredUser.
     */
    @Test
    public void testSetPassword_hash() {
        String password_hash = "";
        RegistredUser instance = new RegistredUser();
        instance.setPassword_hash(password_hash);
    }

    /**
     * Test of getPassword_salt method, of class RegistredUser.
     */
    @Test
    public void testGetPassword_salt() {
        RegistredUser instance = new RegistredUser();
        String expResult = "";
        instance.setPassword_salt("");
        String result = instance.getPassword_salt();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPassword_salt method, of class RegistredUser.
     */
    @Test
    public void testSetPassword_salt() {
        String password_salt = "";
        RegistredUser instance = new RegistredUser();
        instance.setPassword_salt(password_salt);
    }

    /**
     * Test of getSendedMails method, of class RegistredUser.
     */
    @Test
    public void testGetSendedMails() {
        RegistredUser instance = new RegistredUser();
        Collection expResult = null;
        Collection result = instance.getSendedMails();
       // assertEquals(expResult, result);
    }

    /**
     * Test of setSendedMails method, of class RegistredUser.
     */
    @Test
    public void testSetSendedMails() {
        Collection<LetterSenderReceiver> sendedMails = null;
        RegistredUser instance = new RegistredUser();
        instance.setSendedMails(sendedMails);
    }

    /**
     * Test of getReceivedMails method, of class RegistredUser.
     */
    @Test
    public void testGetReceivedMails() {
        RegistredUser instance = new RegistredUser();
        Collection expResult = null;
        Collection result = instance.getReceivedMails();
        //assertEquals(expResult, result);
    }

    /**
     * Test of setReceivedMails method, of class RegistredUser.
     */
    @Test
    public void testSetReceivedMails() {
        Collection<LetterSenderReceiver> receivedMails = null;
        RegistredUser instance = new RegistredUser();
        instance.setReceivedMails(receivedMails);
    }

    /**
     * Test of getHoldedContacts method, of class RegistredUser.
     */
    @Test
    public void testGetHoldedContacts() {
        RegistredUser instance = new RegistredUser();
        Collection expResult = null;
        Collection result = instance.getHoldedContacts();
        //assertEquals(expResult, result);
    }

    /**
     * Test of setHoldedContacts method, of class RegistredUser.
     */
    @Test
    public void testSetHoldedContacts() {
        Collection<Contact> holdedContacts = null;
        RegistredUser instance = new RegistredUser();
        instance.setHoldedContacts(holdedContacts);
    }

    /**
     * Test of getIncludedInContacts method, of class RegistredUser.
     */
    @Test
    public void testGetIncludedInContacts() {
        RegistredUser instance = new RegistredUser();
        Collection expResult = null;
        Collection result = instance.getIncludedInContacts();
        //assertEquals(expResult, result);
    }

    /**
     * Test of setIncludedInContacts method, of class RegistredUser.
     */
    @Test
    public void testSetIncludedInContacts() {
        Collection<Contact> includedInContacts = null;
        RegistredUser instance = new RegistredUser();
        instance.setIncludedInContacts(includedInContacts);
    }
}
