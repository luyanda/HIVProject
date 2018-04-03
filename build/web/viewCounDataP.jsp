<%-- 
    Document   : viewCounData
    Created on : Nov 24, 2013, 2:51:28 AM
    Author     : 210041625
--%>
<%@include file= "checkLogin.jsp"%>
<%@page import="hrproject.User"%>
<%@page import="java.util.ArrayList"%>
<%@page import="hrproject.TestRegister"%>
<%@page import="hrproject.DAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Counseling Data</title>
    </head>
    <body>
         <%@include file="header.jsp" %>
         <div style="background-color: silver; color: white">
            <% User pp = (User)session.getAttribute("LoggedIn");%> 
            <span><a href="patientHome.jsp?id=<%=pp.getNumber()%>">Home</a></span>
            <span><a href="patientDetails.jsp?id=<%=pp.getNumber()%>">Profile details</a></span>
            <span><a href="getPatient?id=<%=pp.getNumber()%>">View Counseling Data</a></span>
            <span><a href="editPatient.jsp?id=<%=pp.getNumber()%>">Update Profile</a></span>
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

<form action="controller" method="POST">
    <input type="hidden" name="action" value="UpdateNurse">
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
    if (request.getParameter("id") != null)
    {
        DAO dao = new DAO();
        TestRegister e = dao.searchByNo(request.getParameter("id"));
        if(e.getNumber()!=null){
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
        </table>
    </div>
</form> 
            <%} else
    out.println("<h3>You have not yet been counselled and tested information will be available as soon as you are tested and counselled. Thank you. <a href='javascript:history.back()'>|&raquo;BACK</h3>");
    }else
      out.println("<h3>Pateint specified does not exit <a href='javascript:history.back()'>|&raquo;BACK</h3>");

%>
    </body>
</html>
