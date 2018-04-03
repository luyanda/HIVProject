<%-- 
    Document   : view
    Created on : Nov 10, 2013, 5:38:25 PM
    Author     : Group 3
--%>
<%@include file= "checkLogin.jsp"%>
<%@page import="hrproject.Nurse"%>
<%@page import="hrproject.User"%>
<%@page import="java.util.ArrayList"%>
<%@page import="hrproject.DAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="registration.css" rel="stylesheet" type="text/css"/>
        <title>Nurse List</title>
    </head>
    <body>
        <%@include file="header.jsp" %>
        <div style="background-color: silver; color: white">
            <span><a href="view.jsp">Home</a></span> |    
            <span><a href="addNurse.jsp">Add Nurse</a></span> |
            <span><a href="Search.jsp">Search User</a></span> |
            <span><a href="logout.jsp">Logout</a></span>
        </div>
        <hr><h2>&raquo;Nurse List</h2>
        <p style="color: #b5ff5e"><%=request.getAttribute("Successmsg") == null ? "" : request.getAttribute("Successmsg")%></p>
        <hr><table border="2" width="100%">
            <thead>
                <tr>
                    <th>Staff Number:</th>
                    <th>First Name:</th>
                    <th>Last Name:</th>
                    <th>Gender:</th>
                    <th>Age:</th>
                    <th>ID</th>
                    <th>Address:</th>
                    <th>Contact number:</th>
                    <th>Email Address:</th>
                    <th>User Name:</th>
                    <th>Password:</th>
                    <th>Edit</th>
                    <th>Delete</th>
                </tr>
            </thead>
            <tbody>
                <%
                    DAO dao = new DAO();
                    ArrayList<Nurse> list = dao.listAllNurses();
                    for (Nurse e : list)
                    {
                %>
                <tr>
                    <td><%=e.getStaffNo()%></td> 
                    <td><%=e.getFirstName()%></td>
                    <td><%=e.getLastName()%></td>
                    <td><%=e.getGender()%></td>
                    <td><%=e.getAge()%></td>
                    <td><%=e.getIdNumber()%></td>
                    <td><%=e.getAddress()%></td>
                    <td><%=e.getCellNumber()%></td>
                    <td><%=e.getEmailAddress()%></td>
                    <td><%=e.getUserName()%></td>
                    <td><%=e.getPassword()%></td>

                    <td><a href="editNurse.jsp?id=<%=e.getStaffNo()%>">Edit</td>
                    <td><a href="DeleteStaff?id=<%=e.getStaffNo()%>">Delete</td>
                </tr>
                <%}%>
            </tbody>
        </table><br>
        <hr>
        <h2>&raquo;Patient List</h2>

        <p style="color: #b5ff5e"><%=request.getAttribute("Successmesg") == null ? "" : request.getAttribute("Successmesg")%></p>
        <hr><table border="2" width="100%">
            <thead>
                <tr>
                    <th>Patient Number:</th>
                    <th>First Name:</th>
                    <th>Last Name:</th>
                    <th>Gender:</th>
                    <th>Age:</th>
                    <th>ID</th>
                    <th>Address:</th>
                    <th>Contact number:</th>
                    <th>Email Address:</th>
                    <th>User Name:</th>
                    <th>Password:</th>
                    <th>Delete</th>
                </tr>
            </thead>
            <tbody>
                <%
                    DAO d = new DAO();
                    ArrayList<User> listP = d.listAllPatients();
                    for (User e : listP)
                    {
                %>
                <tr>
                    <td><%=e.getNumber()%></td> 
                    <td><%=e.getFirstName()%></td>
                    <td><%=e.getLastName()%></td>
                    <td><%=e.getGender()%></td>
                    <td><%=e.getAge()%></td>
                    <td><%=e.getIdNumber()%></td>
                    <td><%=e.getAddress()%></td>
                    <td><%=e.getCellNumber()%></td>
                    <td><%=e.getEmailAddress()%></td>
                    <td><%=e.getUserName()%></td>
                    <td><%=e.getPassword()%></td>
                    <td><a href="DeletePatient?patientNo=<%=e.getNumber()%>">Delete</td>
                </tr>
                <%}%>
            </tbody>
        </table>
    </body>
</html>
