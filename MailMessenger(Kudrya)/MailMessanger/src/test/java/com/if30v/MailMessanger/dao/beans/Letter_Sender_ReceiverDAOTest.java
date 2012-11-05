/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.if30v.MailMessanger.dao.beans;

import com.if30v.MailMessanger.beans.Letter;
import com.if30v.MailMessanger.beans.Letter_Sender_Receiver;
import com.if30v.MailMessanger.beans.RegistredUser;
import com.if30v.MailMessanger.dao.Factory;
import com.if30v.MailMessanger.dao.HibernateUtil;
import java.util.Collection;
import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author Victor
 */
public class Letter_Sender_ReceiverDAOTest {
    private static Letter_Sender_Receiver lsr = null;
    
    static{
        HibernateUtil.configurate("127.0.0.1", "mydb", "root", "pass");
        {
			lsr = new Letter_Sender_Receiver();
			lsr.set_isRead(false);
			lsr.set_isRecTrash(false);
			lsr.set_isSenderTrash(false);
	}
    }
    
    public Letter_Sender_ReceiverDAOTest() {
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
     * Test of addLetter_Sender_Receiver method, of class Letter_Sender_ReceiverDAO.
     */
    @Test
    public void testAddLetter_Sender_Receiver() throws Exception {
        System.out.println("addLetter_Sender_Receiver");
        Letter_Sender_ReceiverDAO instance = new Letter_Sender_ReceiverDAO();
        RegistredUserDAO userInstance = new RegistredUserDAO();
        LetterDAO letterInstance = new LetterDAO();
        RegistredUser reciever = userInstance.getUserById(2);
        RegistredUser sender = userInstance.getUserById(3);
	List<Letter> letters = (List<Letter>) letterInstance.getAllLetters();
        lsr.set_Receiver(reciever);
	lsr.set_Sender(sender);
	lsr.set_Letter(letters.get(1));
        instance.addLetter_Sender_Receiver(lsr);
    }

    /**
     * Test of updateLetter_Sender_Receiver method, of class Letter_Sender_ReceiverDAO.
     */
    @Test
    public void testUpdateLetter_Sender_Receiver() throws Exception {
        System.out.println("updateLetter_Sender_Receiver");
        Letter_Sender_ReceiverDAO instance = new Letter_Sender_ReceiverDAO();
        instance.updateLetter_Sender_Receiver(lsr);
    }

    /**
     * Test of getLetter_Sender_ReceiverById method, of class Letter_Sender_ReceiverDAO.
     */
    @Test
    public void testGetLetter_Sender_ReceiverById() throws Exception {
        System.out.println("getLetter_Sender_ReceiverById");
        int id = 1;
        Letter_Sender_ReceiverDAO instance = new Letter_Sender_ReceiverDAO();
        Letter_Sender_Receiver result = instance.getLetter_Sender_ReceiverById(id);    
    }

    /**
     * Test of getAllLetter_Sender_Receivers method, of class Letter_Sender_ReceiverDAO.
     */
    @Test
    public void testGetAllLetter_Sender_Receivers() throws Exception {
        System.out.println("getAllLetter_Sender_Receivers");
        Letter_Sender_ReceiverDAO instance = new Letter_Sender_ReceiverDAO();
        Collection result = instance.getAllLetter_Sender_Receivers();
    }

    /**
     * Test of deleteLetter_Sender_Receiver method, of class Letter_Sender_ReceiverDAO.
     */
    @Test
    public void testDeleteLetter_Sender_Receiver() throws Exception {
        System.out.println("deleteLetter_Sender_Receiver");
        Letter_Sender_ReceiverDAO instance = new Letter_Sender_ReceiverDAO();
        instance.deleteLetter_Sender_Receiver(lsr);
    }
}
