<%-- 
    Document   : SearchNurse
    Author     : Group 3
--%>
<%@include file= "checkLogin.jsp"%>
<%@page import="hrproject.User"%>
<%@page import="hrproject.Nurse"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <<head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="registration.css" rel="stylesheet" type="text/css"/>
        <title>Nurse List</title>
    </head>
    <body>
        <%@include file="header.jsp" %>
        <div style="background-color: silver; color: white">
            <span><a href="view.jsp">Home</a></span> | 
            <span><a href="view.jsp">View Users</a></span> |  
            <span><a href="addNurse.jsp">Add Nurse</a></span> |
            <span><a href="Search.jsp">Search User</a></span> |
            <span><a href="logout.jsp">Logout</a></span>
        </div>
        <hr><h2>&raquo;Search Nurse</h2>
        <%
            if (request.getAttribute("errors") != null)
            {
                ArrayList<String> errors = (ArrayList<String>) request.getAttribute("errors");
                String str = "";
                for (String e : errors)
                {
                    str = e.toString();

        %>
        <table>
            <tr><span style="color:red"><%=str%></span></tr> 
    </table>

    <% }
           }%>
    <p>Enter Search Term:</p>
    <form action="controller" method="POST">
        <input type="hidden" name="action" value="SearchUser">
        <input type="search" name="search" value=""  placeholder="Search Team" required size="60"/>
        <input type="submit" value="Search" />
    </form>  
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
                if (request.getAttribute("searchResults") != null)
                {
                    ArrayList<User> staffList = (ArrayList<User>) request.getAttribute("searchResults");
                    //check if stafflist is not empty
                    if (!staffList.isEmpty())
                    {

                        for (User e : staffList)
                        {
                            if (e.getCategory().equals("Nurse"))
                                {%>
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

                <td><a href="editNurse.jsp?id=<%=e.getNumber()%>">Edit</td>
                <td><a href="DeleteStaff?id=<%=e.getNumber()%>">Delete</td>
            </tr>
            <%}
                }//close for
            } //close inner if
            else
            { //no records
            %> 
            <tr>
                <td colspan="5"> 
                    <p style="color: red">          
                        No Records matched search criteria.
                    </p> 
                </td>
            </tr>
            <%}//close else
        //close outer if
                }
            %>

        </tbody>
    </table>
    <hr><h2>&raquo;Search Patient</h2>
    <p>Enter Search Term:</p>
    <form action="controller" method="POST">
        <input type="hidden" name="action" value="SearchUser">
        <input type="search" name="search" value=""  placeholder="Search Team" required size="60"/>
        <input type="submit" value="Search" />
    </form>  
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
                if (request.getAttribute("searchResults") != null)
                {
                    ArrayList<User> patientList = (ArrayList<User>) request.getAttribute("searchResults");
                    //check if stafflist is not empty
                    if (!patientList.isEmpty())
                    {

                        for (User e : patientList)
                        {
                            if (e.getCategory().equals("Patient"))
                                {%>
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
            <%}
                }//close for
            } //close inner if
            else
            { //no records
            %> 
            <tr>
                <td colspan="5"> 
                    <p style="color: red">          
                        No Records matched search criteria.
                    </p> 
                </td>
            </tr>
            <%}//close else
        //close outer if
                }
            %>

        </tbody>
    </table>
</body>
</html>
