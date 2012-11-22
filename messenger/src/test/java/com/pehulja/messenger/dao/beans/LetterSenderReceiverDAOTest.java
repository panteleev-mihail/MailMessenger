/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pehulja.messenger.dao.beans;

import com.pehulja.messenger.pojo.LetterSenderReceiver;
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
public class LetterSenderReceiverDAOTest {
    private static LetterSenderReceiver lsr = null;
    
    static{
        lsr = new LetterSenderReceiver();
        lsr.set_isRead(false);
        lsr.set_isRecTrash(false);
        lsr.set_isSenderTrash(false);
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

}
