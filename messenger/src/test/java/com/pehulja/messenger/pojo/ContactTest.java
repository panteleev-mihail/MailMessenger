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
        instance.set_id(expResult);
        int result = instance.get_id();
        assertEquals(expResult, result);
    }

    /**
     * Test of set_id method, of class Contact.
     */
    @Test
    public void testSet_id() {
        int _id = 0;
        Contact instance = new Contact();
        instance.set_id(_id);
    }

    /**
     * Test of get_ContactHolder method, of class Contact.
     */
    @Test
    public void testGet_ContactHolder() {
        Contact instance = new Contact();
        RegistredUser expResult = new RegistredUser();
        instance.set_ContactHolder(expResult);
        RegistredUser result = instance.get_ContactHolder();
        assertEquals(expResult, result);
    }

    /**
     * Test of set_ContactHolder method, of class Contact.
     */
    @Test
    public void testSet_ContactHolder() {
        RegistredUser _ContactHolder = null;
        Contact instance = new Contact();
        instance.set_ContactHolder(_ContactHolder);
    }

    /**
     * Test of get_ContactPerson method, of class Contact.
     */
    @Test
    public void testGet_ContactPerson() {
        Contact instance = new Contact();
        RegistredUser expResult = new RegistredUser();
        instance.set_ContactPerson(expResult);
        RegistredUser result = instance.get_ContactPerson();
        assertEquals(expResult, result);
    }

    /**
     * Test of set_ContactPerson method, of class Contact.
     */
    @Test
    public void testSet_ContactPerson() {
        RegistredUser _ContactPerson = null;
        Contact instance = new Contact();
        instance.set_ContactPerson(_ContactPerson);
    }
}
