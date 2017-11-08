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

/**
 *
 * @author user
 */
public class SQLoutput5 extends HttpServlet {

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
//            

            String name = request.getParameter("name");

//
            String age = request.getParameter("age");
            int a = Integer.parseInt(age);
            String birth = request.getParameter("birthday");
//             
//           out.print(pid + name + tel + age + birth);
////             
//
            Connection db_con = null;
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            db_con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Challenge_db", "root", "");

            PreparedStatement db_st = null;
            db_st = db_con.prepareStatement("Select * from Profiles Where name = ? And  age = ? And birthday = ?");
            db_st.setString(1, name);
            db_st.setInt(2, a);
            db_st.setString(3, birth);

            ResultSet rs = db_st.executeQuery();
            if (rs.next()) {
                int profilesID = rs.getInt("profilesID");
                String name2 = rs.getString("name");
                String tel = rs.getString("tel");
                int age2 = rs.getInt("age");
                String birthday = rs.getString("birthday");
                out.println("<p>");
                out.println("プロフィールID:" + profilesID + ", 名前:" + name2
                        + ", 電話:" + tel + ",年齢:" + age2 + ",誕生日:" + birthday + "<br>");
                out.println("</p>");
            } else {
                out.print("該当なし");
            }

            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet SQLoutput</title>");
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
