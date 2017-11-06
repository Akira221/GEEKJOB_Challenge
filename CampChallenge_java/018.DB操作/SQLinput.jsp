<%-- 
    Document   : SQLinput
    Created on : 2017/11/06, 16:36:31
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
         <form action="/WebApplication1/SQLoutput" method="post">
            名前<input type="text" name="name">
            <input type="submit" name="btnSubmit" value="検索">
        </form>
        <h1></h1>
    </body>
</html>
