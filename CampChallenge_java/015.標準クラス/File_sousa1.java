/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mypackagesample;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author guest1Day
 */
public class File_sousa1 {

    public static void main(String[] arg) {
        File fp = new File("File_sousa.txt");
        FileWriter fw;
        try {
            fw = new FileWriter(fp);
            fw.write("今村陽です！よろしくお願いします。");
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(File_sousa1.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
