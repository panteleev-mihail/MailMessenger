/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.messenger.service;

import com.messenger.dao.Factory;
import com.messenger.pojo.RegistredUser;

/**
 *
 * @author pehulja
 */
//Типа бизнесс слой приложения
public class UpdateService {
    private RegistredUser user;

    public UpdateService(RegistredUser user) {
        this.user = user;
    }
    public boolean update() throws Exception{
         Factory.getInstance().getRegistredUserDAO().update(user);
         return true;
    }
}
