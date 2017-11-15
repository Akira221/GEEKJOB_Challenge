<%@page import="jums.UserDataBeans"%>
<%@page import="javax.servlet.http.HttpSession" %>
<%@page import="jums.JumsHelper" %>
<%
    HttpSession hs = request.getSession();
    UserDataBeans beans = (UserDataBeans) session.getAttribute("Data");

%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JUMS登録画面</title>
    </head>
    <body>
        <form action="insertconfirm" method="POST">
            名前:
            <input type="text" name="name" value="<%if (beans != null) {%><%= beans.getName()%><%}%>">
            <br><br>

            生年月日:
            <select name="year">
                <option value="">----</option>
                <%
                    for (int i = 1950; i <= 2010; i++) {
                        String x = String.valueOf(i);  //数値を文字列に型変換
                %>
                <!--再入力のときは前回入力した値を保持-->
                <option value="<%=i%>"
                        <%if (beans != null && beans.getYear().equals(x)) {%>
                        <%=Integer.parseInt(beans.getYear())%> selected <% }%>><%=i%></option>
                <% } %>
            </select>年
            <select name="month">
                <option value="">--</option>
                <%
                    for (int i = 1; i <= 12; i++) {
                        String y = String.valueOf(i);
                %>
                <!--再入力のときは前回入力した値を保持-->
                <option value="<%=i%>"
                        <%if (beans != null && beans.getMonth().equals(y)) {%>
                        <%=Integer.parseInt(beans.getMonth())%> selected <% }%>><%=i%></option>
                <% }%>
            </select>月
            <select name="day">
                <option value="">--</option>
                <%
                    for (int i = 1; i <= 31; i++) {
                        String z = String.valueOf(i);
                %>
                <!--再入力のときは前回入力した値を保持-->
                <option value="<%=i%>"
                        <%if (beans != null && beans.getDay().equals(z)) {%>
                        <%=Integer.parseInt(beans.getDay())%> selected <% }%>><%=i%></option>
                <% }%>
            </select>日
            <br><br>

            種別:
            <br>
            <input type="radio" name="type" value="1"<%if (beans != null && beans.getType().equals("1")) {%>checked<%}%> >エンジニア<br>
            <input type="radio" name="type" value="2"<%if (beans != null && beans.getType().equals("2")) {%>checked<%}%>>営業<br>
            <input type="radio" name="type" value="3"<%if (beans != null && beans.getType().equals("3")) {%>checked<%}%>>その他<br>
            <br>

            電話番号:
            <input type="text" name="tell" value="<%if (beans != null) {%><%= beans.getTell()%><%}%>">
            <br><br>

            自己紹介文
            <br>
            <textarea name="comment" rows=10 cols=50 style="resize:none" wrap="hard"><%if (beans != null) {%><%= beans.getComment()%><%}%></textarea><br><br>

            <input type="hidden" name="ac"  value="<%= hs.getAttribute("ac")%>">
            <input type="submit" name="btnSubmit" value="確認画面へ">
        </form>
        <br>
        <%=JumsHelper.getInstance().home()%>
    </body>
</html>
