/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arefin.bean;

import com.arefin.entity.Student;
import com.arefin.service.StudentService;
import java.util.ArrayList;
import java.util.List;
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
    private Student student;
    private String[] completedCourse;
    private List<Student> list;

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

    public List<Student> getList() {
        list = new ArrayList<>();
        list = service.getList();
        return list;
    }

    public void setList(List<Student> list) {
        this.list = list;
    }
    
    public void save(){
        String cc = "";
        for (String s : completedCourse) {
            cc += s + ", ";
        }
        student.setCourses(cc);
        service.saveStudent(student);
    }
    
    public void update(){
        service.updateStudent(student);
    }
    
    public void delete(){
        service.deleteStudent(student);
    }

    public StudentService getService() {
        return service;
    }

    public void setService(StudentService service) {
        this.service = service;
    }
    
    
}
