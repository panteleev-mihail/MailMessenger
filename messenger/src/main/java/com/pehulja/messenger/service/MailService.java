/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pehulja.messenger.service;

import com.pehulja.messenger.dao.Factory;
import com.pehulja.messenger.pojo.LetterSenderReceiver;
import com.pehulja.messenger.pojo.RegistredUser;
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
