package com.messenger.dao.beans;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.hibernate.Session;

import com.messenger.pojo.LetterSenderReceiver;
import com.messenger.dao.HibernateUtil;
import com.messenger.pojo.Letter;
import com.messenger.pojo.RegistredUser;
import javax.persistence.EntityManager;

public class LetterSenderReceiverDAO extends DAO {
    
    
    public List<LetterSenderReceiver> getByLetter(Letter letter) {
        
        List<LetterSenderReceiver> result = null;
		EntityManager manager = HibernateUtil.getEm();
		try {
			result = manager.createNamedQuery("getByLetter")
					.setParameter("letter", letter).getResultList();
		} catch (javax.persistence.NoResultException e) {

		} finally {
			manager.close();
		}
		return result;
        
    }
	public List<LetterSenderReceiver> getIncome(RegistredUser user) {
		List<LetterSenderReceiver> result = null;
		EntityManager manager = HibernateUtil.getEm();
		try {
			result = manager.createNamedQuery("getIncome")
					.setParameter("id", user)
					.setParameter("isRecTrash", false).getResultList();
                        
		} catch (javax.persistence.NoResultException e) {

		} finally {
			manager.close();
		}
		return result;
	}

	public List<LetterSenderReceiver> getOutcome(RegistredUser user) {
		List<LetterSenderReceiver> result = null;
		EntityManager manager = HibernateUtil.getEm();
		try {
			result = manager.createNamedQuery("getOutcome")
					.setParameter("id", user)
					.setParameter("isSenderTrash", false).getResultList();
		} catch (javax.persistence.NoResultException e) {

		} finally {
			manager.close();
		}
		return result;
	}

	public List<LetterSenderReceiver> getTrash(RegistredUser user) {
		List<LetterSenderReceiver> result = null;
		EntityManager manager = HibernateUtil.getEm();
		try {
			result = manager.createNamedQuery("getTrash")
					.setParameter("id", user).setParameter("isRecTrash", true)
					.setParameter("isSenderTrash", true).getResultList();
		} catch (javax.persistence.NoResultException e) {

		} finally {
			manager.close();
		}
		return result;
	}
}
