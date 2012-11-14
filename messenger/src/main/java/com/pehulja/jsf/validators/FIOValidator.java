/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pehulja.jsf.validators;

import java.util.ResourceBundle;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

/**
 *
 * @author pehulja
 */
public class FIOValidator implements Validator{

    @Override
    public void validate(FacesContext fc, UIComponent uic, Object o) throws ValidatorException {
        String fio = (String) o;
        if(fio!="" && fio.length() < 5){
            FacesContext context = FacesContext.getCurrentInstance();
            ResourceBundle bundle = context.getApplication().getResourceBundle(context, "msgs");
            String msgStr = bundle.getString("validatorFioErrorFormat");

            FacesMessage message = new FacesMessage();
            message.setDetail(msgStr);
            message.setSummary(msgStr);
            message.setSeverity(FacesMessage.SEVERITY_ERROR);
            throw new ValidatorException(message); 
        }
    }
    
}
