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
        int type=1;
        switch(type) {
        
        case 1:
        out.print("「one」");
        break;
        
        case 2:
        out.print("「two」");
        break;
        
        default:
        out.print("「想定外」");
        
        
        
    } %>
    
    <body>
        <h1></h1>
    </body>
</html>
