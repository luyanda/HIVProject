package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"styles.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <title>Mthatha Clinic</title>\n");
      out.write("    </head>\n");
      out.write("    <body>   \n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("\n");
      out.write("    <link href=\"styles.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("\n");
      out.write("<div id=\"page_top_panel\">\n");
      out.write("    <div id=\"page_top_section\">\n");
      out.write("        <div id=\"site_title\">Mthatha Clinic</div> \n");
      out.write("        <div id=\"site_tagline\">Saving Lives.Protecting People.We care.</div>\n");
      out.write("    </div> <!-- end of top section -->\n");
      out.write("</div>  <!-- end of top panel --> \n");
      out.write("\n");
      out.write("        <div id=\"page_content_panel\">\n");
      out.write("            <h2 style=\"color: white; text-align: center\">");
      out.print(request.getAttribute("result") == null ? "" : request.getAttribute("result"));
      out.write("</h2> \n");
      out.write("            <h2 style=\"color: white; text-align: center\">");
      out.print(request.getAttribute("Successmsg") == null ? "" : request.getAttribute("Successmsg"));
      out.write("</h2>\n");
      out.write("            ");

                if (request.getAttribute("errors") != null)
                {
                    ArrayList<String> errors = (ArrayList<String>) request.getAttribute("errors");
                    String str = "";
                    for (String e : errors)
                    {
                        str = e.toString();

            
      out.write("\n");
      out.write("            <table>\n");
      out.write("                <tr><span style=\"color:red\">");
      out.print(str);
      out.write("</span></tr> \n");
      out.write("            </table>\n");
      out.write("\n");
      out.write("            ");
 }
           }
      out.write("\n");
      out.write("            <p style=\"color: brown; font-size: 1.5em\">\n");
      out.write("                ");
      out.print(request.getAttribute("sessionError") == null ? "" : request.getAttribute("sessionError"));
      out.write("\n");
      out.write("            </p>\n");
      out.write("            <div id=\"page_content_section\">   \n");
      out.write("                <div id=\"page_content_left\">\n");
      out.write("\n");
      out.write("                    <div id=\"login_section\">\n");
      out.write("                        <div id=\"login_section_top\"></div>\n");
      out.write("                        <img src=\"images/Login.png\" witdth=\"300\" height=\"30\" alt=\"login\">\n");
      out.write("                        <div id=\"login_section_middle\">\n");
      out.write("\n");
      out.write("                            <form action=\"Login\" method=\"POST\">\n");
      out.write("                                <!--input type=\"hidden\" name=\"action\" value=\"Login\"-->\n");
      out.write("                                <div class=\"form_row\">\n");
      out.write("                                    <label>User Name: </label>\n");
      out.write("                                    <input  name=\"user_name\" type=\"text\" id=\"user_name\"/>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div class=\"form_row\">\n");
      out.write("                                    <label>Password: </label>\n");
      out.write("                                    <input  name=\"password\" type=\"password\" id=\"password\"/>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <input  type=\"submit\" value=\"LOGIN\" />\n");
      out.write("                            </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <a href=\"registerPatient.jsp\">Need To Register</a>\n");
      out.write("                        </div>\n");
      out.write("                        <div id=\"login_section_bottom\"></div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div id=\"left_column_section\">\n");
      out.write("                        <div id=\"left_column_section_top\">\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <div id=\"left_column_section_title\">HIV/AIDS</div>\n");
      out.write("                        <div id=\"left_column_section_middle\">\n");
      out.write("                            <div class=\"post\">\n");
      out.write("                                <h1>&raquo;HIV testing and counseling</h1>\n");
      out.write("                                <p>HIV testing and counseling (HTC) services \n");
      out.write("                                    have helped millions of people learn their \n");
      out.write("                                    HIV status and for those testing positive,\n");
      out.write("                                    learn about options for long term care and treatment.\n");
      out.write("                                </p>\n");
      out.write("                                <h1>&raquo;Voluntary HIV Counseling and Testing(VTC)</h1>\n");
      out.write("                                <p> VCT is when a person \n");
      out.write("                                    chooses to undergo HIV/AIDS counseling so that\n");
      out.write("                                    they can make an informed decision about whether to be tested for HIV. To get more information on VTC click below\n");
      out.write("                                </p>\n");
      out.write("\n");
      out.write("                            </div><!--end of post-->\n");
      out.write("                        </div> \n");
      out.write("                    </div> \n");
      out.write("                </div> <!-- end of content left--> \n");
      out.write("                <div id=\"page_content_right\">\n");
      out.write("\n");
      out.write("                    <div class=\"right_column_section\">\n");
      out.write("\n");
      out.write("                        <div class=\"right_column_section_title\">\n");
      out.write("                            Welcome to Mthatha Clinic Online HIV Testing and Counseling \n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"right_column_section_body\">\n");
      out.write("                            <div id=\"image_box\"><img  src=\"images/right.png\" alt=\"image\"></div>\n");
      out.write("\n");
      out.write("                            <div class=\"post_body\">\n");
      out.write("                                <div class=\"posted_by\">What is a HIV test?</div>\n");
      out.write("                                <p>A HIV test is a test that reveals whether HIV is present in the body. Commonly-used HIV \n");
      out.write("                                    tests detect the antibodies produced by the immune system in response to HIV, as it is \n");
      out.write("                                    much easier (and cheaper) to detect antibodies than the virus itself. Antibodies are \n");
      out.write("                                    produced by the immune system in response to an infection.\n");
      out.write("                                </p>   \n");
      out.write("                                <div class=\"posted_by\">Why should I get a HIV test?  </div>        \n");
      out.write("                                <p>Knowing your HIV status has two vital benefits. Firstly, if you are HIV positive, you can \n");
      out.write("                                    take necessary steps before symptoms appear to access treatment, care and support \n");
      out.write("                                    services, thereby potentially prolonging your life for many years.  \n");
      out.write("                                    Secondly, if you know you are infected, you can take all the necessary precautions to \n");
      out.write("                                    prevent the spread of HIV to others.  \n");
      out.write("                                    Thirdly, your health care provider may recommend it, for example if you are pregnant \n");
      out.write("                                    and want to protect your unborn child. It may also be recommended by your health care \n");
      out.write("                                    provider if you are unwell, in order to obtain a more accurate medical assessment.  \n");
      out.write("                                </p>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                        </div>           \t\n");
      out.write("                    </div> <!-- end of content right -->\n");
      out.write("\n");
      out.write("                </div> <!-- end of content section -->\n");
      out.write("            </div> \n");
      out.write("        </div> <!-- end of content panel -->\n");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<footer>\n");
      out.write("    <div    style=\"background-color: grey; color: wheat\">\n");
      out.write("        <span style=\"text-align: center\">\n");
      out.write("            Copyright &copy; No part of this file will be copied\n");
      out.write("            &trade; Mthatha Clinic last updated this site on the 25<sup>th</sup> of November 2013.\n");
      out.write("        </span> \n");
      out.write("    </div>\n");
      out.write("</footer>");
      out.write("  \n");
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
