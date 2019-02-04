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
 * @author User
 */
@ManagedBean
@ViewScoped
public class StudentBean {
    StudentService service = new StudentService();
    String cc = "";
    private Student student;
    private String[] completedCourse;

    public void saveStu(){    
        for(String s : completedCourse){
            cc += s + ", ";
        }
        student.setCompletedCourse(cc);
        
        service.saveStudent(student);
        
    }
    
    public void edit(){
        for(String s : completedCourse){
            cc += s + ", ";
        }
        student.setCompletedCourse(cc);
        
        service.editStudent(student);
    }
    
    public void delete(){
        for(String s : completedCourse){
            cc += s + ", ";
        }
        student.setCompletedCourse(cc);
        
        service.deleteStudent(student);
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

    public String[] getCompletedCourse() {
        return completedCourse;
    }

    public void setCompletedCourse(String[] completedCourse) {
        this.completedCourse = completedCourse;
    }
    
    
}
