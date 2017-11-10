<%-- 
    Document   : SQLoutput6
    Created on : 2017/11/08, 16:16:25
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
        <h1>管理ページ</h1>
        <form action="/WebApplication1/Add" method="post">
            【商品情報登録】<br>
            商品番号<input type="text" name="num" style="width: 2em;"><br>
            商品名&nbsp;&nbsp;&nbsp;<input type="text" name="name"><br>
            価格&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="price"><br>
            内容量&nbsp;&nbsp;&nbsp;<input type="text" name="capa" style="width: 3em"><br>	
            納品形態<br>
            <input type="radio" name="arrival" value="翌日納品">翌日納品

            <input type="radio" name="arrival" value="二日後納品">二日後納品<br>

            <input type="submit" value="登録"><br>
            <br><br>
        </form>
        <form action="/WebApplication1/Ichiran" method="post">
            【商品一覧】<br>
            <input type="submit"value="商品一覧ページ">
        </form>
        <br><br>
        
        <form action="/WebApplication1/logout" method="post">
            <input type="submit" name="btnSubmit" value="ログアウト">
        </form>

        
    </body>
</html>
