package com.if30v.MailMessanger.dao.beans;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.hibernate.Session;

import com.if30v.MailMessanger.beans.Letter_Sender_Receiver;
import com.if30v.MailMessanger.dao.HibernateUtil;

public class Letter_Sender_ReceiverDAO {
	public void addContact(Letter_Sender_Receiver lsr) throws Exception {
	    Session session = null;
	    try {
	      session = HibernateUtil.getSessionfactory().openSession();
	      session.beginTransaction();
	      session.save(lsr);
	      session.getTransaction().commit();
	    } catch (Exception e) {
	      //System.out.println("Error adding: " + e.getMessage());
	    	throw new Exception("Error admin adding: "+e.getMessage());
	    } finally {
	      if (session != null && session.isOpen()) {
	        session.close();
	      }
	    }
	  }
	
	public void updateLetter_Sender_Receiver(Letter_Sender_Receiver lsr) throws Exception{
		Session session = null;
		try {
		      session = HibernateUtil.getSessionfactory().openSession();
		      session.beginTransaction();
		      session.update(lsr);
		      session.getTransaction().commit();
		    } catch (Exception e) {
		      //System.out.println("Error updating: "+e.getMessage());
		      throw new Exception("Error admin updating: "+e.getMessage());
		    } finally {
		      if (session != null && session.isOpen()) {
		        session.close();
		      }
		    }
	}
	
	public Letter_Sender_Receiver getLetter_Sender_ReceiverById(int id)throws Exception {
	    Session session = null;
	    Letter_Sender_Receiver lsr = null;
	    try {
	      session = HibernateUtil.getSessionfactory().openSession();
	      lsr = (Letter_Sender_Receiver) session.load(Letter_Sender_Receiver.class, id);
	    } catch (Exception e) {
	    	//System.out.println("Error getting by id: "+e.getMessage());
	    	throw new Exception("Error getting admins by id: " + e.getMessage());
	    } finally {
	      if (session != null && session.isOpen()) {
	        session.close();
	      }
	    }
	    return lsr;
	  }
	
	public Collection getAllLetter_Sender_Receivers() throws Exception {
	    Session session = null;
	    List letter_Sender_Receivers = new ArrayList<Letter_Sender_Receiver>();
	    try {
	      session = HibernateUtil.getSessionfactory().openSession();
	      letter_Sender_Receivers = session.createCriteria(Letter_Sender_Receiver.class).list();
	    } catch (Exception e) {
	      throw new Exception("Error getting letter_Sender_Receivers" + e.getMessage());
	    } finally {
	      if (session != null && session.isOpen()) {
	        session.close();
	      }
	    }
	    return letter_Sender_Receivers;
	  }
	
	public void deleteLetter_Sender_Receiver(Letter_Sender_Receiver letter_Sender_Receiver) throws Exception {
	    Session session = null;
	    try {
	      session = HibernateUtil.getSessionfactory().openSession();
	      session.beginTransaction();
	      session.delete(letter_Sender_Receiver);
	      session.getTransaction().commit();
	    } catch (Exception e) {
	      throw new Exception("Errog deleting letter_Sender_Receiver:" + e.getMessage());
	    } finally {
	      if (session != null && session.isOpen()) {
	        session.close();
	      }
	    }
	  }
}