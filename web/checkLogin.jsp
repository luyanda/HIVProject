<%-- 
    Document   : checkLogin
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
 
