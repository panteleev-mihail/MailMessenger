/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.messenger.service;

import com.messenger.dao.Factory;
import com.messenger.dao.beans.ContactDAO;
import com.messenger.dao.beans.RegistredUserDAO;
import com.messenger.pojo.Contact;
import com.messenger.pojo.LetterSenderReceiver;
import com.messenger.pojo.RegistredUser;

import java.util.List;
import javax.persistence.NoResultException;

/**
 *
 * @author Mihail
 */
public class ContactService {
    private List<RegistredUser> result = null;
    static private ContactDAO contactDAO = null;

    static {
        contactDAO = Factory.getInstance().getContactDAO();
    }
    
    public List<RegistredUser> getContact (RegistredUser user){
		result = contactDAO.getContact(user);
                return result;
	}
    
    public void deleteContact(RegistredUser holder, RegistredUser contact){
        contactDAO.delete(holder, contact);
    }
    
    public void addContact (String login, RegistredUser user) throws NoResultException{
        RegistredUserDAO userDAO = Factory.getInstance().getRegistredUserDAO();
        ContactDAO contactDAO = Factory.getInstance().getContactDAO();
        RegistredUser contactPerson = (RegistredUser) userDAO.getByLogin(login);
        Contact contact = new Contact();
        contact.setContactHolder(user);
        contact.setContactPerson(contactPerson);
        if(!contactDAO.hasUserSuchContact(contact)){
        userDAO.add(contact);
        userDAO.update(user);
        }else{
            throw new NoResultException();
        }
    }
    
    
}
