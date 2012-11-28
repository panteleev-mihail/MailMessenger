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
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;

/**
 *
 * @author I
 */
@ManagedBean(name="letterBean")
@ViewScoped
public class LetterBean implements Serializable{
    
    Letter letter;
    
    private String receiverEmail;
    private String senderEmail;
    private String content;
    private String subject;
    
    private UIComponent replyButton;
    private UIComponent deleteButton;
    private UIComponent restoreButton;
    
    //////
    private List<RegistredUser> listContacts;
    private List<RegistredUser> receivers;
    private RegistredUser user = null;
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
            if (checked.get(item.get_id())) {
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
    
    public UIComponent getReplyButton() {
        return replyButton;
    }

    public void setReplyButton(UIComponent replyButton) {
        this.replyButton = replyButton;
    }

    public UIComponent getDeleteButton() {
        return deleteButton;
    }

    public void setDeleteButton(UIComponent deleteButton) {
        this.deleteButton = deleteButton;
    }

    public UIComponent getRestoreButton() {
        return restoreButton;
    }

    public void setRestoreButton(UIComponent restoreButton) {
        this.restoreButton = restoreButton;
    }
    
    public String getReceiverEmail() {
        return receiverEmail;
    }

    public void setReceiverEmail(String receiverEmail) {
        this.receiverEmail = receiverEmail;
    }

    
    public String getSenderEmail() {
        return senderEmail;
    }

    public void setSenderEmail(String senderEmail) {
        this.senderEmail = senderEmail;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String context) {
        this.content = context;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
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
            
    public String showLetter(int id)
    {
        LetterService ls= new LetterService();
        this.letter = ls.showLetter(id);
        this.content=letter.get_content();
        this.receiverEmail="NULL"; // Заменить
        this.senderEmail="NULL"; // Заменить
        this.subject=letter.get_theme();
        
        
        
        return "letterView";
    }
    
    public String newLetter() {
    
        clear();
        return "letterWrite";
    }
    public String reply(){
        
        this.subject="Re: "+this.subject;
        String temp=this.senderEmail;
        this.senderEmail=this.receiverEmail;
        this.receiverEmail=temp;
        this.content="";
       
        
        return "letterWrite";
       }
    
    public String delete(){
        
        return "letters";
    }
    
    public String restore(){
        
        
        return "letters";
    }
    
    public String send(){
        
        Letter temp=new Letter();
       // temp.set_receiverEmail(this.receiverEmail); // Заменить
       // temp.set_senderEmail(this.senderEmail); // 
        temp.set_theme(this.subject);
        temp.set_content(this.content);
        
        LetterService ls= new LetterService();
        ls.addLetter(temp);
        clear();
        return "letters";
    }
    
    private void clear(){
        this.content="";
        this.letter=null;
        this.receiverEmail="";
        this.senderEmail="";
        this.subject="";
        
    }
}
