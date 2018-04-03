<%-- 
    Document   : addNurse
    Created on : Nov 10, 2013, 4:54:04 PM
    Author     : Group 3
--%>
<%@include file= "checkLogin.jsp"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="registration.css" rel="stylesheet" type="text/css"/>
        <title>Registration</title>
    </head>
    <body>

        <%@include file="header.jsp" %>
        <div style="background-color: silver; color: white">
            <span><a href="view.jsp">View Users</a></span> |
            <span><a href="addNurse.jsp">Add Nurse</a></span> |
            <span><a href="Search.jsp">Search User</a></span> |
            <span><a href="logout.jsp">Logout</a></span>
        </div>

        <%
            if (request.getAttribute("errorList") != null)
            {
                ArrayList<String> errors = (ArrayList<String>) request.getAttribute("errorList");
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

    <form action="controller" method="POST">
        <input type="hidden" name="action" value="addNurseServlet">
        <div id="regform_content">
            <table>


                <tr>
                    <td>Name :</td>
                    <td><input type="text" name="name"  size ="30" /></td>
                </tr>

                <tr>
                    <td>Surname :</td>
                    <td><input type="text" name="surname"  size ="30" /></td>
                </tr>


                <tr>
                    <td>Gender:</td>   
                    <td>
                        <select name="gender">
                            <option> Male</option>
                            <option>Female</option>
                        </select>
                    </td>
                </tr>

                <tr>
                    <td>Age :</td>
                    <td><input type="text" name="age"  size ="30" /></td>
                </tr>

                <tr>
                    <td>National Id/Passport :</td>
                    <td><input type="text" name="national_id"  size ="30" /></td>
                </tr>

                <tr>   
                    <td>Address :</td>
                    <td><input type="text" name="address" size ="30" /></td>
                </tr>

                <tr>   
                    <td>Cell Number :</td>
                    <td><input type="text" name="cellNumber" size ="30" /></td>
                </tr>

                <tr>
                    <td>Email Address :</td>
                    <td><input type="text" name="email"  size ="30" /></td>
                </tr>

                <tr>
                    <td>Create User Name :</td>
                    <td><input type="text" name="username"  size ="30" /></td>
                </tr>

                <tr>
                    <td>Create Password :</td>
                    <td><input type="password" name="password" size ="30"  /></td>
                </tr>
                <tr><td><input type="submit" value="Register" /></td></tr>
            </table>
        </div>
        <div id="regform_move">
            <h1>Add Nurse &raquo;&raquo;&raquo;</h1>
        </div>

    </form>
</body>
</html>
