<%-- 
    Document   : DataSousauketori
    Created on : 2017/10/30, 11:58:13
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
            request.setCharacterEncoding("UTF-8");
            String chk1 = request.getParameter("chkTest1");
            String chk2 = request.getParameter("chkTest2");
            String chk3 = request.getParameter("chkTest3");

            String sumPrice2 = request.getParameter("sumPrice");
            int sum = Integer.parseInt(sumPrice2);
            String per2 = request.getParameter("per");
            int pern = Integer.parseInt(per2);
            if (chk2 == null && chk3 == null) {
                out.print(request.getParameter("chkTest1") + "<br>");
            }
            if (chk1 == null && chk3 == null) {
                out.print(request.getParameter("chkTest2") + "<br>");
            }
            if (chk1 == null && chk2 == null) {
                out.print(request.getParameter("chkTest3" + "<br>") + "<br>");
            } else {

            }

            out.print(request.getParameter("per") + "個" + "<br>");
            out.print("合計" + request.getParameter("sumPrice") + "円" + "<br>");

            int tannka = sum / pern;
            out.print("単価" + tannka + "円");
            if (sum >= 5000) {
                double point = sum * 0.05;
                out.print(point + "ポイントプレゼント！");
            }
            if (sum >= 3000 && sum < 5000) {
                double point = sum * 0.04;
                out.print(point + "ポイントプレゼント！");
            }

//            out.print(request.getParameter("chkTest1"));
//            out.print(request.getParameter("chkTest2"));
//            out.print(request.getParameter("chkTest2"));
%>
        <h1></h1>
    </body>
</html>
