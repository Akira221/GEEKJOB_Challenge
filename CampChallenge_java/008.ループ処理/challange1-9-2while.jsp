<%-- 
    Document   : challange1-10while
    Created on : 2017/10/15, 17:48:36
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
            double num =1000;
            
            while(num > 100){
                num = num/2;
                
            }
            out.print(num);
            %>
    </body>
</html>
