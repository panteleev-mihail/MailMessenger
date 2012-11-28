package com.pehulja.messenger.dao.beans;
import com.pehulja.messenger.pojo.RegistredUser;
import com.pehulja.messenger.dao.HibernateUtil;
import com.pehulja.messenger.pojo.Contact;
import com.pehulja.messenger.pojo.Pojo;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;

public class RegistredUserDAO extends DAO{
	
	public RegistredUser loginUser(String login, String password){
             RegistredUser user = null;
             EntityManager manager = null;
             try{
                 manager = HibernateUtil.getEm();
             
                            
                user = (RegistredUser)manager.createQuery("SELECT user FROM RegistredUser user WHERE user.login=:user_login and user.password_hash=:user_pass")
                              .setParameter("user_login", login)
                              .setParameter("user_pass", password)
                              .getSingleResult(); 
            }
            catch(javax.persistence.NoResultException e){
                System.err.println("asdfasasdfasdfasdfasdfafgsfghsfghsfgdfgsdfgzdfgsdfgadfgadfgadf");
            }
            finally{
                manager.close();
            }
            return user;
        }
        
        public Pojo getByLogin(String login) throws NoResultException{
                    RegistredUser obj = null;
                    EntityManager manager = HibernateUtil.getEm();
                    EntityTransaction tx = manager.getTransaction();
                    tx.begin();
                    System.out.println("Login:" + login);
                    /*obj = (Pojo) manager.createQuery("getUserByLogin")
                            .setParameter("user_login", login)
                            .getSingleResult();*/
                    obj = (RegistredUser)manager.createNamedQuery("getUserByLogin").setParameter("user_login", login).getSingleResult();
                    tx.commit();
                    manager.close();
                
                return obj;
	}
        
}