package com.messenger.dao.beans;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;

import com.messenger.dao.HibernateUtil;
import com.messenger.pojo.Pojo;
import com.messenger.pojo.RegistredUser;

public class RegistredUserDAO extends DAO {

	public RegistredUser loginUser(String login, String password) {
		RegistredUser user = null;
		EntityManager manager = null;
		try {
			manager = HibernateUtil.getEm();

			RegistredUser temp = (RegistredUser) manager
					.createQuery(
							"SELECT user FROM RegistredUser user WHERE user.login=:user_login")
					.setParameter("user_login", login).getSingleResult();
			if (temp != null) {
				MessageDigest digest = MessageDigest.getInstance("SHA");
				String passwordHash = new String(digest.digest(password
						.getBytes()));
				String resultHash = new String(
						digest.digest((passwordHash + temp.getPassword_salt())
								.getBytes()));
				if (resultHash.equals(temp.getPassword_hash()))
					user = temp;
			}
		} catch (javax.persistence.NoResultException e) {

		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (manager != null)
				manager.close();
		}
		return user;
	}

	public Pojo getByLogin(String login) throws NoResultException {
		RegistredUser obj = null;
		EntityManager manager = HibernateUtil.getEm();
		EntityTransaction tx = manager.getTransaction();
		tx.begin();
		System.out.println("Login:" + login);
		/*
		 * obj = (Pojo) manager.createQuery("getUserByLogin")
		 * .setParameter("user_login", login) .getSingleResult();
		 */
		obj = (RegistredUser) manager.createNamedQuery("getUserByLogin")
				.setParameter("user_login", login).getSingleResult();
		tx.commit();
		manager.close();

		return obj;
	}

	public List<RegistredUser> allUsers() throws NoResultException {
		List<RegistredUser> users;
		EntityManager manager = HibernateUtil.getEm();
		EntityTransaction tx = manager.getTransaction();
		tx.begin();
		users = manager.createNamedQuery("getAllusers").getResultList();
		tx.commit();
		manager.close();

		return users;
	}

	public List<RegistredUser> allUsersNotAdmin() throws NoResultException {
		List<RegistredUser> users;
		EntityManager manager = HibernateUtil.getEm();
		EntityTransaction tx = manager.getTransaction();
		tx.begin();
		users = manager.createNamedQuery("getAllUsersNotAdmin").getResultList();
		tx.commit();
		manager.close();

		return users;
	}

	public RegistredUser getUserNotAdmin(String login) throws NoResultException {
		RegistredUser user;
		EntityManager manager = HibernateUtil.getEm();
		EntityTransaction tx = manager.getTransaction();
		tx.begin();
		user = (RegistredUser) manager
				.createNamedQuery("getUserByLoginNotAdmin")
				.setParameter("user_login", login).getSingleResult();
		tx.commit();
		manager.close();

		return user;
	}

}