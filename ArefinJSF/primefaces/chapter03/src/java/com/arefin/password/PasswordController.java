/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arefin.password;

import javax.faces.bean.ManagedBean;

/**
 *
 * @author user
 */
@ManagedBean
public class PasswordController {
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public void save() {
        System.out.println("Password: " + password);
    }
}
