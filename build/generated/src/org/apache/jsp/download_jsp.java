package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.PreparedStatement;
import java.sql.Connection;
import com.util.DbConnector;
import java.sql.ResultSet;

public final class download_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
      out.write("                                    <h1><a href=\"#\">Scalable </a></h1>\n");
      out.write("                                </div>\n");
      out.write("                                <div id=\"menu\">\n");
      out.write("                                    <ul>\n");
      out.write("                                        <li class=\"first current_page_item\"><a href=\"#\">Doctor Home</a></li>                       \n");
      out.write("                                        <li><a href=\"index.jsp\">LogOut</a></li>\n");
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
      out.write("\n");
      out.write("\n");
      out.write("                                    <div style=\"clear: both;\">&nbsp;</div>\n");
      out.write("                                    <div class=\"entry\">\n");
      out.write("                                        <span style=\"font-size: 22px;\">Welcome Doctor</span>\n");
      out.write("                                        ");
if (request.getParameter("msg") != null) {
                                                out.println(request.getParameter("msg"));
                                            }
      out.write("\n");
      out.write("                                            <h3>");

                                            out.println("Details of "+request.getParameter("id"));
                                            
                                            
      out.write("</h3>\n");
      out.write("                                        <table border=\"1\">\n");
      out.write("                                            <tr>\n");
      out.write("                                                <th>Uploaded Date</th>\n");
      out.write("                                                <th>File Name</th>                                                  \n");
      out.write("                                            </tr>\n");
      out.write("                                            ");

                                                String sql = "Select * from upload where userid='" + request.getParameter("id") + "'";
                                                PreparedStatement pst = null;
                                                Connection conn = null;
                                                try {
                                                    conn = DbConnector.getConnection();
                                                    pst = conn.prepareStatement(sql);
                                                    ResultSet rs = pst.executeQuery();
                                                    while (rs.next()) {
      out.write("\n");
      out.write("                                            <tr>                                                \n");
      out.write("                                                <td>");
      out.print(rs.getString("date_"));
      out.write("</td>\n");
      out.write("                                                <td>");
      out.print(rs.getString("filename"));
      out.write("</td>\n");
      out.write("                                                <td><a href=\"SecureDownload.jsp?date=");
      out.print(rs.getString(5));
      out.write("&filename=");
      out.print(rs.getString(6));
      out.write("&userid=");
      out.print(rs.getString(2));
      out.write("\" >Download</a></td>\n");
      out.write("                                                ");




                                                        }
                                                    } catch (Exception e) {
                                                        System.out.println("ERRRORRRR " + e);
                                                    }
      out.write("\n");
      out.write("\n");
      out.write("                                            </tr>\n");
      out.write("                                        </table>\n");
      out.write("                                            \n");
      out.write("                                    </div>\n");
      out.write("                                                    <b> <a href=\"DocHome.jsp\"><< Back</a></b>\n");
      out.write("                                </div>\n");
      out.write("                                <div style=\"clear: both;\">&nbsp;</div>\n");
      out.write("                            </div>\n");
      out.write("                           \n");
      out.write("                            <div style=\"clear: both;\">&nbsp;</div>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                    <div id=\"footer\">\n");
      out.write("                        <p> All rights reserved.</p>\n");
      out.write("                    </div>\n");
      out.write("                   \n");
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
