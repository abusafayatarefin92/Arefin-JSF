/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arefin.editor;

import javax.faces.bean.ManagedBean;

/**
 *
 * @author user
 */
@ManagedBean
public class EditorController {
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    
    public void save(){
        System.out.println("Slider: " + text);
    }
}
