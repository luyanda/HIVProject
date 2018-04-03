
<%@include file= "checkLogin.jsp"%>
<%@page import="hrproject.User"%>
<%@page import="java.lang.String"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="styles.css" rel="stylesheet" type="text/css"/>
        <title>Patient Home</title>
    </head>
    <body>
        <%@include file="header.jsp" %>
        <div style="background-color: silver; color: white">
            <% User pp = (User) session.getAttribute("LoggedIn");%> 
            <span><a href="patientHome.jsp">Home</a></span>
            <span><a href="patientDetails.jsp?id=<%=pp.getNumber()%>">Profile details</a></span>
            <span><a href="getPatient?id=<%=pp.getNumber()%>">View Counseling Data</a></span>
            <span><a href="editPatient.jsp?id=<%=pp.getNumber()%>">Update Profile</a></span>
            <span><a href="logout.jsp">Logout</a></span>
        </div>
        <%if (request.getAttribute("result") != null)
            {
                String text = (String) request.getAttribute("result");
        %>
        <h1 style="text-align: center"><%=text%></h1>
        <%} else%>
        <h1 style="text-align: center">Home</h1>

        <div id="page_content_panel">

            <div id="page_content_section">
                <div id="page_content_right">

                    <div class="right_column_section">

                        <div class="right_column_section_title">
                            Welcome Patient
                        </div>
                        <div class="right_column_section_body">


                            <h2>Learn More!</h2>

                            <table border="0" cellpadding="0" cellspacing="0" style="border-collapse: collapse; color: white; font-family: Arial; font-size: 10pt" bordercolor="#111111" id="table1">
                                <tr>
                                    <td><ul>
                                            <li>Learn more about the virus and how it effects our body.<br>
                                            <li>Look after our health so that we stay as healthy as possible for as long as possible<br>
                                            <li>Get information and counselling around how to live positively 
                                                with the virus.&nbsp; This means learning to accept the fact hat we are 
                                                HIV-infected, seeking emotional support, eating a health diet, learning how to 
                                                control the amount of stress in our life, making sure we don't become 
                                                re-infected, and planning for the future.<br>
                                            <li>Learn to recognize the signs of opportunistic infections so we can get them treated promptly<br>
                                            <li>Find out what resources are available within our community to help us manage our HIV status<br>
                                            <li>Find out about prophylatic drugs.&nbsp; These drugs do not cure HIV/AIDS, 
                                                but can prevent us from getting some oportunistic infections that are common 
                                                with people living with HIV/AIDS eg. T.B and some kinds of Pneumonia<br>
                                            <li>Access Nevirapne.&nbsp; This is a drug available at a number of hospitals 
                                                and clinics that lessens the chance of a pregnant mother passing the virus onto her baby.<br>
                                            <li>Get emotional support by seeking counselling and joining support groups.<br>
                                            <li>Make sure that we don't infect anyone else or get re-infected ourselves<br>
                                            <li>Learn how to manage the stress in our lives<br>
                                        </ul>
                                    </td>
                                    <td><img border="0" src="images/vct1.jpg" align="right"></td>
                                </tr>
                            </table>                    



                        </div>           	
                    </div> <!-- end of content right -->

                </div>
                <div id="page_content_left" >

                    <div id="left_column_section_middle">
                        <div class="post" >
                            <h1>Information about HIV Counselling and Testing</h1>
                            <table>
                                <td width="100%" valign="top" colspan="2" height="144">
                                    <ul>
                                        <li>Information about HIV/AIDS, including the test procedure and what people 
                                            who are HIV infected can do to make sure that they stay as healthy as 
                                            possible for as long as possible.<li>What alternative there are for solving 
                                            your problems<li>Which issues you want to tackle first<li>What impact you 
                                            think a positive, indeterminate or negative result would have on your life 
                                            and how you think you would react to receiving them.<li>The advantages and 
                                            disadvantages for you to having the test<li>What king of support system you 
                                            have including who you would be able to tell if you tested HIV antibody 
                                            positive.<li>How you have coped with problems in the past.
                                            </td>
                                            </tr>
                                        <td><img  src="images/vct4.jpg" alt="image"></td>

                            </table>                      </div> 

                    </div>
                </div>
            </div>
            >
            <%@include file="footer.jsp" %> 
    </body>

</html>
