/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.messenger.service;

import com.messenger.dao.Factory;
import com.messenger.pojo.LetterSenderReceiver;
import com.messenger.pojo.RegistredUser;
import java.util.List;

/**
 *
 * @author Mihail
 */
public class MailService {
    public List<LetterSenderReceiver> getIncome (RegistredUser user){
		List<LetterSenderReceiver> result = null;
                result = Factory.getInstance().getLetterSenderReceiverDAO().getIncome(user);
                return result;
	}
    public List<LetterSenderReceiver> getOutcome (RegistredUser user){
		List<LetterSenderReceiver> result = null;
                result = Factory.getInstance().getLetterSenderReceiverDAO().getOutcome(user);
                return result;
    }
    public List<LetterSenderReceiver> getTrash (RegistredUser user){
		List<LetterSenderReceiver> result = null;
                result = Factory.getInstance().getLetterSenderReceiverDAO().getTrash(user);
                return result;
	}
                
}
