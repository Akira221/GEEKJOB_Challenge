<%-- 
    Document   : challange1-9-1-1for
    Created on : 2017/10/08, 17:47:20
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
       long num =1;
         int n= 20;
        for(int i=0 ; i<n; i++){
        
        num = num * 8;
        }
        out.print(num);
        %>
        
    </body>
</html>
