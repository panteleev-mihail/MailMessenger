/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.messenger.manbeans;

/**
 *
 * @author Mihail
 */
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import com.messenger.pojo.LetterSenderReceiver;
import com.messenger.pojo.RegistredUser;
import com.messenger.service.MailService;

@ManagedBean(name = "income")
@ViewScoped
public class IncomeBean implements Serializable {
	private RegistredUser user = null;
	private List<LetterSenderReceiver> incomeList;
	private Map<Integer, Boolean> selectedIds = new HashMap<Integer, Boolean>();

	@PostConstruct
	public void init() {
		user = ((UserBean) FacesContext.getCurrentInstance()
				.getExternalContext().getSessionMap().get("userbean"))
				.getUser();
		incomeList = getIncome(user);

	}

	public List<LetterSenderReceiver> getIncome(RegistredUser u) {
		MailService mc = new MailService();
		List<LetterSenderReceiver> res = mc.getIncome(u);
		return res;
	}

	public void toTrash() {
		// TODO: implement deleting to trash
	}

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

}