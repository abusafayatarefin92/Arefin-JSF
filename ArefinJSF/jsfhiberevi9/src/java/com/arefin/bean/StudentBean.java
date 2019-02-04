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
 * @author user
 */
@ManagedBean
@ViewScoped
public class StudentBean {

    StudentService service = new StudentService();
    private Student student;
    private String[] completedCourses;
    private List<Student> list;

    public Student getStudent() {
        if (student == null) {
            student = new Student();
        }
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String[] getCompletedCourses() {
        return completedCourses;
    }

    public void setCompletedCourses(String[] completedCourses) {
        this.completedCourses = completedCourses;
    }

    public void save() {
        String cc = "";

        for (String s : completedCourses) {
            cc += s + ", ";
        }
        student.setCourses(cc);

        service.saveStudent(student);
    }

    public List<Student> getList() {
        list = new ArrayList<>();
        list = service.getList();
        return list;
    }

    public void setList(List<Student> list) {
        this.list = list;
    }

}
