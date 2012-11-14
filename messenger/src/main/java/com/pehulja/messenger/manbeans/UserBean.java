/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pehulja.messenger.manbeans;

import com.pehulja.messenger.pojo.RegistredUser;
import com.pehulja.messenger.dao.Factory;
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
 */
@ManagedBean (name = "userbean")
@SessionScoped
public class UserBean implements Serializable{
    private String login;
    private String password;
    private RegistredUser user;
    private UIComponent loginButton;
    private String loginStatus;
    @ManagedProperty(value="#{regbean}")
    private RegBean regBean;
    
    public UserBean() {
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

    public RegistredUser getUser() {
        return user;
    }

    public void setUser(RegistredUser user) {
        this.user = user;
    }

    public UIComponent getLoginButton() {
        return loginButton;
    }

    public void setLoginButton(UIComponent loginButton) {
        this.loginButton = loginButton;
    }

    public RegBean getRegBean() {
        return regBean;
    }

    public void setRegBean(RegBean regBean) {
        this.regBean = regBean;
    }
       
    public String loginUser() throws ValidatorException{
        
        user = Factory.getInstance().getRegistredUserDAO().loginUser(login, password);
         if(user == null){
             FacesContext context = FacesContext.getCurrentInstance();
             ResourceBundle bundle = context.getApplication().getResourceBundle(context, "msgs");
             String msgStr = bundle.getString("loginLoginError");
                        
            FacesMessage message = new FacesMessage(msgStr);
            context.addMessage(loginButton.getClientId(context), message); 
            return null;
         }else{
            regBean.setUser(user);
            return "account";
        }
    }
    
    public String logout (){
        user = null;
        return "login";
    }

    public String getLoginStatus() {
        if(user == null){
            try {
           FacesContext.getCurrentInstance().getExternalContext().redirect("loginPage.xhtml");
        } catch (IOException ex) {
            Logger.getLogger(UserBean.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            return loginStatus;
        }
        }
        return loginStatus;
    }

    public void setLoginStatus(String loginStatus) {
        this.loginStatus = loginStatus;
    }
        
    
}
