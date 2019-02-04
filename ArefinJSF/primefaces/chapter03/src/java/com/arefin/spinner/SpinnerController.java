/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arefin.spinner;

import javax.faces.bean.ManagedBean;

/**
 *
 * @author user
 */
@ManagedBean
public class SpinnerController {
    private int intValue;
    private double doubleValue;

    public int getIntValue() {
        return intValue;
    }

    public void setIntValue(int intValue) {
        this.intValue = intValue;
    }

    public double getDoubleValue() {
        return doubleValue;
    }

    public void setDoubleValue(double doubleValue) {
        this.doubleValue = doubleValue;
    }
    
    public void save(){
        System.out.println("Integer Value: " + intValue + "Double value: " + doubleValue);
    }
}
