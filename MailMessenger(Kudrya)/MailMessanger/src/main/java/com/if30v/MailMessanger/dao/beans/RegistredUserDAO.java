package com.if30v.MailMessanger.dao.beans;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import org.hibernate.Query;
import org.hibernate.Session;

import com.if30v.MailMessanger.beans.RegistredUser;
import com.if30v.MailMessanger.dao.HibernateUtil;

public class RegistredUserDAO {
	public void addUser(RegistredUser user) throws Exception {
	    Session session = null;
	    try {
	      session = HibernateUtil.getSessionfactory().openSession();
	      session.beginTransaction();
	      session.save(user);
	      session.getTransaction().commit();
	    } catch (Exception e) {
	    	throw new Exception("Error user adding: "+e.getMessage());
	    } finally {
	      if (session != null && session.isOpen()) {
	        session.close();
	      }
	    }
	  }
	
	public void updateUser(RegistredUser user) throws Exception{
		Session session = null;
		try {
		      session = HibernateUtil.getSessionfactory().openSession();
		      session.beginTransaction();
		      session.update(user);
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
	
	public RegistredUser getUserById(int id)throws Exception {
	    Session session = null;
	    RegistredUser user = null;
	    try {
	      session = HibernateUtil.getSessionfactory().openSession();
	      user = (RegistredUser) session.load(RegistredUser.class, id);
	    } catch (Exception e) {
	    	throw new Exception("Error getting user by id: " + e.getMessage());
	    } finally {
	      if (session != null && session.isOpen()) {
	        session.close();
	      }
	    }
	    return user;
	  }
	
	public Collection getAllUsers() throws Exception {
	    Session session = null;
	    List users = new ArrayList<RegistredUser>();
	    try {
	      session = HibernateUtil.getSessionfactory().openSession();
	      users = session.createCriteria(RegistredUser.class).list();
	    } catch (Exception e) {
	      throw new Exception("Error getting users" + e.getMessage());
	    } finally {
	      if (session != null && session.isOpen()) {
	        session.close();
	      }
	    }
	    return users;
	  }
	
	public void deleteUser(RegistredUser user) throws Exception {
	    Session session = null;
	    try {
	      session = HibernateUtil.getSessionfactory().openSession();
	      session.beginTransaction();
	      session.delete(user);
	      session.getTransaction().commit();
	    } catch (Exception e) {
	      throw new Exception("Error deleting user:" + e.getMessage());
	    } finally {
	      if (session != null && session.isOpen()) {
	        session.close();
	      }
	    }
	  }
	
	public Collection getUserContactList(String id) throws Exception{
		Session session = null;
		List<RegistredUser> contacts = new ArrayList<RegistredUser>();
		try{
                    session = HibernateUtil.getSessionfactory().openSession();
                    contacts = session.getNamedQuery("getUsersContacts").setParameter("id", id).list();
		}catch(Exception e){
			throw new Exception("Error getting users contact-list: " + e.getMessage());
		}
		finally{
			if (session != null && session.isOpen()){
				session.close();
			}
		}
		return contacts;
	}
}