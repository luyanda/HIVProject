<%-- 
    Document   : monthlyReport
    Author     : Group 3
--%>
<%@include file= "checkLogin.jsp"%>
<%@page import="hrproject.TestRegister"%>
<%@page import="hrproject.DAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Monthly Report Page</title>
    </head>
    <body>
        <%@include file="header.jsp" %>
        <div style="background-color: silver; color: white">
            <span><a href="nurseHome.jsp">Home</a></span>|
            <span><a href="testingRegister.jsp">Record Counseling Data</a></span>|
            <span><a href="searchPatientData.jsp">Search Patient Counseling Data</a></span>|
            <span><a href="monthlyReport.jsp">View Monthly Report</a></span>|
            <span><a href="logout.jsp">Logout</a></span>
        </div>
        <table border="1">
            <thead>
                <tr>
                    <th>Number Of Patients who visited the clinic</th>
                    <th>Number of males who tested positive</th>
                    <th>Number of females who tested positive</th>
                </tr>
            </thead>
            <tbody>
                <%
                    DAO dao = new DAO();
                    int m = dao.postiveMale();
                    int f = dao.postiveFemale();
                    int e = dao.monthlyReport();
                %>
                <tr>
                    <td><%=e%></td>
                    <td><%=m%></td>
                    <td><%=f%></td>
                </tr>
            </tbody>
        </table>



    </body>
</html>
