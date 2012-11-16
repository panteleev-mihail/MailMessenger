/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pehulja.messenger.service;

import com.pehulja.messenger.dao.Factory;
import com.pehulja.messenger.pojo.RegistredUser;

/**
 *
 * @author pehulja
 */
public class UpdateService {
    private RegistredUser user;

    public UpdateService(RegistredUser user) {
        this.user = user;
    }
    /*public boolean update() throws Exception{
         Factory.getInstance().getRegistredUserDAO().updateUser(user);
         return true;
    }*/
}
