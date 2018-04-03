<%-- 
    Document   : registerPatient
    Author     : Group 3
--%>
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

        <input type="hidden" name="action" value="registration">
        <div id="regform_content">

            <h2 stlye= "color :#b5ff5e" >HIV FREE GENERATION BEGINS WITH YOU!</h2>
            <h2>REGISTER AND LEARN MORE KNOW YOUR STATUS!</h2>
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
            <h1>Voluntary HIV Counselling and Testing</h1>
            <h2>VCT - What is it?</h2>
            <p>
                VCT stands for voluntary counselling and testing .&nbsp; VCT is when a person 
                chooses to&nbsp; undergo HIV/AIDS counselling so that they can make an informed 
                decision about whether to be tested for HIV.&nbsp; The government is encouraging 
                all of us to come forward to be tested for HIV.&nbsp; it believes that if many 
                of us get tested, even though we may not be sick, this will help to lessen the 
                amount of stigma associated with the HIV test.&nbsp; Also, if we find out as an 
                earlier stage, that we are infected with HIV, we can
            </p><img border="0" id="img1" src="images/reg.jpg" height="150" width="200" alt="Home"></a>&nbsp;&nbsp;
            <h2>Ongoing HIV/AIDS counselling<br>
            </h2>Ongoing counselling is the king of counselling that happens after you 
            have received your test result.&nbsp; The aims of ongoing counselling are 
            to:<p>

                &raquo;&raquo;Help you to manage the impact that HIV has on your own life, and the 
                lives of the &nbsp;&raquo;people around you.<br>&raquo;&raquo;Encourage you to take control of 
                your health and take charge of your life.<br/>&raquo;&raquo;Help you to accept your result 
                and live positively with HIV/AIDS<br/>&raquo;&raquo;Explore the advantages and 
                disadvantages of telling other people about your status.<br/>&raquo;&raquo;Assist you in 
                tackling your problems<br/>&raquo;&raquo;Provide emotional and psychological support<br/>
                &raquo;&raquo;Help you to strengthen your support system<br/>&raquo;&raquo;Help you to plan for the 
                future<br/>&raquo;&raquo;Explore issues around death and dying<br/>&raquo;&raquo;Refer you to community 
                resources
                </form>
                </body>
                </html>
