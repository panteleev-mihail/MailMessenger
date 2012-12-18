package com.messenger.manbeans;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.faces.context.FacesContext;

import com.messenger.pojo.LetterSenderReceiver;
import com.messenger.pojo.RegistredUser;
import com.messenger.service.LetterService;

public abstract class AbstractLetterBean {
	protected List<LetterSenderReceiver> list;
	protected Map<Integer, Boolean> selectedIds = new HashMap<Integer, Boolean>();
	
	public abstract void init();
	
	public void toTrash() {
		List<LetterSenderReceiver> selectedDataList = new ArrayList<LetterSenderReceiver>();
		RegistredUser user = ((MaskUser) FacesContext.getCurrentInstance()
				.getExternalContext().getSessionMap().get("maskbean"))
				.getUser();
		LetterService ls = new LetterService();
		for (LetterSenderReceiver dataItem : list) {
			if (selectedIds.get(dataItem.getId()).booleanValue()) {
				selectedDataList.add(dataItem);
				selectedIds.remove(dataItem.getId()); // Reset.
			}
		}
		for (LetterSenderReceiver dataItem : selectedDataList) {
			ls.delete(dataItem, user);
		}
		init();
	}

	public void restore() {
		List<LetterSenderReceiver> selectedDataList = new ArrayList<LetterSenderReceiver>();
		RegistredUser user = ((MaskUser) FacesContext.getCurrentInstance()
				.getExternalContext().getSessionMap().get("maskbean"))
				.getUser();
		LetterService ls = new LetterService();
		for (LetterSenderReceiver dataItem : list) {
			if (selectedIds.get(dataItem.getId()).booleanValue()) {
				selectedDataList.add(dataItem);
				selectedIds.remove(dataItem.getId()); // Reset.
			}
		}
		for (LetterSenderReceiver dataItem : selectedDataList) {
			ls.restore(dataItem, user);
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
