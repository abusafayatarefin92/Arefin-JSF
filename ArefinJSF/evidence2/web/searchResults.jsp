<%-- 
    Document   : searchResults
    Created on : Jan 3, 2019, 10:23:49 AM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%@taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
    <%@taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
    <f:view>
        <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Result</title>
    </head>
    <body>
        <h3>Flight Search Result</h3>
        
        Departed from: <h:outputText value="#{flight.origination}"/><br/>
            Going to: <h:outputText value="#{flight.destination}"/><br/>
            Depart Date: <h:outputText value="#{flight.departDte}"/><br/>
            Depart Time: <h:outputText value="#{flight.departTime}"/><br/>
            Return Date: <h:outputText value="#{flight.returnDate}"/><br/>
            Return Time: <h:outputText value="#{flight.returnTime}"/><br/>
            Round: <h:outputText value="#{flight.round}"/><br/>
<!--            Course Completed: <h:outputText value="#{flight.course}"/><br/>-->
            Gender: <h:outputText value="#{flight.gender}"/><br/>
        
    </body>
    </f:view>
</html>
