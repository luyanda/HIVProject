<%-- 
    Document   : testingRegister
    Created on : Nov 21, 2013, 9:20:55 PM
    Author     : Group 3
--%>
<%@include file= "checkLogin.jsp"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="styles.css" rel="stylesheet" type="text/css"/>
        <title>HIV COUNSELLING AND TESTING REGISTER</title>
    </head>
    <body >   
        <%@include file="header.jsp" %>
        <div style="background-color: silver; color: white">
            <span><a href="nurseHome.jsp">Home</a></span>|
            <span><a href="testingRegister.jsp">Record Counseling Data</a></span>|
            <span><a href="searchPatientData.jsp">Search Patient Counseling Data</a></span>|
            <span><a href="monthlyReport.jsp">View Monthly Report</a></span>|
            <span><a href="logout.jsp">Logout</a></span>
        </div>
        <h2>HIV COUNSELLING AND TESTING REGISTER</h2>
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
    <p style="color: #b5ff5e"><%=request.getAttribute("Successmsg") == null ? "" : request.getAttribute("Successmsg")%></p>
    <form action="controller" method="POST">
        <input type="hidden" name="action" value="TestRegister">

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
                    <td><input type="text" name="number" value="" /></td>
                    <td><input type="date" name="date" value="" /></td>
                    <td><input type="text" name="name" value="" /></td>
                    <td><input type="text" name="clinic_nr" value="" /></td>
                    <td>
                        <select name="first_test">
                            <option>Yes</option>
                            <option>No</option>
                        </select>

                    </td>
                    <td><input type="text" name="age" value="" /></td>

            </tbody>
        </table>
        <table border="1" width="100%" style="background-color: white; color: black">
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

                <tr>
                    <td>
                        <select name="gender">
                            <option>Male</option>
                            <option>Female</option>
                        </select>

                    </td>
                    <td>
                        <select name="referral">
                            <option>Self</option>
                            <option>Health Worker</option>
                        </select>

                    </td>
                    <td>
                        <select name="referred_from">
                            <option> ANC</option>
                            <option>TB</option>
                            <option> STI</option>
                            <option>OI</option>
                            <option> Family Planning</option>
                            <option>Other</option>
                        </select>
                    </td>

                    <td>
                        <select name="tested">
                            <option> Pre-Test Counselled</option>
                            <option>Yes</option>
                            <option> No</option>
                            <option>Results Given</option>
                        </select>
                    </td>
                    <td>
                        <select name="screen_test">
                            <option> Non-Reactive</option>
                            <option>Reactive</option>
                            <option> Invalid</option>
                        </select>
                    </td>
                    <td>
                        <select name="confirm_test">
                            <option> Non-Reactive</option>
                            <option>Reactive</option>
                            <option> Invalid</option>
                        </select>
                    </td>

                </tr>


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
                        <select name="results">
                            <option> NEGATIVE</option>
                            <option>POSITIVE</option>
                            <option> Discount</option>
                        </select>
                    </td>
                    <td>
                        <select name="elisa">
                            <option>NEGATIVE</option>
                            <option>POSITIVE</option>
                        </select>
                    </td>
                    <td>
                        <select name="post_test_counsel">
                            <option>Yes</option>
                            <option>No</option>
                        </select>

                    </td>
                    <td>
                        <select name="on_going_counsel">
                            <option>Yes</option>
                            <option>No</option>
                        </select>

                    </td>
                    <td>
                        <select name="referrals_to">
                            <option> CD4 Cell Count</option>
                            <option>PMCTC</option>
                            <option> TB Screening</option>
                            <option>OI Management</option>
                            <option>Nutrition Support</option>
                            <option>Other</option>
                        </select>
                    </td>
                    <td>
                        <textarea name="counselling_notes" rows="4" cols="20">
                        </textarea>
                    </td>  
                </tr>
            </tbody>
        </table>
        <input type="submit" value="Submit" />
    </form>
</body>
</html>
