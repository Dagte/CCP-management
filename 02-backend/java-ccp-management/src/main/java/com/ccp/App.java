package com.ccp;

import com.ccp.config.HibernateConfig;
import com.ccp.entity.Employee;
import com.ccp.entity.Project;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class App {
    public static void main(String[] args) {
        final EntityManagerFactory entityManagerFactory = HibernateConfig.buildEntityManagerFactory();

        final EntityManager entityManager = entityManagerFactory.createEntityManager();
//        Project project = Project.builder().name("Estonia National Opera House").duration(18).income(50000).build();
//        Employee employee = Employee.builder()
//                .name("Ramón")
//                .surname("Ramirez").project(project)
//                .build();

        entityManager.getTransaction().begin();
//        entityManager.persist(employee);
        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();
    }
}
