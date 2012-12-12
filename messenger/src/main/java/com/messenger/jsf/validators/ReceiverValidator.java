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
public class ReceiverValidator implements Validator{

    @Override
    public void validate(FacesContext fc, UIComponent uic, Object o) throws ValidatorException {
        String receiver = (String) o;
        if(receiver.isEmpty()||receiver.length()<5){
            FacesContext context = FacesContext.getCurrentInstance();
            ResourceBundle bundle = context.getApplication().getResourceBundle(context, "msgs");
            String msgStr = bundle.getString("validatorReceiverErrorFormat");

            FacesMessage message = new FacesMessage();
            message.setDetail(msgStr);
            message.setSummary(msgStr);
            message.setSeverity(FacesMessage.SEVERITY_ERROR);
            throw new ValidatorException(message); 
        }
    }
    
    
}
