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
        <title>JUMS登録確認画面</title>
    </head>
    <body>
        <!--JavaBeansの呼び出し-->
        <%  UserDataBeans beans = (UserDataBeans) session.getAttribute("Data");  %>
       <!--未記入がないか判定-->
        <% if (!beans.getName().equals("") && !beans.getYear().equals("") && !beans.getMonth().equals("") && !beans.getDay().equals("")
                    && !beans.getType().equals("") && !beans.getTell().equals("") && !beans.getComment().equals("")) {%>
        <h1>登録確認</h1>
        名前:<%= beans.getName()%><br>
        生年月日:<%= beans.getYear() + "年" + beans.getMonth() + "月" + beans.getDay() + "日"%><br>
        種別:<%= beans.getType()%><br>
        電話番号:<%= beans.getTell()%><br>
        自己紹介:<%= beans.getComment()%><br>
        上記の内容で登録します。よろしいですか？
        <form action="insertresult" method="POST">
            <input type="hidden" name="ac"  value="<%= hs.getAttribute("ac")%>">
            <input type="submit" name="yes" value="はい">
        </form>
        <% } else { %>
        <h1>入力が不完全です</h1>
        <br>
        <!--未記入欄の指摘-->
        <%if (beans.getName().equals("")) {%>

        ・名前の記入がありません<%}%><br><br>

        <%if (beans.getYear().equals("")) {%>
        ・年の記入がありません<%}%><br><br>
        <%if (beans.getMonth().equals("")) {%>
        ・月の記入がありません<%}%><br><br>
        <%if (beans.getDay().equals("")) {%>
        ・日の記入がありません<%}%><br><br>

        <%if (beans.getTell().equals("")) {%>
        ・電話番号の記入がありません<%}%><br><br>
        <%if (beans.getComment().equals("")) {%>
        ・自己紹介の記入がありません<%}%><br><br>




        <% }%><br><br>

        <form action="insert" method="POST">
            <input type="submit" name="no" value="登録画面に戻る">
        </form>
        <%=JumsHelper.getInstance().home()%>
    </body>
</html>
