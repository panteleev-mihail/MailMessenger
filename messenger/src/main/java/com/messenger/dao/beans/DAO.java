/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.messenger.dao.beans;

import com.messenger.dao.HibernateUtil;
import com.messenger.pojo.Pojo;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

/**
 * 
 * @author Mihail
 */
public abstract class DAO {
	public void add(Pojo obj) {
		EntityManager manager = HibernateUtil.getEm();
		EntityTransaction tx = manager.getTransaction();
		try {
			tx.begin();
			manager.persist(obj);
			tx.commit();
		} catch (Exception e) {
			if (tx != null && tx.isActive()) {
				tx.rollback();
			}
		} finally {
			manager.close();
		}
	}

	public Pojo getById(int id, Class<?> cl) {
		Pojo obj = null;
		EntityManager manager = HibernateUtil.getEm();
		try {
			obj = (Pojo) manager.find(cl, id);
		} catch (Exception e) {

		} finally {
			manager.close();
		}
		return obj;
	}

	public void delete(Pojo obj) throws Exception {
		EntityManager manager = HibernateUtil.getEm();
		EntityTransaction tx = manager.getTransaction();
		try {
			tx.begin();
			obj = manager.merge(obj);
			manager.remove(obj);
			tx.commit();
		} catch (Exception e) {
			if (tx != null && tx.isActive()) {
				tx.rollback();
			}
		} finally {
			manager.close();
		}
	}

	public void update(Pojo obj) {
		EntityManager manager = HibernateUtil.getEm();
		EntityTransaction tx = manager.getTransaction();
		try {
			tx.begin();
			manager.merge(obj);
			tx.commit();
		} catch (Exception e) {
			if (tx != null && tx.isActive()) {
				tx.rollback();
			}
		} finally {
			manager.close();
		}
	}

}
