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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import com.messenger.dao.Factory;
import com.messenger.dao.beans.DAO;
import com.messenger.pojo.LetterSenderReceiver;
import com.messenger.pojo.RegistredUser;
import com.messenger.service.MailService;

@ManagedBean(name = "trash")
@ViewScoped
public class TrashBean implements Serializable {
	private List<LetterSenderReceiver> list;
	private Map<Integer, Boolean> selectedIds = new HashMap<Integer, Boolean>();

	@PostConstruct
	public void init() {
		RegistredUser user = ((UserBean) FacesContext.getCurrentInstance()
				.getExternalContext().getSessionMap().get("userbean"))
				.getUser();
		list = getTrash(user);

	}

	public List<LetterSenderReceiver> getTrash(RegistredUser u) {
		MailService mc = new MailService();
		List<LetterSenderReceiver> res = mc.getOutcome(u);
		return res;
	}

	public void toTrash() {
		List<LetterSenderReceiver>selectedDataList = new ArrayList<LetterSenderReceiver>();
        for (LetterSenderReceiver dataItem : list) {
            if (selectedIds.get(dataItem.getId()).booleanValue()) {
                selectedDataList.add(dataItem);
                selectedIds.remove(dataItem.getId()); // Reset.
            }
        }
        for (LetterSenderReceiver dataItem : selectedDataList) {
        	dataItem.setIsRecTrash(true);
        	Factory.getInstance().getLetterSenderReceiverDAO().update(dataItem);
        }
        init();
	}

	public List<LetterSenderReceiver> getList() {
		return list;
	}

	public void setList(List<LetterSenderReceiver> list) {
		this.list = list;
	}

	public Map<Integer, Boolean> getSelectedIds() {
		return selectedIds;
	}

	public void setSelectedIds(Map<Integer, Boolean> selectedIds) {
		this.selectedIds = selectedIds;
	}

}