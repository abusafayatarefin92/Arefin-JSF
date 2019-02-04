<%-- 
    Document   : selectedFlight
    Created on : Dec 18, 2018, 11:30:11 AM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%@taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
    <%@taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
    <f:view>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <title>Freedom Airlines Online Flight Reservation System</title>
        </head>
        <body>
            <h3>Flight Reservation</h3>
            <h:form>
                <p/>You selected this flight:
                <p/><h:outputText value="#{flight.matchingFlight}"/>
                <p/><h:commandButton value="New Search" action="#{flight.reset}"/>
            </h:form>
        </body>
    </f:view>
</html>
