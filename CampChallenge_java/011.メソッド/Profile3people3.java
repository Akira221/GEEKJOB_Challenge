/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mypackagesample;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author guest1Day
 */
public class Profile3people3 extends HttpServlet {

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
             HashMap<String, String> Prof = new HashMap<String, String>();

            for (int limit = 1; limit <= 3; limit++) {
                Prof = ProfList(limit);
                if(Prof.get("住所") == null){
                    continue;
                }else if(limit == 2){
                    break;
                
                }

                out.print(Prof.get("名前"));
                out.print(Prof.get("生年月日"));
                out.print(Prof.get("住所"));
            }
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Profile3people3</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Profile3people3 at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }
 HashMap<String, String> ProfList(Integer limit) {
        HashMap<String, String> Prof1
                = new HashMap<String, String>();
        Prof1.put("id", "01");
        Prof1.put("名前", "今村");
        Prof1.put("生年月日", "1984年2月21日");
        Prof1.put("住所", "東京都");

        HashMap<String, String> Prof2
                = new HashMap<String, String>();
        Prof2.put("id", "02");
        Prof2.put("名前", "中村");
        Prof2.put("生年月日", "1990年4月9日");
        Prof2.put("住所", null);

        HashMap<String, String> Prof3
                = new HashMap<String, String>();
        Prof3.put("id", "03");
        Prof3.put("名前", "上村");
        Prof3.put("生年月日", "1976年8月16日");
        Prof3.put("住所", "群馬県");

        switch (limit) {

            case 1:
                return Prof1;

            case 2:
                return Prof2;

            case 3:
                return Prof3;

            default:
                return null;

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
