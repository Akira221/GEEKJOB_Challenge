<%-- 
    Document   : DataOutput
    Created on : 2017/10/29, 17:24:39
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

        <%
            // 受け取るパラメータの文字コード
            request.setCharacterEncoding("UTF-8");
            // テキストボックスの情報
            out.print(request.getParameter("txtName") + "<br>");
            // ラジオボタンの情報
            out.print(request.getParameter("rdoSeibetuM") + "<br>");
            out.print(request.getParameter("rdoSeibetuF") + "<br>");
            // テキストエリアの情報
            out.print(request.getParameter("mulText") + "<br>");
        %>
        <h1></h1>
    </body>
</html>
