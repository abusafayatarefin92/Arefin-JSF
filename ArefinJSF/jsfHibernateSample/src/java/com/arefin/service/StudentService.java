/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arefin.service;

import com.arefin.entity.Students;
import com.arefin.util.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import javax.transaction.Transactional;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author User
 */
public class StudentService {

    public static void saveOrUpdate(Students students) {
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(students);
        System.out.println("Success");
        transaction.commit();
    }

    public static void delete(Students students) {
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        session.delete(students);
        System.out.println("Delete Success");
        transaction.commit();
    }

    @Transactional
    public static Students getById(int id) {
        Students students = new Students();
        try {
            SessionFactory factory = HibernateUtil.getSessionFactory();
            Session session = factory.getCurrentSession();
            Transaction transaction = session.beginTransaction();
            students = (Students) session.get(Students.class, id);
            transaction.commit();
        } catch (Exception e) {
            System.out.println("Something went wrong");
        }
        return students;
    }

    @Transactional
    public static List<Students> getList() {
        List<Students> students = new ArrayList<>();
        try {
            SessionFactory factory = HibernateUtil.getSessionFactory();
            Session session = factory.getCurrentSession();
            Transaction transaction = session.beginTransaction();
            students = session.createQuery("FROM Students").list();
            transaction.commit();
        } catch (Exception e) {
            System.out.println("Something went wrong");
        }
        return students;
    }
}
