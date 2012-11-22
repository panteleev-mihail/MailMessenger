/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pehulja.messenger.pojo;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author pehulja
 */
@ManagedBean(name = "tempbean")
@SessionScoped
public class TempBean extends Pojo implements java.io.Serializable{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TempBean() {
        
    }
    public String check(){
        return "next1";
    }
    
}
