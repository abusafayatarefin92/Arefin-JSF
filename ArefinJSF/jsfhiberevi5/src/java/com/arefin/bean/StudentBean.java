/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arefin.bean;

import com.arefin.entity.Student;
import com.arefin.service.StudentService;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author user
 */
@ManagedBean
@ViewScoped
public class StudentBean {
    private Student student;
    private String[] c;
    
    public void saveStu(){
        String cc = "";
        
        for(String s : c){
            cc += s + ", ";
        }
        student.setCourses(cc);
        
        StudentService service = new StudentService();
        service.saveStudent(student);
    }

    public Student getStudent() {
        if(student == null){
            student = new Student();
        }
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String[] getC() {
        return c;
    }

    public void setC(String[] c) {
        this.c = c;
    }
    
    
}
