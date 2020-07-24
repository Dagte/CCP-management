package com.ccp.config;

import com.ccp.entity.Employee;
import com.ccp.entity.Project;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class HibernateConfig {
//    public static EntityManagerFactory buildEntityManagerFactory() {
//        EntityManagerFactory entityManagerFactory =
//                Persistence.createEntityManagerFactory("org.hibernate.ccp-management");
//        return entityManagerFactory;
//    }

    public static SessionFactory buildSessionFactory(){
        try{
            final Configuration configuration = new Configuration();
            configuration.configure("hibernate.cfg.xml");
            final ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                    .applySettings(configuration.getProperties())
                    .build();
            return configuration.configure().buildSessionFactory();

        }catch (Exception ex){
            System.err.println("Initial SessionFactory Creation Failed, " + ex.getMessage());
            throw  ex;
        }
    }
}
