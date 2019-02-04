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
    private String[] course;
    
    public void save(){
        String c = "";
        
        for(String s : course){
            c += s + ", ";
        }
        student.setCourses(c);
        
        StudentService service = new StudentService();
        service.saveStudent(student);
        System.out.println("Item inserted");
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

    public String[] getCourse() {
        return course;
    }

    public void setCourse(String[] course) {
        this.course = course;
    }
    
    
}
