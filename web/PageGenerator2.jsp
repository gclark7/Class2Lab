<%-- 
    Document   : PageGenerator2
    Created on : Jan 22, 2014, 7:00:16 PM
    Author     : gclark7
--%>

<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <table>
            <tr>
                <td>
                    <input type="text" value="<%= new Date()%>"/>
                </td>
            </tr>
            <%
            String s="";
            for(int i=0;i<6;i++){
                out.println("<tr><td>" + i + "</td></tr>");
            }
            %>
        </table>
    </body>
</html>
