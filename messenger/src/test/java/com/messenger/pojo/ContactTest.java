/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.messenger.pojo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.messenger.pojo.Contact;
import com.messenger.pojo.RegistredUser;

import static org.junit.Assert.*;

/**
 *
 * @author Victor
 */
public class ContactTest {
     
    public ContactTest() {
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
     * Test of get_id method, of class Contact.
     */
    @Test
    public void testGet_id() {
        Contact instance = new Contact();
        int expResult = 0;
        instance.setId(expResult);
        int result = instance.getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of set_id method, of class Contact.
     */
    @Test
    public void testSet_id() {
        int _id = 0;
        Contact instance = new Contact();
        instance.setId(_id);
    }

    /**
     * Test of get_ContactHolder method, of class Contact.
     */
    @Test
    public void testGet_ContactHolder() {
        Contact instance = new Contact();
        RegistredUser expResult = new RegistredUser();
        instance.setContactHolder(expResult);
        RegistredUser result = instance.getContactHolder();
        assertEquals(expResult, result);
    }

    /**
     * Test of set_ContactHolder method, of class Contact.
     */
    @Test
    public void testSet_ContactHolder() {
        RegistredUser _ContactHolder = null;
        Contact instance = new Contact();
        instance.setContactHolder(_ContactHolder);
    }

    /**
     * Test of get_ContactPerson method, of class Contact.
     */
    @Test
    public void testGet_ContactPerson() {
        Contact instance = new Contact();
        RegistredUser expResult = new RegistredUser();
        instance.setContactPerson(expResult);
        RegistredUser result = instance.getContactPerson();
        assertEquals(expResult, result);
    }

    /**
     * Test of set_ContactPerson method, of class Contact.
     */
    @Test
    public void testSet_ContactPerson() {
        RegistredUser _ContactPerson = null;
        Contact instance = new Contact();
        instance.setContactPerson(_ContactPerson);
    }
}
