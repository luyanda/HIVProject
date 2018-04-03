<%-- 
    Document   : index
    sAuthor     : Group 3
--%>

<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="styles.css" rel="stylesheet" type="text/css"/>
        <title>Mthatha Clinic</title>
    </head>
    <body>   
        <%@include file="header.jsp" %>
        <div id="page_content_panel">
            <h2 style="color: white; text-align: center"><%=request.getAttribute("result") == null ? "" : request.getAttribute("result")%></h2> 
            <h2 style="color: white; text-align: center"><%=request.getAttribute("Successmsg") == null ? "" : request.getAttribute("Successmsg")%></h2>
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
            <p style="color: brown; font-size: 1.5em">
                <%=request.getAttribute("sessionError") == null ? "" : request.getAttribute("sessionError")%>
            </p>
            <div id="page_content_section">   
                <div id="page_content_left">

                    <div id="login_section">
                        <div id="login_section_top"></div>
                        <img src="images/Login.png" witdth="300" height="30" alt="login">
                        <div id="login_section_middle">

                            <form action="Login" method="POST">
                                <!--input type="hidden" name="action" value="Login"-->
                                <div class="form_row">
                                    <label>User Name: </label>
                                    <input  name="user_name" type="text" id="user_name"/>
                                </div>

                                <div class="form_row">
                                    <label>Password: </label>
                                    <input  name="password" type="password" id="password"/>
                                </div>

                                <input  type="submit" value="LOGIN" />
                            </form>


                            <a href="registerPatient.jsp">Need To Register</a>
                        </div>
                        <div id="login_section_bottom"></div>
                    </div>

                    <div id="left_column_section">
                        <div id="left_column_section_top">

                        </div>
                        <div id="left_column_section_title">HIV/AIDS</div>
                        <div id="left_column_section_middle">
                            <div class="post">
                                <h1>&raquo;HIV testing and counseling</h1>
                                <p>HIV testing and counseling (HTC) services 
                                    have helped millions of people learn their 
                                    HIV status and for those testing positive,
                                    learn about options for long term care and treatment.
                                </p>
                                <h1>&raquo;Voluntary HIV Counseling and Testing(VTC)</h1>
                                <p> VCT is when a person 
                                    chooses to undergo HIV/AIDS counseling so that
                                    they can make an informed decision about whether to be tested for HIV. To get more information on VTC click below
                                </p>

                            </div><!--end of post-->
                        </div> 
                    </div> 
                </div> <!-- end of content left--> 
                <div id="page_content_right">

                    <div class="right_column_section">

                        <div class="right_column_section_title">
                            Welcome to Mariestopes Clinic Online HIV Testing and Counseling 
                        </div>
                        <div class="right_column_section_body">
                            <div id="image_box"><img  src="images/right.png" alt="image"></div>

                            <div class="post_body">
                                <div class="posted_by">What is a HIV test?</div>
                                <p>A HIV test is a test that reveals whether HIV is present in the body. Commonly-used HIV 
                                    tests detect the antibodies produced by the immune system in response to HIV, as it is 
                                    much easier (and cheaper) to detect antibodies than the virus itself. Antibodies are 
                                    produced by the immune system in response to an infection.
                                </p>   
                                <div class="posted_by">Why should I get a HIV test?  </div>        
                                <p>Knowing your HIV status has two vital benefits. Firstly, if you are HIV positive, you can 
                                    take necessary steps before symptoms appear to access treatment, care and support 
                                    services, thereby potentially prolonging your life for many years.  
                                    Secondly, if you know you are infected, you can take all the necessary precautions to 
                                    prevent the spread of HIV to others.  
                                    Thirdly, your health care provider may recommend it, for example if you are pregnant 
                                    and want to protect your unborn child. It may also be recommended by your health care 
                                    provider if you are unwell, in order to obtain a more accurate medical assessment.  
                                </p>

                            </div>

                        </div>           	
                    </div> <!-- end of content right -->

                </div> <!-- end of content section -->
            </div> 
        </div> <!-- end of content panel -->

        <%@include file="footer.jsp" %>  
    </body>
</html>
