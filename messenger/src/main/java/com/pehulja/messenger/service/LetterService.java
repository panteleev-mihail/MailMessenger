/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pehulja.messenger.service;

import com.pehulja.messenger.dao.Factory;
import com.pehulja.messenger.pojo.Letter;
import com.pehulja.messenger.pojo.LetterSenderReceiver;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author I
 */
public class LetterService {
 
    public Letter showLetter(int id)
    {
        Letter letter=null;
        try {
            letter = (Letter)Factory.getInstance().getLetterDAO().getById(id, Letter.class);
        } catch (Exception ex) {
            Logger.getLogger(LetterService.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        return letter;
    }
    
    public void addLetter(Letter letter){
        try {
            Factory.getInstance().getLetterDAO().add(letter);
        } catch (Exception ex) {
            Logger.getLogger(LetterService.class.getName()).log(Level.SEVERE, null, ex);
        }
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
    
}
