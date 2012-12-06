/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pehulja.messenger.manbeans;

import com.pehulja.messenger.pojo.Letter;
import com.pehulja.messenger.pojo.RegistredUser;
import com.pehulja.messenger.service.ContactService;
import com.pehulja.messenger.service.LetterService;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

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

    private LetterService ls;
    
    
    //////
    private List<RegistredUser> listContacts;
    private List<RegistredUser> receivers;
    private ContactService mc;
    private Map<Integer, Boolean> checked = new HashMap<Integer, Boolean>();
    //////
    
    @PostConstruct
    public void init() {
        user = ((UserBean)FacesContext.getCurrentInstance() 
			.getExternalContext().getSessionMap().get("userbean")).getUser();
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
    }
    public String send(){
        
        Letter temp=new Letter();
        temp.setTheme(this.subject);
        temp.setContent(this.content);
     
        ls= new LetterService();
        ls.addLetter(temp,this.user,this.receiverEmail);
        clear();
        return "account";
    }
    
}
