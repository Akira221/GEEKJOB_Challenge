/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mypackagesample;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;
import java.net.URLEncoder;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author guest1Day
 */
public class Ck extends HttpServlet {
    
    public static void display(PrintWriter out){
        out.print("hi");
    }
    
    

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
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Ck</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Ck at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");

            Cookie cs = new Cookie("Data", URLEncoder.encode("いちご", "UTF-8"));

            response.addCookie(cs);
            cs.setMaxAge(120);
            
            Cookie[] cs2 = request.getCookies();
            
            if(cs2 == null){
                out.print("null dayo");
            }else{
                out.print("null janai yo");
            }

            if (cs2 != null) {
                out.print("すくなくともnullではない");
                out.print( URLDecoder.decode(cs2[cs2.length-1].getValue(), "UTF-8") );
                for (int i = 0; i < cs2.length; i++) {
//                    if (cs2[i].getName().equals("いちご")) {
                        out.print("name  : " + cs2[i].getName()
                                + ", value : " + cs2[i].getValue() );
//                        break;
                    }
                
                
                
                }
            

            /* TODO output your page here. You may use following sample code. */
        }catch(Exception e){
            PrintWriter out = response.getWriter();
            out.print(e.getMessage());
            
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
