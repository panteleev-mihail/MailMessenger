/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.messenger.manbeans;

import com.messenger.pojo.RegistredUser;
import com.messenger.service.UsersService;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.ResourceBundle;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.event.ValueChangeEvent;
import javax.faces.model.SelectItem;
import javax.persistence.NoResultException;
import org.jboss.logging.MessageBundle;

/**
 *
 * @author pehulja
 */
@ManagedBean(name = "adminBean")
@SessionScoped
public class AdminControlBean implements Serializable {

    private String login;
    private boolean masked = false;
    private String noSuchUser = "";

    public AdminControlBean() {
        FacesContext context = FacesContext.getCurrentInstance();
        ResourceBundle bundle = context.getApplication().getResourceBundle(context, "msgs");
        noSuchUser = bundle.getString("errorNoSuchUser");

    }
    @ManagedProperty(value = "#{maskbean}")
    private MaskUser maskUser;
    @ManagedProperty(value = "#{userbean}")
    private UserBean userBean;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public MaskUser getMaskUser() {
        return maskUser;
    }

    public void setMaskUser(MaskUser maskUser) {
        this.maskUser = maskUser;
    }

    public UserBean getUserBean() {
        return userBean;
    }

    public void setUserBean(UserBean userBean) {
        this.userBean = userBean;
    }

    public boolean isMasked() {
        return masked;
    }

    public void setMasked(boolean masked) {
        this.masked = masked;
    }

    public String maskAsUser() {
        if (login != null && login != "") {
            UsersService service = new UsersService();
            RegistredUser user;
            try {
                user = service.getUserNotAdmin(login);
            } catch (NoResultException ex) {
                login = "";
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(noSuchUser));
                return "account";
            }
            if (user == null) {
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(noSuchUser));
            } else {
                maskUser.setUser(user);
                masked = true;
            }
        }
        return "account";
    }

    public String unmask() {
        masked = false;
        maskUser.setUser(userBean.getUser());
        login = "";
        return "account";
    }

    public String getNoSuchUser() {
        return noSuchUser;
    }

    public void setNoSuchUser(String noSuchUser) {
        this.noSuchUser = noSuchUser;
    }
}
