/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
public class DBsousa extends HttpServlet {

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
//データベース接続のための記述
        Connection db_con = null;
//データベース操作のための記述
        PreparedStatement db_st = null;
//SQL文実行のための記述       
        ResultSet db_data = null;
        try (PrintWriter out = response.getWriter()) {
//データベース接続のための記述   
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            db_con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Challenge_db", "root", "");
//データベース操作のための記述
            db_st = db_con.prepareStatement("insert into user(userID,name,tell,age,birthday,departmentID,stationID)values(?,?,?,?,?,?,?)");
            db_st.setInt(1, 6);
            db_st.setString(2, "山田");
            db_st.setString(3, "090-9988-0123");
            db_st.setInt(4, 40);
            db_st.setString(5, "1984-04-01");
            db_st.setInt(6, 2);
            db_st.setInt(7, 1);

/*            db_data = db_st.executeQuery();
            while (db_data.next()) {
                out.print("名前：" + db_data.getString("name") + "<br>");
            }
            db_data.close(); */

            db_st.executeUpdate();

            db_st.close();
            db_con.close();
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet DBsousa</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet DBsousa at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        } catch (Exception ex) {
            System.out.print(ex.getMessage());
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
