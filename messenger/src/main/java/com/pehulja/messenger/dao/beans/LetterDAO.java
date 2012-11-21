package com.pehulja.messenger.dao.beans;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.hibernate.Session;

import com.pehulja.messenger.pojo.Letter;
import com.pehulja.messenger.dao.HibernateUtil;
import javax.persistence.EntityManager;


public class LetterDAO {
	public void addLetter(Letter letter) throws Exception {
	    EntityManager manager = HibernateUtil.getEm();
            manager.getTransaction().begin();
            manager.persist(letter);
            manager.getTransaction().commit();
            manager. close();
	  }
        
	public Letter getLetterById(int id)throws Exception {
	    Letter letter = null;
	    EntityManager manager = HibernateUtil.getEm();
            letter = manager.find(Letter.class, id);
            manager. close();
	    return letter;
	  }
	
	public void deleteLSR(Letter letter) throws Exception {
	    EntityManager manager = HibernateUtil.getEm();
            manager.remove(letter);
            manager. close();
	  }
}
