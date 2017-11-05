<%-- 
    Document   : newjsp
    Created on : 2017/11/05, 3:37:15
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="/WebApplication1/NewServlet" method="get">
            元の整数 <input type="text" name="so">
            <input type="submit" name="btnSubmit" value="決定">
        </form>
        <h1></h1>
    </body>
</html>
