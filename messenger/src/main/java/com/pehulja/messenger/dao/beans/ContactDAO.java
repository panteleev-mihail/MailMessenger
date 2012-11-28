package com.pehulja.messenger.dao.beans;

import com.pehulja.messenger.dao.Factory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;

import com.pehulja.messenger.pojo.Contact;
import com.pehulja.messenger.dao.HibernateUtil;
import com.pehulja.messenger.pojo.LetterSenderReceiver;
import com.pehulja.messenger.pojo.RegistredUser;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Query;

public class ContactDAO extends DAO{
	public List<RegistredUser> getContact(RegistredUser user){
            List<RegistredUser> result = null;
            EntityManager manager = HibernateUtil.getEm();
            try{
               result = manager.createNamedQuery("getUsersContacts").setParameter("id", user.get_id()).getResultList();
            }
            catch(javax.persistence.NoResultException e){
                
            }
            finally{
                manager.close();
            }
            return result;
        }
        
        public void delete (RegistredUser holder, RegistredUser contact){
            EntityManager manager = HibernateUtil.getEm();
            EntityTransaction tx = manager.getTransaction();
            try{
               tx.begin();
               Query query = manager.createNamedQuery("deleteUserContact")
                       .setParameter("idContactPerson", contact.get_id())
                       .setParameter("idContactHolder", holder.get_id());
               query.executeUpdate();
               tx.commit();
            }
            catch(javax.persistence.NoResultException e){
            }
            finally{
                manager.close();
            }
        }
        
        public boolean hasUserSuchContact(Contact contact) throws NoResultException{
            List<RegistredUser> result = null;
            EntityManager manager = HibernateUtil.getEm();
            EntityTransaction tx = manager.getTransaction();
            
               tx.begin();
               result = manager.createNamedQuery("getContactRepeats")
                       .setParameter("idHolder", contact.get_ContactHolder().get_id())
                       .setParameter("idPerson", contact.get_ContactPerson().get_id())
                       .getResultList();
               tx.commit();
               manager.close();
            if(result != null && result.size() != 0){
                return true;
            }else{
                return false;
            }
        }
}
