package com.pehulja.messenger.dao.beans;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.hibernate.Session;

import com.pehulja.messenger.pojo.LetterSenderReceiver;
import com.pehulja.messenger.dao.HibernateUtil;
import com.pehulja.messenger.pojo.RegistredUser;
import javax.persistence.EntityManager;

public class LetterSenderReceiverDAO extends DAO{
    public List<LetterSenderReceiver> getIncome(RegistredUser user){
            List<LetterSenderReceiver> result = null;
            EntityManager manager = HibernateUtil.getEm();
            try{
                
            result = manager.createQuery("SELECT lsr FROM LetterSenderReceiver lsr WHERE lsr._Receiver=:id "
                    + "AND lsr._isRecTrash =:_isRecTrash")
                                     .setParameter("id", user).setParameter("_isRecTrash", false).getResultList();
            }
            catch(javax.persistence.NoResultException e){
                
            }
            finally{
                manager.close();
            }
            return result;
        }
    public List<LetterSenderReceiver> getOutcome(RegistredUser user){
            List<LetterSenderReceiver> result = null;
            EntityManager manager = HibernateUtil.getEm();
            try{
            result = manager.createQuery("SELECT lsr FROM LetterSenderReceiver lsr WHERE lsr._Sender=:id "
                    + "AND lsr._isSenderTrash =:_isSenderTrash")
                                     .setParameter("id", user).setParameter("_isSenderTrash", false).getResultList();
            }
            catch(javax.persistence.NoResultException e){
                
            }
            finally{
                manager.close();
            }
            return result;
        }
    public List<LetterSenderReceiver> getTrash(RegistredUser user){
            List<LetterSenderReceiver> result = null;
            EntityManager manager = HibernateUtil.getEm();
            try{
            result = manager.createQuery("SELECT lsr FROM LetterSenderReceiver lsr WHERE (lsr._Receiver=:id " 
                    + "AND lsr._isRecTrash =:_isRecTrash) OR (lsr._Sender=:id AND lsr._isSenderTrash =:_isSenderTrash)")
                                     .setParameter("id", user).setParameter("_isRecTrash", true).setParameter("_isSenderTrash", true).getResultList();
            }
            catch(javax.persistence.NoResultException e){
                
            }
            finally{
                manager.close();
            }
            return result;
        }
}
