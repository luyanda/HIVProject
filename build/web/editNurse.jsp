<%@include file= "checkLogin.jsp"%>
<%@page import="hrproject.Nurse"%>
<%@page import="hrproject.DAO"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="registration.css" rel="stylesheet" type="text/css"/>
        <title>Edit Nurse</title>
    </head>
    <body>

        <%@include file="header.jsp" %>
        <div style="background-color: silver; color: white">
            <span><a href="view.jsp">Home</a></span> |    
            <span><a href="addNurse.jsp">Add Nurse</a></span> |
            <span><a href="Search.jsp">Search User</a></span> |
            <span><a href="logout.jsp">Logout</a></span>
        </div>
        <h1>Updating Nurse</h1>
        <ul>
            <%
                if (request.getAttribute("errorsList") != null)
                {
                    ArrayList<String> list = (ArrayList<String>) request.getAttribute("errorsList");
                    for (String e : list)
                    {
            %>
            <li style="color: red"><%=e%></li>
                <%}
            }%>
        </ul>
        <%
            if (request.getParameter("id") != null)
            {
                DAO dao = new DAO();
                Nurse e = dao.searchByNumber(request.getParameter("id"));
        %>
        <form action="controller" method="POST">
            <input type="hidden" name="action" value="UpdateNurse">
            <div id="regform_content">
                <table>
                    <tr>
                        <td>Nurse Number :</td>
                        <td><input type="text" name="num"  size ="30" value="<%=e.getStaffNo()%>" readonly /></td>
                    </tr>
                    <tr>
                        <td>Name :</td>
                        <td><input type="text" name="name"  size ="30" value="<%=e.getFirstName()%>" /></td>
                    </tr>

                    <tr>
                        <td>Surname :</td>
                        <td><input type="text" name="surname"  size ="30" value="<%=e.getLastName()%>" /></td>
                    </tr>


                    <tr>
                        <td>Gender:</td>   
                        <td>
                            <select name="gender" value="<%=e.getGender()%>">
                                <option> Male</option>
                                <option>Female</option>
                            </select>
                        </td>
                    </tr>

                    <tr>
                        <td>Age :</td>
                        <td><input type="text" name="age"  size ="30" value="<%=e.getAge()%>" /></td>
                    </tr>

                    <tr>
                        <td>National Id/Passport :</td>
                        <td><input type="text" name="national_id"  size ="30" value="<%=e.getIdNumber()%>"/></td>
                    </tr>

                    <tr>   
                        <td>Address :</td>
                        <td><input type="text" name="address" size ="30" value="<%=e.getAddress()%>" /></td>
                    </tr>

                    <tr>   
                        <td>Cell Number :</td>
                        <td><input type="text" name="cellNumber" size ="30" value="<%=e.getCellNumber()%>" /></td>
                    </tr>

                    <tr>
                        <td>Email Address :</td>
                        <td><input type="text" name="email"  size ="30" value="<%=e.getEmailAddress()%>"/></td>
                    </tr>

                    <tr>
                        <td>User Name :</td>
                        <td><input type="text" name="username"  size ="30" value="<%=e.getUserName()%>" /></td>
                    </tr>

                    <tr>
                        <td>Password :</td>
                        <td><input type="text" name="password" size ="30"  value="<%=e.getPassword()%>"/></td>
                    </tr>
                    <tr><td><input type="submit" value="Update" /></td></tr>
                </table>

            </div>

        </form>       
        <div id="regform_move">
            <h1>Update Nurse &raquo;&raquo;&raquo;</h1>
        </div>


        <%} else
                out.println("<h3>Nurse specified does not exit <a href='javascript:history.back()'>|||BACK</h3>");
        %>



    </body>
</html>
