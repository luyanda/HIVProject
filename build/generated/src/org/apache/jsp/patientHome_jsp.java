package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import hrproject.User;
import java.lang.String;

public final class patientHome_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/checkLogin.jsp");
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/footer.jsp");
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

      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");

//place this on top of every page yuu want protected
    if(session.getAttribute("LoggedIn")==null){
        request.setAttribute("sessionError", "You must be logged.");
    

      out.write('\n');
      if (true) {
        _jspx_page_context.forward("index.jsp");
        return;
      }
      out.write('\n');
}
      out.write('\n');
      out.write(' ');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"styles.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <title>Patient Home</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("          \n");
      out.write("        ");
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
      out.write("                <div id=\"site_tagline\">Saving Lives.Protecting People.We care.</div>\n");
      out.write("            </div> <!-- end of top section -->\n");
      out.write("        </div>  <!-- end of top panel --> \n");
      out.write("\n");
      out.write("        <div style=\"background-color: silver; color: white\">\n");
      out.write("            ");
 User pp = (User)session.getAttribute("LoggedIn");
      out.write(" \n");
      out.write("            <span><a href=\"getPatient?id=");
      out.print(pp.getNumber());
      out.write("\">View Counseling Data</a></span>\n");
      out.write("            <span><a href=\"editPatient.jsp?id=");
      out.print(pp.getNumber());
      out.write("\">Update Profile</a></span>\n");
      out.write("            <span><a href=\"logout.jsp\">Logout</a></span>\n");
      out.write("         </div>\n");
      out.write("        ");
if(request.getAttribute("result")!=null)
        {
            String text = (String) request.getAttribute("result");
        
      out.write("\n");
      out.write("        <h1 style=\"text-align: center\">");
      out.print(text );
      out.write("</h1>\n");
      out.write("        ");
}
        
         else
      out.write("\n");
      out.write("         <h1 style=\"text-align: center\">Home</h1>\n");
      out.write("        \n");
      out.write("        <div id=\"page_content_panel\">\n");
      out.write("\n");
      out.write("            <div id=\"page_content_section\">\n");
      out.write("        <div id=\"page_content_right\">\n");
      out.write("\n");
      out.write("                    <div class=\"right_column_section\">\n");
      out.write("\n");
      out.write("                        <div class=\"right_column_section_title\">\n");
      out.write("                            Welcome Patient\n");
      out.write("                         </div>\n");
      out.write("                        <div class=\"right_column_section_body\">\n");
      out.write("                          \n");
      out.write("                                     \n");
      out.write("                                    <h2>Learn More!</h2>\n");
      out.write("\n");
      out.write("      <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" style=\"border-collapse: collapse; color: white; font-family: Arial; font-size: 10pt\" bordercolor=\"#111111\" id=\"table1\">\n");
      out.write("  <tr>\n");
      out.write("    <td><ul>\n");
      out.write("<li>Learn more about the virus and how it effects our body.<br>\n");
      out.write("<li>Look after our health so that we stay as healthy as possible for as long as possible<br>\n");
      out.write("<li>Get information and counselling around how to live positively \n");
      out.write("with the virus.&nbsp; This means learning to accept the fact hat we are \n");
      out.write("HIV-infected, seeking emotional support, eating a health diet, learning how to \n");
      out.write("control the amount of stress in our life, making sure we don't become \n");
      out.write("re-infected, and planning for the future.<br>\n");
      out.write("<li>Learn to recognize the signs of opportunistic infections so we can get them treated promptly<br>\n");
      out.write("<li>Find out what resources are available within our community to help us manage our HIV status<br>\n");
      out.write("<li>Find out about prophylatic drugs.&nbsp; These drugs do not cure HIV/AIDS, \n");
      out.write("but can prevent us from getting some oportunistic infections that are common \n");
      out.write("with people living with HIV/AIDS eg. T.B and some kinds of Pneumonia<br>\n");
      out.write("<li>Access Nevirapne.&nbsp; This is a drug available at a number of hospitals \n");
      out.write("and clinics that lessens the chance of a pregnant mother passing the virus onto her baby.<br>\n");
      out.write("<li>Get emotional support by seeking counselling and joining support groups.<br>\n");
      out.write("<li>Make sure that we don't infect anyone else or get re-infected ourselves<br>\n");
      out.write("<li>Learn how to manage the stress in our lives<br>\n");
      out.write("</ul>\n");
      out.write("</td>\n");
      out.write("    <td><img border=\"0\" src=\"images/vct1.jpg\" align=\"right\"></td>\n");
      out.write("  </tr>\n");
      out.write("      </table>                    \n");
      out.write("                           \n");
      out.write("                            \n");
      out.write("\n");
      out.write("                        </div>           \t\n");
      out.write("                    </div> <!-- end of content right -->\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                        <div id=\"page_content_left\" >\n");
      out.write("                            \n");
      out.write("                        <div id=\"left_column_section_middle\">\n");
      out.write("                            <div class=\"post\" >\n");
      out.write("                             <h1>Information about HIV Counselling and Testing</h1>\n");
      out.write("                             <table>\n");
      out.write("           <td width=\"100%\" valign=\"top\" colspan=\"2\" height=\"144\">\n");
      out.write("    <ul>\n");
      out.write("    <li>Information about HIV/AIDS, including the test procedure and what people \n");
      out.write("    who are HIV infected can do to make sure that they stay as healthy as \n");
      out.write("    possible for as long as possible.<li>What alternative there are for solving \n");
      out.write("    your problems<li>Which issues you want to tackle first<li>What impact you \n");
      out.write("    think a positive, indeterminate or negative result would have on your life \n");
      out.write("    and how you think you would react to receiving them.<li>The advantages and \n");
      out.write("    disadvantages for you to having the test<li>What king of support system you \n");
      out.write("    have including who you would be able to tell if you tested HIV antibody \n");
      out.write("    positive.<li>How you have coped with problems in the past.\n");
      out.write("    </td>\n");
      out.write("    </tr>\n");
      out.write("   <td><img  src=\"images/vct4.jpg\" alt=\"image\"></td>\n");
      out.write("    \n");
      out.write("            </table>                      </div> \n");
      out.write("                        \n");
      out.write("                        </div>\n");
      out.write("                        </div>\n");
      out.write("                        </div>\n");
      out.write("        >\n");
      out.write("              ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<footer>\n");
      out.write("    <div    style=\"background-color: grey; color: wheat\">\n");
      out.write("    <span style=\"text-align: center\">\n");
      out.write("        Copyright &copy; No part of this file will be copied\n");
      out.write("        &trade; Mthatha Clinic last updated this site on the 22<sup>nd</sup> of October 2013.\n");
      out.write("    </span> \n");
      out.write("    </div>\n");
      out.write("</footer>\n");
      out.write(" \n");
      out.write("    </body>\n");
      out.write("    \n");
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
