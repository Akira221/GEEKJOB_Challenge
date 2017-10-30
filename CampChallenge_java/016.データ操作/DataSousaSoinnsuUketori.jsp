<%-- 
    Document   : DataSousaSoinnsuUketori
    Created on : 2017/10/30, 15:41:10
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
            String sosu = request.getParameter("so");
             int s = Integer.parseInt(sosu);
               int i= 2;
                while(s!=1)
                {   if (s%i==0)
                    {  
                        s/= i;
                    }
                    else	i++;
                }
                 out.print("元の整数=" + sosu + "  素因数=" + i+"<br>");
                %>
        <h1></h1>
    </body>
</html>
