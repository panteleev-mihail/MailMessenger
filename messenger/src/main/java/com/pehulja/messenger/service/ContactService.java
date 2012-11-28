/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pehulja.messenger.service;

import com.pehulja.messenger.dao.Factory;
import com.pehulja.messenger.dao.beans.ContactDAO;
import com.pehulja.messenger.dao.beans.RegistredUserDAO;
import com.pehulja.messenger.pojo.Contact;
import com.pehulja.messenger.pojo.LetterSenderReceiver;
import com.pehulja.messenger.pojo.RegistredUser;
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
        contact.set_ContactHolder(user);
        contact.set_ContactPerson(contactPerson);
        if(!contactDAO.hasUserSuchContact(contact)){
        userDAO.add(contact);
        userDAO.update(user);
        }else{
            throw new NoResultException();
        }
    }
    
    
}
