<%-- 
    Document   : results
    Created on : Jan 27, 2014, 12:54:12 PM
    Author     : gcDataTechnology
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome User</title>
    </head>
    <body>
        <%
            out.println("<h1 id='greetingText'>" +
                request.getAttribute("welcomeUser")+
                    "</h1>");
                    
        %>
    </body>
</html>
