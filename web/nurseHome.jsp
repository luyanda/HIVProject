<%-- 
    Document   : nurseHome
    Author     : Group 3
--%>
<%@include file= "checkLogin.jsp"%>
<%@page import="hrproject.TestRegister"%>
<%@page import="java.util.ArrayList"%>
<%@page import="hrproject.DAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Nurse Home</title>
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
        <h1>Patients counseling data</h1>
        <p style="color: #b5ff5e"><%=request.getAttribute("Successmsg") == null ? "" : request.getAttribute("Successmsg")%></p>
        <table border="1" width="1700" >
            <thead>
                <tr>
                    <th>Patient Number</th>
                    <th>Date</th>
                    <th>First Name Surname:</th>
                    <th>Clinic Nr</th>
                    <th>First Ever Test</th>
                    <th> Age in years</th>
                    <th>Gender</th>
                    <th>Referral:</th>
                    <th>Referred From</th>
                    <th>Tested</th>
                    <th>Screening Test</th>
                    <th>Confirmatory Test</th>
                    <th>Results</th>
                    <th>ELISA</th>
                    <th>Post-test Counselled</th>
                    <th>On-going Counselling</th>
                    <th>Referrals to</th>
                    <th>Counselling Note</th>
                    <th>Edit</th>
                    <th>Delete</th>
                </tr>
            </thead>
            <tbody>
                <%
                    DAO dao = new DAO();
                    ArrayList<TestRegister> list = dao.viewPatientsInfo();
                    for (TestRegister e : list)
                    {
                %>
                <tr>
                    <td><%=e.getNumber()%></td> 
                    <td><%=e.getDate()%></td>
                    <td><%=e.getFirstname_sname()%></td>
                    <td><%=e.getClinic_nr()%></td>
                    <td><%=e.getFirst_test()%></td>
                    <td><%=e.getAge()%></td>
                    <td><%=e.getGender()%></td>
                    <td><%=e.getReferral()%></td>
                    <td><%=e.getReferred_fro()%></td>
                    <td><%=e.getTested()%></td>
                    <td><%=e.getSreening()%></td>
                    <td><%=e.getConf_test()%></td>
                    <td><%=e.getResults()%></td>
                    <td><%=e.getElisa()%></td>
                    <td><%=e.getPost_test()%></td>
                    <td><%=e.getOngoing_test()%></td>
                    <td><%=e.getReferrals_to()%></td>
                    <td><%=e.getNotes()%></td>
                    <td><a href="editPatientData.jsp?id=<%=e.getNumber()%>">Edit</td>
                    <td><a href="DeletePatientData?id=<%=e.getNumber()%>">Delete</td>
                </tr>
                <%}%>
            </tbody>
        </table>
    </body>
    <%@include file="footer.jsp" %>  
</html>
