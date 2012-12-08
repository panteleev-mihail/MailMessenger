/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.messenger.dao.beans;

import com.messenger.dao.beans.LetterDAO;
import com.messenger.dao.beans.LetterSenderReceiverDAO;
import com.messenger.dao.beans.RegistredUserDAO;
import com.messenger.pojo.Letter;
import com.messenger.pojo.LetterSenderReceiver;
import com.messenger.pojo.RegistredUser;

import java.util.List;
import java.util.Random;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import org.apache.log4j.Logger;

/**
 *
 * @author Victor
 */
public class LetterSenderReceiverDAOTest {
    private static LetterSenderReceiver lsr = null;
    private static final Logger log = Logger.getLogger(DAOTest.class);
    
    static{
        lsr = new LetterSenderReceiver();
        lsr.setIsRead(false);
        lsr.setIsRecTrash(false);
        lsr.setIsSenderTrash(false);
    }
    
    public LetterSenderReceiverDAOTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getIncome method, of class LetterSenderReceiverDAO.
     */
    @Ignore
    @Test
    public void testGetIncome() {
        log.info("getIncome");
        RegistredUser sender = getNewOne();
        RegistredUser receiver = getNewOne();
        Letter letter = new Letter();
        LetterSenderReceiver lsr = new LetterSenderReceiver();
        
        RegistredUserDAO userInstance = new RegistredUserDAO();
        LetterDAO letterInstance = new LetterDAO();
        LetterSenderReceiverDAO instance = new LetterSenderReceiverDAO();
        
        userInstance.add(sender);
        userInstance.add(receiver);
        letterInstance.add(letter);
        
        lsr.setLetter(letter);
        lsr.setReceiver(receiver);
        lsr.setSender(sender);
        
        instance.add(lsr);
        
        assertNotNull(instance.getIncome(receiver));
    }

    /**
     * Test of getOutcome method, of class LetterSenderReceiverDAO.
     */
    @Ignore
    @Test
    public void testGetOutcome() {
        log.info("getOutcome");
        RegistredUser sender = getNewOne();
        RegistredUser receiver = getNewOne();
        Letter letter = new Letter();
        LetterSenderReceiver lsr = new LetterSenderReceiver();
        
        RegistredUserDAO userInstance = new RegistredUserDAO();
        LetterDAO letterInstance = new LetterDAO();
        LetterSenderReceiverDAO instance = new LetterSenderReceiverDAO();
        
        userInstance.add(sender);
        userInstance.add(receiver);
        letterInstance.add(letter);
        
        lsr.setLetter(letter);
        lsr.setReceiver(receiver);
        lsr.setSender(sender);
        
        instance.add(lsr);
        
        assertNotNull(instance.getOutcome(receiver));
    }

    /**
     * Test of getTrash method, of class LetterSenderReceiverDAO.
     */
    @Ignore
    @Test
    public void testGetTrash() {
        log.info("getTrash");
        RegistredUser sender = getNewOne();
        RegistredUser receiver = getNewOne();
        Letter letter = new Letter();
        LetterSenderReceiver lsr = new LetterSenderReceiver();
        
        RegistredUserDAO userInstance = new RegistredUserDAO();
        LetterDAO letterInstance = new LetterDAO();
        LetterSenderReceiverDAO instance = new LetterSenderReceiverDAO();
        
        userInstance.add(sender);
        userInstance.add(receiver);
        letterInstance.add(letter);
        
        lsr.setLetter(letter);
        lsr.setReceiver(receiver);
        lsr.setSender(sender);
        lsr.setIsSenderTrash(true);
        
        instance.add(lsr);
        
        assertNotNull(instance.getOutcome(sender));
    }

    private RegistredUser getNewOne(){
        RegistredUser obj = new  RegistredUser();
        Random r = new Random();
        obj.setLogin( (new Integer(r.nextInt())).toString() );
        obj.setPassword_hash("98979897");
        return obj;
    }
}
