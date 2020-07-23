package com.ccp;

import com.ccp.config.HibernateConfig;
import com.ccp.entity.Employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class App {
    public static void main(String[] args) {
        final EntityManagerFactory entityManagerFactory = HibernateConfig.buildEntityManagerFactory();

        final EntityManager entityManager = entityManagerFactory.createEntityManager();
        Employee employee = Employee.builder()
                .name("Ramón")
                .surname("Ramirez")
                .build();

        entityManager.getTransaction().begin();
        entityManager.persist(employee);
        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();
    }
}
