/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apress.projsp;

/**
 *
 * @author User
 */
public class Airport {
    String code;
    String name;

    public Airport(String code, String name) {
        this.code = code;
        this.name = name;
    }

    @Override
    public String toString() {
        return code;
    }
    
    
}
