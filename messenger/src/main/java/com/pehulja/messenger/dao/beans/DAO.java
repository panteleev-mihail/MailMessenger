/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pehulja.messenger.dao.beans;

import com.pehulja.messenger.dao.HibernateUtil;
import com.pehulja.messenger.pojo.Letter;
import com.pehulja.messenger.pojo.LetterSenderReceiver;
import javax.persistence.EntityManager;
import com.pehulja.messenger.pojo.Pojo;
/**
 *
 * @author Mihail
 */
public abstract class DAO {
    public void add(Pojo obj) throws Exception {
	    EntityManager manager = HibernateUtil.getEm();
            manager.getTransaction().begin();
            manager.persist(obj);
            manager.getTransaction().commit();
            manager.close();
	  }
    public Pojo getById(int id, Class<?> cl) throws Exception {
	    Pojo obj = null;
	    EntityManager manager = HibernateUtil.getEm();
            obj = (Pojo) manager.find(cl, id);
            manager.close();
	    return obj;
	  }
	
	public void delete(Pojo obj) throws Exception {
	    EntityManager manager = HibernateUtil.getEm();
            manager.remove(obj);
            manager.close();
	  }
}
