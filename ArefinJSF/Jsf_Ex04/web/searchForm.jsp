<%-- 
    Document   : searchForms
    Created on : Dec 17, 2018, 12:09:28 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
    <f:view>
        <head>
            <title>Freedom Airlines Online Flight Reservation System</title>
        </head>
        <body>
            <h:form>
                <h2>Search Flights</h2>
                <h:outputText value="What type of flight do you need?"/>
                <h:selectOneRadio layout="lineDirection" value="#{flight.tripType}" valueChangeListener="#{flight.typeChanged}" onclick="submit()" immediate="true">
                    <f:selectItems value="#{types.tripTypes}"/>
                </h:selectOneRadio>
                <p/>
                <table>
                    <tr><td colspan="4">Where and when do you want to travel?</td></tr>
                    <tr>
                        <td colspan="2">Leaving from: </td>
                        <td colspan="2">Going to: </td>
                    </tr>
                    <tr>
                        <td colspan="2">
                            <h:inputText id="origination" value="#{flight.origination}" size="35"/>
                            <h:message for="origination"/>
                        </td>
                        <td colspan="2">
                            <h:inputText id="destination" value="#{flight.destination}" size="35"/>
                            <h:message for="destination"/>
                        </td>
                    </tr>
                    <tr>
                        <td colspan="2">Departing: </td>
                        <td colspan="2">
                            <c:if test="${flight.tripType == 'One Way'}">
                                <!--
                            </c:if>
                            <h:outputText value="Returning:"/>
                            <c:if test="${flight.tripType == 'One Way'}">
                                -->
                            </c:if>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <h:inputText id="departDate" value="#{flight.departDate}">
                                <f:convertDateTime pattern="MM/dd/yy"/>
                                <f:validator validatorId="date.validator"/>
                            </h:inputText>
                            <h:message for="departDate"/>
                        </td>
                        <td>
                            <h:selectOneMenu value="#{flight.departTime}" id="departTimes">
                                <f:selectItems value="#{times.times}"/>
                            </h:selectOneMenu>
                        </td>
                        <td>
                            <c:if test="${flight.tripType == 'One Way'}">
                                <!--
                            </c:if>
                            <h:inputText id="returnDate" value="#{flight.returnDate}">
                                <f:convertDateTime pattern="MM/dd/yy"/>
                                <f:validator validatorId="date.validator"/>
                            </h:inputText>
                            <h:message for="returnDate"/>
                            <c:if test="${flight.tripType == 'One Way'}">
                                -->
                            </c:if>
                        </td>     
                        <td>
                            <c:if test="${flight.tripType == 'One Way'}">
                                <!--
                            </c:if>
                            <h:selectOneMenu value="#{flight.returnTime}" id="returnTimes">
                                <f:selectItems value="#{times.times}"/>
                            </h:selectOneMenu>
                            <c:if test="${flight.tripType == 'One Way'}">
                                -->
                            </c:if>  
                        </td>
                    </tr>
                </table>
                <p>
                    <h:commandButton value="Search" action="#{flight.search}"/>
                </p>
            </h:form>
        </body>
    </f:view>
</html>
