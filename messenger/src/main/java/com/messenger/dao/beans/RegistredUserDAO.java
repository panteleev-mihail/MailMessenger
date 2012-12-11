package com.messenger.dao.beans;
import com.messenger.pojo.RegistredUser;
import com.messenger.dao.HibernateUtil;
import com.messenger.pojo.Contact;
import com.messenger.pojo.Pojo;
import java.util.List;
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
        public List <RegistredUser> allUsers() throws NoResultException{
                    List <RegistredUser> users;
                    EntityManager manager = HibernateUtil.getEm();
                    EntityTransaction tx = manager.getTransaction();
                    tx.begin();
                    users = manager.createNamedQuery("getAllusers").getResultList();
                    tx.commit();
                    manager.close();
                
                return users;
	}
        public List <RegistredUser> allUsersNotAdmin() throws NoResultException{
                    List <RegistredUser> users;
                    EntityManager manager = HibernateUtil.getEm();
                    EntityTransaction tx = manager.getTransaction();
                    tx.begin();
                    users = manager.createNamedQuery("getAllUsersNotAdmin").getResultList();
                    tx.commit();
                    manager.close();
                
                return users;
	}
        public RegistredUser getUserNotAdmin(String login) throws NoResultException{
                    RegistredUser user;
                    EntityManager manager = HibernateUtil.getEm();
                    EntityTransaction tx = manager.getTransaction();
                    tx.begin();
                    user = (RegistredUser) manager.createNamedQuery("getUserByLoginNotAdmin")
                            .setParameter("user_login", login)
                            .getSingleResult();
                    tx.commit();
                    manager.close();
                
                return user;
	}
       
}