package com.if30v.email.dao;


import java.util.Date;
import java.util.List;

import org.hibernate.Session;

import com.if30v.email.beans.RegistredUser;
import com.if30v.email.dao.HibernateUtil;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HibernateUtil.configurate("127.0.0.1", "messenger", "root", "98979897");
		if(HibernateUtil.isConfigurated){
			RegistredUser registredUser = new RegistredUser();
			registredUser.set_fIO("User1");
			registredUser.set_dateOfBirth(new Date());
			registredUser.set_secondMailAdress("pehulja@gmail.com");
			Session session=HibernateUtil.getSessionfactory().openSession();
			session.beginTransaction();
				session.save(registredUser);
			session.getTransaction().commit();
			session.close();
		}
		
		
	}

}
