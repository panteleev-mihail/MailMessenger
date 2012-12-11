/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.messenger.manbeans;

import com.messenger.pojo.RegistredUser;
import com.messenger.dao.Factory;
import com.messenger.dao.HibernateUtil;
import java.io.IOException;
import java.io.Serializable;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;  
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;  
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;

/**
 *
 * @author Pehulya
 * Класс, где хранится ссылка на текущего авторизованого пользователя
 */

@ManagedBean (name = "maskbean")
@SessionScoped
public class MaskUser implements Serializable{
    private static final org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger("errLogger");
    
    //Сюда попадает объект на зарегистрированного пользователя
    private RegistredUser user;
   
    public MaskUser() {
    }
   
    public RegistredUser getUser() {
        return user;
    }

    public void setUser(RegistredUser user) {
        this.user = user;
    }
  
}
