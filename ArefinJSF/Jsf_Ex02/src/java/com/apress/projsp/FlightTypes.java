/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apress.projsp;

import javax.faces.model.SelectItem;

/**
 *
 * @author User
 */
public class FlightTypes {

    static SelectItem[] tripTypes = new SelectItem[]{
        new SelectItem("Roundtrip", "Roundtrip"),
        new SelectItem("One way", "One way")
    };

    public SelectItem[] getTripTypes() {
        return tripTypes;
    }

    public void setTripTypes(SelectItem[] tripTypes) {
        FlightTypes.tripTypes = tripTypes;
    }
}
