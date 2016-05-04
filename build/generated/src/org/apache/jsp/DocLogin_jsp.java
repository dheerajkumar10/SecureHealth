package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class DocLogin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">\n");
      out.write("<!--\n");
      out.write("Design by Free CSS Templates\n");
      out.write("http://www.freecsstemplates.org\n");
      out.write("Released for free under a Creative Commons Attribution 2.5 License\n");
      out.write("\n");
      out.write("Name       : Keyboard \n");
      out.write("Description: A two-column, fixed-width design with dark color scheme.\n");
      out.write("Version    : 1.0\n");
      out.write("Released   : 20120915\n");
      out.write("\n");
      out.write("-->\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("    <head>\n");
      out.write("        <meta name=\"keywords\" content=\"\" />\n");
      out.write("        <meta name=\"description\" content=\"\" />\n");
      out.write("        <meta http-equiv=\"content-type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("        <title>Scalable and Secure Sharing of Personal Health Records in Cloud Computing using Attribute-based Encryption</title>\n");
      out.write("        <link href='http://fonts.googleapis.com/css?family=Oswald:400,300' rel='stylesheet' type='text/css'>\n");
      out.write("            <link href='http://fonts.googleapis.com/css?family=Abel' rel='stylesheet' type='text/css'>\n");
      out.write("                <link href=\"style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"screen\" />\n");
      out.write("                </head>\n");
      out.write("                <body>\n");
      out.write("                    <div id=\"wrapper\">\n");
      out.write("                        <div id=\"header-wrapper\">\n");
      out.write("                            <div id=\"header\" class=\"container\">\n");
      out.write("                                <div id=\"logo\">\n");
      out.write("                                    <h1><a href=\"#\">SECURE HEALTH </a></h1>\n");
      out.write("                                </div>\n");
      out.write("                                <div id=\"menu\">\n");
      out.write("                                    <ul>\n");
      out.write("                                        <li><a href=\"index.jsp\">Home</a></li>\n");
      out.write("                                        <li><a href=\"PHRLogin.jsp\">PHR Login</a></li>\n");
      out.write("                                        <li><a href=\"ActuaryLogin.jsp\">Actuary Login</a></li>\n");
      out.write("                                        <li class=\"first current_page_item\"><a href=\"#\">Doctor Login</a></li>                                       \n");
      out.write("                                    </ul>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div id=\"banner\">\n");
      out.write("                                <div class=\"content\"><img src=\"images/img02.jpg\" width=\"1000\" height=\"300\" alt=\"\" /></div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- end #header -->\n");
      out.write("\n");
      out.write("                        <div id=\"page\">\n");
      out.write("                            <div id=\"content\">\n");
      out.write("                                <div class=\"post\">\n");
      out.write("                                    <h2 class=\"title\"><a href=\"#\"></a></h2>\n");
      out.write("                                   \n");
      out.write("                                    <div style=\"clear: both;\">&nbsp;</div>\n");
      out.write("                                    <div class=\"entry\">\n");
      out.write("                                        ");
if (request.getParameter("msg") != null) {
                                                                 out.println(request.getParameter("msg"));
                                                             }
      out.write("\n");
      out.write("                                        <span style=\"font-size: 22px;\">Doctor Login</span>\n");
      out.write("                                        <form name=\"\" action=\"DocLog\" method=\"post\">\n");
      out.write("                                            <table width=\"100%\">\n");
      out.write("                                                <tr style=\"height: 40px;\"><td>User id:</td><td><input type=\"text\" size=\"30\" style=\"height: 25px;\" id=\"name_\" name=\"name_\"/></td></tr>\n");
      out.write("                                                <tr style=\"height: 40px;\"><td>Password:</td><td><input type=\"password\" size=\"30\" style=\"height: 25px;\" id=\"password\" name=\"password\"/></td></tr>                                \n");
      out.write("\n");
      out.write("                                                <tr style=\"height: 40px;\">\n");
      out.write("                                                    <td></td><td><input type=\"submit\" value=\"Login\" style=\"height: 25px;width: 90px;\"/></td></tr>\n");
      out.write("\n");
      out.write("                                            </table>\n");
      out.write("                                        </form>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div style=\"clear: both;\">&nbsp;</div>\n");
      out.write("                            </div>\n");
      out.write("                            <!-- end #content -->\n");
      out.write("                            <!-- end #sidebar -->\n");
      out.write("                            <div style=\"clear: both;\">&nbsp;</div>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- end #page --> \n");
      out.write("                    </div>\n");
      out.write("                    <div id=\"footer\">\n");
      out.write("                        <p> All rights reserved.</p>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- end #footer -->\n");
      out.write("                </body>\n");
      out.write("                </html>\n");
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
