/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apress.projsp;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;

/**
 *
 * @author User
 */
public class FlightSearch {

    String flightNum;
    Airport origination;
    Airport destination;
    String departDate;
    String departTime;
    String returnDate;
    String returnTime;
    String tripType;
    ArrayList matchingFlights = new ArrayList();
    Flight matchingFlight;

    public FlightSearch() {
        setTripType("Roundtrip");
    }

    public void typeChanged(ValueChangeEvent event) {
        if ("Roundtrip".equals(event.getNewValue().toString())) {
            setTripType("Roundtrip");
        } else {
            setTripType("One Way");
        }
        FacesContext.getCurrentInstance().renderResponse();
    }

    public String reset() {
        this.setDepartDate("");
        this.setDepartTime("");
        this.setDestination(null);
        this.setOrigination(null);
        this.setReturnDate("");
        this.setReturnTime("");
        this.setTripType("");
        return "success";
    }

    public String search() {
        if (origination.code.equals("BOS") && destination.code.equals("ORD")) {
            return "success";
        } else {
            return "no flights";
        }
    }

    public String select() {
        FacesContext context = FacesContext.getCurrentInstance();
        Map requestParams = context.getExternalContext().getRequestParameterMap();
        flightNum = (String) requestParams.get("flightNum");
        return "select";
    }

    public String getFlightNum() {
        return flightNum;
    }

    public void setFlightNum(String flightNum) {
        this.flightNum = flightNum;
    }

    public Flight getMatchingFlight() {
        for (int i = 0; i < matchingFlights.size(); i++) {
            matchingFlight = (Flight) matchingFlights.get(i);

            if (matchingFlight.flightNum.equals(flightNum)) {
                break;
            }

            matchingFlight = null;
        }
        return matchingFlight;
    }

    public void setMatchingFlight(Flight matchingFlight) {
        this.matchingFlight = matchingFlight;
    }

    public String getTripType() {
        return tripType;
    }

    public void setTripType(String tripType) {
        this.tripType = tripType;
    }

    public ArrayList getMatchingFlights() {
        return matchingFlights;
    }

    public void setMatchingFlights(List matchingFlights) {
        this.matchingFlights.addAll(matchingFlights);
    }

    public Airport getOrigination() {
        return origination;
    }

    public void setOrigination(Airport origination) {
        this.origination = origination;
        ((Flight) matchingFlights.get(0)).setOrigination(origination);
        ((Flight) matchingFlights.get(1)).setOrigination(origination);
    }

    public Airport getDestination() {
        return destination;
    }

    public void setDestination(Airport destination) {
        this.destination = destination;
        ((Flight) matchingFlights.get(0)).setDestination(destination);
        ((Flight) matchingFlights.get(1)).setDestination(destination);
        ((Flight) matchingFlights.get(0)).setFlightNum("133");
        ((Flight) matchingFlights.get(1)).setFlightNum("233");
    }

    public String getDepartDate() {
        return departDate;
    }

    public void setDepartDate(String departDate) {
        this.departDate = departDate;
        ((Flight) matchingFlights.get(0)).setDepartDate(departDate);
        ((Flight) matchingFlights.get(1)).setDepartDate(departDate);
    }

    public String getDepartTime() {
        return departTime;
    }

    public void setDepartTime(String departTime) {
        this.departTime = departTime;
        ((Flight) matchingFlights.get(0)).setDepartTime(departTime);
        ((Flight) matchingFlights.get(1)).setDepartTime(departTime);
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
        ((Flight) matchingFlights.get(0)).setReturnDate(returnDate);
        ((Flight) matchingFlights.get(1)).setReturnDate(returnDate);
    }

    public String getReturnTime() {
        return returnTime;
    }

    public void setReturnTime(String returnTime) {
        this.returnTime = returnTime;
        ((Flight) matchingFlights.get(0)).setReturnTime(returnTime);
        ((Flight) matchingFlights.get(1)).setReturnTime(returnTime);
    }
}
