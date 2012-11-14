package com.pehulja.messenger.service;

import com.pehulja.messenger.pojo.RegistredUser;
import com.pehulja.messenger.dao.Factory;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegistrationService {
	private String login;
	private String password;
        private String passwordCheck;
	private String telephone;
	private Date dateOfBirth;
	private String controlEmail;
	private String fio;

    public RegistrationService(String login, String password, String telephone, Date dateOfBirth, String controlEmail, String fio, String passwordCheck) {
        this.login = login;
        this.password = password;
        this.telephone = telephone;
        this.dateOfBirth = dateOfBirth;
        this.controlEmail = controlEmail;
        this.fio = fio;
        this.passwordCheck = passwordCheck;
    }
	public boolean register() throws Exception{
            RegistredUser user = new RegistredUser();
            user.setLogin(login);
            if(password.equals(passwordCheck) == true){
               user.setPassword_hash(password);
            }else{
                return false;
            }
            user.set_telephone(telephone);
            user.set_fIO(fio);
            user.set_dateOfBirth(dateOfBirth);
            user.set_dateOfREgistration(new Date());
            Factory.getInstance().getRegistredUserDAO().addUser(user);
            return true;
	}
	public String getFio() {
		return fio;
	}
	public void setFio(String fio) {
		this.fio = fio;
	}
	
}
