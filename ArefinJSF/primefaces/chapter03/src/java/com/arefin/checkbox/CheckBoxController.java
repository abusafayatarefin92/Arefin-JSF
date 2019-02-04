/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arefin.checkbox;

import java.util.Arrays;
import java.util.List;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author user
 */
@ManagedBean
public class CheckBoxController {
    private boolean selectedValue;
    private List<String> selectedCountries;

    public boolean isSelectedValue() {
        return selectedValue;
    }

    public void setSelectedValue(boolean selectedValue) {
        this.selectedValue = selectedValue;
    }

    public List<String> getSelectedCountries() {
        return selectedCountries;
    }

    public void setSelectedCountries(List<String> selectedCountries) {
        this.selectedCountries = selectedCountries;
    }

    public void saveMulti(){
        System.out.println(Arrays.toString(selectedCountries.toArray()));
    }
    
    public void save(){
        System.out.println("Selected Value: " + selectedValue);
    }
}
