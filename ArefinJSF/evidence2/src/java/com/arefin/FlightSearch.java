/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arefin;

/**
 *
 * @author user
 */
public class FlightSearch {
    String origination;
    String destination;
    String departDte;
    String departTime;
    String returnDate;
    String returnTime;
    String round;
    //List<Object> course;
    String gender;

    public String getRound() {
        return round;
    }

    public void setRound(String round) {
        this.round = round;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

//    public List<Object> getCourse() {
//        return course;
//    }
//
//    public void setCourse(List<Object> course) {
//        this.course = course;
//    } 

    public String getOrigination() {
        return origination;
    }

    public void setOrigination(String origination) {
        this.origination = origination;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDepartDte() {
        return departDte;
    }

    public void setDepartDte(String departDte) {
        this.departDte = departDte;
    }

    public String getDepartTime() {
        return departTime;
    }

    public void setDepartTime(String departTime) {
        this.departTime = departTime;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    public String getReturnTime() {
        return returnTime;
    }

    public void setReturnTime(String returnTime) {
        this.returnTime = returnTime;
    }
    
    
}
