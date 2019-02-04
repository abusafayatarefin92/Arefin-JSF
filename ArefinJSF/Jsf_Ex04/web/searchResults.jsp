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
            <h3>Select a flight</h3>
            <h:form>
                <p/><h:outputText value="#{flight.matchingFlights[0]}"/>
                <h:commandLink action="#{flight.select}" value="Select this flight">
                    <f:param name="flightNum" value="#{flight.matchingFlights[0].flightNum}"/>
                </h:commandLink>
                <p/><h:outputText value="#{flight.matchingFlights[1]}"/>
                <h:commandLink action="#{flight.select}" value="Select this flight">
                    <f:param name="flightNum" value="#{flight.matchingFlights[1].flightNum}"/>
                </h:commandLink>
                <p/>
                <h:commandButton value="New Search" action="#{flight.reset}"/>
            </h:form>
        </body>
    </f:view>
</html>
