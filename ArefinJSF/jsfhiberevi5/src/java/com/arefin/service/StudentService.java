/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arefin.service;

import com.arefin.entity.Student;
import com.arefin.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author user
 */
public class StudentService {
    public void saveStudent(Student s){
    SessionFactory factory = HibernateUtil.getSessionFactory();
    Session session = factory.getCurrentSession();
    Transaction transaction = session.beginTransaction();
    session.save(s);
    transaction.commit();
    } 
}
