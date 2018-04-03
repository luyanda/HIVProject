package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import hrproject.Nurse;
import hrproject.DAO;
import java.util.ArrayList;

public final class editNurse_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Edit Nurse</title>\n");
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
      out.write("                <div id=\"site_tagline\">Saving Life Protecting People.We care.</div>\n");
      out.write("            </div> <!-- end of top section -->\n");
      out.write("        </div>  <!-- end of top panel --> \n");
      out.write("\n");
      out.write("       <div style=\"background-color: silver; color: white\">\n");
      out.write("            <span><a href=\"view.jsp\">Home</a></span> |    \n");
      out.write("            <span><a href=\"addNurse.jsp\">Add Nurse</a></span> |\n");
      out.write("            <span><a href=\"Search.jsp\">Search User</a></span> |\n");
      out.write("            <span><a href=\"logout.jsp\">Logout</a></span>\n");
      out.write("         </div>\n");
      out.write("         <h1>Updating Nurse</h1>\n");
      out.write("         <ul>\n");
      out.write("        ");

            if (request.getAttribute("errorsList") != null)
            {
                ArrayList<String> list = (ArrayList<String>) request.getAttribute("errorsList");
                for (String e : list)
                {
        
      out.write("\n");
      out.write("    <li style=\"color: red\">");
      out.print(e);
      out.write("</li>\n");
      out.write("        ");
}
            }
      out.write("\n");
      out.write("     </ul>\n");

    if (request.getParameter("id") != null)
    {
        DAO dao = new DAO();
        Nurse e = dao.searchByNumber(request.getParameter("id"));

      out.write("\n");
      out.write("<form action=\"controller\" method=\"POST\">\n");
      out.write("    <input type=\"hidden\" name=\"action\" value=\"UpdateNurse\">\n");
      out.write("    <div id=\"regform_content\">\n");
      out.write("        <table>\n");
      out.write("            <tr>\n");
      out.write("                <td>Nurse Number :</td>\n");
      out.write("                <td><input type=\"text\" name=\"num\"  size =\"30\" value=\"");
      out.print(e.getStaffNo());
      out.write("\" /></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Name :</td>\n");
      out.write("                <td><input type=\"text\" name=\"name\"  size =\"30\" value=\"");
      out.print(e.getFirstName());
      out.write("\" /></td>\n");
      out.write("            </tr>\n");
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>Surname :</td>\n");
      out.write("                <td><input type=\"text\" name=\"surname\"  size =\"30\" value=\"");
      out.print(e.getLastName());
      out.write("\" /></td>\n");
      out.write("            </tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>Gender:</td>   \n");
      out.write("                <td>\n");
      out.write("                    <select name=\"gender\" value=\"");
      out.print(e.getGender());
      out.write("\">\n");
      out.write("                        <option> Male</option>\n");
      out.write("                        <option>Female</option>\n");
      out.write("                    </select>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>Age :</td>\n");
      out.write("                <td><input type=\"text\" name=\"age\"  size =\"30\"value=\"");
      out.print(e.getAge());
      out.write("\" /></td>\n");
      out.write("            </tr>\n");
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>National Id/Passport :</td>\n");
      out.write("                <td><input type=\"text\" name=\"national_id\"  size =\"30\" value=\"");
      out.print(e.getIdNumber());
      out.write("\"/></td>\n");
      out.write("            </tr>\n");
      out.write("\n");
      out.write("            <tr>   \n");
      out.write("                <td>Address :</td>\n");
      out.write("                <td><input type=\"text\" name=\"address\" size =\"30\"value=\"");
      out.print(e.getAddress());
      out.write("\" /></td>\n");
      out.write("            </tr>\n");
      out.write("\n");
      out.write("            <tr>   \n");
      out.write("                <td>Cell Number :</td>\n");
      out.write("                <td><input type=\"text\" name=\"cellNumber\" size =\"30\" value=\"");
      out.print(e.getCellNumber());
      out.write("\" /></td>\n");
      out.write("            </tr>\n");
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>Email Address :</td>\n");
      out.write("                <td><input type=\"text\" name=\"email\"  size =\"30\" value=\"");
      out.print(e.getEmailAddress());
      out.write("\"/></td>\n");
      out.write("            </tr>\n");
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>User Name :</td>\n");
      out.write("                <td><input type=\"text\" name=\"username\"  size =\"30\" value=\"");
      out.print(e.getUserName());
      out.write("\" /></td>\n");
      out.write("            </tr>\n");
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>Password :</td>\n");
      out.write("                <td><input type=\"text\" name=\"password\" size =\"30\"  value=\"");
      out.print(e.getPassword());
      out.write("\"/></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr><td><input type=\"submit\" value=\"Update\" /></td></tr>\n");
      out.write("        </table>\n");
      out.write("    </div>\n");
      out.write("    <div id=\"regform_move\">\n");
      out.write("        <h1>Update Nurse &raquo;&raquo;&raquo;</h1>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("</form>\n");
} else
        out.println("<h3>Nurse specified does not exit <a href='javascript:history.back()'>|||BACK</h3>");

      out.write('\n');
      out.write(' ');
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
      out.write("</body>\n");
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
