package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.util.Utilities;
import java.sql.PreparedStatement;
import java.sql.Connection;
import com.util.DbConnector;
import java.sql.ResultSet;
import java.io.*;
import com.action.Downloadfile;
import javax.swing.JOptionPane;

public final class content_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">\n");
      out.write("\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("    <head>\n");
      out.write("        <meta name=\"keywords\" content=\"\" />\n");
      out.write("        <meta name=\"description\" content=\"\" />\n");
      out.write("        <meta http-equiv=\"content-type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("        <title>HASBE</title>\n");
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
      out.write("                                        <li class=\"first current_page_item\"><a href=\"ActuaryHome.jsp\">Back </a></li>                       \n");
      out.write("                                        <li><a href=\"index.jsp\">LogOut</a></li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div id=\"banner\">\n");
      out.write("                                <div class=\"content\"><img src=\"images/img02.jpg\" width=\"1000\" height=\"300\" alt=\"\" /></div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("\n");
      out.write("                        <div id=\"page\">\n");
      out.write("                            <div id=\"content\">\n");
      out.write("                                <div class=\"post\">\n");
      out.write("                                    <h2 class=\"title\"><a href=\"#\"></a></h2>\n");
      out.write("\n");
      out.write("                                    <div style=\"clear: both;\">&nbsp;</div>\n");
      out.write("                                    <div class=\"entry\">\n");
      out.write("                                        <span style=\"font-size: 22px;\">Data:</span>\n");
      out.write("                                        ");
if (request.getParameter("msg") != null) {
                                                out.println(request.getParameter("msg"));
                                            }
      out.write("\n");
      out.write("                                        <form method=\"post\" action=\"content.jsp\">\n");
      out.write("                                            <table width=\"90%\">\n");
      out.write("                                                <tr style=\"height: 40px;\">\n");
      out.write("                                                    <td>\n");
      out.write("\n");
      out.write("                                                        ");

                                                            String sql = "",c="no";
                                                            if(request.getParameter("confirm")!=null){c=request.getParameter("confirm");}else{c="no";}
                                                            boolean flag = false;
                                                            if (request.getParameter("keys").trim() != "" && request.getParameter("keys").trim() != "") {
                                                                sql = "select * from upload where id='" + request.getParameter("keys") + "' and key_='" + request.getParameter("key_") + "'";
                                                                flag = true;
                                                            } else {
                                                                sql = "select * from upload where id='" + request.getParameter("keys") + "'";

                                                            }
                                                            System.out.println(";;;;;;;;;;;;;;;" + sql);
                                                            System.out.println("Confirm it (yes/no) "+c);
                                                            PreparedStatement pst = null;
                                                            Connection conn = null;
                                                            try {
                                                                conn = DbConnector.getConnection();
                                                                pst = conn.prepareStatement(sql);
                                                                ResultSet rs = pst.executeQuery();
                                                                if (rs.next()) {
                                                                    if (flag == true) {
                                                                        System.out.println("false????");
                                                                        if(c.equalsIgnoreCase("yes")){
                                                                        Downloadfile n = new Downloadfile();


                                                                        if (n.getFile(rs.getInt("id"))) {
                                                                            JOptionPane.showMessageDialog(null, "Your file download in D:");
                                                                            response.sendRedirect("DocHome.jsp");
                                                                        } else {
                                                                            JOptionPane.showMessageDialog(null, "Download Failed");
                                                                        }
                                                                                                                                               }
                                                                                                                                               else{
                                                                        out.println(Utilities.decryptString(rs.getString(3), rs.getString(4)));
                                                                                                                                               }
                                                                    } else {
                                                                        out.println(rs.getString(3));
                                                                    }
                                                                } else {
                                                                    out.println("In valid Key");
                                                                }
                                                            } catch (Exception e) {
                                                                e.printStackTrace();
                                                            }
      out.write("\n");
      out.write("                                                    </td></tr>\n");
      out.write("                                            </table>\n");
      out.write("\n");
      out.write("                                        </form>\t\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div style=\"clear: both;\">&nbsp;</div>\n");
      out.write("                            </div>\n");
      out.write("                           \n");
      out.write("                            <div style=\"clear: both;\">&nbsp;</div>\n");
      out.write("                        </div>\n");
      out.write("                       \n");
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
