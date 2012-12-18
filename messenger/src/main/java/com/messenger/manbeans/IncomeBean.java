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
import com.messenger.service.LetterService;
import com.messenger.service.MailService;

@ManagedBean(name = "income")
@ViewScoped
public class IncomeBean extends AbstractLetterBean implements Serializable {

	@PostConstruct
	public void init() {
		RegistredUser user = ((MaskUser) FacesContext.getCurrentInstance()
				.getExternalContext().getSessionMap().get("maskbean"))
				.getUser();
		MailService mc = new MailService();
		list = mc.getIncome(user);

	}
}