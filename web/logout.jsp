<%-- 
    Document   : logout
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
