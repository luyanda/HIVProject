<%-- 
    Document   : checkLogin
    Created on : 08 Nov 2013, 10:21:30 AM
    Author     : Group 3
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
//place this on top of every page yuu want protected
    if(session.getAttribute("LoggedIn")==null){
        request.setAttribute("sessionError", "You must be logged.");
    
%>
<jsp:forward page="index.jsp"/>
<%}%>
 