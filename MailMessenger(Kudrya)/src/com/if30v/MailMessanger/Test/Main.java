package com.if30v.MailMessanger.Test;


import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;

import junit.framework.TestSuite;
import junit.textui.TestRunner;

import org.hibernate.Session;

import com.if30v.MailMessanger.beans.Administrator;
import com.if30v.MailMessanger.beans.Contact;
import com.if30v.MailMessanger.beans.RegistredUser;
import com.if30v.MailMessanger.dao.HibernateUtil;
import com.if30v.MailMessanger.dao.Factory;

public class Main {
	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		HibernateUtil.configurate("127.0.0.1", "mydb", "root", "pass");
		RegistredUser user = Factory.getInstance().getRegistredUserDAO().getUserById(1);
		List<RegistredUser> contacts;// = (List<Contact>) Factory.getInstance().getContactDAO().getUsersContact(user);
		Session session = HibernateUtil.getSessionfactory().openSession();
		contacts = session.getNamedQuery("getUsersContacts").setParameter("id", "1").list();
		if (contacts != null)
			System.out.println(contacts.size());
	}
}