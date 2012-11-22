/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pehulja.messenger.manbeans;

/**
 *
 * @author Mihail
 */
import com.pehulja.messenger.pojo.LetterSenderReceiver;
import com.pehulja.messenger.pojo.RegistredUser;
import java.io.Serializable;
import java.math.BigDecimal;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.pehulja.messenger.service.MailService;
import java.util.ArrayList;
import java.util.List;
@ManagedBean(name="mail")
@SessionScoped
public class MailBean implements Serializable{
 
	private static final long serialVersionUID = 1L;
 
	private static List<LetterSenderReceiver> list;
                
        public List<LetterSenderReceiver> getIncome(RegistredUser u) {
                MailService mc = new MailService();
                List<LetterSenderReceiver> res = mc.getIncome(u);
		list = res;
                return list;
	}
        public List<LetterSenderReceiver> getOutcome(RegistredUser u) {
                MailService mc = new MailService();
                List<LetterSenderReceiver> res = mc.getOutcome(u);
		list = res;
                return list;
	}
        public List<LetterSenderReceiver> getTrash(RegistredUser u) {
                MailService mc = new MailService();
                List<LetterSenderReceiver> res = mc.getTrash(u);
		list = res;
                return list;
	}
}