/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SQLtest;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import javax.servlet.http.HttpSession;

/**
 *
 * @author user
 */
public class Kanri extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            request.setCharacterEncoding("UTF-8");
            String user = request.getParameter("user");
            String pass = request.getParameter("pass");

            Connection db_con = null;
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            db_con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Challenge_db", "root", "");

            PreparedStatement db_st = null;
            db_st = db_con.prepareStatement("Select * from Users where id =?");
            db_st.setString(1, user);

            ResultSet rs = db_st.executeQuery();
            if(user.equals("") || pass.equals("")) {
                    out.print("ログイン失敗");

                }
            else if (rs.next()) {
                String pass2 = rs.getString("pass");
                String id = rs.getString("id");
                if (pass2.equals(pass) && id.equals(id)) {
                    HttpSession session = request.getSession();
                    session.setAttribute("login", pass2);

                    out.print("ログイン成功");
                    out.print("<form action=\"/WebApplication1/Touroku.jsp\" method=\"post\">");
                    out.print("<input type=\"submit\" name=\"btnSubmit\" value=\"管理ページ\">");
                    out.print("</form>");

                    out.print("<form action=\"/WebApplication1/logout\" method=\"post\">");
                    out.print("<input type=\"submit\" name=\"btnSubmit\" value=\"ログアウト\">");
                    out.print("</form>");

                } else if (user.equals("") || pass.equals("")) {
                    out.print("ログイン失敗");

                }
                db_con.close();
                db_st.close();
                rs.close();
            }  else {
                    out.print("ログイン失敗");

                }
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet SQLoutput6</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1></h1>");
            out.println("</body>");
            out.println("</html>");
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
