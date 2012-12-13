/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.messenger.manbeans;

import com.messenger.pojo.RegistredUser;
import com.messenger.service.RegistrationService;
import com.messenger.service.UpdateService;
import java.beans.Transient;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

/**
 * 
 * @author Pehulya
 */
// Бин представляет собой форму для регистрации и изменения личных данных
@ManagedBean(name = "regbean")
@SessionScoped
public class RegBean implements Serializable {
	private RegistredUser user;
	private String login, password, passwordCheck, fio, telephone, email;
	private Date dateOfBirth;

	public RegBean() {
		user = new RegistredUser();
	}

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

	public String getPasswordCheck() {
		return passwordCheck;
	}

	public void setPasswordCheck(String passwordCheck) {
		this.passwordCheck = passwordCheck;
	}

	public String getFio() {
		return fio;
	}

	public void setFio(String fio) {
		this.fio = fio;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setUser(RegistredUser user) {
		this.user = user;
		login = user.getLogin();
		password = user.getPassword_hash();
		fio = user.getfIO();
		telephone = user.getTelephone();
		email = user.getSecondMailAdress();
		dateOfBirth = user.getDateOfBirth();
	}

	public String register() {
		try {
			if (password.equals(passwordCheck)) {
				RegistrationService service = new RegistrationService(login,
						password, telephone, dateOfBirth, email, fio);
				service.register();
				return "login";
			} else {
				return "registration";
			}
		} catch (Exception ex) {
			ex.getMessage();
			return "registration";
		}
	}

	public String update() {

		user.setPassword_hash(password);
		user.setfIO(fio);
		user.setTelephone(telephone);
		user.setSecondMailAdress(email);
		user.setDateOfBirth(dateOfBirth);
		UpdateService service = new UpdateService(user);
		try {
			boolean flag = service.update();
			if (flag)
				return "account";
			else
				return "userData";
		} catch (Exception ex) {
			ex.getMessage();
			return "registration";
		}
	}

}
