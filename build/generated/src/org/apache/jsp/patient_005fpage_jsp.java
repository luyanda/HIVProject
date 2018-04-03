package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import hrproject.User;
import hrproject.DAO;

public final class patient_005fpage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Patient Profile</title>\n");
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
      out.write("        ");

             if (request.getAttribute("id") != null && request.getAttribute("pas")!=null)
             {
                 String id = (String) request.getAttribute("id");
                 String pas = (String) request.getAttribute("pas");
                 DAO dao = new DAO();
                 User e = dao.getPateint(id, pas);
         /* try
             {
                String id = (String) request.getAttribute("id");
               String pas = (String) request.getAttribute("pas");
               Class.forName("com.mysql.jdbc.Driver").newInstance();
               Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinesystemdb","root","csi3201");
               PreparedStatement ps=conn.prepareStatement("select fname, sname, gender, age, id, address, cell, email, username ,password, category from user WHERE username=? and password=?");
               ResultSet rs=null;
               ps.setString(1, id);
               ps.setString(2, pas);
               rs= ps.executeQuery();
                while(rs.next()){
                   
               /*String id = (String) request.getAttribute("id");
               String pas = (String) request.getAttribute("pas");
               DAO dao = new DAO();
               User u = dao.getPateint(id, pas);*/
              // User u = new User();
            
      out.write("\n");
      out.write("            <br>\n");
      out.write("            <form action=\"\" method=\"POST\">\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                <td>Name :</td>\n");
      out.write("                <td><input type=\"text\" name=\"name\"  value =\"");
      out.print( e.getFirstName() );
      out.write("\" /></td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                <td>Surname :</td>\n");
      out.write("                <td><input type=\"text\" name=\"surname\"  value =\"");
      out.print( e.getFirstName() );
      out.write("\" /></td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                    <td>Gender:</td>   \n");
      out.write("                    <td>\n");
      out.write("                        <input type=\"text\" name=\"gender\" value =\"");
      out.print(e.getGender() );
      out.write("\" />\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                <td>Age :</td>\n");
      out.write("                <td><input type=\"text\" name=\"age\"  value =\"");
      out.print( e.getAge());
      out.write("\" /></td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                <td>National Id/Passport :</td>\n");
      out.write("                <td><input type=\"text\" name=\"national_id\"  value =\"");
      out.print(e.getIdNumber());
      out.write("\" /></td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                <tr>   \n");
      out.write("                    <td>Address :</td>\n");
      out.write("                    <td><input type=\"text\" name=\"address\" value =\"");
      out.print( e.getAddress());
      out.write("\" /></td>\n");
      out.write("                 </tr>\n");
      out.write("            \n");
      out.write("                 <tr>   \n");
      out.write("                     <td>Cell Number :</td>\n");
      out.write("                     <td><input type=\"text\" name=\"cellNumber\" value =\"");
      out.print( e.getCellNumber());
      out.write("\" /></td>\n");
      out.write("                 </tr>\n");
      out.write("                 \n");
      out.write("                 <tr>\n");
      out.write("                     <td>Email Address :</td>\n");
      out.write("                     <td><input type=\"text\" name=\"email\"  value =\"");
      out.print( e.getEmailAddress());
      out.write("\" /></td>\n");
      out.write("                </tr>\n");
      out.write("                 \n");
      out.write("                <tr>\n");
      out.write("                 <td> User Name :</td>\n");
      out.write("                <td><input type=\"text\" name=\"username\"  value =\"");
      out.print(e.getUserName());
      out.write("\" /></td>\n");
      out.write("                </tr>\n");
      out.write("               \n");
      out.write("                <tr>\n");
      out.write("                <td> Password :</td>\n");
      out.write("                <td><input type=\"text\" name=\"password\" value =\"");
      out.print( e.getPassword());
      out.write("\"  /></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                <td>Category :</td>\n");
      out.write("                <td><input type=\"text\" name=\"password\" value =\"");
      out.print( e.getCategory());
      out.write("\"  /></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr><td><input type=\"submit\" value=\"Register\" /></td></tr>\n");
      out.write("             </table>\n");
      out.write("            </form>\n");
      out.write("            ");
 } else{
                  out.println("<h2>Cannot find details</h2>");
             }
            
      out.write("\n");
      out.write("        ");
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
