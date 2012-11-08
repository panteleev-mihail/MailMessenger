package com.pehulja.messenger.dao.beans;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.hibernate.Session;

import com.pehulja.messenger.pojo.Letter;
import com.pehulja.messenger.dao.HibernateUtil;


public class LetterDAO {
	public void addLetter(Letter letter) throws Exception {
	    Session session = null;
	    try {
	      session = HibernateUtil.getSessionfactory().openSession();
	      session.beginTransaction();
	      session.save(letter);
	      session.getTransaction().commit();
	    } catch (Exception e) {
	      //System.out.println("Error adding: " + e.getMessage());
	    	throw new Exception("Error user adding: "+e.getMessage());
	    } finally {
	      if (session != null && session.isOpen()) {
	        session.close();
	      }
	    }
	  }
	
	public void updateLetter(Letter letter) throws Exception{
		Session session = null;
		try {
		      session = HibernateUtil.getSessionfactory().openSession();
		      session.beginTransaction();
		      session.update(letter);
		      session.getTransaction().commit();
		    } catch (Exception e) {
		      //System.out.println("Error updating: "+e.getMessage());
		      throw new Exception("Error user updating: "+e.getMessage());
		    } finally {
		      if (session != null && session.isOpen()) {
		        session.close();
		      }
		    }
	}
	
	public Letter getLetterById(int id)throws Exception {
	    Session session = null;
	    Letter letter = null;
	    try {
	      session = HibernateUtil.getSessionfactory().openSession();
	      letter = (Letter) session.load(Letter.class, id);
	    } catch (Exception e) {
	    	//System.out.println("Error getting by id: "+e.getMessage());
	    	throw new Exception("Error getting user by id: " + e.getMessage());
	    } finally {
	      if (session != null && session.isOpen()) {
	        session.close();
	      }
	    }
	    return letter;
	  }
	
	public Collection getAllLetters() throws Exception {
	    Session session = null;
	    List letters = new ArrayList<Letter>();
	    try {
	      session = HibernateUtil.getSessionfactory().openSession();
	      letters = session.createCriteria(Letter.class).list();
	    } catch (Exception e) {
	      throw new Exception("Error getting users" + e.getMessage());
	    } finally {
	      if (session != null && session.isOpen()) {
	        session.close();
	      }
	    }
	    return letters;
	  }
	
	public void deleteLetter(Letter letter) throws Exception {
	    Session session = null;
	    try {
	      session = HibernateUtil.getSessionfactory().openSession();
	      session.beginTransaction();
	      session.delete(letter);
	      session.getTransaction().commit();
	    } catch (Exception e) {
	      throw new Exception("Errog deleting user:" + e.getMessage());
	    } finally {
	      if (session != null && session.isOpen()) {
	        session.close();
	      }
	    }
	  }
}
