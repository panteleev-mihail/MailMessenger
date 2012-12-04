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

import javax.annotation.PostConstruct;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import com.pehulja.messenger.service.MailService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@ManagedBean(name = "income")
@ViewScoped
public class IncomeBean implements Serializable {
	private RegistredUser user = null;
	private List<LetterSenderReceiver> incomeList;
	private Map<Integer, Boolean> selectedIds = new HashMap<Integer, Boolean>();
	/*private List<LetterSenderReceiver> outcomeList;
	private List<LetterSenderReceiver> trashList;*/
	

	@PostConstruct
	public void init() {
		user = ((UserBean) FacesContext.getCurrentInstance()
				.getExternalContext().getSessionMap().get("userbean"))
				.getUser();
		incomeList = getIncome(user);
		/*outcomeList = getOutcome(user);
		trashList = getTrash(user);*/
	}


	public List<LetterSenderReceiver> getIncome(RegistredUser u) {
		MailService mc = new MailService();
		List<LetterSenderReceiver> res = mc.getIncome(u);
		return res;
	}
	
	public void toTrash() {
		//TODO: implement deleting to trash
	}
	/*public List<LetterSenderReceiver> getOutcome(RegistredUser u) {
		MailService mc = new MailService();
		List<LetterSenderReceiver> res = mc.getOutcome(u);
		return res;
	}

	public List<LetterSenderReceiver> getTrash(RegistredUser u) {
		MailService mc = new MailService();
		List<LetterSenderReceiver> res = mc.getTrash(u);
		return res;
	}*/


	public List<LetterSenderReceiver> getIncomeList() {
		return incomeList;
	}


	public void setIncomeList(List<LetterSenderReceiver> incomeList) {
		this.incomeList = incomeList;
	}


	public Map<Integer, Boolean> getSelectedIds() {
		return selectedIds;
	}


	public void setSelectedIds(Map<Integer, Boolean> selectedIds) {
		this.selectedIds = selectedIds;
	}


	/*public List<LetterSenderReceiver> getOutcomeList() {
		return outcomeList;
	}


	public void setOutcomeList(List<LetterSenderReceiver> outcomeList) {
		this.outcomeList = outcomeList;
	}


	public List<LetterSenderReceiver> getTrashList() {
		return trashList;
	}


	public void setTrashList(List<LetterSenderReceiver> trashList) {
		this.trashList = trashList;
	}*/

}