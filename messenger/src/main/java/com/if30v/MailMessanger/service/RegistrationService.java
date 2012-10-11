package com.if30v.MailMessanger.service;

import java.sql.SQLException;
import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.imageio.spi.RegisterableService;

import org.hibernate.Session;

import com.if30v.MailMessanger.beans.RegistredUser;
import com.if30v.MailMessanger.dao.HibernateUtil;
import com.if30v.MailMessanger.validators.Validator;
import com.if30v.MailMessanger.validators.ValidatorException;

import java.text.DateFormat;

public class RegistrationService {
	private String login;
	private String password;
	private String telephone;
	private String dateOfBirth;
	private String controlEmail;
	private String fio;
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getControlEmail() {
		return controlEmail;
	}
	public void setControlEmail(String controlEmail) {
		this.controlEmail = controlEmail;
	}
	
	public boolean register() throws SQLException{
		String dateFormat = "dd.MM.yyyy";
		SimpleDateFormat formatter = new SimpleDateFormat(dateFormat);
		Date date;
				
		try {
			date = formatter.parse(dateOfBirth);
			RegistredUser user = new RegistredUser();
			if(controlEmail!=null && controlEmail!="")
				Validator.validEmail(controlEmail);
			Validator.validLogin(login);
			Validator.validPassword(password);
			if(telephone!=null && telephone!="")
				Validator.validTelephone(telephone);
			
			user.setLogin(login);
			user.setPassword_hash(password);
			user.set_dateOfBirth(date);
			user.set_telephone(telephone);
			user.set_dateOfREgistration(new Date());
			user.set_secondMailAdress(controlEmail);
			user.set_fIO(fio);
			Session session=HibernateUtil.getSessionfactory().openSession();
			session.beginTransaction();
				session.save(user);
			session.getTransaction().commit();
			session.close();
			return true;
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		} 
		catch (ValidatorException ex){
			ex.printStackTrace();
			return false;
		}
		catch (Exception ex){
			ex.printStackTrace();
			return false;
		}
	}
	public String getFio() {
		return fio;
	}
	public void setFio(String fio) {
		this.fio = fio;
	}
	
}
