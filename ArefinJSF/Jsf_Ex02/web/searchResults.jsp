<%-- 
    Document   : searchResults
    Created on : Dec 17, 2018, 12:24:38 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%@taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
    <%@taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
    <f:view>
        <head>
            <title>Freedom Airlines Online Flight Reservation System</title>
        </head>
        <body>
            <h3>You entered these search parameters</h3>
            <br/>Trip type: <h:outputText value="#{flight.tripType}"/>
            <br/>Origination: <h:outputText value="#{flight.origination}"/>
            <br/>Depart date: <h:outputText value="#{flight.departDate}"/>
            <br/>Depart time: <h:outputText value="#{flight.departTime}"/>
            <br/>Destination: <h:outputText value="#{flight.destination}"/>
            <br/>Return date: <h:outputText value="#{flight.returnDate}"/>
            <br/>Return time: <h:outputText value="#{flight.returnTime}"/>
            <p/>Matching Flights
            <p/><h:outputText value="#{flight.matchingFlights[0]}"/>
            <p/><h:outputText value="#{flight.matchingFlights[1]}"/>
        </body>
    </f:view>
</html>
