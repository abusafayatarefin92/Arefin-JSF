<%-- 
    Document   : searchForm
    Created on : Jan 3, 2019, 10:16:13 AM
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
        <title>Form</title>
    </head>
    <body>
        <h3>Search Flight</h3>
        <h:form>
            Departed from: <h:inputText value="#{flight.origination}"/><br/>
            Going to: <h:inputText value="#{flight.destination}"/><br/>
            Depart Date: <h:inputText value="#{flight.departDte}"/><br/>
            Depart Time: <h:inputText value="#{flight.departTime}"/><br/>
            Return Date: <h:inputText value="#{flight.returnDate}"/><br/>
            Return Time: <h:inputText value="#{flight.returnTime}"/><br/>
            Round:
            <h:selectOneMenu value = "#{flight.round}"> 
                <f:selectItems value="#{round.round}"/> 
                
            </h:selectOneMenu> 	<br/>

<!--            Course Completed:
            <h:selectManyCheckbox value="#{flight.course}">
                <f:selectItem itemValue="ppt" itemLabel="PPT" />
                <f:selectItem itemValue="js" itemLabel="JavaScript" />
                <f:selectItem itemValue="java" itemLabel="Java" />
            </h:selectManyCheckbox><br/>-->
            Gender:   
            <h:selectOneRadio value = "#{flight.gender}"> 
                <f:selectItems value="#{gender.gender}"/> 
                
            </h:selectOneRadio>
            <h:commandButton value="Search" action="submit"/>
        </h:form>
    </body>
    </f:view>
</html>
