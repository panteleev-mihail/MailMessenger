package com.if30v.MailMessanger.dao;


import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;

import com.if30v.MailMessanger.beans.Contact;
import com.if30v.MailMessanger.beans.RegistredUser;
import com.if30v.MailMessanger.dao.HibernateUtil;


public class Main {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HibernateUtil.configurate("127.0.0.1", "mydb", "root", "pass");
		try{
			RegistredUser user = Factory.getInstance().getRegistredUserDAO().getUserById(1);
			List<RegistredUser> users = (List<RegistredUser>) Factory.getInstance().getRegistredUserDAO().getUserContactList(user);
			System.out.println(users.size());
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}