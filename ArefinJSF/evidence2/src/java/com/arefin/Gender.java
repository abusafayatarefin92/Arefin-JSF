/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arefin;

import javax.faces.model.SelectItem;

/**
 *
 * @author user
 */
public class Gender {

    static SelectItem[] gender = new SelectItem[]{
        new SelectItem("Male", "Male"),
        new SelectItem("Female", "Female")
    };

    public static SelectItem[] getGender() {
        return gender;
    }

    public static void setGender(SelectItem[] gender) {
        Gender.gender = gender;
    }

}
