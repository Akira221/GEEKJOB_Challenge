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
public class SQLoutput2 extends HttpServlet {

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
            String pid = request.getParameter("profilesID");
            int id = Integer.parseInt(pid);
            String name = request.getParameter("name");

            String tel = request.getParameter("tel");
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
            if(db_con != null){
                out.print("情報を追加しました。");
            }
            
            PreparedStatement db_st = null;
            db_st = db_con.prepareStatement("insert into profiles(profilesID, name, tel, age, birthday) values(?, ?, ?, ?, ?)");
            db_st.setInt(1, id);
            db_st.setString(2, name);
            db_st.setString(3, tel);
            db_st.setInt(4, a);
            db_st.setString(5, birth);
             db_st.executeUpdate();  



            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet SQLoutput</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet SQLoutput at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
            
            db_con.close();
            db_st.close();
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
