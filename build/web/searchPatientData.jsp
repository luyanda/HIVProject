<%-- 
    Document   : searchPatientData
    Created on : Nov 24, 2013, 10:06:23 PM
    Author     : Group 3
--%>
<%@include file= "checkLogin.jsp"%>
<%@page import="hrproject.TestRegister"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Search Data Page</title>
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
        <input type="hidden" name="action" value="SearchPatientData">
        <input type="search" name="search" value=""  placeholder="Search Team" required size="60"/>
        <input type="submit" value="Search" />
    </form>  

    <div id="regform_content">
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

                </tr>
            </thead>
            <tbody>
                <%
                    if (request.getAttribute("searchResults") != null)
                    {
                        ArrayList<TestRegister> patientData = (ArrayList<TestRegister>) request.getAttribute("searchResults");
                        //check if stafflist is not empty
                        if (!patientData.isEmpty())
                        {

                            for (TestRegister e : patientData)
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

                </tr>

            </tbody>
            <%}
            }//close for
            //close inner if
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
        </table>
    </div>

</body>
</html>
