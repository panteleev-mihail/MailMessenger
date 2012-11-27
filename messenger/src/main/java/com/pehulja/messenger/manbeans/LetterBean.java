/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pehulja.messenger.manbeans;

import com.pehulja.messenger.pojo.Letter;
import com.pehulja.messenger.service.LetterService;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIComponent;

/**
 *
 * @author I
 */
@ManagedBean
@SessionScoped
public class LetterBean implements Serializable{
    
    Letter letter;
    
    private String receiverEmail;
    private String senderEmail;
    private String content;
    private String subject;
    
    private UIComponent replyButton;
    private UIComponent deleteButton;
    private UIComponent restoreButton;

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
