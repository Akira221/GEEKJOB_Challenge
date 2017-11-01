<%-- 
    Document   : Session2_Cookie
    Created on : 2017/10/30, 18:43:31
    Author     : guest1Day
--%><%
    HttpSession hs = request.getSession();

    String Namae = (String) hs.getAttribute("Name");
    String dannjyo = (String) hs.getAttribute("Seibetu");
    String Hob = (String) hs.getAttribute("MulText");
    
    String aaa = "";
   if(dannjyo!=null){
    if (dannjyo.equals("男性")) {
        aaa = "checked";
    } else {
       
    }
   }
    String bbb = "";
   if(dannjyo!=null){
    if (dannjyo.equals("女性")) {
        bbb = "checked";
    } else {
       
    }
   }
//                    if (Namae != null) {
//                        
//
//                        out.print(Namae);
//                    } else {
//                    }
//                }
    //                Cookie[] cs = request.getCookies();
    //                    if (cs != null) {
    //                        for (int i = 0; i < cs.length; i++) {
    //                            if (cs[i].getName().equals("name")) {
    //                                cs[i].getValue();
    //                                break;
    //                            }
    //                        }
    //
    //                    }
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="/SampleA/Session2_Cookie" method="post">
            名前<input type="text" name="name" value=<% if (Namae != null) {
                    out.print(Namae);
                } else {
                    out.print("");
                }%>>
            <br><br>
            
            女性<input type="radio" name="seibetu" value="女性" <%=bbb%>>
            男性<input type="radio" name="seibetu" value="男性" <%=aaa%>>
            <br><br>
            趣味<textarea name="mulText" >
                <% if (Hob != null) {
                        out.print(Hob);
                    } else {
                        out.print("");
                    }%></textarea><br><br>
            <input type="submit" name="btnSubmit" value="送信">


        </form>
        <h1></h1>
    </body>
</html>
