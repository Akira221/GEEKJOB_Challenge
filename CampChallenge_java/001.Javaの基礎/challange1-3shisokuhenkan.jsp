<%-- 
    Document   : challange1-3shisokuhenkan
    Created on : 2017/10/07, 13:24:06
    Author     : guest1Day
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1></h1>
        <%
            final int BASE = 300;
            int num = 60;
            int tasu = BASE + num;
            int hiku = BASE - num;
            int kakeru =BASE * num;
            int waru = BASE / num;
            
            out.print(tasu+"<br>");
           
            out.print(hiku+"<br>");
            out.print(kakeru+"<br>");
            out.print(waru+"<br>");
        %>
    </body>
</html>
