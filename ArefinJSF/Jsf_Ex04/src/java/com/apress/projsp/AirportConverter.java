/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apress.projsp;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;

/**
 *
 * @author User
 */
public class AirportConverter implements Converter {

    @Override
    public Object getAsObject(FacesContext ctxt, UIComponent comp, String value) {
        Airport airport = null;
        if ("BOS".equalsIgnoreCase(value)) {
            airport = new Airport("BOS", "Logan International Airport");
        }

        if ("ORD".equalsIgnoreCase(value)) {
            airport = new Airport("ORD", "O'Hare International Airport");
        }

        if (airport == null) {
            FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, "UnrecognizedAirportCode", "Airport code " + value + " is not recognized");
            throw new ConverterException(message);
        }

        return airport;
    }

    @Override
    public String getAsString(FacesContext ctxt, UIComponent comp, Object obj) {
        if (obj != null) {
            return obj.toString();
        }

        return "";
    }

}
