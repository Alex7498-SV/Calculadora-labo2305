/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import javax.swing.JFrame;

/**
 *
 * @author LN710Q
 */
public class GUI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame ventana = new  JFrame("ventana");
        ventana.setContentPane(new Ventana());
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setResizable(false);
        ventana.pack();
        ventana.setVisible(true);
        
    }
    
}
