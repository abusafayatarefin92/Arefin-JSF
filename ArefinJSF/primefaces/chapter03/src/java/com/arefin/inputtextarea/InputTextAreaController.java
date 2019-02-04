/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arefin.inputtextarea;

import javax.faces.bean.ManagedBean;

/**
 *
 * @author user
 */
@ManagedBean
public class InputTextAreaController {

    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void save() {
        System.out.println("Text Area: " + value);
    }
}
