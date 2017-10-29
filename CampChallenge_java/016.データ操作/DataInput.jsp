<%-- 
    Document   : DataInput
    Created on : 2017/10/29, 17:06:23
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
          <form action="./test.jsp" method="post">
              名前<input type="text" name="txtName"><br>
              男性<input type="radio" name="rdoSeibetuM">女性<input type="radio" name="rdoSeibetuF"><br>
              趣味<textarea name="mulText"></textarea><br>
          </form>
        <h1></h1>
    </body>
</html>
