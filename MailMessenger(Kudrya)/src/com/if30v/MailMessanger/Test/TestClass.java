package com.if30v.MailMessanger.Test;

import java.util.Date;
import java.util.List;

import org.junit.Test;

import com.if30v.MailMessanger.beans.Contact;
import com.if30v.MailMessanger.beans.Letter;
import com.if30v.MailMessanger.beans.Letter_Sender_Receiver;
import com.if30v.MailMessanger.beans.RegistredUser;
import com.if30v.MailMessanger.dao.*;
import com.if30v.MailMessanger.dao.beans.Letter_Sender_ReceiverDAO;
import com.if30v.MailMessanger.dao.beans.RegistredUserDAO;

import junit.framework.Assert;

public class TestClass extends Assert{

	private static RegistredUser user = null;
	private static Letter letter = null;
	private static Contact contact = null;
	private static Letter_Sender_Receiver lettersr = null;
	
	@Test
	public void connection() throws Exception{
		HibernateUtil.configurate("127.0.0.1", "mydb", "root", "pass");	
	}
	
	static{
		HibernateUtil.configurate("127.0.0.1", "mydb", "root", "pass");
		
		{
			user = new RegistredUser();
			user.setLogin("test_test_test");
			user.set_dateOfBirth(new Date());
			user.set_dateOfREgistration(new Date());
			user.set_fIO("Ololoev Ololosha");
			user.setPassword_hash("pass");
			user.set_telephone("9379992");
		}
		
		{
			letter = new Letter();
		}
		
		{
			contact = new Contact();
		}
		
		{
			lettersr = new Letter_Sender_Receiver();
			lettersr.set_isRead(false);
			lettersr.set_isRecTrash(false);
			lettersr.set_isSenderTrash(false);
		}
	}
	
	@Test
	public void getAdmins() throws Exception{
		Factory.getInstance().getAdministratorDAO().getAllAdmins();
	}

	@Test
	public void getAdmin() throws Exception{
		Factory.getInstance().getAdministratorDAO().getAdminById(1);
	}
	
	@Test
	public void addUser() throws Exception{
		Factory.getInstance().getRegistredUserDAO().addUser(user);
	}
	
	@Test
	public void getUsers() throws Exception{
		Factory.getInstance().getRegistredUserDAO().getAllUsers();
	}
	
	/*@Test
	public void updateUser() throws Exception{
		user.set_fIO("Updated Fio");
		Factory.getInstance().getRegistredUserDAO().updateUser(user);
	}*/
	
	@Test
	public void removeUser() throws Exception{
		Factory.getInstance().getRegistredUserDAO().deleteUser(user);
	}
	
	@Test
	public void getLetters() throws Exception{
		Factory.getInstance().getLetterDAO().getAllLetters();
	}
	
	@Test
	public void addLetter() throws Exception{
		Factory.getInstance().getLetterDAO().addLetter(letter);
	}
	
	@Test
	public void updateLetter() throws Exception{
		Factory.getInstance().getLetterDAO().updateLetter(letter);
	}
	
	@Test
	public void getContacts() throws Exception{
		Factory.getInstance().getContactDAO().getAllContacts();
	}
	
	@Test
	public void addContact() throws Exception{
		RegistredUser holder = Factory.getInstance().getRegistredUserDAO().getUserById(1);
		RegistredUser person = Factory.getInstance().getRegistredUserDAO().getUserById(2);
		contact.set_ContactHolder(holder);
		contact.set_ContactPerson(person);
		Factory.getInstance().getContactDAO().addContact(contact);
	}
		
	/*@Test
	public void updateContact() throws Exception{
		Factory.getInstance().getContactDAO().updateContact(contact);
	}*/
	
	@Test
	public void removeContact() throws Exception{
		Factory.getInstance().getContactDAO().deleteContact(contact);
	}
	
	@Test
	public void addLetterSenderReceiver() throws Exception{
		RegistredUser reciever = Factory.getInstance().getRegistredUserDAO().getUserById(1);
		RegistredUser sender = Factory.getInstance().getRegistredUserDAO().getUserById(2);
		List<Letter> letters = (List<Letter>)Factory.getInstance().getLetterDAO().getAllLetters();
		lettersr.set_Receiver(reciever);
		lettersr.set_Sender(sender);
		lettersr.set_Letter(letters.get(1));
		Factory.getInstance().getLetter_Sender_ReceiverDAO().addLetter_Sender_Receiver(lettersr);
	}
	
	@Test
	public void getLetterSenderReciever() throws Exception{
		Factory.getInstance().getLetter_Sender_ReceiverDAO().getAllLetter_Sender_Receivers();
	}
	
	@Test
	public void updateLetterSenderReciever() throws Exception{
		Factory.getInstance().getLetter_Sender_ReceiverDAO().updateLetter_Sender_Receiver(lettersr);
	}
	
	@Test
	public void removeLetterSenderReciever() throws Exception{
		Factory.getInstance().getLetter_Sender_ReceiverDAO().deleteLetter_Sender_Receiver(lettersr);
	}
	
	/*@Test
	public void removeLetter() throws Exception{
		Factory.getInstance().getLetterDAO().deleteLetter(letter);
	}*/
}