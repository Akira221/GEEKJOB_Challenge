/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mypackagesample;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author guest1Day
 */
abstract class Human {

    abstract public int open();

    abstract public void setCard(ArrayList<Integer> list);

    abstract public boolean checkSum();
    ArrayList<Integer> myCards = new ArrayList<Integer>();  //てふだ
}

class Dealer extends Human {

    ArrayList<Integer> cards = new ArrayList<Integer>();

    public Dealer(int num) {

        if (num == 1) {
            for (int i = 1; i <= 4; i++) {
                for (int ser = 1; ser <= 13; ser++) {
                    this.cards.add(ser);
                }
            }

        }
    }

    public ArrayList<Integer> deal(String s) {
        ArrayList<Integer> temp = new ArrayList<Integer>();
        if (s == "start") {
            for (int a = 1; a <= 2; a++) {
                Random rand = new Random();
                Integer r = rand.nextInt(this.cards.size());
                this.cards.remove(r);
                temp.add(r);
            }

        }
        return temp;
    }

    public ArrayList<Integer> hit() {
        ArrayList<Integer> temp2 = new ArrayList<Integer>();
        Random rand = new Random();
        Integer rm = rand.nextInt(this.cards.size());
        this.cards.remove(rm);
        temp2.add(rm);
        return temp2;
    }

    public void setCard(ArrayList<Integer> list) {

        for (int i = 0; i < list.size(); i++) {
            this.myCards.add(list.get(i));
        }

    }

    public boolean checkSum() {

        int total = 0;
        for (int value : this.myCards) {
            total = total + value;
        }
        if (total <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public int open() {
        int total = 0;
        for (int value : this.myCards) {
            total = total + value;
        }
        return total;
    }
}

class User extends Human {

    public void setCard(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            this.myCards.add(list.get(i));

        }
    }

    public boolean checkSum() {

        int total = 0;
        for (int value : this.myCards) {
            total = total + value;
        }
        if (total <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public int open() {
        int total = 0;
        for (int value : this.myCards) {
            total = total + value;
        }
        return total;
    }
}

public class BrackJack extends HttpServlet {

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
            Dealer d = new Dealer(1);
            User u = new User();
            
            out.print("Start!<br>");

            out.print("Users deal<br>");

//            d.deal("start");

            u.setCard(d.deal("start"));
//           out.print(u.myCards + "<br>");

            out.print("Dealers deal<br>");
//            d.deal("start");
            d.setCard(d.deal("start"));

            while (true) {
                if (u.checkSum() == true) {
//                    d.hit();
                    u.setCard(d.hit());

                    out.print("Users hit<br>");
                }
                if (u.checkSum() == false){
                    break;
                }
                    if (d.checkSum() == true) {
                        d.hit();
                        d.setCard(d.hit());
                        out.print("Dealers hit<br>");
                    }
                    if (d.checkSum() == false){
                    break;
                }
            }
                if (u.checkSum() == false && d.checkSum() == false) {
                    out.print("Open!<br>");
                    out.print("Dealers No," + d.open() + "<br>");
                    out.print("Users No," + u.open());
                    
                }
            
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet BrackJack</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1></h1>");
            out.println("</body>");
            out.println("</html>");
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
