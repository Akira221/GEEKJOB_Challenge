<%-- 
    Document   : challange-switch
    Created on : 2017/10/08, 14:49:08
    Author     : guest1Day
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <%
        char type='あ';
        switch(type) {
        
        case 'A':
        out.print("「英語」");
        break;
        
        case 'あ':
        out.print("「日本語」");
        break;
        
        default:
        out.print("");
        
        
        
    } %>
    
    <body>
        <h1></h1>
    </body>
</html>
