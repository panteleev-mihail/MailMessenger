package com.if30v.MailMessanger.dao.beans;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.hibernate.Session;

import com.if30v.MailMessanger.beans.Administrator;
import com.if30v.MailMessanger.beans.RegistredUser;
import com.if30v.MailMessanger.dao.HibernateUtil;

public class AdministratorDAO {
	
	public void addAdmin(Administrator admin) throws Exception {
	    Session session = null;
	    try {
	      session = HibernateUtil.getSessionfactory().openSession();
	      session.beginTransaction();
	      session.save(admin);
	      session.getTransaction().commit();
	    } catch (Exception e) {
	    	throw new Exception("Error admin adding: "+e.getMessage());
	    } finally {
	      if (session != null && session.isOpen()) {
	        session.close();
	      }
	    }
	  }
	
	public void updateAdmin(Administrator admin) throws Exception{
		Session session = null;
		try {
		      session = HibernateUtil.getSessionfactory().openSession();
		      session.beginTransaction();
		      session.update(admin);
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
	
	public RegistredUser getAdminById(int id)throws Exception {
	    Session session = null;
	    Administrator admin = null;
	    RegistredUser user = null;
	    //try {
	      session = HibernateUtil.getSessionfactory().openSession();
	      admin = (Administrator) session.load(Administrator.class, id);
	      user = (RegistredUser) session.load(RegistredUser.class, admin.get_id());
	    //} catch (Exception e) {
	    	//System.out.println("Error getting by id: "+e.getMessage());
	    	//throw new Exception("Error getting admins by id: " + e.getMessage());
	    //} finally {
	      if (session != null && session.isOpen()) {
	        session.close();
	     // }
	    }
	    return new RegistredUser();
	  }
	
	public Collection getAllAdmins() throws Exception {
	    Session session = null;
	    List admins = new ArrayList<Administrator>();
	    try {
	      session = HibernateUtil.getSessionfactory().openSession();
	      admins = session.createCriteria(Administrator.class).list();
	    } catch (Exception e) {
	      throw new Exception("Error getting admins " + e.getMessage());
	    } finally {
	      if (session != null && session.isOpen()) {
	        session.close();
	      }
	    }
	    return admins;
	  }
	
	public void deleteAdmin(Administrator admin) throws Exception {
	    Session session = null;
	    try {
	      session = HibernateUtil.getSessionfactory().openSession();
	      session.beginTransaction();
	      session.delete(admin);
	      session.getTransaction().commit();
	    } catch (Exception e) {
	      throw new Exception("Errog deleting admin:" + e.getMessage());
	    } finally {
	      if (session != null && session.isOpen()) {
	        session.close();
	      }
	    }
	  }
}
