/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arefin.service;

import com.arefin.entity.Student;
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

    public void saveStudent(Student student) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        Transaction t = session.beginTransaction();
        session.save(student);
        t.commit();
    }

    public void updateStudent(Student student) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        Transaction t = session.beginTransaction();
        session.saveOrUpdate(student);
        t.commit();
    }

    public void deleteStudent(Student student) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        Transaction t = session.beginTransaction();
        session.delete(student);
        t.commit();
    }
    @Transactional
    public List<Student> getList() {
        List<Student> list = new ArrayList<>();
        try {
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            Session session = sessionFactory.getCurrentSession();
            Transaction t = session.beginTransaction();
            list = session.createQuery("FROM Student").list();
            t.commit();
        } catch (Exception e) {
            System.out.println("Something went wrong");
        }
        return list;
    }
    
    /*
    public void login(String username, String password){
        User user = service.findByUsernameAndPassword(username,password);
        if(user != null){
            login ok
        }else{
            
        }
    }
    
    */
}
