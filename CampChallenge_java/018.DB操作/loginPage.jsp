<%-- 
    Document   : SQLinput6
    Created on : 2017/11/08, 16:16:01
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
       
        <h1>ログインページ</h1>
         <form action="/WebApplication1/Kanri" method="post">
            ユーザーID<input type="text" name="user"><br>
            パスワード<input type="password" name="pass"><br>
            
            <input type="submit" name="btnSubmit" value="ログイン">
        </form>
    </body>
</html>
