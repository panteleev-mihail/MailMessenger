/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.messenger.service;

import com.messenger.dao.Factory;
import com.messenger.pojo.Letter;
import com.messenger.pojo.LetterSenderReceiver;
import com.messenger.pojo.Pojo;
import com.messenger.pojo.RegistredUser;
import java.util.List;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author I
 */
public class LetterService {
 
    public List<LetterSenderReceiver> showLetter(int id)
    {
        Letter letter = new Letter();
        List<LetterSenderReceiver> lsr = null;
        
        try {
            letter = (Letter)Factory.getInstance().getLetterDAO().getById(id, Letter.class);
        } catch (Exception ex) {
            Logger.getLogger(LetterService.class.getName()).log(Level.SEVERE, null, ex);
        }

       lsr =  Factory.getInstance().getLetterSenderReceiverDAO().getByLetter(letter);

        return lsr;
    }
    
    public boolean addLetter(Letter letter, RegistredUser sender, String receivers){
          try {
            Factory.getInstance().getLetterDAO().add(letter);
        } catch (Exception ex) {
            Logger.getLogger(LetterService.class.getName()).log(Level.SEVERE, null, ex);
        }
         
       
       RegistredUser receiver = null;

        StringTokenizer st = new StringTokenizer(receivers, ", ", false);
        while(st.hasMoreTokens()) {
            LetterSenderReceiver lsr = new LetterSenderReceiver();
            lsr.setLetter(letter);
            lsr.setSender(sender);
            try {
                receiver = (RegistredUser) Factory.getInstance().getRegistredUserDAO().getByLogin(st.nextToken());
            }
            catch (Exception ex){
                return false;
            }
            lsr.setReceiver(receiver);
            
            try {
                Factory.getInstance().getLetterSenderReceiverDAO().add(lsr);
            }
            catch (Exception ex){
                return false;
            }
            
        } 
        return true;
        
    }
    
    public Object[] getLetter(int id) {
        
        Object data[] =  new Object[2];
        
        Letter letter=null;
        try {
            letter = (Letter)Factory.getInstance().getLetterDAO().getById(id, Letter.class);
        } catch (Exception ex) {
            Logger.getLogger(LetterService.class.getName()).log(Level.SEVERE, null, ex);
        }
        data[1]=letter;
        
        LetterSenderReceiver lsr=null;
        
        
        return null;    
        
    }
    
    public void delete(LetterSenderReceiver lsr, RegistredUser user){
        if (lsr.getSender().getId()==user.getId())
            if (!lsr.isIsSenderTrash())
                lsr.setIsSenderTrash(true);
            else lsr.setIsSenderDel(true);
        else if (lsr.getReceiver().getId()==user.getId())
            if(!lsr.isIsRecTrash())
                lsr.setIsRecTrash(true);
            else lsr.setIsRecDel(true);
        
        Factory.getInstance().getLetterSenderReceiverDAO().update(lsr);
    }
    
    public void restore(LetterSenderReceiver lsr, RegistredUser user){
        if ( lsr.getSender().getId()==user.getId())
            lsr.setIsSenderTrash(false);
        else if (lsr.getReceiver().getId()==user.getId())
            lsr.setIsRecTrash(false);
        
        Factory.getInstance().getLetterSenderReceiverDAO().update(lsr);
    }
    
}
