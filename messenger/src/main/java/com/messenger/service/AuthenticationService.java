package com.messenger.service;

import com.messenger.dao.Factory;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.messenger.pojo.RegistredUser;
import com.messenger.dao.HibernateUtil;
//Типа бизнесс слой приложения
public class AuthenticationService {
	public RegistredUser  authenticate (String login, String password){
		RegistredUser user = null;
                user = Factory.getInstance().getRegistredUserDAO().loginUser(login, password);
                return user;
	}
}
