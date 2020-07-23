package com.ccp.config;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class HibernateConfig {
    public static EntityManagerFactory buildEntityManagerFactory() {
        EntityManagerFactory entityManagerFactory =
                Persistence.createEntityManagerFactory("org.hibernate.ccp-management");
        return entityManagerFactory;
    }
}
