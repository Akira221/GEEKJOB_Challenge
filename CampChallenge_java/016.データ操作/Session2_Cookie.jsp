<%-- 
    Document   : Session2_Cookie
    Created on : 2017/10/30, 18:43:31
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
        <form action="/SampleA/Session2_Cookie" method="post">
            名前<input type="text" name="name" value=><br><br>
            性別<input type="text" name="seibetu" value=""><br><br>
            趣味<textarea name="mulText" value=""></textarea><br><br>
            <input type="submit" name="btnSubmit" value="送信">
            
        </form>
        <h1></h1>
    </body>
</html>
