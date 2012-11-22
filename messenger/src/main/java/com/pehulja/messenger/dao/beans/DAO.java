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
import com.pehulja.messenger.pojo.RegistredUser;
/**
 *
 * @author Mihail
 */
public abstract class DAO {
    public static int i = 0;
    public void add(Pojo obj) throws Exception {
            if(i==1){
                int a = 5;
            }
	    EntityManager manager = HibernateUtil.getEm();
            manager.getTransaction().begin();
            manager.persist(obj);
            manager.getTransaction().commit();
            manager.close();
            i++;
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
            manager.getTransaction().begin();
            Integer index = ((RegistredUser)obj).get_id();
            Pojo obj1 = manager.find(RegistredUser.class, index);
            manager.remove(obj1);
            
            manager.getTransaction().commit();
            manager.close();
	  }
        
        public void update (Pojo obj) throws Exception{
            EntityManager manager = HibernateUtil.getEm();
            manager.getTransaction().begin();
           
            manager.merge(obj);
            manager.getTransaction().commit();
            manager.close();
        }
       
}
