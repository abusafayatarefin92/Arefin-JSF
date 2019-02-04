/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arefin.slider;

import javax.faces.bean.ManagedBean;

/**
 *
 * @author user
 */
@ManagedBean
public class Slidercontroller {
    private int intValue;

    public int getIntValue() {
        return intValue;
    }

    public void setIntValue(int intValue) {
        this.intValue = intValue;
    }
    
    public void save(){
        System.out.println("Slider: " + intValue);
    }
}
