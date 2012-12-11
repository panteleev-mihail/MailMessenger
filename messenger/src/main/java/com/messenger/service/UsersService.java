/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.messenger.service;

import com.messenger.dao.Factory;
import com.messenger.pojo.RegistredUser;
import java.util.List;
import javax.persistence.NoResultException;

/**
 *
 * @author pehulja
 */
public class UsersService {
    public List <RegistredUser> getAllUsers(){
        return Factory.getInstance().getRegistredUserDAO().allUsers();
    }
    public List <RegistredUser> getAllUsersNotAdmin(){
        return Factory.getInstance().getRegistredUserDAO().allUsersNotAdmin();
    }
    public RegistredUser getUserNotAdmin(String login) throws NoResultException{
        return Factory.getInstance().getRegistredUserDAO().getUserNotAdmin(login);
    }
    public boolean isAdmin(RegistredUser user){
        return Factory.getInstance().getAdministratorDAO().isCurrentUserIsAdmin(user);
    }
}
