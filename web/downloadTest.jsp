<%-- 
    Document   : download
    Created on : Nov 10, 2012, 1:05:23 PM
    Author     : JP1
--%>

<%@page import="javax.swing.JOptionPane"%>
<%@page import="java.sql.PreparedStatement" %>
<%@page import="java.sql.Connection" %>
<%@page import="java.sql.ResultSet" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.action.Downloadfile" %>
<%@page import="com.util.*" %>
<!DOCTYPE html>
<%
String id=request.getParameter("id");
Downloadfile n=new Downloadfile();


if(n.getFile(Integer.parseInt(id)))
       {
    JOptionPane.showMessageDialog(null, "Your file download in D:");
    response.sendRedirect("DocHome.jsp");
}
else
       {
    JOptionPane.showMessageDialog(null, "Download Failed");
}


%>