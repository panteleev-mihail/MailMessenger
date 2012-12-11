/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.messenger.manbeans;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;

/**
 *
 * @author pehulja
 */
@ManagedBean(name = "localeBean")
@SessionScoped
public class LocaleBean implements Serializable{
    private static Map<String,Locale> locales;
    private String localeCode;
    static {
        locales = new LinkedHashMap<String, Locale>();
        locales.put("ru", new Locale("ru"));
        locales.put("en", Locale.ENGLISH);
    }

    public Map<String, Locale> getLocales() {
        return locales;
    }

    public void setLocales(Map<String, Locale> locales) {
        LocaleBean.locales = locales;
    }

    public String getLocaleCode() {
        return localeCode;
    }

    public void setLocaleCode(String localeCode) {
        this.localeCode = localeCode;
    }
    
    public void localeListener(ValueChangeEvent ev){
        String newLocaleValue = ev.getNewValue().toString();
        System.out.println(newLocaleValue + " " + locales.get(newLocaleValue));
        FacesContext.getCurrentInstance().getViewRoot().setLocale(locales.get(newLocaleValue));
    }
}
