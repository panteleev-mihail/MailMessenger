package com.messenger.dao.beans;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Query;

import com.messenger.dao.HibernateUtil;
import com.messenger.pojo.Contact;
import com.messenger.pojo.RegistredUser;

public class ContactDAO extends DAO {
	@SuppressWarnings("unchecked")
	public List<RegistredUser> getContact(RegistredUser user) {
		List<RegistredUser> result = null;
		EntityManager manager = HibernateUtil.getEm();
		try {
			result = manager.createNamedQuery("getUsersContacts")
					.setParameter("id", user.getId()).getResultList();
		} catch (javax.persistence.NoResultException e) {

		} finally {
			manager.close();
		}
		return result;
	}

	public void delete(RegistredUser holder, RegistredUser contact) {
		EntityManager manager = HibernateUtil.getEm();
		EntityTransaction tx = manager.getTransaction();
		try {
			tx.begin();
			Query query = manager.createNamedQuery("deleteUserContact")
					.setParameter("idContactPerson", contact.getId())
					.setParameter("idContactHolder", holder.getId());
			query.executeUpdate();
			tx.commit();
		} catch (javax.persistence.NoResultException e) {
		} finally {
			manager.close();
		}
	}

	@SuppressWarnings("unchecked")
	public boolean hasUserSuchContact(Contact contact) throws NoResultException {
		List<RegistredUser> result = null;
		EntityManager manager = HibernateUtil.getEm();
		EntityTransaction tx = manager.getTransaction();

		tx.begin();
		result = manager.createNamedQuery("getContactRepeats")
				.setParameter("idHolder", contact.getContactHolder().getId())
				.setParameter("idPerson", contact.getContactPerson().getId())
				.getResultList();
		tx.commit();
		manager.close();
		if (result != null && result.size() != 0) {
			return true;
		} else {
			return false;
		}
	}
}
