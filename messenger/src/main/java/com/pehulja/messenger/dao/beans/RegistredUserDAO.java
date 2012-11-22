package com.pehulja.messenger.dao.beans;
import com.pehulja.messenger.pojo.RegistredUser;
import com.pehulja.messenger.dao.HibernateUtil;
import javax.persistence.EntityManager;

public class RegistredUserDAO extends DAO{
	
	public RegistredUser loginUser(String login, String password){
            RegistredUser user = null;
            EntityManager manager = HibernateUtil.getEm();
            try{
            user = (RegistredUser)manager.createQuery("SELECT user FROM RegistredUser user WHERE user.login=:user_login and user.password_hash=:user_pass")
                              .setParameter("user_login", login)
                              .setParameter("user_pass", password)
                              .getSingleResult(); 
            }
            catch(javax.persistence.NoResultException e){
                
            }
            finally{
                manager.close();
            }
            return user;
        }
}