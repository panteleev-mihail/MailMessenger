package com.pehulja.messenger.dao.beans;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;

import com.pehulja.messenger.pojo.Contact;
import com.pehulja.messenger.dao.HibernateUtil;

public class ContactDAO {
	public void addContact(Contact contact) throws Exception {
	    EntityManager manager = HibernateUtil.getEm();
            manager.persist(contact);
            manager. close();
	  }
        
	public Contact getContactById(int id)throws Exception {
	    Contact contact = null;
	    EntityManager manager = HibernateUtil.getEm();
            contact = manager.find(Contact.class, id);
            manager. close();
	    return contact;
	  }
	
	public void deleteContact(Contact contact) throws Exception {
	    EntityManager manager = HibernateUtil.getEm();
            manager.remove(contact);
            manager. close();
	  }
}
