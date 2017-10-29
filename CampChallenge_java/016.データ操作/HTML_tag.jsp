<%-- 
    Document   : HTML_tag
    Created on : 2017/10/29, 17:53:23
    Author     : guest1Day
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <!--分割を設定するソースコード-->
    <!--左右の分割を指定（左：100ピクセル、右：残り全て）-->
    <frameset cols="100,*">

        <!--左のフレームに example1.html を表示-->
        <frame src="example1.html"> 
            <h1 align="center">センターに配置する</h1>
            <!--右のフレームに example2.html を表示-->
            <frame src="example2.html"> 

                <body>
                    <h1>Hello World!</h1>
                </body>
                </frameset> 
                </html>
