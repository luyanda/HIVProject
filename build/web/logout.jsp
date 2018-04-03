<%-- 
    Document   : logout
    Created on : 05 Nov 2013, 3:39:17 PM
    Author     : Group 3
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    if (session.getAttribute("LoggedIn") != null)
    {
        session.removeAttribute("LoggedIn");
        session.invalidate();
        RequestDispatcher rs = request.getRequestDispatcher("index.jsp");
        rs.forward(request, response);
    }
%>