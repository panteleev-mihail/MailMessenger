package com.pehulja.messenger.dao;
import java.util.List;

import javax.swing.JOptionPane;

import org.hibernate.JDBCException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	public static boolean isConfigurated() {
		return isConfigurated;
	}
	public static List<ConnectionParams> listParams = ConnectionParams.getConnectionParamsList();
	
	private static SessionFactory sessionFactory=null;
	static public boolean isConfigurated=false;
	
	public static boolean configurate(String hostName, String dbName, String username, String pass)
	{
		Configuration configuration = new Configuration();  
		configuration.setProperty("hibernate.connection.url", "jdbc:mysql://"+hostName+":3306/"+dbName);  
		configuration.setProperty("hibernate.connection.username", username);  
		configuration.setProperty("hibernate.connection.password", pass); 
		configuration.configure();
		
		try
		{
				isConfigurated=false;
				sessionFactory =configuration.buildSessionFactory(); 
				Session testSess=(Session) sessionFactory.openSession();
				testSess.beginTransaction();
				testSess.getTransaction().commit();
				testSess.close();
				isConfigurated=true;
		}
		catch  (JDBCException e){                      
	           JOptionPane.showMessageDialog( null,"Неможливо підключитися до сервера !", "Помилка з'єднання",JOptionPane.ERROR_MESSAGE );
	       }
		catch (Exception ex){
			ex.printStackTrace();
			JOptionPane.showMessageDialog( null,"Неможливо підключитися до сервера !", "Помилка з'єднання",JOptionPane.ERROR_MESSAGE );
		}
		
		return true;
	}
	
	public static SessionFactory getSessionfactory() {
		return isConfigurated?sessionFactory:null;
	}

	public static String[] getDefaultConnectionConfigOpt() {
		return new String[]{listParams.get(0).getServerPath(), listParams.get(0).getDbName(), listParams.get(0).getUserName(), listParams.get(0).getPass()};
	}

	public static List<ConnectionParams> getListParams() {
		return listParams;
	}

	public static void setListParams(List<ConnectionParams> listParams) {
		HibernateUtil.listParams = listParams;
	}

}
