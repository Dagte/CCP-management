package com.ccp;

import com.ccp.config.HibernateConfig;
import com.ccp.entity.Employee;
import com.ccp.entity.Project;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class App {
    public static void main(String[] args) {
//        final EntityManagerFactory entityManagerFactory = HibernateConfig.buildEntityManagerFactory();
//        final EntityManager entityManager = entityManagerFactory.createEntityManager();
/*        entityManager.getTransaction().begin();
        entityManager.persist(employee);
        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();
 */
        final SessionFactory sessionFactory = HibernateConfig.buildSessionFactory();
        final Session session = sessionFactory.openSession();

        Project project = Project.builder().name("Estonia National Opera House").duration(18).income(50000).build();
        Employee employee = Employee.builder()
                .name("Ramón")
                .surname("Ramirez").project(project)
                .build();

        session.beginTransaction();
        session.save(project);
        session.save(employee);
        System.out.println(employee.toString() + " inserted successfully");
        session.getTransaction().commit();
        session.close();
        sessionFactory.close();

    }
}
