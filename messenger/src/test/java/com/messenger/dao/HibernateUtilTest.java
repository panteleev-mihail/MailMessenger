/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.messenger.dao;

import javax.persistence.EntityManager;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.messenger.dao.HibernateUtil;

import static org.junit.Assert.*;

/**
 *
 * @author Victor
 */
public class HibernateUtilTest {
    
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
        EntityManager result = HibernateUtil.getEm();
        assertNotNull(result);
    }
}
