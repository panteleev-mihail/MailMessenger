/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.if30v.MailMessanger.dao.beans;

import com.if30v.MailMessanger.beans.Letter;
import com.if30v.MailMessanger.dao.HibernateUtil;
import java.util.Collection;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author Victor
 */
public class LetterDAOTest {
    private static Letter letter = null;
    
    static{
        HibernateUtil.configurate("127.0.0.1", "mydb", "root", "pass");	
        {
            letter = new Letter();
        }
    }
    
    public LetterDAOTest() {
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
     * Test of addLetter method, of class LetterDAO.
     */
    @Test
    public void testAddLetter() throws Exception {
        System.out.println("addLetter");
        LetterDAO instance = new LetterDAO();
        instance.addLetter(letter);
    }

    /**
     * Test of updateLetter method, of class LetterDAO.
     */
    @Test
    public void testUpdateLetter() throws Exception {
        System.out.println("updateLetter");
        LetterDAO instance = new LetterDAO();
        instance.updateLetter(letter);
    }

    /**
     * Test of getLetterById method, of class LetterDAO.
     */
    @Test
    public void testGetLetterById() throws Exception {
        System.out.println("getLetterById");
        int id = 1;
        LetterDAO instance = new LetterDAO();
        Letter result = instance.getLetterById(id);
    }

    /**
     * Test of getAllLetters method, of class LetterDAO.
     */
    @Test
    public void testGetAllLetters() throws Exception {
        System.out.println("getAllLetters");
        LetterDAO instance = new LetterDAO();
        Collection result = instance.getAllLetters();
    }

    /**
     * Test of deleteLetter method, of class LetterDAO.
     */
    @Test
    public void testDeleteLetter() throws Exception {
        System.out.println("deleteLetter");
        LetterDAO instance = new LetterDAO();
        instance.deleteLetter(letter);
    }
}
