/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arefin.bean;

import com.arefin.entity.Students;
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
    private StudentService service = new StudentService();
    private Students students;
    private List<Students> list;
    private String[] courseCompleted;
    
    public void save(){
        String cc = "";
        
        for(String s : courseCompleted){
            cc += s + ", ";
        }
        students.setCompletedCourse(cc);
        service.saveOrUpdate(students);
    }
    
    public void edit(){
        service.saveOrUpdate(students);
    }
    
    public void delete(){
        service.delete(students);
    }
    
    public Students searchById(){
        Students s = new Students();
        s = service.getById(students.getId());
        return s;
    }

    public StudentService getService() {
        return service;
    }

    public void setService(StudentService service) {
        this.service = service;
    }

    public Students getStudents() {
        if(students == null){
         students = new Students();
        }
        return students;
    }

    public void setStudents(Students students) {
        this.students = students;
    }

    public List<Students> getList() {
        list = new ArrayList<>();
        list = service.getList();
        return list;
    }

    public void setList(List<Students> list) {
        this.list = list;
    }

    public String[] getCourseCompleted() {
        return courseCompleted;
    }

    public void setCourseCompleted(String[] courseCompleted) {
        this.courseCompleted = courseCompleted;
    }
    
    
}
