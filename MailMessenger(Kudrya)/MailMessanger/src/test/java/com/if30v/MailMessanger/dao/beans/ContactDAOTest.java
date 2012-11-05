/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.if30v.MailMessanger.dao.beans;

import com.if30v.MailMessanger.beans.Contact;
import com.if30v.MailMessanger.beans.RegistredUser;
import com.if30v.MailMessanger.dao.HibernateUtil;
import java.util.Collection;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author Victor
 */
public class ContactDAOTest {
    private static Contact contact = null;
    
    static{
        HibernateUtil.configurate("127.0.0.1", "mydb", "root", "pass");
        {
            contact = new Contact();
	}
    }
    
    public ContactDAOTest() {
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
     * Test of addContact method, of class ContactDAO.
     */
    @Test
    public void testAddContact() throws Exception {
        System.out.println("addContact");
        ContactDAO instance = new ContactDAO();
        RegistredUserDAO userInstance = new RegistredUserDAO();
        RegistredUser holder = userInstance.getUserById(2);
	RegistredUser person = userInstance.getUserById(3);
	contact.set_ContactHolder(holder);
	contact.set_ContactPerson(person);
        instance.addContact(contact);
    }

    /**
     * Test of updateContact method, of class ContactDAO.
     */
    @Test
    public void testUpdateContact() throws Exception {
        System.out.println("updateContact");
        ContactDAO instance = new ContactDAO();
        instance.updateContact(contact);
    }

    /**
     * Test of getContactById method, of class ContactDAO.
     */
    @Test
    public void testGetContactById() throws Exception {
        System.out.println("getContactById");
        int id = 1;
        ContactDAO instance = new ContactDAO();
        Contact result = instance.getContactById(id);
    }

    /**
     * Test of getAllContacts method, of class ContactDAO.
     */
    @Test
    public void testGetAllContacts() throws Exception {
        System.out.println("getAllContacts");
        ContactDAO instance = new ContactDAO();
        Collection result = instance.getAllContacts();
    }

    /**
     * Test of deleteContact method, of class ContactDAO.
     */
    @Test
    public void testDeleteContact() throws Exception {
        System.out.println("deleteContact");
        ContactDAO instance = new ContactDAO();
        instance.deleteContact(contact);
    }
}
