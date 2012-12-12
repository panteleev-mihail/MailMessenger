/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.messenger.jsf.validators;

import java.util.ResourceBundle;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

/**
 *
 * @author I
 */
public class EmptyFieldValidator implements Validator{
    
     @Override
    public void validate(FacesContext fc, UIComponent uic, Object o) throws ValidatorException {
        String field = (String) o;
        if(field.isEmpty()){
            FacesContext context = FacesContext.getCurrentInstance();
            ResourceBundle bundle = context.getApplication().getResourceBundle(context, "msgs");
            String msgStr = bundle.getString("emptyFieldError");

            FacesMessage message = new FacesMessage();
            message.setDetail(msgStr);
            message.setSummary(msgStr);
            message.setSeverity(FacesMessage.SEVERITY_ERROR);
            throw new ValidatorException(message); 
        }
    }
}
