<%-- 
    Document   : SQLinput4
    Created on : 2017/11/08, 12:20:35
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
         <form action="/WebApplication1/SQLoutput5" method="post">
            
            名前<input type="text" name="name">
            

            <select name="age">
                <option value="" selected>年齢</option>
                <% for(int i = 0; i<=100 ; i++){ %>
                    <option value="<%= i %>"><%= i %> 歳</option>
                <%}%>
                
            </select>

           誕生日<input type="date" name="birthday" value="2017-11-06">
            <input type="submit" name="btnSubmit" value="入力">
        </form>
        <h1></h1>
    </body>
</html>
