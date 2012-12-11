package com.messenger.dao.beans;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.hibernate.Session;

import com.messenger.pojo.Administrator;
import com.messenger.dao.HibernateUtil;
import com.messenger.pojo.RegistredUser;
import javax.persistence.EntityManager;

public class AdministratorDAO extends DAO{
	public boolean isCurrentUserIsAdmin(RegistredUser user) {
		List<Object> admins = new ArrayList<Object>();
		EntityManager manager = null;
		try {
			manager = HibernateUtil.getEm();
			admins = manager
					.createNativeQuery(
							"SELECT * FROM Administrator WHERE registreduser_id = :user_id")
					.setParameter("user_id", user.getId()).getResultList();
		} catch (Exception e) {
		} finally {
			manager.close();
		}
		if (!admins.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}
}
