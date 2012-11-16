/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pehulja.messenger.manbeans;

import com.pehulja.messenger.pojo.RegistredUser;
import com.pehulja.messenger.service.RegistrationService;
import com.pehulja.messenger.service.UpdateService;
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
@ManagedBean(name="regbean")
@SessionScoped
public class RegBean implements Serializable{
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
        fio = user.get_fIO();
        telephone = user.get_telephone();
        email = user.get_secondMailAdress();
        dateOfBirth = user.get_dateOfBirth();
    }
      
    public String register(){
        RegistrationService service = new RegistrationService(login, password, telephone, dateOfBirth, email, fio, passwordCheck);
        try{
            boolean flag = service.register();
            if(flag)
                return "login";
            else
                return "registration";
        }catch(Exception ex){
            ex.getMessage();
            return "registration";
        }
    }
    public String update(){
         user.setLogin(login);
         user.setPassword_hash(password);
         user.set_fIO(fio);
         user.set_telephone(telephone);
         user.set_secondMailAdress(email);
         user.set_dateOfBirth(dateOfBirth);
        UpdateService service = new UpdateService(user);
        /*try{
            boolean flag = service.update();
            if(flag)
                return "account";
            else
                return "userData";
        }catch(Exception ex){
            ex.getMessage();
            return "registration";
        }*/
        return "userData";
    }
  
}
