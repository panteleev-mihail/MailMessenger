/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pehulja.messenger.dao;

import javax.persistence.EntityManager;
import org.apache.log4j.Logger;
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
public class HibernateUtilTest {
    private static final Logger log = Logger.getLogger(HibernateUtilTest.class);
    
    public HibernateUtilTest() {
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
     * Test of getEm method, of class HibernateUtil.
     */
    @Test
    public void testGetEm() {
        log.info("Test of getEm method, of class HibernateUtilTest");
        EntityManager expResult = HibernateUtil.getEm();
    }
}