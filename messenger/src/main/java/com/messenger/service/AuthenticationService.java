package com.messenger.service;

import com.messenger.dao.Factory;
import com.messenger.dao.HibernateUtil;
import com.messenger.pojo.RegistredUser;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

//Типа бизнесс слой приложения
public class AuthenticationService {
	public RegistredUser  authenticate (String login, String password){
		RegistredUser user = null;
                user = Factory.getInstance().getRegistredUserDAO().loginUser(login, password);
                return user;
	}
}
