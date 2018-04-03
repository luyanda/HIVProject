<%-- 
    Document   : patient_page
    Author     : Group 3
--%>
<%@include file= "checkLogin.jsp"%>
<%@page import="hrproject.Nurse"%>
<%@page import="hrproject.TestRegister"%>
<%@page import="java.sql.*"%>
<%@page import="hrproject.User"%>
<%@page import="hrproject.DAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Patient Profile</title>
    </head>
    <body>
        <%@include file="header.jsp" %>
        <div style="background-color: silver; color: white">
            <% User pp = (User) session.getAttribute("LoggedIn");%> 
            <span><a href="patientHome.jsp">Home</a></span>|
            <span><a href="patientDetails.jsp?id=<%=pp.getNumber()%>">Profile details</a></span>|
            <span><a href="getPatient?id=<%=pp.getNumber()%>">View Counseling Data</a></span>|
            <span><a href="editPatient.jsp?id=<%=pp.getNumber()%>">Update Profile</a></span>|
            <span><a href="logout.jsp">Logout</a></span>|
        </div>
        <%
            if (request.getParameter("id") != null)
            {
                DAO dao = new DAO();
                User e = dao.searchDataByNumber(request.getParameter("id"));
        %>
        <br>
        <table>
            <tr>
                <td>Patient Number:</td>   
                <td>
                    <%=e.getNumber()%>
                </td>
            </tr>
            <tr>
                <td>Name :</td>
                <td><%=e.getFirstName()%></td>
            </tr>

            <tr>
                <td>Surname :</td>
                <td><%=e.getLastName()%></td>
            </tr>

            <tr>
                <td>Gender:</td>  
                <td>
                    <%=e.getGender()%>
                </td>
            </tr>

            <tr>
                <td>Age :</td>
                <td><%=e.getAge()%></td>
            </tr>

            <tr>
                <td>National Id/Passport :</td>
                <td><%=e.getIdNumber()%></td>
            </tr>

            <tr>   
                <td>Address :</td>
                <td><%=e.getAddress()%></td>
            </tr>

            <tr>   
                <td>Cell Number :</td>
                <td><%=e.getCellNumber()%></td>
            </tr>

            <tr>
                <td>Email Address :</td>
                <td><%=e.getEmailAddress()%></td>
            </tr>

            <tr>
                <td> User Name :</td>
                <td><%=e.getUserName()%></td>
            </tr>

            <tr>
                <td> Password :</td>
                <td><%=e.getPassword()%></td>
            </tr>
        </table>
        <%} else
                out.println("<h3>Patient specified does not exit <a href='javascript:history.back()'>|||BACK</h3>");
        %>
        <%@include file="footer.jsp" %>
    </body>
</html>
