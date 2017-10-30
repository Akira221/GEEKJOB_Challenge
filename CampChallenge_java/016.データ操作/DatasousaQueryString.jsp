<%-- 
    Document   : DatasousaQueryString
    Created on : 2017/10/30, 11:48:17
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
        <form action="./DataSousauketori.jsp" method="get">
            <fieldset>
                <legend>お申込み商品</legend>
                <input type="checkbox" name="chkTest1"value="雑貨">雑貨<br>
                <input type="checkbox" name="chkTest2"value="生鮮食品">生鮮食品<br>
                <input type="checkbox" name="chkTest3"value="その他">その他<br>
            </fieldset><br><br>
            個数　　　<input type="text" name="per"><br><br>
            合計金額<input type="text" name="sumPrice"><br>
            
            <input type="submit" name="btnSubmit" value="決定">
        </form>
        <h1></h1>
    </body>
</html>
