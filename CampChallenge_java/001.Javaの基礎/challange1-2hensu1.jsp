<%-- 
    Document   : challange1-2
    Created on : 2017/10/07, 11:52:18
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
            int age=33;
            out.print("こんにちは！<br>");
            out.print("初めまして、今村　陽です。<br>");
            out.print("年齢は");
            out.print(age);
            out.print("歳です。");
        %>
    </body>
</html>
