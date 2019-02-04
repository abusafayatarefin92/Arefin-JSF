<%-- 
    Document   : noFlights
    Created on : Dec 18, 2018, 11:34:33 AM
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
        <h3>Search Results</h3>
        <h:form>
            <p/>No flights that match your search parameters were found.
            <p/><h:commandButton value="New Search" action="#{flight.reset}"/>
        </h:form>
    </body>
    </f:view>
</html>
