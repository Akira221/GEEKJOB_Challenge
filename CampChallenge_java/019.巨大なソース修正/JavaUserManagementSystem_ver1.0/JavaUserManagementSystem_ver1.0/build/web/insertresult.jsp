<%@page import="jums.UserDataBeans"%>
<%@page import="jums.JumsHelper"%>
<%@page import="javax.servlet.http.HttpSession" %>
<%
    HttpSession hs = request.getSession();
    
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JUMS登録結果画面</title>
    </head>
    <body>
        <%  UserDataBeans beans = (UserDataBeans)session.getAttribute("Data");  %>
        <h1>登録結果</h1><br>
        名前:<%= beans.getName()%><br>
        生年月日:<%= beans.getYear()+"年"+beans.getMonth()+"月"+beans.getDay()+"日"%><br>
        種別:<%= beans.getType()%><br>
        電話番号:<%= beans.getType()%><br>
        自己紹介:<%= beans.getComment()%><br>
        以上の内容で登録しました。<br>
        <%=JumsHelper.getInstance().home()%>
    </body>
</html>
