/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arefin.calendar;

import java.util.Date;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author user
 */
@ManagedBean
public class CalendarController {
    private Date date;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
    public void save(){
        System.out.println("Date: " + date);
    }
}
