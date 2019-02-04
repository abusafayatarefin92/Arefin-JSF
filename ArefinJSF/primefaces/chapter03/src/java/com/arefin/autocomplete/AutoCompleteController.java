/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arefin.autocomplete;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author user
 */
@ManagedBean
public class AutoCompleteController {
    private String txt1;
    private List<String> selectedTexts;

    public String getTxt1() {
        return txt1;
    }

    public void setTxt1(String txt1) {
        this.txt1 = txt1;
    }
    
    public List<String> complete(String input){
        List<String> result = new ArrayList<>();
        
        for(int i = 0; i < 10; i++){
            result.add(input + i);
        }
        
        return result;
    }
    
    public void save(){
        System.out.println("Text: " + txt1);
    }

    public List<String> getSelectedTexts() {
        return selectedTexts;
    }

    public void setSelectedTexts(List<String> selectedTexts) {
        this.selectedTexts = selectedTexts;
    }
    
    public void saveMulti(){
        System.out.println(Arrays.toString(selectedTexts.toArray()));
    }
}
