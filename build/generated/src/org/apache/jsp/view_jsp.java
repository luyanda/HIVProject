package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import hrproject.Nurse;
import hrproject.User;
import java.util.ArrayList;
import hrproject.DAO;

public final class view_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/checkLogin.jsp");
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"registration.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <title>Nurse List</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
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
      out.write("         <div style=\"background-color: silver; color: white\">\n");
      out.write("            <span><a href=\"view.jsp\">Home</a></span> |    \n");
      out.write("            <span><a href=\"addNurse.jsp\">Add Nurse</a></span> |\n");
      out.write("            <span><a href=\"Search.jsp\">Search User</a></span> |\n");
      out.write("            <span><a href=\"logout.jsp\">Logout</a></span>\n");
      out.write("         </div>\n");
      out.write("         <hr><h2>&raquo;Nurse List</h2>\n");
      out.write("         <p style=\"color: #b5ff5e\">");
      out.print(request.getAttribute("Successmsg")==null?"":request.getAttribute("Successmsg"));
      out.write("</p>\n");
      out.write("         <hr><table border=\"2\" width=\"100%\">\n");
      out.write("            <thead>\n");
      out.write("                <tr>\n");
      out.write("                    <th>Staff Number:</th>\n");
      out.write("                    <th>First Name:</th>\n");
      out.write("                    <th>Last Name:</th>\n");
      out.write("                    <th>Gender:</th>\n");
      out.write("                    <th>Age:</th>\n");
      out.write("                    <th>ID</th>\n");
      out.write("                    <th>Address:</th>\n");
      out.write("                    <th>Contact number:</th>\n");
      out.write("                    <th>Email Address:</th>\n");
      out.write("                    <th>User Name:</th>\n");
      out.write("                    <th>Password:</th>\n");
      out.write("                    <th>Edit</th>\n");
      out.write("                    <th>Delete</th>\n");
      out.write("                </tr>\n");
      out.write("            </thead>\n");
      out.write("            <tbody>\n");
      out.write("                ");

                DAO dao = new DAO();
                ArrayList<Nurse> list= dao.listAllNurses();
                for(Nurse e: list){
                
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td>");
      out.print(e.getStaffNo());
      out.write("</td> \n");
      out.write("                    <td>");
      out.print(e.getFirstName());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(e.getLastName());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(e.getGender());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(e.getAge());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(e.getIdNumber());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(e.getAddress());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(e.getCellNumber());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(e.getEmailAddress());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(e.getUserName());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(e.getPassword());
      out.write("</td>\n");
      out.write("                    \n");
      out.write("                    <td><a href=\"editNurse.jsp?id=");
      out.print(e.getStaffNo());
      out.write("\">Edit</td>\n");
      out.write("                    <td><a href=\"DeleteStaff?id=");
      out.print(e.getStaffNo());
      out.write("\">Delete</td>\n");
      out.write("                </tr>\n");
      out.write("                ");
}
      out.write("\n");
      out.write("            </tbody>\n");
      out.write("        </table><br>\n");
      out.write("            <hr>\n");
      out.write("             <h2>&raquo;Patient List</h2>\n");
      out.write("            \n");
      out.write("             <p style=\"color: #b5ff5e\">");
      out.print(request.getAttribute("Successmesg")==null?"":request.getAttribute("Successmesg"));
      out.write("</p>\n");
      out.write("             <hr><table border=\"2\" width=\"100%\">\n");
      out.write("            <thead>\n");
      out.write("                <tr>\n");
      out.write("                    <th>Patient Number:</th>\n");
      out.write("                    <th>First Name:</th>\n");
      out.write("                    <th>Last Name:</th>\n");
      out.write("                    <th>Gender:</th>\n");
      out.write("                    <th>Age:</th>\n");
      out.write("                    <th>ID</th>\n");
      out.write("                    <th>Address:</th>\n");
      out.write("                    <th>Contact number:</th>\n");
      out.write("                    <th>Email Address:</th>\n");
      out.write("                    <th>User Name:</th>\n");
      out.write("                    <th>Password:</th>\n");
      out.write("                    <th>Delete</th>\n");
      out.write("                </tr>\n");
      out.write("            </thead>\n");
      out.write("            <tbody>\n");
      out.write("                ");

                DAO d = new DAO();
                ArrayList<User> listP= d.listAllPatients();
                for(User e: listP){
                
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td>");
      out.print(e.getNumber());
      out.write("</td> \n");
      out.write("                    <td>");
      out.print(e.getFirstName());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(e.getLastName());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(e.getGender());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(e.getAge());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(e.getIdNumber());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(e.getAddress());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(e.getCellNumber());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(e.getEmailAddress());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(e.getUserName());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(e.getPassword());
      out.write("</td>\n");
      out.write("                    <td><a href=\"DeletePatient?patientNo=");
      out.print(e.getNumber());
      out.write("\">Delete</td>\n");
      out.write("                </tr>\n");
      out.write("                ");
}
      out.write("\n");
      out.write("            </tbody>\n");
      out.write("        </table>\n");
      out.write("          \n");
      out.write("\n");
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
