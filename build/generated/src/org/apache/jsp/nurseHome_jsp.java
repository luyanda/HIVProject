package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import hrproject.TestRegister;
import java.util.ArrayList;
import hrproject.DAO;

public final class nurseHome_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Nurse Home</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("         ");
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
      out.write("           <div style=\"background-color: silver; color: white\">\n");
      out.write("            <span><a href=\"testingRegister.jsp\">Record Counseling Data</a></span>|\n");
      out.write("            <span><a href=\"logout.jsp\">Logout</a></span>\n");
      out.write("         </div>\n");
      out.write("        <h1>Patients counseling data</h1>\n");
      out.write("          <p style=\"color: #b5ff5e\">");
      out.print(request.getAttribute("Successmsg")==null?"":request.getAttribute("Successmsg"));
      out.write("</p>\n");
      out.write("    <table border=\"1\" width=\"1700\" >\n");
      out.write("              <thead>\n");
      out.write("                  <tr>\n");
      out.write("                      <th>Patient Number</th>\n");
      out.write("                      <th>Date</th>\n");
      out.write("                      <th>First Name Surname:</th>\n");
      out.write("                      <th>Clinic Nr</th>\n");
      out.write("                      <th>First Ever Test</th>\n");
      out.write("                      <th> Age in years</th>\n");
      out.write("                      <th>Gender</th>\n");
      out.write("                      <th>Referral:</th>\n");
      out.write("                      <th>Referred From</th>\n");
      out.write("                      <th>Tested</th>\n");
      out.write("                      <th>Screening Test</th>\n");
      out.write("                      <th>Confirmatory Test</th>\n");
      out.write("                      <th>Results</th>\n");
      out.write("                      <th>ELISA</th>\n");
      out.write("                      <th>Post-test Counselled</th>\n");
      out.write("                      <th>On-going Counselling</th>\n");
      out.write("                      <th>Referrals to</th>\n");
      out.write("                      <th>Counselling Note</th>\n");
      out.write("                      <th>Edit</th>\n");
      out.write("                      <th>Delete</th>\n");
      out.write("                  </tr>\n");
      out.write("      </thead>\n");
      out.write("      <tbody>\n");
      out.write("                ");

                DAO dao = new DAO();
                ArrayList<TestRegister> list= dao.viewPatientsInfo();
                for(TestRegister e: list){
                
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td>");
      out.print(e.getNumber());
      out.write("</td> \n");
      out.write("                    <td>");
      out.print(e.getDate());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(e.getFirstname_sname());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(e.getClinic_nr());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(e.getFirst_test());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(e.getAge());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(e.getGender());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(e.getReferral());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(e.getReferred_fro());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(e.getTested());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(e.getSreening());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(e.getConf_test());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(e.getResults());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(e.getElisa());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(e.getPost_test());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(e.getOngoing_test());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(e.getReferrals_to());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(e.getNotes());
      out.write("</td>\n");
      out.write("                    <td><a href=\"editPatientData.jsp?id=");
      out.print(e.getNumber());
      out.write("\">Edit</td>\n");
      out.write("                    <td><a href=\"DeletePatientData?id=");
      out.print(e.getNumber());
      out.write("\">Delete</td>\n");
      out.write("                </tr>\n");
      out.write("                ");
}
      out.write("\n");
      out.write("            </tbody>\n");
      out.write("        </table>\n");
      out.write("    </body>\n");
      out.write("     ");
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
      out.write("  \n");
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
