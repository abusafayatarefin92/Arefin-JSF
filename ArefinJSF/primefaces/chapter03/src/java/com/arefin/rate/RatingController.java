/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arefin.rate;

import com.sun.faces.util.MessageUtils;
import javax.faces.bean.ManagedBean;
import org.primefaces.event.RateEvent;

/**
 *
 * @author user
 */
@ManagedBean
public class RatingController {
    private String rate;

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }
    
    public void save() {
        System.out.println("Rate: " + rate);
    }

}
