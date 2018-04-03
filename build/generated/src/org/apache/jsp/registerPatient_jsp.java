package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;

public final class registerPatient_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/header.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"registration.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <title>Registration</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("        \n");
      out.write("        <link href=\"styles.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    \n");
      out.write("     <div id=\"page_top_panel\">\n");
      out.write("            <div id=\"page_top_section\">\n");
      out.write("                <div id=\"site_title\">Mthatha Clinic</div> \n");
      out.write("                <div id=\"site_tagline\">Saving Life Protecting People.We care.</div>\n");
      out.write("            </div> <!-- end of top section -->\n");
      out.write("        </div>  <!-- end of top panel --> \n");
      out.write("\n");
      out.write("        \n");
      out.write("        ");

            if(request.getAttribute("errorList")!=null){
                ArrayList<String> list =new ArrayList<String>();
              for(String e: list){
            
        
      out.write("\n");
      out.write("        <p>");
      out.print(e);
      out.write("</p>\n");
      out.write("        ");
}
          }
    
      out.write("\n");
      out.write("        <form action=\"controller\" method=\"POST\">\n");
      out.write("            \n");
      out.write("             <input type=\"hidden\" name=\"action\" value=\"registration\">\n");
      out.write("             <div id=\"regform_content\">\n");
      out.write("                 \n");
      out.write("         <h2 stlye= \"color :#b5ff5e\" >HIV FREE GENERATION BEGINS WITH YOU!</h2>\n");
      out.write("         <h2>REGISTER AND LEARN MORE KNOW YOUR STATUS!</h2>\n");
      out.write("             <table>\n");
      out.write("                <tr>\n");
      out.write("                <td>Name :</td>\n");
      out.write("                <td><input type=\"text\" name=\"name\"  size =\"30\" /></td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                <td>Surname :</td>\n");
      out.write("                <td><input type=\"text\" name=\"surname\"  size =\"30\" /></td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                    <td>Gender:</td>   \n");
      out.write("                    <td>\n");
      out.write("                    <select name=\"gender\">\n");
      out.write("                    <option> Male</option>\n");
      out.write("                    <option>Female</option>\n");
      out.write("                </select>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                <td>Age :</td>\n");
      out.write("                <td><input type=\"text\" name=\"age\"  size =\"30\" /></td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                <td>National Id/Passport :</td>\n");
      out.write("                <td><input type=\"text\" name=\"national_id\"  size =\"30\" /></td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                <tr>   \n");
      out.write("                    <td>Address :</td>\n");
      out.write("                    <td><input type=\"text\" name=\"address\" size =\"30\" /></td>\n");
      out.write("                 </tr>\n");
      out.write("            \n");
      out.write("                 <tr>   \n");
      out.write("                     <td>Cell Number :</td>\n");
      out.write("                     <td><input type=\"text\" name=\"cellNumber\" size =\"30\" /></td>\n");
      out.write("                 </tr>\n");
      out.write("                 \n");
      out.write("                 <tr>\n");
      out.write("                     <td>Email Address :</td>\n");
      out.write("                     <td><input type=\"text\" name=\"email\"  size =\"30\" /></td>\n");
      out.write("                </tr>\n");
      out.write("                 \n");
      out.write("                <tr>\n");
      out.write("                 <td>Create User Name :</td>\n");
      out.write("                <td><input type=\"text\" name=\"username\"  size =\"30\" /></td>\n");
      out.write("                </tr>\n");
      out.write("               \n");
      out.write("                <tr>\n");
      out.write("                <td>Create Password :</td>\n");
      out.write("                <td><input type=\"password\" name=\"password\" size =\"30\"  /></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr><td><input type=\"submit\" value=\"Register\" /></td></tr>\n");
      out.write("             </table>\n");
      out.write("             </div>\n");
      out.write("             <div id=\"regform_move\">\n");
      out.write("                 <h1>Voluntary HIV Counselling and Testing</h1>\n");
      out.write("                 <h2>VCT - What is it?</h2>\n");
      out.write("       <p>\n");
      out.write("                           VCT stands for voluntary counselling and testing .&nbsp; VCT is when a person \n");
      out.write("chooses to&nbsp; undergo HIV/AIDS counselling so that they can make an informed \n");
      out.write("decision about whether to be tested for HIV.&nbsp; The government is encouraging \n");
      out.write("all of us to come forward to be tested for HIV.&nbsp; it believes that if many \n");
      out.write("of us get tested, even though we may not be sick, this will help to lessen the \n");
      out.write("amount of stigma associated with the HIV test.&nbsp; Also, if we find out as an \n");
      out.write("earlier stage, that we are infected with HIV, we can\n");
      out.write("                       </p><img border=\"0\" id=\"img1\" src=\"images/reg.jpg\" height=\"150\" width=\"200\" alt=\"Home\"></a>&nbsp;&nbsp;\n");
      out.write("                       <h2>Ongoing HIV/AIDS counselling<br>\n");
      out.write("    </h2>Ongoing counselling is the king of counselling that happens after you \n");
      out.write("    have received your test result.&nbsp; The aims of ongoing counselling are \n");
      out.write("    to:<p>\n");
      out.write("    \n");
      out.write("    &raquo;&raquo;Help you to manage the impact that HIV has on your own life, and the \n");
      out.write("    lives of the &nbsp;&raquo;people around you.<br>&raquo;&raquo;Encourage you to take control of \n");
      out.write("    your health and take charge of your life.<br/>&raquo;&raquo;Help you to accept your result \n");
      out.write("    and live positively with HIV/AIDS<br/>&raquo;&raquo;Explore the advantages and \n");
      out.write("    disadvantages of telling other people about your status.<br/>&raquo;&raquo;Assist you in \n");
      out.write("    tackling your problems<br/>&raquo;&raquo;Provide emotional and psychological support<br/>\n");
      out.write("    &raquo;&raquo;Help you to strengthen your support system<br/>&raquo;&raquo;Help you to plan for the \n");
      out.write("    future<br/>&raquo;&raquo;Explore issues around death and dying<br/>&raquo;&raquo;Refer you to community \n");
      out.write("        resources\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
