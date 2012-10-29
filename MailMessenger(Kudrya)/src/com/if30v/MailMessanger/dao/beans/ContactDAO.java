package com.if30v.MailMessanger.dao.beans;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;

import com.if30v.MailMessanger.beans.Contact;
import com.if30v.MailMessanger.beans.RegistredUser;
import com.if30v.MailMessanger.dao.HibernateUtil;

public class ContactDAO {
	public void addContact(Contact contact) throws Exception {
	    Session session = null;
	    try {
	      session = HibernateUtil.getSessionfactory().openSession();
	      session.beginTransaction();
	      session.save(contact);
	      session.getTransaction().commit();
	    } catch (Exception e) {
	    	throw new Exception("Error contact adding: "+e.getMessage());
	    } finally {
	      if (session != null && session.isOpen()) {
	        session.close();
	      }
	    }
	  }
	
	public void updateContact(Contact contact) throws Exception{
		Session session = null;
		try {
		      session = HibernateUtil.getSessionfactory().openSession();
		      session.beginTransaction();
		      session.update(contact);
		      session.getTransaction().commit();
		    } catch (Exception e) {
		      throw new Exception("Error contact updating: "+e.getMessage());
		    } finally {
		      if (session != null && session.isOpen()) {
		        session.close();
		      }
		    }
	}
	
	public Contact getContactById(int id)throws Exception {
	    Session session = null;
	    Contact contact = null;
	    try {
	      session = HibernateUtil.getSessionfactory().openSession();
	      contact = (Contact) session.load(Contact.class, id);
	    } catch (Exception e) {
	    	//System.out.println("Error getting by id: "+e.getMessage());
	    	throw new Exception("Error getting contacts by id: " + e.getMessage());
	    } finally {
	      if (session != null && session.isOpen()) {
	        session.close();
	      }
	    }
	    return contact;
	  }
	
	public Collection getAllContacts() throws Exception {
	    Session session = null;
	    List contacts = new ArrayList<RegistredUser>();
	    try {
	      session = HibernateUtil.getSessionfactory().openSession();
	      contacts = session.createCriteria(Contact.class).list();
	    } catch (Exception e) {
	      throw new Exception("Error getting contacts" + e.getMessage());
	    } finally {
	      if (session != null && session.isOpen()) {
	        session.close();
	      }
	    }
	    return contacts;
	  }
	
	public void deleteContact(Contact contact) throws Exception {
	    Session session = null;
	    try {
	      session = HibernateUtil.getSessionfactory().openSession();
	      session.beginTransaction();
	      session.delete(contact);
	      session.getTransaction().commit();
	    } catch (Exception e) {
	      throw new Exception("Errog deleting contact:" + e.getMessage());
	    } finally {
	      if (session != null && session.isOpen()) {
	        session.close();
	      }
	    }
	  }
	
	public Collection getUsersContact(RegistredUser user) throws Exception {
	    Session session = null;
	    int id = user.get_id();
	    List contacts = new ArrayList<RegistredUser>();
	    try {
	      session = HibernateUtil.getSessionfactory().openSession();
	      contacts = session.getNamedQuery("getUsersContacts").setParameter("id", 1).list();
	    } catch (Exception e) {
	      throw new Exception("Error getting contacts" + e.getMessage());
	    } finally {
	      if (session != null && session.isOpen()) {
	        session.close();
	      }
	    }
	    return contacts;
	  }
}
