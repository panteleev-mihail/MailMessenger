package com.pehulja.messenger.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.apache.log4j.Logger;


public class HibernateUtil {
    private static final Logger log = Logger.getLogger(HibernateUtil.class);
    
    private static final String PERSISTENT_UNIT_NAME = "item-manager-pu";
    private static final EntityManagerFactory emf;
    static {
        try {
            emf = Persistence.createEntityManagerFactory(PERSISTENT_UNIT_NAME);
        } catch (Throwable ex) {
            log.error("JPA:entityManagerFactory has not configurated. "+ex);
            throw new ExceptionInInitializerError(ex);
        }
        log.info("JPA:entityManagerFactory has configurated");
    }

    public static EntityManager getEm() {
        return emf.createEntityManager();
    }
}