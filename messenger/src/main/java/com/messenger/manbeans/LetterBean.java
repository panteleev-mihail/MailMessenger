/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.messenger.manbeans;


import com.messenger.pojo.Letter;
import com.messenger.pojo.LetterSenderReceiver;
import com.messenger.service.LetterService;

import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UICommand;
import javax.faces.context.FacesContext;

/**
 *
 * @author I
 */
@ManagedBean(name="letterBean")
@SessionScoped
public class LetterBean implements Serializable{
    
    Letter letter;
    
    private String receiverEmail="";
    private String senderEmail="";
    private String content="";
    private String subject="";
    
    
    private LetterService ls;
    
    private UICommand replyButton;
    private UICommand deleteButton;
    private UICommand restoreButton;
    
    @ManagedProperty(value="#{letterWriteBean}")
    private LetterWriteBean letterWriteBean;
    
  
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

    public LetterWriteBean getLetterWriteBean() {
        return letterWriteBean;
    }

    public void setLetterWriteBean(LetterWriteBean letterWriteBean) {
        this.letterWriteBean = letterWriteBean;
    }

   
            
    public String showLetter(int id)
    {
        ls= new LetterService();
        List<LetterSenderReceiver> lsr = ls.showLetter(id);
        this.letter = lsr.get(0).getLetter();
        this.content=letter.getContent();
        this.subject=letter.getTheme();
        this.senderEmail=lsr.get(0).getSender().getLogin();
        this.receiverEmail="";
        for(LetterSenderReceiver temp:lsr)
            this.receiverEmail+=temp.getReceiver().getLogin()+", ";
       
        /*FacesContext context = FacesContext.getCurrentInstance();
        this.deleteButton=context.getViewRoot().findComponent("letterViewForm:dBtn");
        this.replyButton=context.getViewRoot().findComponent("letterViewForm:rBtn");
        this.restoreButton=context.getViewRoot().findComponent("letterViewForm:rsBtn"); */
        //System.out.println(this.deleteButton.getId());
 
        return "letterView";
    }
    
    public String newLetter() {
    

        return "letterWrite";
    }
    public String reply(){

               

        letterWriteBean.setReceiverEmail(this.senderEmail);
        letterWriteBean.setSubject("Re: "+this.subject);
        /* lb = (LetterBean) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("bean");
        
        
        this.senderEmail=this.user.getLogin();
        this.receiverEmail = lb.getSenderEmail();
        this.subject="Re: "+lb.getSubject();
        */
        return "letterWrite";
        
       }
    
    public String delete(){
        
        return "letters";
    }
    
    public String restore(){
        
        
        return "letters";
    }
    
    

    
}
