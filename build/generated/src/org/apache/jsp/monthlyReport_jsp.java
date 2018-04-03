package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import hrproject.TestRegister;
import hrproject.DAO;

public final class monthlyReport_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Monthly Report Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
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
      out.write("           <div style=\"background-color: silver; color: white\">\n");
      out.write("                <span><a href=\"nurseHome.jsp\">Home</a></span>|\n");
      out.write("            <span><a href=\"testingRegister.jsp\">Record Counseling Data</a></span>|\n");
      out.write("             <span><a href=\"searchPatientData.jsp\">Search Patient Counseling Data</a></span>|\n");
      out.write("             <span><a href=\"monthlyReport.jsp\">View Monthly Report</a></span>|\n");
      out.write("            <span><a href=\"logout.jsp\">Logout</a></span>\n");
      out.write("         </div>\n");
      out.write("            <table border=\"1\">\n");
      out.write("                <thead>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>Number Of Patients who visited the clinic</th>\n");
      out.write("                        <th>Number of males who tested positive</th>\n");
      out.write("                        <th>Number of females who tested positive</th>\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                <tbody>\n");
      out.write("                      ");

    
        DAO dao = new DAO();
        int m = dao.postiveMale();
        int f = dao.postiveFemale();
        int e = dao.monthlyReport();
      
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td>");
      out.print(e);
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(m);
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(f);
      out.write("</td>\n");
      out.write("                    </tr>\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("\n");
      out.write("      \n");
      out.write("                     \n");
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
