package com.pehulja.messenger.service;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.pehulja.messenger.pojo.RegistredUser;
import com.pehulja.messenger.dao.HibernateUtil;

public class AuthenticationService {
	public RegistredUser  authenticate (String login, String password){
		List <RegistredUser> user = null;
		
		System.out.println("service");
		if(HibernateUtil.isConfigurated){
			System.out.println("conf");
			Session session=HibernateUtil.getSessionfactory().openSession();
			session.beginTransaction();
				Criteria criteria =  session.createCriteria(RegistredUser.class);
				criteria.add(Restrictions.eq("login", login));
				criteria.add(Restrictions.eq("password_hash", password));
				user = criteria.list();
			session.getTransaction().commit();
			session.close();
			if(user != null && user.get(0) != null && user.size()==1)
				return user.get(0);
			else
				return null;
		}
		return null;
	}
}
