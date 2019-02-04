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
            <p>Origination: <h:outputText value="#{flight.origination}"/>
            <p>Depart date: <h:outputText value="#{flight.departDate}"/>
            <p>Depart time: <h:outputText value="#{flight.departTime}"/>
            <p>Destination: <h:outputText value="#{flight.destination}"/>
            <p>Return date: <h:outputText value="#{flight.returnDate}"/>
            <p>Return time: <h:outputText value="#{flight.returnTime}"/>
            
        </body>
    </f:view>
</html>
