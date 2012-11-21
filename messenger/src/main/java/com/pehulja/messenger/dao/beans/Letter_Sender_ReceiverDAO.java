package com.pehulja.messenger.dao.beans;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.hibernate.Session;

import com.pehulja.messenger.pojo.Letter_Sender_Receiver;
import com.pehulja.messenger.dao.HibernateUtil;
import javax.persistence.EntityManager;

public class Letter_Sender_ReceiverDAO {
	public void addLSR(Letter_Sender_Receiver lsr) throws Exception {
	    EntityManager manager = HibernateUtil.getEm();
            manager.persist(lsr);
            manager. close();
	  }
        
	public Letter_Sender_Receiver getLSRById(int id)throws Exception {
	    Letter_Sender_Receiver lsr = null;
	    EntityManager manager = HibernateUtil.getEm();
            lsr = manager.find(Letter_Sender_Receiver.class, id);
            manager. close();
	    return lsr;
	  }
	
	public void deleteLSR(Letter_Sender_Receiver lsr) throws Exception {
	    EntityManager manager = HibernateUtil.getEm();
            manager.remove(lsr);
            manager. close();
	  }
}
