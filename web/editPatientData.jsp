<%-- 
    Document   : editPatientData
    Created on : Nov 23, 2013, 3:40:57 PM
    Author     : Group 3
--%>
<%@include file= "checkLogin.jsp"%>
<%@page import="java.util.ArrayList"%>
<%@page import="hrproject.TestRegister"%>
<%@page import="hrproject.DAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update Counseling Data</title>
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
                TestRegister e = dao.searchByPatientNo(request.getParameter("id"));
        %>
        <form action="controller" method="POST">
            <input type="hidden" name="action" value="UpdateTestRegister">

            <table border="1" width="100%" style="background-color: white; color: black">
                <thead>
                    <tr>
                        <th>Patient Number</th>
                        <th>Date</th>
                        <th>First Name Surname:</th>
                        <th>Clinic Nr</th>
                        <th>First Ever Test</th>
                        <th> Age in years</th>


                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td><input type="text" name="number" value="<%=e.getNumber()%>" readonly /></td>
                        <td><input type="date" name="date" value="<%=e.getDate()%>" /></td>
                        <td><input type="text" name="name" value="<%=e.getFirstname_sname()%>" /></td>
                        <td><input type="text" name="clinic_nr" value="<%=e.getClinic_nr()%>" /></td>

                        <td>
                            <select name="first_test" value="<%=e.getFirst_test()%> ">
                                <option>Yes</option>
                                <option>No</option>
                            </select>

                        </td>
                        <td><input type="text" name="age" value="<%=e.getAge()%>" /></td>

                </tbody>
            </table>
            <table  border="1" width="100%" style="background-color: white; color: black">
                <thead>
                    <tr>
                        <th>Gender</th>
                        <th>Referral:</th>
                        <th>Referred From</th>
                        <th>Tested</th>
                        <th>Screening Test</th>
                        <th>Confirmatory Test</th>

                    </tr>

                </thead>
                <tbody>
                <td>
                    <select  name="gender" value="<%=e.getGender()%>">
                        <option>Male</option>
                        <option>Female</option>
                    </select>

                </td>

                <td>
                    <select  name="referral"  value="<%=e.getReferral()%>">
                        <option>Self</option>
                        <option>Health Worker</option>
                    </select>

                </td>
                <td>
                    <select  name="referred_from" value="<%=e.getReferred_fro()%>">
                        <option> ANC</option>
                        <option>TB</option>
                        <option> STI</option>
                        <option>OI</option>
                        <option> Family Planning</option>
                        <option>Other</option>
                    </select>
                </td>

                <td>
                    <select  name="tested"  value="<%=e.getTested()%>">
                        <option> Pre-Test Counselled</option>
                        <option>Yes</option>
                        <option> No</option>
                        <option>Results Given</option>
                    </select>
                </td>
                <td>
                    <select name="screen_test" value="<%=e.getSreening()%>">
                        <option> Non-Reactive</option>
                        <option>Reactive</option>
                        <option> Invalid</option>
                    </select>
                </td>
                <td>
                    <select name="confirm_test" value="<%=e.getSreening()%>">
                        <option> Non-Reactive</option>
                        <option>Reactive</option>
                        <option> Invalid</option>
                    </select>
                </td>

                </tbody>

            </table>
            <table border="1" width="100%" style="background-color: white; color: black">
                <thead>
                    <tr>

                        <th>Results</th>
                        <th>ELISA</th>
                        <th>Post-test Counselled</th>
                        <th>On-going Counselling</th>
                        <th>Referrals to</th>
                        <th>Counselling Note</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>

                        <td>
                            <select name="results" value="<%=e.getResults()%>">
                                <option> NEGATIVE</option>
                                <option>POSITIVE</option>
                                <option> Discount</option>
                            </select>
                        </td>
                        <td>
                            <select name="elisa" value="<%=e.getElisa()%>">
                                <option>NEGATIVE</option>
                                <option>POSITIVE</option>
                            </select>
                        </td>
                        <td>
                            <select name="post_test_counsel" value="<%=e.getPost_test()%>">
                                <option>Yes</option>
                                <option>No</option>
                            </select>

                        </td>
                        <td>
                            <select name="on_going_counsel" value="<%=e.getOngoing_test()%>">
                                <option>Yes</option>
                                <option>No</option>
                            </select>

                        </td>
                        <td>
                            <select name="referrals_to" value="<%=e.getReferrals_to()%>">
                                <option> CD4 Cell Count</option>
                                <option>PMCTC</option>
                                <option> TB Screening</option>
                                <option>OI Management</option>
                                <option>Nutrition Support</option>
                                <option>Other</option>
                            </select>
                        </td>
                        <td>
                            <input type="text"name="counselling_notes" rows="4" cols="20" value="<%=e.getNotes()%>"/>

                        </td>  

                    </tr>
                </tbody>
            </table>
            <input type="submit" value="Update Data" />
        </form>
        <%} else
                out.println("<h3>Patient specified does not exit <a href='javascript:history.back()'>|||BACK</h3>");
        %>
    </body>
</html>
