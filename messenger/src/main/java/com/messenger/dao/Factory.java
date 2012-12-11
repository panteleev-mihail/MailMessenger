package com.messenger.dao;

import com.messenger.dao.beans.AdministratorDAO;
import com.messenger.dao.beans.ContactDAO;
import com.messenger.dao.beans.LetterDAO;
import com.messenger.dao.beans.LetterSenderReceiverDAO;
import com.messenger.dao.beans.RegistredUserDAO;

public class Factory {

	private static Factory instance = null;
	private static RegistredUserDAO userDAO = null;
	private static AdministratorDAO adminDAO = null;
	private static LetterDAO letterDAO = null;
	private static ContactDAO contactDAO = null;
	private static LetterSenderReceiverDAO letterSenderReceiverDAO = null;
	
        /*static {
            HibernateUtil.configurate("localhost", "mydb", "root", "98979897");
        }*/
	 public static synchronized Factory getInstance(){
		 if (instance == null){
			 instance = new Factory();
			 }
		 return instance;
		 }
	 
	 public RegistredUserDAO getRegistredUserDAO(){
		 if (userDAO == null)
			 userDAO = new RegistredUserDAO();
		 return userDAO;
	 }
	 
	 public AdministratorDAO getAdministratorDAO(){
		 if (adminDAO == null)
			 adminDAO = new AdministratorDAO();
		 return adminDAO;
	 }
	 
	 public LetterDAO getLetterDAO(){
		 if (letterDAO == null)
			 letterDAO = new LetterDAO();
		 return letterDAO;
	 }
	 
	 public ContactDAO getContactDAO(){
		 if (contactDAO == null)
			 contactDAO = new ContactDAO();
		 return contactDAO;
	 }
	 
	public LetterSenderReceiverDAO getLetterSenderReceiverDAO(){
		 if (letterSenderReceiverDAO == null)
			 letterSenderReceiverDAO = new LetterSenderReceiverDAO();
		 return letterSenderReceiverDAO;
	 }
}
