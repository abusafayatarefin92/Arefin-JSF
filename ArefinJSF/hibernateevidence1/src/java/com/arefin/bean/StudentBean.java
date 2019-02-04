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
    private String[] courseCompleted;

    public Student getStudent() {
        if(student == null){
            student = new Student();
        }
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String[] getCourseCompleted() {
        return courseCompleted;
    }

    public void setCourseCompleted(String[] courseCompleted) {
        this.courseCompleted = courseCompleted;
    }
    
    public void saveStudent(){
        String cc = "";
        
        for(String s : courseCompleted){
            cc += s + ", ";
        }
        
        student.setCompletedCourse(cc);
        
        StudentService service = new StudentService();
        service.saveStudent(student);
        System.out.println("Insert Success");
    }
}
