/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import AbstractFactory.FactoryProducer;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;


/**
 *
 * @author LN710Q
 */
public class Ventana extends JPanel{
    private int a = 0, b = 0, flagtip = 1, flagint = 0;
    String aux = "";
    
    private int WIDTH=400, HEIGHT=200;
    private int widthTF=120, heightTF=30;
    private int widthBT=50, heightBT=50;
    JButton suma;
    JButton resta;
    JButton mult;
    JButton div;
    JButton igual;
    JButton conv;
    
    JTextField textfield1, textfield2, result;
    
    public Ventana(){
        //CREACION DE BOTONES
        suma = new JButton("+");
        suma.setBounds(10, 100, widthBT, heightBT);
        
        resta = new JButton("-");
        resta.setBounds(70, 100, widthBT, heightBT);
        
        mult = new JButton("x");
        mult.setBounds(130, 100, widthBT, heightBT);
        
        div = new JButton("/");
        div.setBounds(190, 100, widthBT, heightBT);
        
        igual = new JButton("=");
        igual.setBounds(330, 100, widthBT, heightBT);
        
        conv = new JButton("conv");
        conv.setBounds(250, 100, 70, heightBT);
        
//      CREACION DE TEXTFIELDS
        textfield1= new JTextField();
        textfield2= new JTextField();
        result = new JTextField();
        textfield1.setBounds(15, 40, widthTF, heightTF);
        textfield2.setBounds(140, 40, widthTF, heightTF);
        //textfield2.setText("hola");
        textfield2.setEditable(false);
        result.setBounds(270, 40, widthTF, heightTF);
        result.setEditable(false);
        
        
        // ASIGNACION DE ACCION A BOTONES
        // BOTON SUMA
        suma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                aux = textfield1.getText();
                a = Integer.parseInt(aux);
                aux = "";
                System.out.println(a);
                textfield1.setEditable(false);
                textfield2.setEditable(true);
                flagint = 1;
                suma.setEnabled(false);
                resta.setEnabled(false);
                mult.setEnabled(false);
                div.setEnabled(false);
                conv.setEnabled(false);
                System.out.println("selector externo");
                System.out.println(flagtip);
                System.out.println("selector interno");
                System.out.println(flagint);
                }
        });
        //BOTON RESTA
        resta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                aux = textfield1.getText();
                a = Integer.parseInt(aux);
                aux = "";
                System.out.println(a);
                textfield1.setEditable(false);
                textfield2.setEditable(true);
                flagint = 2;
                suma.setEnabled(false);
                resta.setEnabled(false);
                mult.setEnabled(false);
                div.setEnabled(false);
                conv.setEnabled(false);
                System.out.println("selector externo");
                System.out.println(flagtip);
                System.out.println("selector interno");
                System.out.println(flagint);
            }
        } );
        // BOTON MULT
        mult.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                aux = textfield1.getText();
                a = Integer.parseInt(aux);
                aux = "";
                System.out.println(a);
                textfield1.setEditable(false);
                textfield2.setEditable(true);
                flagint = 3;
                suma.setEnabled(false);
                resta.setEnabled(false);
                mult.setEnabled(false);
                div.setEnabled(false);
                conv.setEnabled(false);
                System.out.println("selector externo");
                System.out.println(flagtip);
                System.out.println("selector interno");
                System.out.println(flagint);
            }
        });
        //BOTON DIV
        div.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                aux = textfield1.getText();
                a = Integer.parseInt(aux);
                aux = "";
                System.out.println(a);
                textfield1.setEditable(false);
                textfield2.setEditable(true);
                flagint = 4;
                suma.setEnabled(false);
                resta.setEnabled(false);
                mult.setEnabled(false);
                div.setEnabled(false);
                conv.setEnabled(false);
                System.out.println("selector externo");
                System.out.println(flagtip);
                System.out.println("selector interno");
                System.out.println(flagint);
            }
        });
        
        igual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //FactoryProducer.getFactory(flagtip).getop(flagint);
            }
        });
//        textfield1.setEditable(true);

        
        add(suma);
        add(resta);
        add(mult);
        add(div);
        add(igual);
        add(conv);
        add(textfield1);
        add(textfield2);
        add(result);
        
        setLayout(null);
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        
        
        
    }
    
    
}
