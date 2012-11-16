/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pehulja.jsf.validators;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedProperty;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import org.hibernate.Session;

/**
 *
 * @author pehulja
 */
public class EmailValidator implements Validator{
    //Получаем ссыку на файл msds с локализоваными сообщениями
    @ManagedProperty("#{msgs}")
    private ResourceBundle bundle;

    public void setBundle(ResourceBundle bundle) {
        this.bundle = bundle;
    }
    
    // Переопределяем метод для валидации поля
    @Override
    public void validate(FacesContext fc, UIComponent uic, Object o) throws ValidatorException {
        String email = (String) o;
        if(email!="")
        {
            try {
               InternetAddress emailAddr = new InternetAddress(email);
               emailAddr.validate();
            } catch (AddressException ex) {
                FacesContext context = FacesContext.getCurrentInstance();
                ResourceBundle bundle = context.getApplication().getResourceBundle(context, "msgs");
                String msgStr = bundle.getString("validatorEmailErrorFormat");
            
                FacesMessage message = new FacesMessage();
                message.setDetail(msgStr);
                message.setSummary(msgStr);
                message.setSeverity(FacesMessage.SEVERITY_ERROR);
                throw new ValidatorException(message); 
            }
        }
    }
    
}
