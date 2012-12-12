/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.messenger.manbeans;

import com.messenger.pojo.Letter;
import com.messenger.pojo.RegistredUser;
import com.messenger.service.ContactService;
import com.messenger.service.LetterService;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;

/**
 *
 * @author I
 */
@ManagedBean (name = "letterWriteBean")
@SessionScoped
public class LetterWriteBean implements Serializable{
    
    private RegistredUser user;
    private String receiverEmail;
    private String subject;
    private String content;
    private String msg;

    private LetterService ls;
    
    
    //////
    private List<RegistredUser> listContacts;
    private List<RegistredUser> receivers;
    private ContactService mc;
    private Map<Integer, Boolean> checked = new HashMap<Integer, Boolean>();
    //////
    
    @PostConstruct
    public void init() {
        user = ((MaskUser)FacesContext.getCurrentInstance() 
			.getExternalContext().getSessionMap().get("maskbean")).getUser();
        confContacts(user);
        receivers = new ArrayList<RegistredUser>();

    }
    public void confContacts(RegistredUser u) {
        mc = new ContactService();
        listContacts = mc.getContact(u);
    }
    
    public void addUsersToReceivers(){
        StringBuilder builder = new StringBuilder();
        if(receiverEmail!=null){
            builder.append(receiverEmail);
        }
        for (RegistredUser item : listContacts) {
            if (checked.get(item.getId())) {
                boolean contains = false;
                for(RegistredUser item2 : receivers){
                    if(item.equals(item2)){
                        contains = true;
                    }
                }
                if(!contains){
                    receivers.add(item);
                    builder.append(item.getLogin()+", ");
                }
            }
        }
        receiverEmail = builder.toString();
        checked.clear(); // If necessary.
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
    
    
    public RegistredUser getUser() {
        return user;
    }

    public void setUser(RegistredUser user) {
        this.user = user;
    }

    public String getReceiverEmail() {
        return receiverEmail;
    }

    public void setReceiverEmail(String receiver) {
        this.receiverEmail = receiver;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    
    
     public List<RegistredUser> getListContacts() {
        return listContacts;
    }

    public void setListContacts(List<RegistredUser> list) {
        this.listContacts = list;
    }

    public List<RegistredUser> getReceivers() {
        return receivers;
    }

    public void setReceivers(List<RegistredUser> receivers) {
        this.receivers = receivers;
    }

    public Map<Integer, Boolean> getChecked() {
        return checked;
    }

    public void setChecked(Map<Integer, Boolean> checked) {
        this.checked = checked;
    }
    
    private void clear(){
        
        this.receiverEmail="";
        this.subject="";
        this.content="";
        this.msg="";
    }
    public String send(){
        
        Letter temp=new Letter();
        temp.setTheme(this.subject);
        temp.setContent(this.content);
     
        ls= new LetterService();
        
        boolean result = ls.addLetter(temp,this.user,this.receiverEmail);
        
        if (result){
            clear();
        return "account";
        }
        else {
                      
            FacesContext context = FacesContext.getCurrentInstance();
            ResourceBundle bundle = context.getApplication().getResourceBundle(context, "msgs");
            String msgStr = bundle.getString("LetterError");

            this.msg=msgStr;
            return "letterWrite";
        }
        
    }
    
}
