package com.pehulja.messenger.dao.beans;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.hibernate.Session;

import com.pehulja.messenger.pojo.Administrator;
import com.pehulja.messenger.dao.HibernateUtil;
import javax.persistence.EntityManager;

public class AdministratorDAO extends DAO{
	public void addAdministrator(Administrator admin) throws Exception {
	    EntityManager manager = HibernateUtil.getEm();
            manager.persist(admin);
            manager. close();
	  }
        
	public Administrator getContactById(int id)throws Exception {
	    Administrator admin = null;
	    EntityManager manager = HibernateUtil.getEm();
            admin = manager.find(Administrator.class, id);
            manager. close();
	    return admin;
	  }
	
	public void deleteContact(Administrator admin) throws Exception {
	    EntityManager manager = HibernateUtil.getEm();
            manager.remove(admin);
            manager. close();
	  }
}
