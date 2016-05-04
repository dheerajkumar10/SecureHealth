package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.util.Utilities;
import com.util.SendMail;
import org.apache.commons.io.IOUtils;
import org.apache.tomcat.util.http.fileupload.FileItem;
import java.util.List;
import java.util.Iterator;
import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;
import org.apache.tomcat.util.http.fileupload.disk.DiskFileItemFactory;
import java.io.File;

public final class uploadProcess_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("                ");

                    String TMP_DIR_PATH = "c:\\tmp";
                    File tmpDir = new File(TMP_DIR_PATH);
                    String[] lines = null;
                    int count = 0;
                    String size = null;
                    String key = null;
                    String userid = null;
                    String filename = null;
                    String nameid = "";
                    String master = "";
                    String sec = "";
                    String pub = "";
                    try {
                        DiskFileItemFactory fileItemFactory = new DiskFileItemFactory();
                        fileItemFactory.setSizeThreshold(1 * 1024 * 1024); //1 MB
                        fileItemFactory.setRepository(tmpDir);
                        ServletFileUpload uploadHandler = new ServletFileUpload(fileItemFactory);
                        List items = uploadHandler.parseRequest(request);
                        Iterator itr = items.iterator();
                        int a1;
                        int a2;

                        while (itr.hasNext()) {
                            FileItem item = (FileItem) itr.next();
                            if (item.isFormField()) {
                             
                            } else {
                                String str = IOUtils.toString(item.getInputStream(), "UTF-8");
                                filename = item.getName();
                                //item.getInputStream().
                                lines = str.split("\r\n|\r|\n");
                                nameid = (String) session.getAttribute("userid");
                                sec = Utilities.stringtoByte(filename + filename.length());
                                pub = Utilities.stringtoByte(nameid);
                                master = Utilities.stringtoByte(pub + sec);
                                // a1=Utilities.stringtoByte(filename); 
                                // a2=Utilities.stringtoByte(filename.length()+""); 
                                //   master= Integer.toBinaryString((a1&a2)); 

                                // size = lines.length + "";
                            }
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                
      out.write("\n");
      out.write("                <body>\n");
      out.write("                    <div id=\"wrapper\">\n");
      out.write("                        <div id=\"header-wrapper\">\n");
      out.write("                            <div id=\"header\" class=\"container\">\n");
      out.write("                                <div id=\"logo\">\n");
      out.write("                                    <h1><a href=\"#\">Scalable </a></h1>\n");
      out.write("                                </div>\n");
      out.write("                                <div id=\"menu\">\n");
      out.write("                                    <ul>\n");
      out.write("                                        <li class=\"first current_page_item\"><a href=\"#\">PHR Home</a></li>\n");
      out.write("                                        <li><a href=\"index.jsp\">Log Out</a></li>\n");
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
      out.write("                                    \n");
      out.write("                                    <div style=\"clear: both;\">&nbsp;</div>\n");
      out.write("                                    <div class=\"entry\">\n");
      out.write("                                        ");
if (request.getParameter("msg") != null) {
                                                out.println(request.getParameter("msg"));
                                            }
      out.write("\n");
      out.write("                                        <h2>Upload Process</h2>\n");
      out.write("                                        <form method=\"post\" action=\"UploadData\">\n");
      out.write("                                            <input type=\"hidden\" id=\"fileName\" name=\"fileName\" value=\"");
      out.print(filename);
      out.write("\">\n");
      out.write("\n");
      out.write("                                                <table>\n");
      out.write("                                                    <tr><td>Public Key:</td><td><input type=\"text\" id=\"publicKey\" name=\"publicKey\" size=\"50\" value=\"");
      out.print(Utilities.stringtoByte(nameid));
      out.write("\"/></td></tr>\n");
      out.write("                                                    <tr><td>File Attribute 1:</td><td><input type=\"text\" id=\"att1\" name=\"att1\" size=\"50\" value=\"");
      out.print(Utilities.stringtoByte(filename));
      out.write("\"/></td></tr>\n");
      out.write("                                                    <tr><td>File Attribute 2:</td><td><input type=\"text\" id=\"att2\" name=\"att2\" size=\"50\" value=\"");
      out.print(Utilities.stringtoByte(lines.length + ""));
      out.write("\"/></td></tr>\n");
      out.write("                                                    <tr><td>Master key:</td><td><input type=\"text\" id=\"master\" name=\"master\" size=\"50\"  value=\"");
      out.print( master);
      out.write("\"/></td></tr>\n");
      out.write("                                                    <tr><td>Secrete Key:</td><td><input type=\"text\" id=\"secret\" name=\"secret\"  size=\"50\" value=\"");
      out.print(sec);
      out.write("\"/></td></tr>\n");
      out.write("                                                    <tr><td>File Content:</td><td><textarea id=\"block1\" name=\"block1\" value=\"\" size=\"50\" style=\"width: 300px;height: 100px;\">\n");
      out.write("                                                                ");

                                                                    for (int i = count; i < lines.length; i++) {
                                                                        if (lines[i].trim() == null || lines[i].trim() == "") {
                                                                            continue;
                                                                        }
                                                                        out.println(lines[i]);
                                                                    }
      out.write("\n");
      out.write("                                                            </textarea></td></tr>\n");
      out.write("                                                    <tr><td><input type=\"submit\" value=\"Upload\"/></td></tr>\n");
      out.write("                                                </table>\n");
      out.write("                                        </form>\n");
      out.write("                                                                    ");

                                                                    String msg="\n\nFile Name:" + filename + "\n\n"+"PHR Name:"+nameid+"\n\n\n\n"+"Secret Key: "+sec;
                                                                    SendMail.sendingMail(msg);                                                                                                           
                                                                    
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div style=\"clear: both;\">&nbsp;</div>\n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                            <div style=\"clear: both;\">&nbsp;</div>\n");
      out.write("                        </div>\n");
      out.write("                       \n");
      out.write("                    </div>\n");
      out.write("                    <div id=\"footer\">\n");
      out.write("                        <p>. All rights reserved.</p>\n");
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
