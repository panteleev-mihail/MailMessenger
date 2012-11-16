package com.pehulja.messenger.dao.beans;
import com.pehulja.messenger.pojo.RegistredUser;
import com.pehulja.messenger.dao.HibernateUtil;
import javax.persistence.EntityManager;

public class RegistredUserDAO {
	public void addUser(RegistredUser user) throws Exception {
	    EntityManager manager = HibernateUtil.getEm();
            manager.persist(user);
            manager. close();
	  }
	
	/*public void updateUser(RegistredUser user) throws Exception{
		Session session = null;
		try {
		      session = HibernateUtil.getSessionfactory().openSession();
		      session.beginTransaction();
		      session.update(user);
		      session.getTransaction().commit();
		    } catch (Exception e) {
		      //System.out.println("Error updating: "+e.getMessage());
		      throw new Exception("Error user updating: "+e.getMessage());
		    } finally {
		      if (session != null && session.isOpen()) {
		        session.close();
		      }
		    }
	}*/
	
	public RegistredUser getUserById(int id)throws Exception {
	    RegistredUser user = null;
	    EntityManager manager = HibernateUtil.getEm();
            user = manager.find(RegistredUser.class, id);
            manager. close();
	    return user;
	  }
	
	/*public Collection getAllUsers() throws Exception {
	    Session session = null;
	    List users = new ArrayList<RegistredUser>();
	    EntityManager manager = HibernateUtil.getEm();
            user = manager.find(RegistredUser.class, id);
            manager. close();
	    return users;
	  }
	*/
	public void deleteUser(RegistredUser user) throws Exception {
	    EntityManager manager = HibernateUtil.getEm();
            manager.remove(user);
            manager. close();
	  }
	public RegistredUser loginUser(String login, String password){
            RegistredUser user = null;
            EntityManager manager = HibernateUtil.getEm();
            user = (RegistredUser)manager.createQuery("SELECT user FROM RegistredUser user WHERE user.login=:user_login and user.password_hash=:user_pass")
                              .setParameter("user_login", login)
                              .setParameter("user_pass", password)
                              .getSingleResult(); 
            manager. close();
            return user;
        }
	/*public Collection getUserContactList(RegistredUser user) throws Exception{
		Session session = null;
		List<RegistredUser> contacts = new ArrayList<RegistredUser>();
		try{
			session = HibernateUtil.getSessionfactory().openSession();
			session.
		}catch(Exception e){
			throw new Exception("Error getting users contact-list: " + e.getMessage());
		}
		finally{
			if (session != null && session.isOpen()){
				session.close();
			}
		}
		return contacts;
	}*/
}