package com.if30v.MailMessanger.dao;

import com.if30v.MailMessanger.dao.beans.AdministratorDAO;
import com.if30v.MailMessanger.dao.beans.ContactDAO;
import com.if30v.MailMessanger.dao.beans.LetterDAO;
import com.if30v.MailMessanger.dao.beans.Letter_Sender_ReceiverDAO;
import com.if30v.MailMessanger.dao.beans.RegistredUserDAO;

public class Factory {

	private static Factory instance = null;
	private static RegistredUserDAO userDAO = null;
	private static AdministratorDAO adminDAO = null;
	private static LetterDAO letterDAO = null;
	private static ContactDAO contactDAO = null;
	private static Letter_Sender_ReceiverDAO letter_Sender_ReceiverDAO = null;
        
        static {
            HibernateUtil.configurate("127.0.0.1", "mydb", "root", "pass");
        }
	
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
	 
	 public Letter_Sender_ReceiverDAO getLetter_Sender_ReceiverDAO(){
		 if (letter_Sender_ReceiverDAO == null)
			 letter_Sender_ReceiverDAO = new Letter_Sender_ReceiverDAO();
		 return letter_Sender_ReceiverDAO;
	 }
}
