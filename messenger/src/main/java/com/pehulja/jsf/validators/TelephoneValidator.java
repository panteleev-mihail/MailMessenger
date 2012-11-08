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
public class TelephoneValidator implements Validator{

    @Override
    public void validate(FacesContext fc, UIComponent uic, Object o) throws ValidatorException {
        String telephone = (String) o;
        Pattern pattern;
        Matcher matcher;
        if(telephone!="")
        {
            pattern = Pattern.compile("\\+[\\d]{12}");
            matcher = pattern.matcher((String)o);
            if(telephone == null || matcher == null || !matcher.matches()){
                FacesContext context = FacesContext.getCurrentInstance();
                ResourceBundle bundle = context.getApplication().getResourceBundle(context, "msgs");
                String msgStr = bundle.getString("validatorTelephoneErrorFormat");
            
            FacesMessage message = new FacesMessage();
            message.setDetail(msgStr);
            message.setSummary(msgStr);
                message.setSeverity(FacesMessage.SEVERITY_ERROR);
                throw new ValidatorException(message); 
            }
        }
    }
    
}
