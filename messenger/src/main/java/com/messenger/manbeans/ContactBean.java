/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.messenger.manbeans;

/**
 *
 * @author Mihail
 */
import com.messenger.dao.beans.ContactDAO;
import com.messenger.pojo.Contact;
import com.messenger.pojo.LetterSenderReceiver;
import com.messenger.pojo.RegistredUser;
import com.messenger.service.ContactService;
import com.messenger.service.MailService;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;
import javax.persistence.NoResultException;
@ManagedBean(name="contact")
@ViewScoped
public class ContactBean implements Serializable{
 
    private static final long serialVersionUID = 1L;
 	private List<RegistredUser> list;
        private RegistredUser item = new RegistredUser();
        private boolean edit;
        private ContactService mc;
        private RegistredUser user = null;
        private String tempLogin = null;
        private UIComponent addContactButton;
        
    @PostConstruct
    public void init() {
        user = ((UserBean)FacesContext.getCurrentInstance() 
			.getExternalContext().getSessionMap().get("userbean")).getUser();
        confContacts(user);
    }
    public void add() throws ValidatorException{
        // dao.create(item);
        // Actually, the DAO should already have set the ID from DB. This is just for demo.
        //item.setLogin( list.isEmpty() ? "" : list.get(list.size() - 1).getLogin() + 1);
        try{
            mc.addContact(tempLogin, user);
            tempLogin = "";
            confContacts(user);
        }catch(NoResultException ex){
             FacesContext context = FacesContext.getCurrentInstance();
             ResourceBundle bundle = context.getApplication().getResourceBundle(context, "msgs");
             String msgStr = bundle.getString("loginLoginError");
                        
            FacesMessage message = new FacesMessage(msgStr);
            context.addMessage(addContactButton.getClientId(context), message);
        }
        item = new RegistredUser(); // Reset placeholder.
    }

    public void edit(RegistredUser item) {
        this.item = item;
        edit = true;
    }

    public void save() {
        this.delete(item);
        System.err.println(item.getLogin());
        this.add();
        item = new RegistredUser(); // Reset placeholder.
        edit = false;
    }

    public void delete(RegistredUser item) {
        mc.deleteContact(user, item);
        list.remove(item);
    }

    public List<RegistredUser> getList() {
        return list;
    }

    public RegistredUser getItem() {
        return item;
    }

    public boolean isEdit() {
        return edit;
    }
    
    public void confContacts(RegistredUser u) {
        mc = new ContactService();
        list = mc.getContact(u);
    }    

    public String getTempLogin() {
        return tempLogin;
    }

    public void setTempLogin(String tempLogin) {
        this.tempLogin = tempLogin;
    }

    public UIComponent getAddContactButton() {
        return addContactButton;
    }

    public void setAddContactButton(UIComponent addContactButton) {
        this.addContactButton = addContactButton;
    }
    
    
    
}