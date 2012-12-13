package com.messenger.service;

import com.messenger.pojo.RegistredUser;
import com.messenger.dao.Factory;

import java.security.MessageDigest;
import java.security.SecureRandom;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//Типа бизнесс слой приложения
public class RegistrationService {
	private String login;
	private String password;
	private String telephone;
	private Date dateOfBirth;
	private String controlEmail;
	private String fio;

    public RegistrationService(String login, String password, String telephone, Date dateOfBirth, String controlEmail, String fio) {
        this.login = login;
        this.password = password;
        this.telephone = telephone;
        this.dateOfBirth = dateOfBirth;
        this.controlEmail = controlEmail;
        this.fio = fio;
    }

	public void register() throws Exception {
		RegistredUser user = new RegistredUser();
		user.setLogin(login);
		MessageDigest digest = MessageDigest.getInstance("SHA");
		SecureRandom rand = new SecureRandom();
		byte[] randomBytes = new byte[128];
		rand.nextBytes(randomBytes);
		String passwordHash = new String(digest.digest(password.getBytes()));
		String salt = new String(digest.digest(randomBytes));
		String resultHash = new String(digest.digest((passwordHash + salt)
				.getBytes()));
		user.setPassword_hash(resultHash);
		user.setPassword_salt(salt);
		user.setTelephone(telephone);
		user.setfIO(fio);
		user.setDateOfBirth(dateOfBirth);
		user.setDateOfREgistration(new Date());
		Factory.getInstance().getRegistredUserDAO().add(user);
	}
	public String getFio() {
		return fio;
	}
	public void setFio(String fio) {
		this.fio = fio;
	}
	
}
